package org.xms.g.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class BridgeMethodUtils {
    // key is bridge method and value is bridged method
    private final static Map<Method, Method> bridgeMethodCache = new HashMap<>();

    private BridgeMethodUtils() {
    }

    /**
     * @param clazz declaring class
     * @param name method name
     * @param types parameter types
     * @return bridge method
     */
    public static Method getBridgeMethod(Class<?> clazz, String name, Class<?>... types) {
        if (clazz == null) {
            throw new IllegalStateException("bad clazz");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("method name is null or empty!");
        }
        try {
            return clazz.getMethod(name, types);
        } catch (NoSuchMethodException ex) {
            throw new IllegalStateException("Expected method not found: " + ex);
        }
    }

    /**
     *
     * @param bridgeMethod key
     * @return bridged method
     */
    private static synchronized Method getCachedBridgedMethod(Method bridgeMethod) {
        if (bridgeMethodCache.containsKey(bridgeMethod)) {
            return bridgeMethodCache.get(bridgeMethod);
        }
        return null;
    }

    /**
     *
     * @param bridgeMethod key
     * @param bridgedMethod value
     */
    private static synchronized void setCachedBridgedMethodCache(Method bridgeMethod, Method bridgedMethod) {
        bridgeMethodCache.put(bridgeMethod, bridgedMethod);
    }

    /**
     * @param bridgeMethod bridge class for generic type
     * @return bridged method which has accurate parameter type
     */
    public static Method getBridgedMethod(Method bridgeMethod) {
        if (!bridgeMethod.isBridge()) {
            return bridgeMethod;
        }

        Method bridgedMethod = getCachedBridgedMethod(bridgeMethod);
        if (bridgedMethod != null) {
            return bridgedMethod;
        }
        List<Method> candidateMethods = new ArrayList<>();
        getCandidateBridgedMethods(bridgeMethod.getDeclaringClass(), bridgeMethod, candidateMethods);
        if (!candidateMethods.isEmpty()) {
            bridgedMethod = getBridgedMethodByCandidates(candidateMethods, bridgeMethod);
        }
        if (bridgedMethod == null) {
            bridgedMethod = bridgeMethod;
        }

        setCachedBridgedMethodCache(bridgeMethod, bridgedMethod);
        return bridgedMethod;
    }

    /**
     * @param clazz declaring class
     * @param method bridge method
     * @param list contains methods has the same method name and parameter numbers as bridge method.
     *        for example, overloaded methods.
     */
    private static void getCandidateBridgedMethods(Class<?> clazz, Method method, List<Method> list) {
        Method[] targetMethods = clazz.getMethods();
        for (Method m : targetMethods) {
            if (m.isBridge() || m.equals(method) || m.getParameterTypes().length != method.getParameterTypes().length) {
                continue;
            }

            if (m.getName().equals(method.getName())) {
                list.add(m);
            }
        }

        if (clazz.getSuperclass() != null && !clazz.getSuperclass().equals(Object.class)) {
            getCandidateBridgedMethods(clazz.getSuperclass(), method, list);
        }

        if (clazz.isInterface()) {
            for (Class<?> cl : clazz.getInterfaces()) {
                getCandidateBridgedMethods(cl, method, list);
            }
        }
    }

    /**
     * get true bridged method from candidates
     * 
     * @param candidateMethods candidate method list
     * @param bridgeMethod bridge method
     * @return bridged method
     */
    private static Method getBridgedMethodByCandidates(List<Method> candidateMethods, Method bridgeMethod) {
        boolean isSameSignature = true;
        Method preMethod = null;
        Method genericMethod = getGenericMethod(bridgeMethod);
        if (genericMethod != null) {
            for (Method candidateMethod : candidateMethods) {
                if (isBridgedMethod(genericMethod, candidateMethod, bridgeMethod.getDeclaringClass())) {
                    return candidateMethod;
                } else if (preMethod != null) {
                    isSameSignature = isSameSignature && Arrays.equals(candidateMethod.getGenericParameterTypes(),
                        preMethod.getGenericParameterTypes());
                }
                preMethod = candidateMethod;
            }
            if (isSameSignature) {
                return candidateMethods.get(0);
            }
        }
        return null;
    }

    /**
     * resolve bridged method.
     * 
     * @param genericMethod generic declared bridge method
     * @param candidateMethod candidate method which may be bridged method
     * @param declaringClass declaring class of bridge method
     * @return true or false
     */
    private static boolean isBridgedMethod(Method genericMethod, Method candidateMethod, Class<?> declaringClass) {
        Class<?>[] parameters = candidateMethod.getParameterTypes();
        for (int i = 0; i < parameters.length; i++) {
            Parameter methodParameter = new Parameter(genericMethod, i, declaringClass);
            TypeNode genericParameterType = TypeNode.createMethodParameterType(methodParameter, null);
            Class<?> candidateParameter = parameters[i];
            if (candidateParameter.isArray()) {
                if (!candidateParameter.getComponentType()
                    .equals(genericParameterType.resolveComponentType().getClazz())) {
                    return false;
                }
            }

            if (!candidateParameter.equals(genericParameterType.getClazz())) {
                return false;
            }
        }
        return true;
    }

    /**
     * resolve declared generic method by bridge method
     * 
     * @param bridgeMethod bridge method
     * @return declared generic method
     */
    private static Method getGenericMethod(Method bridgeMethod) {
        Method m = null;

        // first super class list
        Class<?> cl = null;
        for (cl = bridgeMethod.getDeclaringClass().getSuperclass(); cl != null && !cl.equals(Object.class);
            cl = cl.getSuperclass()) {
            m = getDeclaredMethod(cl, bridgeMethod);
            if (m != null && !m.isBridge()) {
                return m;
            }
        }

        // then interface list
        Set<Class<?>> ifcList = new LinkedHashSet<>();
        for (cl = bridgeMethod.getDeclaringClass(); cl != null && !cl.equals(Object.class);
            cl = cl.getSuperclass()) {
            Class<?>[] interfaces = cl.getInterfaces();
            for (Class<?> ifc : interfaces) {
                ifcList.add(ifc);
            }
        }

        return getMethodByInterfaces(ifcList.toArray(new Class<?>[0]), bridgeMethod);
    }

    private static Method getDeclaredMethod(Class<?> cl, Method bridgeMethod) {
        try {
            return cl.getDeclaredMethod(bridgeMethod.getName(), bridgeMethod.getParameterTypes());
        } catch (NoSuchMethodException ex) {
            return null;
        }
    }

    private static Method getMethodByInterfaces(Class<?>[] interfaces, Method bridgeMethod) {
        for (Class<?> ifc : interfaces) {
            Method method = getDeclaredMethod(ifc, bridgeMethod);
            if (method != null && !method.isBridge()) {
                return method;
            } else {
                method = getMethodByInterfaces(ifc.getInterfaces(), bridgeMethod);
                if (method != null) {
                    return method;
                }
            }
        }

        return null;
    }
}
