
package org.xms.g.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Utils {

    private static Map<String, String> map = new HashMap<>();

    private static Map<String, String> G2H = new HashMap<>();

    private static Map<String, String> H2G = new HashMap<>();

    private static Map<Class, Constructor> wrapperCache = new ConcurrentHashMap<>();

    private static Map<Class, Method> getGHInstCache = new ConcurrentHashMap<>();

    private static final String G = "g";

    private static final String H = "h";

    public static <T, R> T[] mapArray2GH(R[] array, Class<T> cls, boolean isH) {
        if (null == array) {
            org.xms.g.utils.XmsLog.w("1", "array is null");
            return null;
        }
        T[] result = (T[]) Array.newInstance(cls, array.length);
        for (int i = 0; i < array.length; i++) {
            result[i] = Utils.getInstanceInInterface(array[i], isH);
        }
        String arrayType = array.getClass().getName();
        String resultType = result.getClass().getName();
        org.xms.g.utils.XmsLog.i("2", "array : " + arrayType + " isH : " + isH + " result : " + resultType);
        return result;
    }

    private static class MappedIterator<R, T> implements Iterator<T> {
        Iterator<R> origin;

        Function<R, T> mapper;

        MappedIterator(Iterator<R> origin, Function<R, T> mapper) {
            this.origin = origin;
            this.mapper = mapper;
        }

        @Override
        public boolean hasNext() {
            return origin.hasNext();
        }

        @Override
        public T next() {
            return mapper.apply(origin.next());
        }

        @Override
        public void remove() {
            origin.remove();
        }
    }

    public static <R, T> Iterable<T> transformIterable(Iterable<R> iterable, Function<R, T> mapper) {
        Iterator<T> iter = new MappedIterator<>(iterable.iterator(), mapper);
        String iteratorType = iter == null ? null : iter.getClass().getName();
        org.xms.g.utils.XmsLog.i("1", "iterable : " + iterable.getClass().getName() + " result : " + iteratorType);
        return () -> iter;
    }

    public static <T, R> T[] genericArrayCopy(R[] array, Class<T> type, Function<R, T> mapper) {
        T[] arr = (T[]) Array.newInstance(type, array.length);
        for (int i = 0; i < array.length; i++) {
            arr[i] = mapper.apply(array[i]);
        }
        String typeType = type == null ? null : type.getClass().getName();
        org.xms.g.utils.XmsLog.i("1",
            "array : " + array.getClass().getName() + " type : " + typeType + " result : " + arr.getClass().getName());
        return arr;
    }

    public static <K, V, T> Map<T, K> convertMap(Map<T, V> map, Function<V, K> mapper) {
        Map<T, K> returnMap = new HashMap<>();
        for (Map.Entry<T, V> entry : map.entrySet()) {
            returnMap.put(entry.getKey(), mapper.apply(map.get(entry.getKey())));
        }
        org.xms.g.utils.XmsLog.i("1",
            "map : " + map.getClass().getName() + " result : " + returnMap.getClass().getName());
        return returnMap;
    }

    public static <T, R> android.util.SparseArray<T> genericArrayCopy(android.util.SparseArray<R> array,
        Function<R, T> mapper) {
        android.util.SparseArray<T> arr = new android.util.SparseArray<>(array.size());
        for (int i = 0; i < array.size(); i++) {
            int key = array.keyAt(i);
            arr.put(key, mapper.apply(array.get(key)));
        }
        org.xms.g.utils.XmsLog.i("1",
            "array : " + array.getClass().getName() + " result : " + arr.getClass().getName());
        return arr;
    }

    public static <T, R> List<T> mapList(List<R> list, Function<R, T> mapper) {
        if (list == null) {
            org.xms.g.utils.XmsLog.i("1", "list is null");
            return null;
        }
        List<T> result = new ArrayList<>(list.size());
        for (int i = 0; i < list.size(); i++) {
            result.add(mapper.apply(list.get(i)));
        }
        String resultType = result.getClass().getName();
        org.xms.g.utils.XmsLog.i("2", "list : " + list.getClass().getName() + " result : " + resultType);
        return result;
    }

    public static <T, R> List<T> mapList2GH(List<R> list, boolean isH) {
        List<T> result = mapList(list, it -> getInstanceInInterface(it, isH));
        String listType = list == null ? null : list.getClass().getName();
        String resultType = result == null ? null : result.getClass().getName();
        org.xms.g.utils.XmsLog.i("1", "list : " + listType + " isH : " + isH + " result : " + resultType);
        return result;
    }

    public static <T, R> List<T> mapList2X(List<R> list, boolean isH) {
        List<T> result = isH ? mapList(list, it -> (T) getXmsObjectWithHmsObject(it))
            : mapList(list, it -> (T) getXmsObjectWithGmsObject(it));
        String listType = list == null ? null : list.getClass().getName();
        String resultType = result == null ? null : result.getClass().getName();
        org.xms.g.utils.XmsLog.i("1", "list : " + listType + " isH : " + isH + " result : " + resultType);
        return result;
    }

    public static <T, R> Collection<T> mapCollection(Collection<? extends R> collection, Function<R, T> mapper) {
        if (collection == null) {
            org.xms.g.utils.XmsLog.i("0", "collection : null");
            return null;
        }
        String collectionType = collection.getClass().getName();
        Collection<T> result;
        if (collection instanceof Set) {
            int capacity = Math.max((int) ((float) collection.size() / 0.75F) + 1, 16);
            result = new HashSet<>(capacity);
        } else {
            result = new ArrayList<>(collection.size());
        }
        for (R item : collection) {
            result.add(mapper.apply(item));
        }
        String resultType = result.getClass().getName();
        org.xms.g.utils.XmsLog.i("1", "collection : " + collectionType + " result : " + resultType);
        return result;
    }

    public static <T, R> Collection<T> mapCollection2GH(Collection<R> collection, boolean isH) {
        Collection<T> result = mapCollection(collection, it -> getInstanceInInterface(it, isH));
        String collectionType = collection == null ? null : collection.getClass().getName();
        String resultType = result == null ? null : result.getClass().getName();
        org.xms.g.utils.XmsLog.i("1", "collection : " + collectionType + " isH : " + isH + " result : " + resultType);
        return result;
    }

    public static <T, R> Collection<T> mapCollection2X(Collection<R> collection, boolean isH) {
        Collection<T> result = isH ? mapCollection(collection, it -> (T) getXmsObjectWithHmsObject(it))
            : mapCollection(collection, it -> (T) getXmsObjectWithGmsObject(it));
        String collectionType = collection == null ? null : collection.getClass().getName();
        String resultType = result == null ? null : result.getClass().getName();
        org.xms.g.utils.XmsLog.i("1", "collection : " + collectionType + " isH : " + isH + " result : " + resultType);
        return result;
    }

    private static Object transformList2X(Object object, boolean isH)
        throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (!(object instanceof List)) {
            org.xms.g.utils.XmsLog.i("1", "object is List");
            return object;
        }
        List result = (List) object.getClass().newInstance();
        for (int i = 0; i < ((List) object).size(); i++) {
            Object o = ((List) object).get(i);
            if (o == null || !map.containsKey(o.getClass().getCanonicalName())) {
                result.add(o);
                continue;
            }
            // should transform to X.
            String xName = map.get(o.getClass().getCanonicalName());
            Class clazz = Class.forName(xName);
            if (isH) {
                result.add(getOrCreateInstance(clazz, null, o, isH));
            } else {
                result.add(getOrCreateInstance(clazz, o, null, isH));
            }
        }
        String objectType = object.getClass().getName();
        String resultType = result == null ? null : result.getClass().getName();
        org.xms.g.utils.XmsLog.i("2", "object : " + objectType + " isH : " + isH + " result : " + resultType);
        return result;
    }

    public static Object getXmsObjectWithGmsObject(Object object) {
        if (object == null) {
            return object;
        }
        if (object instanceof List) {
            try {
                return transformList2X(object, false);
            } catch (IllegalAccessException e) {
                org.xms.g.utils.XmsLog.e("2", e.getMessage(), e);
            } catch (InstantiationException e) {
                org.xms.g.utils.XmsLog.e("2", e.getMessage(), e);
            } catch (ClassNotFoundException e) {
                org.xms.g.utils.XmsLog.e("2", e.getMessage(), e);
            }
        }
        if (!isGmsType(object)) {
            return object;
        }
        org.xms.g.utils.XmsLog.i("1", "inObject : " + object.getClass().getName());
        return getXmsObject(object, G);
    }

    public static Object getXmsObjectWithHmsObject(Object object) {
        if (object == null) {
            return object;
        }
        if (object instanceof List) {
            try {
                return transformList2X(object, true);
            } catch (IllegalAccessException e) {
                org.xms.g.utils.XmsLog.e("2", e.getMessage(), e);
            } catch (InstantiationException e) {
                org.xms.g.utils.XmsLog.e("2", e.getMessage(), e);
            } catch (ClassNotFoundException e) {
                org.xms.g.utils.XmsLog.e("2", e.getMessage(), e);
            }
        }
        if (!isHmsType(object)) {
            return object;
        }
        org.xms.g.utils.XmsLog.i("1", "inObject : " + object.getClass().getName());
        return getXmsObject(object, H);
    }

    private static Object getXmsObject(Object object, String GorH) {
        String xmsClassName = null;
        String interfaceClass = null;
        String inClassName = object.getClass().getName();
        inClassName = inClassName.replaceAll("\\$", ".");

        Class inSuperClass = object.getClass().getSuperclass();
        Class[] interfaces = object.getClass().getInterfaces();
        while (!map.containsKey(inClassName)) {
            inClassName = inSuperClass.getName().replaceAll("\\$", ".");
            if (inClassName.equals("java.lang.Object")) {
                if (interfaces == null || interfaces.length == 0) {
                    break;
                }
                String interfacesStr = interfaces[0].getName().replaceAll("\\$", ".");
                while (!map.containsKey(interfacesStr)) {
                    interfaces = interfaces[0].getInterfaces();
                    interfacesStr = interfaces[0].getName().replaceAll("\\$", ".");
                }
                interfaceClass = map.get(interfacesStr);
                org.xms.g.utils.XmsLog.d("2",
                    "interfacesStr : " + interfacesStr + ", interfaceClass : " + interfaceClass);
            } else {
                inSuperClass = inSuperClass.getSuperclass();
                interfaces = inSuperClass.getInterfaces();
            }
        }

        xmsClassName = map.get(inClassName);
        org.xms.g.utils.XmsLog.i("1", "inClassName : " + inClassName + ", xmsClassName : " + xmsClassName);
        if (xmsClassName == null) {
            if (interfaceClass != null) {
                xmsClassName = interfaceClass;
                org.xms.g.utils.XmsLog.i("5", "xmsClassName : " + xmsClassName);
            } else {
                org.xms.g.utils.XmsLog.i("6", "xmsClassName is null");
                return object;
            }
        }

        try {
            Class clazz = Class.forName(xmsClassName);
            org.xms.g.utils.XmsLog.i("7", "clazz : " + clazz.getName());
            Constructor[] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                if (constructor.getParameterTypes().length == 2
                    && isGmsClass(constructor.getParameterTypes()[0].getName())) {
                    return "g".equals(GorH) ? constructor.newInstance(object, null)
                        : constructor.newInstance(null, object);
                }
            }
        } catch (ClassNotFoundException e) {
            org.xms.g.utils.XmsLog.e("8", e.getMessage(), e);
        } catch (IllegalAccessException e) {
            org.xms.g.utils.XmsLog.e("9", e.getMessage(), e);
        } catch (InstantiationException e) {
            org.xms.g.utils.XmsLog.e("10", e.getMessage(), e);
        } catch (InvocationTargetException e) {
            org.xms.g.utils.XmsLog.e("11", e.getMessage(), e);
        }
        return null;
    }

    public static boolean isGmsClass(String className) {
        if (className.startsWith("com.google.android.gms") || className.startsWith("com.google.firebase")
            || className.startsWith("com.google.ads") || className.startsWith("com.android.installreferrer")
            || className.startsWith("com.google.android.libraries") || className.startsWith("com.google.api")) {
            org.xms.g.utils.XmsLog.i("1", "true");
            return true;
        }
        org.xms.g.utils.XmsLog.i("2", "false");
        return false;
    }

    public static boolean isHmsClass(String className) {
        if (className.startsWith("com.huawei.hms") || className.startsWith("com.huawei.hmf")) {
            org.xms.g.utils.XmsLog.i("1", "true");
            return true;
        }
        org.xms.g.utils.XmsLog.i("2", "false");
        return false;
    }

    public static boolean isGmsType(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass().isAnonymousClass() || obj.getClass().isMemberClass()) {
            if (isGmsClass(obj.getClass().getName())) {
                return true;
            }
            if (obj.getClass().getSuperclass().getName().equals("java.lang.Object")) {
                Class[] superInterfaces = obj.getClass().getInterfaces();
                // anonymous class or inner class has only one interface
                for (Class inter : superInterfaces) {
                    return isGmsClass(inter.getName());
                }
            } else {
                Class superClassName = obj.getClass().getSuperclass();
                return isGmsClass(superClassName.getName());
            }
        }
        return isGmsClass(obj.getClass().getName());
    }

    public static boolean isHmsType(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass().isAnonymousClass() || obj.getClass().isMemberClass()) {
            if (isHmsClass(obj.getClass().getName())) {
                return true;
            }
            if (obj.getClass().getSuperclass().getName().equals("java.lang.Object")) {
                Class[] superInterfaces = obj.getClass().getInterfaces();
                // anonymous class or inner class has only one interface
                for (Class inter : superInterfaces) {
                    return isHmsClass(inter.getName());
                }
            } else {
                Class superClassName = obj.getClass().getSuperclass();
                return isHmsClass(superClassName.getName());
            }
        }
        return isHmsClass(obj.getClass().getName());
    }

    public static Class getGmsClassWithXmsClass(Class xmsClass) {
        try {
            Field field = xmsClass.getField("gInstance");
            org.xms.g.utils.XmsLog.i("1", "field.getType : " + field.getType());
            return field.getType();
        } catch (NoSuchFieldException e) {
            org.xms.g.utils.XmsLog.w("2", "xmsClass : " + xmsClass + ", e : " + e.getMessage(), e);
            return xmsClass;
        }
    }

    public static Class getHmsClassWithXmsClass(Class xmsClass) {
        try {
            Field field = xmsClass.getField("hInstance");
            org.xms.g.utils.XmsLog.i("1", "field.getType : " + field.getType());
            return field.getType();
        } catch (NoSuchFieldException e) {
            org.xms.g.utils.XmsLog.w("2", "xmsClass : " + xmsClass + ", e : " + e.getMessage(), e);
            return xmsClass;
        }
    }

    public static Class getXmsClassWithClass(Class clazz) {
        try {
            if (map.containsKey(clazz.getName())) {
                org.xms.g.utils.XmsLog.i("1", "XmsClass : " + map.get(clazz.getName()));
                return Class.forName(map.get(clazz.getName()));
            }
        } catch (ClassNotFoundException e) {
            org.xms.g.utils.XmsLog.e("2", e.getMessage(), e);
        }
        return null;
    }

    /**
     * Tell a clazz is xms type or not.
     *
     * @param clazz, the clazz need to be identified.
     * @return if clazz is xms type, return true.
     */
    public static boolean isXmsType(Class clazz) {
        boolean result = XInterface.class.isAssignableFrom(clazz);
        org.xms.g.utils.XmsLog.i("1", "isXmsType : " + result);
        return result;
    }

    /**
     * Create an instance from its Class, and we MUST use
     * its wrapper constructor.
     *
     * @param clazz, Create an instance from clazz.
     * @param gInst, first parameter for constructor.
     * @param hInst, second parameter for constructor.
     * @return the instance.
     */
    public static Object getOrCreateInstance(Class clazz, Object gInst, Object hInst, boolean isH) {
        // transform ghList to xList.
        Object instance = isH ? hInst : gInst;
        if (instance == null) {
            org.xms.g.utils.XmsLog.i("1", "instance : null");
            return null;
        }
        if (instance instanceof List) {
            org.xms.g.utils.XmsLog.i("2", "instance is List");
            return mapList2X((List) instance, isH);
        }

        if (!isXmsType(clazz)) {
            org.xms.g.utils.XmsLog.i("3", "instance : " + instance.getClass().getName());
            // maybe instance is GInstance or HInstance
            if (isH) { // HInstance
                return getXmsObjectWithHmsObject(instance);
            }
            // GInstance
            return getXmsObjectWithGmsObject(instance);
        }

        String className = "";
        if (clazz.isInterface() || Modifier.isAbstract(clazz.getModifiers())) {
            className = clazz.getName();
            className += "$XImpl";
            try {
                org.xms.g.utils.XmsLog.d("4", "className : " + className);
                clazz = Class.forName(className);
            } catch (ClassNotFoundException e) {
                org.xms.g.utils.XmsLog.e("5", e.getMessage(), e);
            }
        }

        Constructor constructor = getWrapperConstructor(clazz);
        if (constructor != null) {
            try {
                return constructor.newInstance(gInst, hInst);
            } catch (InstantiationException e) {
                org.xms.g.utils.XmsLog.e("6", e.getMessage(), e);
            } catch (IllegalAccessException e) {
                org.xms.g.utils.XmsLog.e("7", e.getMessage(), e);
            } catch (InvocationTargetException e) {
                org.xms.g.utils.XmsLog.e("8", e.getMessage(), e);
            }
        }

        return null;
    }

    /**
     * Find wrapper constructor for an xms class.
     *
     * @param xmsType, the class whose wrapper constructor need to be found.
     * @return xmsType's wrapper constructor.
     */
    public static Constructor getWrapperConstructor(Class xmsType) {
        if (wrapperCache.containsKey(xmsType)) {
            org.xms.g.utils.XmsLog.i("1", "wrapperCache.get(xmsType) xmsType : " + xmsType.getName());
            return wrapperCache.get(xmsType);
        }

        Constructor[] constructors = xmsType.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            if (constructors[i].getParameterTypes().length != 2) {
                continue;
            }

            if (map.containsKey(constructors[i].getParameterTypes()[0].getCanonicalName())) {
                wrapperCache.put(xmsType, constructors[i]);
                org.xms.g.utils.XmsLog.i("2",
                    "wrapperCache.put(xmsType, constructors[i]) xmsType : " + xmsType.getName());
                return constructors[i];
            } else {
                org.xms.g.utils.XmsLog.w("3",
                    "map not containsKey " + constructors[i].getParameterTypes()[0].getCanonicalName());
            }
        }

        return null;
    }

    /**
     * If an object is xms instance, get its G instance or H instance.
     * An xms object may be an XGettable instance, then it has a concrete g instance,
     * also, it may be an XInterface but not XGettable, we must call these methods
     * by reflection.
     *
     * @param o object to get its g instance.
     * @param isH show we need its g or h instance.
     * @return xms object's g/h instance.
     */
    public static <T> T getInstanceInInterface(Object o, boolean isH) {
        if (!(o instanceof XInterface)) {
            String inObjectType = o == null ? null : o.getClass().getName();
            org.xms.g.utils.XmsLog.i("1", "inObject : " + inObjectType);
            return (T) o;
        }

        if (o instanceof XGettable) {
            if (isH) {
                org.xms.g.utils.XmsLog.i("2", "hInstance : " + ((XGettable) o).getHInstance().getClass().getName());
                return (T) ((XGettable) o).getHInstance();
            } else {
                org.xms.g.utils.XmsLog.i("3", "gInstance : " + ((XGettable) o).getGInstance().getClass().getName());
                return (T) ((XGettable) o).getGInstance();
            }
        }

        // o must be an XInterface and not XGettable.
        return (T) reflectiveGetInstance(o, isH);
    }

    private static Object reflectiveGetInstance(Object o, boolean isH) {
        if (getGHInstCache.containsKey(o.getClass())) {
            org.xms.g.utils.XmsLog.i("1", "inObject : " + o.getClass());
            try {
                return getGHInstCache.get(o.getClass()).invoke(o);
            } catch (IllegalAccessException e) {
                org.xms.g.utils.XmsLog.i("2", "inObject : " + o.getClass(), e);
            } catch (InvocationTargetException e) {
                org.xms.g.utils.XmsLog.i("3", "inObject : " + o.getClass(), e);
            }
        }

        Method[] methods = o.getClass().getMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getParameterTypes().length > 0) {
                continue;
            }

            if (isH && (!methods[i].getName().startsWith("getHInstance"))) {
                continue;
            }

            if (!isH && (!methods[i].getName().startsWith("getGInstance"))) {
                continue;
            }

            org.xms.g.utils.XmsLog.i("2", "inObject : " + o.getClass() + ", methods[i] : " + methods[i].getName());
            getGHInstCache.put(o.getClass(), methods[i]);
            try {
                return methods[i].invoke(o);
            } catch (IllegalAccessException e) {
                org.xms.g.utils.XmsLog.e("3", e.getMessage(), e);
            } catch (InvocationTargetException e) {
                org.xms.g.utils.XmsLog.e("4", e.getMessage(), e);
            }
        }

        return null;
    }

    /**
     * Invoke the bridge method with the original parameter types.
     *
     * @param receiver the invoke target
     * @param methodName the method name
     * @param params parameters
     * @param paramTypes the declaration types of parameters (the upper bound type for the generic type)
     * @param isH HMS if true; GMS, otherwise
     * @return the return value
     * @throws IllegalStateException capsuling the real refection exception
     */
    public static Object invokeBridgeMethod(Object receiver, String methodName, Object[] params, Class[] paramTypes,
        boolean isH) throws IllegalStateException {
        if (params == null) {
            org.xms.g.utils.XmsLog.w("1", "params == null");
            throw new IllegalArgumentException("null params");
        }

        if (paramTypes == null) {
            org.xms.g.utils.XmsLog.w("2", "paramTypes == null");
            throw new IllegalArgumentException("null paramTypes");
        }

        if (params.length != paramTypes.length) {
            org.xms.g.utils.XmsLog.w("3", "params.length != paramTypes.length");
            throw new IllegalArgumentException("mismatched params and paramTypes");
        }

        Method bridgeMethod = BridgeMethodUtils.getBridgeMethod(receiver.getClass(), methodName, paramTypes);
        org.xms.g.utils.XmsLog.d("4", "get bridge method " + bridgeMethod.toString());
        Method bridgedMethod = BridgeMethodUtils.getBridgedMethod(bridgeMethod);
        org.xms.g.utils.XmsLog.d("4", "get bridged method " + bridgedMethod.toString());
        try {
            String bridgeMethodType = bridgeMethod.getName();
            String bridgedMethodMethodType = bridgedMethod.getName();
            org.xms.g.utils.XmsLog.d("4",
                "bridgeMethod : " + bridgeMethodType + ", bridgedMethod : " + bridgedMethodMethodType);
            Class<?>[] types = bridgedMethod.getParameterTypes();
            Object[] args = new Object[params.length];
            for (int i = 0; i < params.length; i++) {
                if (isH) {
                    args[i] = Utils.getOrCreateInstance(types[i], null, params[i], isH);
                } else {
                    args[i] = Utils.getOrCreateInstance(types[i], params[i], null, isH);
                }
            }
            org.xms.g.utils.XmsLog.i("5", "receiver : " + receiver.getClass().getName());
            if (args.length > 0) {
                StringBuffer argSb = new StringBuffer();
                for (int i = 0; i < args.length; i++) {
                    String argsType = args[i] == null ? null : args[i].getClass().getName();
                    argSb.append("args [" + i + "] : ").append(argsType).append(", ");
                }
                org.xms.g.utils.XmsLog.i("6", argSb.toString());
            }
            bridgedMethod.setAccessible(true);
            return bridgedMethod.invoke(receiver, args);
        } catch (Exception ex) {
            org.xms.g.utils.XmsLog.e("7", ex.getMessage(), ex);
            throw new IllegalStateException(ex);
        }
    }

    /**
     * handle invokeBridge method return value.
     * return value need type cast.
     *
     * @param receiver the invoke target
     * @param isH HMS if true; GMS, otherwise
     * @return the return value
     */
    public static Object handleInvokeBridgeReturnValue(Object receiver, boolean isH) {
        // not xms type
        if (!isXmsType(receiver.getClass())) {
            org.xms.g.utils.XmsLog.d("1", "receiver : " + receiver.getClass().getName());
            return receiver;
        }
        // gettable, use Gettable getGorHinstance
        if (receiver instanceof XGettable) {
            if (isH) {
                org.xms.g.utils.XmsLog.i("2",
                    "hInstance : " + ((XGettable) receiver).getHInstance().getClass().getName());
                return ((XGettable) receiver).getHInstance();
            }
            org.xms.g.utils.XmsLog.i("3", "gInstance : " + ((XGettable) receiver).getGInstance().getClass().getName());
            return ((XGettable) receiver).getGInstance();
        }
        // interface, invoke default getHorGInstance method
        Method[] methods = receiver.getClass().getMethods();
        int cnt = 0;
        String prefix = isH ? "getHInstance" : "getGInstance";
        Method target = null;
        for (Method m : methods) {
            if (m.getName().startsWith(prefix)) {
                cnt++;
                target = m;
            }
        }
        if (cnt == 1) {
            try {
                org.xms.g.utils.XmsLog.i("4", "receiver : " + receiver.getClass().getName());
                return target.invoke(receiver);
            } catch (IllegalAccessException e) {
                org.xms.g.utils.XmsLog.e("5", e.getMessage(), e);
            } catch (InvocationTargetException e) {
                org.xms.g.utils.XmsLog.e("6", e.getMessage(), e);
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("mutiple getInstance methods found.");
        org.xms.g.utils.XmsLog.w("7", illegalStateException.getMessage());
        throw illegalStateException;
    }

    public static Object invokeProtectMethod(Object receiver, Class targetClass, String methodName,
        Class[] methodParametersType, Object[] args) {
        if (targetClass == null) {
            throw new IllegalStateException("null class.");
        }
        if (methodName == null || methodName.isEmpty()) {
            throw new IllegalStateException("methodName not exist.");
        }
        try {
            Method method = null;
            method = targetClass.getDeclaredMethod(methodName, methodParametersType);
            assert method != null;
            method.setAccessible(true);
            return method.invoke(receiver, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    static {
        map.put("com.google.firebase.FirebaseApiNotAvailableException", "org.xms.f.FirebaseApiNotAvailableException");
        map.put("com.google.firebase.FirebaseException", "org.xms.f.FirebaseException");
        map.put("com.google.android.gms.actions.ItemListIntents", "org.xms.g.actions.ItemListIntents");
        map.put("com.google.android.gms.actions.NoteIntents", "org.xms.g.actions.NoteIntents");
        map.put("com.google.android.gms.actions.ReserveIntents", "org.xms.g.actions.ReserveIntents");
        map.put("com.google.android.gms.actions.SearchIntents", "org.xms.g.actions.SearchIntents");
        map.put("com.huawei.hms.actions.SearchIntents", "org.xms.g.actions.SearchIntents");
        map.put("com.google.android.gms.common.AccountPicker", "org.xms.g.common.AccountPicker");
        map.put("com.google.android.gms.common.AccountPicker.AccountChooserOptions", "org.xms.g.common.AccountPicker$AccountChooserOptions");
        map.put("com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder", "org.xms.g.common.AccountPicker$AccountChooserOptions$Builder");
        map.put("com.google.android.gms.common.ConnectionResult", "org.xms.g.common.ConnectionResult");
        map.put("com.huawei.hms.api.ConnectionResult", "org.xms.g.common.ConnectionResult");
        map.put("com.google.android.gms.common.ErrorDialogFragment", "org.xms.g.common.ErrorDialogFragment");
        map.put("com.huawei.hms.common.ErrorDialogFragment", "org.xms.g.common.ErrorDialogFragment");
        map.put("com.google.android.gms.common.GoogleApiAvailability", "org.xms.g.common.ExtensionApiAvailability");
        map.put("com.huawei.hms.api.HuaweiApiAvailability", "org.xms.g.common.ExtensionApiAvailability");
        map.put("com.google.android.gms.common.GooglePlayServicesNotAvailableException", "org.xms.g.common.ExtensionPlayServicesNotAvailableException");
        map.put("com.huawei.hms.api.HuaweiServicesNotAvailableException", "org.xms.g.common.ExtensionPlayServicesNotAvailableException");
        map.put("com.google.android.gms.common.GooglePlayServicesRepairableException", "org.xms.g.common.ExtensionPlayServicesRepairableException");
        map.put("com.huawei.hms.api.HuaweiServicesRepairableException", "org.xms.g.common.ExtensionPlayServicesRepairableException");
        map.put("com.google.android.gms.common.GooglePlayServicesUtil", "org.xms.g.common.ExtensionPlayServicesUtil");
        map.put("com.huawei.hms.api.HuaweiMobileServicesUtil", "org.xms.g.common.ExtensionPlayServicesUtil");
        map.put("com.google.android.gms.common.Scopes", "org.xms.g.common.Scopes");
        map.put("com.google.android.gms.common.SupportErrorDialogFragment", "org.xms.g.common.SupportErrorDialogFragment");
        map.put("com.huawei.hms.common.ErrDlgFragmentForSupport", "org.xms.g.common.SupportErrorDialogFragment");
        map.put("com.google.android.gms.common.UserRecoverableException", "org.xms.g.common.UserRecoverableException");
        map.put("com.huawei.hms.api.UserRecoverableException", "org.xms.g.common.UserRecoverableException");
        map.put("com.google.android.gms.common.api.Api", "org.xms.g.common.api.Api");
        map.put("com.huawei.hms.api.Api", "org.xms.g.common.api.Api");
        map.put("com.google.android.gms.common.api.Api.ApiOptions.HasOptions", "org.xms.g.common.api.Api$ApiOptions$HasOptions$XImpl");
        map.put("com.huawei.hms.api.Api.ApiOptions.HasOptions", "org.xms.g.common.api.Api$ApiOptions$HasOptions$XImpl");
        map.put("com.google.android.gms.common.api.Api.ApiOptions.NoOptions", "org.xms.g.common.api.Api$ApiOptions$NoOptions");
        map.put("com.huawei.hms.api.Api.ApiOptions.NoOptions", "org.xms.g.common.api.Api$ApiOptions$NoOptions");
        map.put("com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions", "org.xms.g.common.api.Api$ApiOptions$NotRequiredOptions$XImpl");
        map.put("com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions", "org.xms.g.common.api.Api$ApiOptions$NotRequiredOptions$XImpl");
        map.put("com.google.android.gms.common.api.Api.ApiOptions.Optional", "org.xms.g.common.api.Api$ApiOptions$Optional$XImpl");
        map.put("com.huawei.hms.api.Api.ApiOptions.Optional", "org.xms.g.common.api.Api$ApiOptions$Optional$XImpl");
        map.put("com.google.android.gms.common.api.Api.ApiOptions", "org.xms.g.common.api.Api$ApiOptions$XImpl");
        map.put("com.huawei.hms.api.Api.ApiOptions", "org.xms.g.common.api.Api$ApiOptions$XImpl");
        map.put("com.google.android.gms.common.api.ApiException", "org.xms.g.common.api.ApiException");
        map.put("com.huawei.hms.common.ApiException", "org.xms.g.common.api.ApiException");
        map.put("com.google.android.gms.common.api.AvailabilityException", "org.xms.g.common.api.AvailabilityException");
        map.put("com.huawei.hms.common.api.AvailabilityException", "org.xms.g.common.api.AvailabilityException");
        map.put("com.google.android.gms.common.api.Batch", "org.xms.g.common.api.Batch");
        map.put("com.google.android.gms.common.api.Batch.Builder", "org.xms.g.common.api.Batch$Builder");
        map.put("com.google.android.gms.common.api.BatchResult", "org.xms.g.common.api.BatchResult");
        map.put("com.google.android.gms.common.api.BatchResultToken", "org.xms.g.common.api.BatchResultToken");
        map.put("com.google.android.gms.common.api.BooleanResult", "org.xms.g.common.api.BooleanResult");
        map.put("com.huawei.hms.common.api.BooleanResult", "org.xms.g.common.api.BooleanResult");
        map.put("com.google.android.gms.common.api.CommonStatusCodes", "org.xms.g.common.api.CommonStatusCodes");
        map.put("com.huawei.hms.common.api.CommonStatusCodes", "org.xms.g.common.api.CommonStatusCodes");
        map.put("com.google.android.gms.common.api.GoogleApi", "org.xms.g.common.api.ExtensionApi$XImpl");
        map.put("com.google.android.gms.common.api.GoogleApiClient.Builder", "org.xms.g.common.api.ExtensionApiClient$Builder");
        map.put("com.huawei.hms.api.HuaweiApiClient.Builder", "org.xms.g.common.api.ExtensionApiClient$Builder");
        map.put("com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks", "org.xms.g.common.api.ExtensionApiClient$ConnectionCallbacks$XImpl");
        map.put("com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks", "org.xms.g.common.api.ExtensionApiClient$ConnectionCallbacks$XImpl");
        map.put("com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener", "org.xms.g.common.api.ExtensionApiClient$OnConnectionFailedListener$XImpl");
        map.put("com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener", "org.xms.g.common.api.ExtensionApiClient$OnConnectionFailedListener$XImpl");
        map.put("com.google.android.gms.common.api.GoogleApiClient", "org.xms.g.common.api.ExtensionApiClient$XImpl");
        map.put("com.huawei.hms.api.HuaweiApiClient", "org.xms.g.common.api.ExtensionApiClient$XImpl");
        map.put("com.google.android.gms.common.api.HasApiKey", "org.xms.g.common.api.HasApiKey$XImpl");
        map.put("com.google.android.gms.common.api.OptionalPendingResult", "org.xms.g.common.api.OptionalPendingResult$XImpl");
        map.put("com.huawei.hms.common.api.OptionalPendingResult", "org.xms.g.common.api.OptionalPendingResult$XImpl");
        map.put("com.google.android.gms.common.api.PendingResult", "org.xms.g.common.api.PendingResult$XImpl");
        map.put("com.huawei.hms.support.api.client.PendingResult", "org.xms.g.common.api.PendingResult$XImpl");
        map.put("com.google.android.gms.common.api.PendingResults", "org.xms.g.common.api.PendingResults");
        map.put("com.huawei.hms.support.api.client.PendingResultsCreator", "org.xms.g.common.api.PendingResults");
        map.put("com.google.android.gms.common.api.Releasable", "org.xms.g.common.api.Releasable$XImpl");
        map.put("com.huawei.hms.common.api.Releasable", "org.xms.g.common.api.Releasable$XImpl");
        map.put("com.google.android.gms.common.api.ResolvableApiException", "org.xms.g.common.api.ResolvableApiException");
        map.put("com.huawei.hms.common.ResolvableApiException", "org.xms.g.common.api.ResolvableApiException");
        map.put("com.google.android.gms.common.api.ResolvingResultCallbacks", "org.xms.g.common.api.ResolvingResultCallbacks$XImpl");
        map.put("com.huawei.hms.support.api.client.ResolvingResultCallbacks", "org.xms.g.common.api.ResolvingResultCallbacks$XImpl");
        map.put("com.google.android.gms.common.api.Response", "org.xms.g.common.api.Response");
        map.put("com.huawei.hms.common.api.Response", "org.xms.g.common.api.Response");
        map.put("com.google.android.gms.common.api.Result", "org.xms.g.common.api.Result$XImpl");
        map.put("com.huawei.hms.support.api.client.Result", "org.xms.g.common.api.Result$XImpl");
        map.put("com.google.android.gms.common.api.ResultCallback", "org.xms.g.common.api.ResultCallback$XImpl");
        map.put("com.huawei.hms.support.api.client.ResultCallback", "org.xms.g.common.api.ResultCallback$XImpl");
        map.put("com.google.android.gms.common.api.ResultCallbacks", "org.xms.g.common.api.ResultCallbacks$XImpl");
        map.put("com.huawei.hms.support.api.client.ResultCallbacks", "org.xms.g.common.api.ResultCallbacks$XImpl");
        map.put("com.google.android.gms.common.api.ResultTransform", "org.xms.g.common.api.ResultTransform$XImpl");
        map.put("com.huawei.hms.support.api.client.ResultConvert", "org.xms.g.common.api.ResultTransform$XImpl");
        map.put("com.google.android.gms.common.api.Scope", "org.xms.g.common.api.Scope");
        map.put("com.huawei.hms.support.api.entity.auth.Scope", "org.xms.g.common.api.Scope");
        map.put("com.google.android.gms.common.api.Status", "org.xms.g.common.api.Status");
        map.put("com.huawei.hms.support.api.client.Status", "org.xms.g.common.api.Status");
        map.put("com.google.android.gms.common.api.TransformedResult", "org.xms.g.common.api.TransformedResult$XImpl");
        map.put("com.huawei.hms.support.api.client.ConvertedResult", "org.xms.g.common.api.TransformedResult$XImpl");
        map.put("com.google.android.gms.common.api.UnsupportedApiCallException", "org.xms.g.common.api.UnsupportedApiCallException");
        map.put("com.huawei.hms.common.api.UnsupportedApiCallException", "org.xms.g.common.api.UnsupportedApiCallException");
        map.put("com.google.android.gms.common.data.AbstractDataBuffer", "org.xms.g.common.data.AbstractDataBuffer$XImpl");
        map.put("com.huawei.hms.common.data.AbstractDataBuffer", "org.xms.g.common.data.AbstractDataBuffer$XImpl");
        map.put("com.google.android.gms.common.data.DataBuffer", "org.xms.g.common.data.DataBuffer$XImpl");
        map.put("com.huawei.hms.common.data.DataBuffer", "org.xms.g.common.data.DataBuffer$XImpl");
        map.put("com.google.android.gms.common.data.DataBufferObserver.Observable", "org.xms.g.common.data.DataBufferObserver$Observable$XImpl");
        map.put("com.google.android.gms.common.data.DataBufferObserver", "org.xms.g.common.data.DataBufferObserver$XImpl");
        map.put("com.huawei.hms.common.data.DataBufferObserver", "org.xms.g.common.data.DataBufferObserver$XImpl");
        map.put("com.google.android.gms.common.data.DataBufferObserverSet", "org.xms.g.common.data.DataBufferObserverSet");
        map.put("com.google.android.gms.common.data.DataBufferUtils", "org.xms.g.common.data.DataBufferUtils");
        map.put("com.huawei.hms.common.data.DataBufferUtils", "org.xms.g.common.data.DataBufferUtils");
        map.put("com.google.android.gms.common.data.Freezable", "org.xms.g.common.data.Freezable$XImpl");
        map.put("com.huawei.hms.common.data.Freezable", "org.xms.g.common.data.Freezable$XImpl");
        map.put("com.google.android.gms.common.data.FreezableUtils", "org.xms.g.common.data.FreezableUtils");
        map.put("com.huawei.hms.common.data.FreezableUtils", "org.xms.g.common.data.FreezableUtils");
        map.put("com.google.android.gms.common.images.ImageManager", "org.xms.g.common.images.ImageManager");
        map.put("com.google.android.gms.common.images.ImageManager.OnImageLoadedListener", "org.xms.g.common.images.ImageManager$OnImageLoadedListener$XImpl");
        map.put("com.google.android.gms.common.images.Size", "org.xms.g.common.images.Size");
        map.put("com.huawei.hms.common.size.Size", "org.xms.g.common.images.Size");
        map.put("com.google.android.gms.common.images.WebImage", "org.xms.g.common.images.WebImage");
        map.put("com.huawei.hms.common.webserverpic.WebServerPic", "org.xms.g.common.images.WebImage");
        map.put("com.google.android.gms.location.ActivityRecognition", "org.xms.g.location.ActivityRecognition");
        map.put("com.huawei.hms.location.ActivityIdentification", "org.xms.g.location.ActivityRecognition");
        map.put("com.google.android.gms.location.ActivityRecognitionApi", "org.xms.g.location.ActivityRecognitionApi$XImpl");
        map.put("com.google.android.gms.location.ActivityRecognitionClient", "org.xms.g.location.ActivityRecognitionClient");
        map.put("com.huawei.hms.location.ActivityIdentificationService", "org.xms.g.location.ActivityRecognitionClient");
        map.put("com.google.android.gms.location.ActivityRecognitionResult", "org.xms.g.location.ActivityRecognitionResult");
        map.put("com.huawei.hms.location.ActivityIdentificationResponse", "org.xms.g.location.ActivityRecognitionResult");
        map.put("com.google.android.gms.location.ActivityTransition", "org.xms.g.location.ActivityTransition");
        map.put("com.huawei.hms.location.ActivityConversionInfo", "org.xms.g.location.ActivityTransition");
        map.put("com.google.android.gms.location.ActivityTransition.Builder", "org.xms.g.location.ActivityTransition$Builder");
        map.put("com.huawei.hms.location.ActivityConversionInfo.Builder", "org.xms.g.location.ActivityTransition$Builder");
        map.put("com.google.android.gms.location.ActivityTransitionEvent", "org.xms.g.location.ActivityTransitionEvent");
        map.put("com.huawei.hms.location.ActivityConversionData", "org.xms.g.location.ActivityTransitionEvent");
        map.put("com.google.android.gms.location.ActivityTransitionRequest", "org.xms.g.location.ActivityTransitionRequest");
        map.put("com.huawei.hms.location.ActivityConversionRequest", "org.xms.g.location.ActivityTransitionRequest");
        map.put("com.google.android.gms.location.ActivityTransitionResult", "org.xms.g.location.ActivityTransitionResult");
        map.put("com.huawei.hms.location.ActivityConversionResponse", "org.xms.g.location.ActivityTransitionResult");
        map.put("com.google.android.gms.location.DetectedActivity", "org.xms.g.location.DetectedActivity");
        map.put("com.huawei.hms.location.ActivityIdentificationData", "org.xms.g.location.DetectedActivity");
        map.put("com.google.android.gms.location.FusedLocationProviderApi", "org.xms.g.location.FusedLocationProviderApi$XImpl");
        map.put("com.google.android.gms.location.FusedLocationProviderClient", "org.xms.g.location.FusedLocationProviderClient");
        map.put("com.huawei.hms.location.FusedLocationProviderClient", "org.xms.g.location.FusedLocationProviderClient");
        map.put("com.google.android.gms.location.Geofence.Builder", "org.xms.g.location.Geofence$Builder");
        map.put("com.huawei.hms.location.Geofence.Builder", "org.xms.g.location.Geofence$Builder");
        map.put("com.google.android.gms.location.Geofence", "org.xms.g.location.Geofence$XImpl");
        map.put("com.huawei.hms.location.Geofence", "org.xms.g.location.Geofence$XImpl");
        map.put("com.google.android.gms.location.GeofenceStatusCodes", "org.xms.g.location.GeofenceStatusCodes");
        map.put("com.huawei.hms.location.GeofenceErrorCodes", "org.xms.g.location.GeofenceStatusCodes");
        map.put("com.google.android.gms.location.GeofencingApi", "org.xms.g.location.GeofencingApi$XImpl");
        map.put("com.google.android.gms.location.GeofencingClient", "org.xms.g.location.GeofencingClient");
        map.put("com.huawei.hms.location.GeofenceService", "org.xms.g.location.GeofencingClient");
        map.put("com.google.android.gms.location.GeofencingEvent", "org.xms.g.location.GeofencingEvent");
        map.put("com.huawei.hms.location.GeofenceData", "org.xms.g.location.GeofencingEvent");
        map.put("com.google.android.gms.location.GeofencingRequest", "org.xms.g.location.GeofencingRequest");
        map.put("com.huawei.hms.location.GeofenceRequest", "org.xms.g.location.GeofencingRequest");
        map.put("com.google.android.gms.location.GeofencingRequest.Builder", "org.xms.g.location.GeofencingRequest$Builder");
        map.put("com.huawei.hms.location.GeofenceRequest.Builder", "org.xms.g.location.GeofencingRequest$Builder");
        map.put("com.google.android.gms.location.LocationAvailability", "org.xms.g.location.LocationAvailability");
        map.put("com.huawei.hms.location.LocationAvailability", "org.xms.g.location.LocationAvailability");
        map.put("com.google.android.gms.location.LocationCallback", "org.xms.g.location.LocationCallback");
        map.put("com.huawei.hms.location.LocationCallback", "org.xms.g.location.LocationCallback");
        map.put("com.google.android.gms.location.LocationListener", "org.xms.g.location.LocationListener$XImpl");
        map.put("com.google.android.gms.location.LocationRequest", "org.xms.g.location.LocationRequest");
        map.put("com.huawei.hms.location.LocationRequest", "org.xms.g.location.LocationRequest");
        map.put("com.google.android.gms.location.LocationResult", "org.xms.g.location.LocationResult");
        map.put("com.huawei.hms.location.LocationResult", "org.xms.g.location.LocationResult");
        map.put("com.google.android.gms.location.LocationServices", "org.xms.g.location.LocationServices");
        map.put("com.huawei.hms.location.LocationServices", "org.xms.g.location.LocationServices");
        map.put("com.google.android.gms.location.LocationSettingsRequest", "org.xms.g.location.LocationSettingsRequest");
        map.put("com.huawei.hms.location.LocationSettingsRequest", "org.xms.g.location.LocationSettingsRequest");
        map.put("com.google.android.gms.location.LocationSettingsRequest.Builder", "org.xms.g.location.LocationSettingsRequest$Builder");
        map.put("com.huawei.hms.location.LocationSettingsRequest.Builder", "org.xms.g.location.LocationSettingsRequest$Builder");
        map.put("com.google.android.gms.location.LocationSettingsResponse", "org.xms.g.location.LocationSettingsResponse");
        map.put("com.huawei.hms.location.LocationSettingsResponse", "org.xms.g.location.LocationSettingsResponse");
        map.put("com.google.android.gms.location.LocationSettingsResult", "org.xms.g.location.LocationSettingsResult");
        map.put("com.huawei.hms.location.LocationSettingsResult", "org.xms.g.location.LocationSettingsResult");
        map.put("com.google.android.gms.location.LocationSettingsStates", "org.xms.g.location.LocationSettingsStates");
        map.put("com.huawei.hms.location.LocationSettingsStates", "org.xms.g.location.LocationSettingsStates");
        map.put("com.google.android.gms.location.LocationSettingsStatusCodes", "org.xms.g.location.LocationSettingsStatusCodes");
        map.put("com.huawei.hms.location.LocationSettingsStatusCodes", "org.xms.g.location.LocationSettingsStatusCodes");
        map.put("com.google.android.gms.location.LocationStatusCodes", "org.xms.g.location.LocationStatusCodes");
        map.put("com.google.android.gms.location.SettingsApi", "org.xms.g.location.SettingsApi$XImpl");
        map.put("com.google.android.gms.location.SettingsClient", "org.xms.g.location.SettingsClient");
        map.put("com.huawei.hms.location.SettingsClient", "org.xms.g.location.SettingsClient");
        map.put("com.google.android.gms.maps.CameraUpdate", "org.xms.g.maps.CameraUpdate");
        map.put("com.huawei.hms.maps.CameraUpdate", "org.xms.g.maps.CameraUpdate");
        map.put("com.google.android.gms.maps.CameraUpdateFactory", "org.xms.g.maps.CameraUpdateFactory");
        map.put("com.huawei.hms.maps.CameraUpdateFactory", "org.xms.g.maps.CameraUpdateFactory");
        map.put("com.google.android.gms.maps.GoogleMap", "org.xms.g.maps.ExtensionMap");
        map.put("com.huawei.hms.maps.HuaweiMap", "org.xms.g.maps.ExtensionMap");
        map.put("com.google.android.gms.maps.GoogleMap.CancelableCallback", "org.xms.g.maps.ExtensionMap$CancelableCallback$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.CancelableCallback", "org.xms.g.maps.ExtensionMap$CancelableCallback$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.InfoWindowAdapter", "org.xms.g.maps.ExtensionMap$InfoWindowAdapter$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter", "org.xms.g.maps.ExtensionMap$InfoWindowAdapter$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnCameraChangeListener", "org.xms.g.maps.ExtensionMap$OnCameraChangeListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnCameraIdleListener", "org.xms.g.maps.ExtensionMap$OnCameraIdleListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener", "org.xms.g.maps.ExtensionMap$OnCameraIdleListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener", "org.xms.g.maps.ExtensionMap$OnCameraMoveCanceledListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener", "org.xms.g.maps.ExtensionMap$OnCameraMoveCanceledListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnCameraMoveListener", "org.xms.g.maps.ExtensionMap$OnCameraMoveListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener", "org.xms.g.maps.ExtensionMap$OnCameraMoveListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener", "org.xms.g.maps.ExtensionMap$OnCameraMoveStartedListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener", "org.xms.g.maps.ExtensionMap$OnCameraMoveStartedListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnCircleClickListener", "org.xms.g.maps.ExtensionMap$OnCircleClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnCircleClickListener", "org.xms.g.maps.ExtensionMap$OnCircleClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener", "org.xms.g.maps.ExtensionMap$OnGroundOverlayClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener", "org.xms.g.maps.ExtensionMap$OnGroundOverlayClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener", "org.xms.g.maps.ExtensionMap$OnIndoorStateChangeListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener", "org.xms.g.maps.ExtensionMap$OnIndoorStateChangeListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener", "org.xms.g.maps.ExtensionMap$OnInfoWindowClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener", "org.xms.g.maps.ExtensionMap$OnInfoWindowClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener", "org.xms.g.maps.ExtensionMap$OnInfoWindowCloseListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener", "org.xms.g.maps.ExtensionMap$OnInfoWindowCloseListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener", "org.xms.g.maps.ExtensionMap$OnInfoWindowLongClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener", "org.xms.g.maps.ExtensionMap$OnInfoWindowLongClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnMapClickListener", "org.xms.g.maps.ExtensionMap$OnMapClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnMapClickListener", "org.xms.g.maps.ExtensionMap$OnMapClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback", "org.xms.g.maps.ExtensionMap$OnMapLoadedCallback$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback", "org.xms.g.maps.ExtensionMap$OnMapLoadedCallback$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnMapLongClickListener", "org.xms.g.maps.ExtensionMap$OnMapLongClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener", "org.xms.g.maps.ExtensionMap$OnMapLongClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnMarkerClickListener", "org.xms.g.maps.ExtensionMap$OnMarkerClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener", "org.xms.g.maps.ExtensionMap$OnMarkerClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnMarkerDragListener", "org.xms.g.maps.ExtensionMap$OnMarkerDragListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener", "org.xms.g.maps.ExtensionMap$OnMarkerDragListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener", "org.xms.g.maps.ExtensionMap$OnMyLocationButtonClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener", "org.xms.g.maps.ExtensionMap$OnMyLocationButtonClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener", "org.xms.g.maps.ExtensionMap$OnMyLocationChangeListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener", "org.xms.g.maps.ExtensionMap$OnMyLocationClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener", "org.xms.g.maps.ExtensionMap$OnMyLocationClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnPoiClickListener", "org.xms.g.maps.ExtensionMap$OnPoiClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnPoiClickListener", "org.xms.g.maps.ExtensionMap$OnPoiClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnPolygonClickListener", "org.xms.g.maps.ExtensionMap$OnPolygonClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener", "org.xms.g.maps.ExtensionMap$OnPolygonClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.OnPolylineClickListener", "org.xms.g.maps.ExtensionMap$OnPolylineClickListener$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener", "org.xms.g.maps.ExtensionMap$OnPolylineClickListener$XImpl");
        map.put("com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback", "org.xms.g.maps.ExtensionMap$SnapshotReadyCallback$XImpl");
        map.put("com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback", "org.xms.g.maps.ExtensionMap$SnapshotReadyCallback$XImpl");
        map.put("com.google.android.gms.maps.GoogleMapOptions", "org.xms.g.maps.ExtensionMapOptions");
        map.put("com.huawei.hms.maps.HuaweiMapOptions", "org.xms.g.maps.ExtensionMapOptions");
        map.put("com.google.android.gms.maps.LocationSource.OnLocationChangedListener", "org.xms.g.maps.LocationSource$OnLocationChangedListener$XImpl");
        map.put("com.huawei.hms.maps.LocationSource.OnLocationChangedListener", "org.xms.g.maps.LocationSource$OnLocationChangedListener$XImpl");
        map.put("com.google.android.gms.maps.LocationSource", "org.xms.g.maps.LocationSource$XImpl");
        map.put("com.huawei.hms.maps.LocationSource", "org.xms.g.maps.LocationSource$XImpl");
        map.put("com.google.android.gms.maps.MapFragment", "org.xms.g.maps.MapFragment");
        map.put("com.google.android.gms.maps.MapView", "org.xms.g.maps.MapView");
        map.put("com.huawei.hms.maps.MapView", "org.xms.g.maps.MapView");
        map.put("com.google.android.gms.maps.MapsInitializer", "org.xms.g.maps.MapsInitializer");
        map.put("com.huawei.hms.maps.MapsInitializer", "org.xms.g.maps.MapsInitializer");
        map.put("com.google.android.gms.maps.OnMapReadyCallback", "org.xms.g.maps.OnMapReadyCallback$XImpl");
        map.put("com.huawei.hms.maps.OnMapReadyCallback", "org.xms.g.maps.OnMapReadyCallback$XImpl");
        map.put("com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback", "org.xms.g.maps.OnStreetViewPanoramaReadyCallback$XImpl");
        map.put("com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback", "org.xms.g.maps.OnStreetViewPanoramaReadyCallback$XImpl");
        map.put("com.google.android.gms.maps.Projection", "org.xms.g.maps.Projection");
        map.put("com.huawei.hms.maps.Projection", "org.xms.g.maps.Projection");
        map.put("com.google.android.gms.maps.StreetViewPanorama", "org.xms.g.maps.StreetViewPanorama");
        map.put("com.huawei.hms.maps.StreetViewPanorama", "org.xms.g.maps.StreetViewPanorama");
        map.put("com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener", "org.xms.g.maps.StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener$XImpl");
        map.put("com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener", "org.xms.g.maps.StreetViewPanorama$OnStreetViewPanoramaCameraChangeListener$XImpl");
        map.put("com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener", "org.xms.g.maps.StreetViewPanorama$OnStreetViewPanoramaChangeListener$XImpl");
        map.put("com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener", "org.xms.g.maps.StreetViewPanorama$OnStreetViewPanoramaChangeListener$XImpl");
        map.put("com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener", "org.xms.g.maps.StreetViewPanorama$OnStreetViewPanoramaClickListener$XImpl");
        map.put("com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener", "org.xms.g.maps.StreetViewPanorama$OnStreetViewPanoramaClickListener$XImpl");
        map.put("com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener", "org.xms.g.maps.StreetViewPanorama$OnStreetViewPanoramaLongClickListener$XImpl");
        map.put("com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener", "org.xms.g.maps.StreetViewPanorama$OnStreetViewPanoramaLongClickListener$XImpl");
        map.put("com.google.android.gms.maps.StreetViewPanoramaFragment", "org.xms.g.maps.StreetViewPanoramaFragment");
        map.put("com.huawei.hms.maps.StreetViewPanoramaFragment", "org.xms.g.maps.StreetViewPanoramaFragment");
        map.put("com.google.android.gms.maps.StreetViewPanoramaOptions", "org.xms.g.maps.StreetViewPanoramaOptions");
        map.put("com.huawei.hms.maps.StreetViewPanoramaOptions", "org.xms.g.maps.StreetViewPanoramaOptions");
        map.put("com.google.android.gms.maps.StreetViewPanoramaView", "org.xms.g.maps.StreetViewPanoramaView");
        map.put("com.huawei.hms.maps.StreetViewPanoramaView", "org.xms.g.maps.StreetViewPanoramaView");
        map.put("com.google.android.gms.maps.SupportMapFragment", "org.xms.g.maps.SupportMapFragment");
        map.put("com.google.android.gms.maps.SupportStreetViewPanoramaFragment", "org.xms.g.maps.SupportStreetViewPanoramaFragment");
        map.put("com.huawei.hms.maps.SupportStreetViewPanoramaFragment", "org.xms.g.maps.SupportStreetViewPanoramaFragment");
        map.put("com.google.android.gms.maps.UiSettings", "org.xms.g.maps.UiSettings");
        map.put("com.huawei.hms.maps.UiSettings", "org.xms.g.maps.UiSettings");
        map.put("com.google.android.gms.maps.model.BitmapDescriptor", "org.xms.g.maps.model.BitmapDescriptor");
        map.put("com.huawei.hms.maps.model.BitmapDescriptor", "org.xms.g.maps.model.BitmapDescriptor");
        map.put("com.google.android.gms.maps.model.BitmapDescriptorFactory", "org.xms.g.maps.model.BitmapDescriptorFactory");
        map.put("com.huawei.hms.maps.model.BitmapDescriptorFactory", "org.xms.g.maps.model.BitmapDescriptorFactory");
        map.put("com.google.android.gms.maps.model.ButtCap", "org.xms.g.maps.model.ButtCap");
        map.put("com.huawei.hms.maps.model.ButtCap", "org.xms.g.maps.model.ButtCap");
        map.put("com.google.android.gms.maps.model.CameraPosition", "org.xms.g.maps.model.CameraPosition");
        map.put("com.huawei.hms.maps.model.CameraPosition", "org.xms.g.maps.model.CameraPosition");
        map.put("com.google.android.gms.maps.model.CameraPosition.Builder", "org.xms.g.maps.model.CameraPosition$Builder");
        map.put("com.huawei.hms.maps.model.CameraPosition.Builder", "org.xms.g.maps.model.CameraPosition$Builder");
        map.put("com.google.android.gms.maps.model.Cap", "org.xms.g.maps.model.Cap");
        map.put("com.huawei.hms.maps.model.Cap", "org.xms.g.maps.model.Cap");
        map.put("com.google.android.gms.maps.model.Circle", "org.xms.g.maps.model.Circle");
        map.put("com.huawei.hms.maps.model.Circle", "org.xms.g.maps.model.Circle");
        map.put("com.google.android.gms.maps.model.CircleOptions", "org.xms.g.maps.model.CircleOptions");
        map.put("com.huawei.hms.maps.model.CircleOptions", "org.xms.g.maps.model.CircleOptions");
        map.put("com.google.android.gms.maps.model.CustomCap", "org.xms.g.maps.model.CustomCap");
        map.put("com.huawei.hms.maps.model.CustomCap", "org.xms.g.maps.model.CustomCap");
        map.put("com.google.android.gms.maps.model.Dash", "org.xms.g.maps.model.Dash");
        map.put("com.huawei.hms.maps.model.Dash", "org.xms.g.maps.model.Dash");
        map.put("com.google.android.gms.maps.model.Dot", "org.xms.g.maps.model.Dot");
        map.put("com.huawei.hms.maps.model.Dot", "org.xms.g.maps.model.Dot");
        map.put("com.google.android.gms.maps.model.Gap", "org.xms.g.maps.model.Gap");
        map.put("com.huawei.hms.maps.model.Gap", "org.xms.g.maps.model.Gap");
        map.put("com.google.android.gms.maps.model.GroundOverlay", "org.xms.g.maps.model.GroundOverlay");
        map.put("com.huawei.hms.maps.model.GroundOverlay", "org.xms.g.maps.model.GroundOverlay");
        map.put("com.google.android.gms.maps.model.GroundOverlayOptions", "org.xms.g.maps.model.GroundOverlayOptions");
        map.put("com.huawei.hms.maps.model.GroundOverlayOptions", "org.xms.g.maps.model.GroundOverlayOptions");
        map.put("com.google.android.gms.maps.model.IndoorBuilding", "org.xms.g.maps.model.IndoorBuilding");
        map.put("com.huawei.hms.maps.model.IndoorBuilding", "org.xms.g.maps.model.IndoorBuilding");
        map.put("com.google.android.gms.maps.model.IndoorLevel", "org.xms.g.maps.model.IndoorLevel");
        map.put("com.huawei.hms.maps.model.IndoorLevel", "org.xms.g.maps.model.IndoorLevel");
        map.put("com.google.android.gms.maps.model.JointType", "org.xms.g.maps.model.JointType");
        map.put("com.huawei.hms.maps.model.JointType", "org.xms.g.maps.model.JointType");
        map.put("com.google.android.gms.maps.model.LatLng", "org.xms.g.maps.model.LatLng");
        map.put("com.huawei.hms.maps.model.LatLng", "org.xms.g.maps.model.LatLng");
        map.put("com.google.android.gms.maps.model.LatLngBounds", "org.xms.g.maps.model.LatLngBounds");
        map.put("com.huawei.hms.maps.model.LatLngBounds", "org.xms.g.maps.model.LatLngBounds");
        map.put("com.google.android.gms.maps.model.LatLngBounds.Builder", "org.xms.g.maps.model.LatLngBounds$Builder");
        map.put("com.huawei.hms.maps.model.LatLngBounds.Builder", "org.xms.g.maps.model.LatLngBounds$Builder");
        map.put("com.google.android.gms.maps.model.MapStyleOptions", "org.xms.g.maps.model.MapStyleOptions");
        map.put("com.huawei.hms.maps.model.MapStyleOptions", "org.xms.g.maps.model.MapStyleOptions");
        map.put("com.google.android.gms.maps.model.Marker", "org.xms.g.maps.model.Marker");
        map.put("com.huawei.hms.maps.model.Marker", "org.xms.g.maps.model.Marker");
        map.put("com.google.android.gms.maps.model.MarkerOptions", "org.xms.g.maps.model.MarkerOptions");
        map.put("com.huawei.hms.maps.model.MarkerOptions", "org.xms.g.maps.model.MarkerOptions");
        map.put("com.google.android.gms.maps.model.PatternItem", "org.xms.g.maps.model.PatternItem");
        map.put("com.huawei.hms.maps.model.PatternItem", "org.xms.g.maps.model.PatternItem");
        map.put("com.google.android.gms.maps.model.PointOfInterest", "org.xms.g.maps.model.PointOfInterest");
        map.put("com.huawei.hms.maps.model.PointOfInterest", "org.xms.g.maps.model.PointOfInterest");
        map.put("com.google.android.gms.maps.model.Polygon", "org.xms.g.maps.model.Polygon");
        map.put("com.huawei.hms.maps.model.Polygon", "org.xms.g.maps.model.Polygon");
        map.put("com.google.android.gms.maps.model.PolygonOptions", "org.xms.g.maps.model.PolygonOptions");
        map.put("com.huawei.hms.maps.model.PolygonOptions", "org.xms.g.maps.model.PolygonOptions");
        map.put("com.google.android.gms.maps.model.Polyline", "org.xms.g.maps.model.Polyline");
        map.put("com.huawei.hms.maps.model.Polyline", "org.xms.g.maps.model.Polyline");
        map.put("com.google.android.gms.maps.model.PolylineOptions", "org.xms.g.maps.model.PolylineOptions");
        map.put("com.huawei.hms.maps.model.PolylineOptions", "org.xms.g.maps.model.PolylineOptions");
        map.put("com.google.android.gms.maps.model.RoundCap", "org.xms.g.maps.model.RoundCap");
        map.put("com.huawei.hms.maps.model.RoundCap", "org.xms.g.maps.model.RoundCap");
        map.put("com.google.android.gms.maps.model.RuntimeRemoteException", "org.xms.g.maps.model.RuntimeRemoteException");
        map.put("com.huawei.hms.maps.model.RuntimeRemoteException", "org.xms.g.maps.model.RuntimeRemoteException");
        map.put("com.google.android.gms.maps.model.SquareCap", "org.xms.g.maps.model.SquareCap");
        map.put("com.huawei.hms.maps.model.SquareCap", "org.xms.g.maps.model.SquareCap");
        map.put("com.google.android.gms.maps.model.StreetViewPanoramaCamera", "org.xms.g.maps.model.StreetViewPanoramaCamera");
        map.put("com.huawei.hms.maps.model.StreetViewPanoramaCamera", "org.xms.g.maps.model.StreetViewPanoramaCamera");
        map.put("com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder", "org.xms.g.maps.model.StreetViewPanoramaCamera$Builder");
        map.put("com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder", "org.xms.g.maps.model.StreetViewPanoramaCamera$Builder");
        map.put("com.google.android.gms.maps.model.StreetViewPanoramaLink", "org.xms.g.maps.model.StreetViewPanoramaLink");
        map.put("com.huawei.hms.maps.model.StreetViewPanoramaLink", "org.xms.g.maps.model.StreetViewPanoramaLink");
        map.put("com.google.android.gms.maps.model.StreetViewPanoramaLocation", "org.xms.g.maps.model.StreetViewPanoramaLocation");
        map.put("com.huawei.hms.maps.model.StreetViewPanoramaLocation", "org.xms.g.maps.model.StreetViewPanoramaLocation");
        map.put("com.google.android.gms.maps.model.StreetViewPanoramaOrientation", "org.xms.g.maps.model.StreetViewPanoramaOrientation");
        map.put("com.huawei.hms.maps.model.StreetViewPanoramaOrientation", "org.xms.g.maps.model.StreetViewPanoramaOrientation");
        map.put("com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder", "org.xms.g.maps.model.StreetViewPanoramaOrientation$Builder");
        map.put("com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder", "org.xms.g.maps.model.StreetViewPanoramaOrientation$Builder");
        map.put("com.google.android.gms.maps.model.StreetViewSource", "org.xms.g.maps.model.StreetViewSource");
        map.put("com.huawei.hms.maps.model.StreetViewSource", "org.xms.g.maps.model.StreetViewSource");
        map.put("com.google.android.gms.maps.model.Tile", "org.xms.g.maps.model.Tile");
        map.put("com.huawei.hms.maps.model.Tile", "org.xms.g.maps.model.Tile");
        map.put("com.google.android.gms.maps.model.TileOverlay", "org.xms.g.maps.model.TileOverlay");
        map.put("com.huawei.hms.maps.model.TileOverlay", "org.xms.g.maps.model.TileOverlay");
        map.put("com.google.android.gms.maps.model.TileOverlayOptions", "org.xms.g.maps.model.TileOverlayOptions");
        map.put("com.huawei.hms.maps.model.TileOverlayOptions", "org.xms.g.maps.model.TileOverlayOptions");
        map.put("com.google.android.gms.maps.model.TileProvider", "org.xms.g.maps.model.TileProvider$XImpl");
        map.put("com.huawei.hms.maps.model.TileProvider", "org.xms.g.maps.model.TileProvider$XImpl");
        map.put("com.google.android.gms.maps.model.UrlTileProvider", "org.xms.g.maps.model.UrlTileProvider$XImpl");
        map.put("com.huawei.hms.maps.model.UrlTileProvider", "org.xms.g.maps.model.UrlTileProvider$XImpl");
        map.put("com.google.android.gms.maps.model.VisibleRegion", "org.xms.g.maps.model.VisibleRegion");
        map.put("com.huawei.hms.maps.model.VisibleRegion", "org.xms.g.maps.model.VisibleRegion");
        map.put("com.google.android.gms.security.ProviderInstaller", "org.xms.g.security.ProviderInstaller");
        map.put("com.huawei.hms.security.SecComponentInstallWizard", "org.xms.g.security.ProviderInstaller");
        map.put("com.google.android.gms.security.ProviderInstaller.ProviderInstallListener", "org.xms.g.security.ProviderInstaller$ProviderInstallListener$XImpl");
        map.put("com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener", "org.xms.g.security.ProviderInstaller$ProviderInstallListener$XImpl");
        map.put("com.google.android.gms.tasks.CancellationToken", "org.xms.g.tasks.CancellationToken$XImpl");
        map.put("com.huawei.hmf.tasks.CancellationToken", "org.xms.g.tasks.CancellationToken$XImpl");
        map.put("com.google.android.gms.tasks.CancellationTokenSource", "org.xms.g.tasks.CancellationTokenSource");
        map.put("com.huawei.hmf.tasks.CancellationTokenSource", "org.xms.g.tasks.CancellationTokenSource");
        map.put("com.google.android.gms.tasks.Continuation", "org.xms.g.tasks.Continuation$XImpl");
        map.put("com.huawei.hmf.tasks.Continuation", "org.xms.g.tasks.Continuation$XImpl");
        map.put("com.google.android.gms.tasks.OnCanceledListener", "org.xms.g.tasks.OnCanceledListener$XImpl");
        map.put("com.huawei.hmf.tasks.OnCanceledListener", "org.xms.g.tasks.OnCanceledListener$XImpl");
        map.put("com.google.android.gms.tasks.OnCompleteListener", "org.xms.g.tasks.OnCompleteListener$XImpl");
        map.put("com.huawei.hmf.tasks.OnCompleteListener", "org.xms.g.tasks.OnCompleteListener$XImpl");
        map.put("com.google.android.gms.tasks.OnFailureListener", "org.xms.g.tasks.OnFailureListener$XImpl");
        map.put("com.huawei.hmf.tasks.OnFailureListener", "org.xms.g.tasks.OnFailureListener$XImpl");
        map.put("com.google.android.gms.tasks.OnSuccessListener", "org.xms.g.tasks.OnSuccessListener$XImpl");
        map.put("com.huawei.hmf.tasks.OnSuccessListener", "org.xms.g.tasks.OnSuccessListener$XImpl");
        map.put("com.google.android.gms.tasks.OnTokenCanceledListener", "org.xms.g.tasks.OnTokenCanceledListener$XImpl");
        map.put("com.google.android.gms.tasks.RuntimeExecutionException", "org.xms.g.tasks.RuntimeExecutionException");
        map.put("com.google.android.gms.tasks.SuccessContinuation", "org.xms.g.tasks.SuccessContinuation$XImpl");
        map.put("com.huawei.hmf.tasks.SuccessContinuation", "org.xms.g.tasks.SuccessContinuation$XImpl");
        map.put("com.google.android.gms.tasks.Task", "org.xms.g.tasks.Task$XImpl");
        map.put("com.huawei.hmf.tasks.Task", "org.xms.g.tasks.Task$XImpl");
        map.put("com.google.android.gms.tasks.TaskCompletionSource", "org.xms.g.tasks.TaskCompletionSource");
        map.put("com.huawei.hmf.tasks.TaskCompletionSource", "org.xms.g.tasks.TaskCompletionSource");
        map.put("com.google.android.gms.tasks.TaskExecutors", "org.xms.g.tasks.TaskExecutors");
        map.put("com.google.android.gms.tasks.Tasks", "org.xms.g.tasks.Tasks");
        map.put("com.huawei.hmf.tasks.Tasks", "org.xms.g.tasks.Tasks");
        G2H.put("com.google.android.gms.actions.SearchIntents", "com.huawei.hms.actions.SearchIntents");
        G2H.put("com.google.android.gms.common.ConnectionResult", "com.huawei.hms.api.ConnectionResult");
        G2H.put("com.google.android.gms.common.ErrorDialogFragment", "com.huawei.hms.common.ErrorDialogFragment");
        G2H.put("com.google.android.gms.common.GoogleApiAvailability", "com.huawei.hms.api.HuaweiApiAvailability");
        G2H.put("com.google.android.gms.common.GooglePlayServicesNotAvailableException", "com.huawei.hms.api.HuaweiServicesNotAvailableException");
        G2H.put("com.google.android.gms.common.GooglePlayServicesRepairableException", "com.huawei.hms.api.HuaweiServicesRepairableException");
        G2H.put("com.google.android.gms.common.GooglePlayServicesUtil", "com.huawei.hms.api.HuaweiMobileServicesUtil");
        G2H.put("com.google.android.gms.common.SupportErrorDialogFragment", "com.huawei.hms.common.ErrDlgFragmentForSupport");
        G2H.put("com.google.android.gms.common.UserRecoverableException", "com.huawei.hms.api.UserRecoverableException");
        G2H.put("com.google.android.gms.common.api.Api", "com.huawei.hms.api.Api");
        G2H.put("com.google.android.gms.common.api.Api.ApiOptions.HasOptions", "com.huawei.hms.api.Api.ApiOptions.HasOptions");
        G2H.put("com.google.android.gms.common.api.Api.ApiOptions.NoOptions", "com.huawei.hms.api.Api.ApiOptions.NoOptions");
        G2H.put("com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions", "com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions");
        G2H.put("com.google.android.gms.common.api.Api.ApiOptions.Optional", "com.huawei.hms.api.Api.ApiOptions.Optional");
        G2H.put("com.google.android.gms.common.api.Api.ApiOptions", "com.huawei.hms.api.Api.ApiOptions");
        G2H.put("com.google.android.gms.common.api.ApiException", "com.huawei.hms.common.ApiException");
        G2H.put("com.google.android.gms.common.api.AvailabilityException", "com.huawei.hms.common.api.AvailabilityException");
        G2H.put("com.google.android.gms.common.api.BooleanResult", "com.huawei.hms.common.api.BooleanResult");
        G2H.put("com.google.android.gms.common.api.CommonStatusCodes", "com.huawei.hms.common.api.CommonStatusCodes");
        G2H.put("com.google.android.gms.common.api.GoogleApiClient.Builder", "com.huawei.hms.api.HuaweiApiClient.Builder");
        G2H.put("com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks", "com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks");
        G2H.put("com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener", "com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener");
        G2H.put("com.google.android.gms.common.api.GoogleApiClient", "com.huawei.hms.api.HuaweiApiClient");
        G2H.put("com.google.android.gms.common.api.OptionalPendingResult", "com.huawei.hms.common.api.OptionalPendingResult");
        G2H.put("com.google.android.gms.common.api.PendingResult", "com.huawei.hms.support.api.client.PendingResult");
        G2H.put("com.google.android.gms.common.api.PendingResults", "com.huawei.hms.support.api.client.PendingResultsCreator");
        G2H.put("com.google.android.gms.common.api.Releasable", "com.huawei.hms.common.api.Releasable");
        G2H.put("com.google.android.gms.common.api.ResolvableApiException", "com.huawei.hms.common.ResolvableApiException");
        G2H.put("com.google.android.gms.common.api.ResolvingResultCallbacks", "com.huawei.hms.support.api.client.ResolvingResultCallbacks");
        G2H.put("com.google.android.gms.common.api.Response", "com.huawei.hms.common.api.Response");
        G2H.put("com.google.android.gms.common.api.Result", "com.huawei.hms.support.api.client.Result");
        G2H.put("com.google.android.gms.common.api.ResultCallback", "com.huawei.hms.support.api.client.ResultCallback");
        G2H.put("com.google.android.gms.common.api.ResultCallbacks", "com.huawei.hms.support.api.client.ResultCallbacks");
        G2H.put("com.google.android.gms.common.api.ResultTransform", "com.huawei.hms.support.api.client.ResultConvert");
        G2H.put("com.google.android.gms.common.api.Scope", "com.huawei.hms.support.api.entity.auth.Scope");
        G2H.put("com.google.android.gms.common.api.Status", "com.huawei.hms.support.api.client.Status");
        G2H.put("com.google.android.gms.common.api.TransformedResult", "com.huawei.hms.support.api.client.ConvertedResult");
        G2H.put("com.google.android.gms.common.api.UnsupportedApiCallException", "com.huawei.hms.common.api.UnsupportedApiCallException");
        G2H.put("com.google.android.gms.common.data.AbstractDataBuffer", "com.huawei.hms.common.data.AbstractDataBuffer");
        G2H.put("com.google.android.gms.common.data.DataBuffer", "com.huawei.hms.common.data.DataBuffer");
        G2H.put("com.google.android.gms.common.data.DataBufferObserver", "com.huawei.hms.common.data.DataBufferObserver");
        G2H.put("com.google.android.gms.common.data.DataBufferUtils", "com.huawei.hms.common.data.DataBufferUtils");
        G2H.put("com.google.android.gms.common.data.Freezable", "com.huawei.hms.common.data.Freezable");
        G2H.put("com.google.android.gms.common.data.FreezableUtils", "com.huawei.hms.common.data.FreezableUtils");
        G2H.put("com.google.android.gms.common.images.Size", "com.huawei.hms.common.size.Size");
        G2H.put("com.google.android.gms.common.images.WebImage", "com.huawei.hms.common.webserverpic.WebServerPic");
        G2H.put("com.google.android.gms.location.ActivityRecognition", "com.huawei.hms.location.ActivityIdentification");
        G2H.put("com.google.android.gms.location.ActivityRecognitionClient", "com.huawei.hms.location.ActivityIdentificationService");
        G2H.put("com.google.android.gms.location.ActivityRecognitionResult", "com.huawei.hms.location.ActivityIdentificationResponse");
        G2H.put("com.google.android.gms.location.ActivityTransition", "com.huawei.hms.location.ActivityConversionInfo");
        G2H.put("com.google.android.gms.location.ActivityTransition.Builder", "com.huawei.hms.location.ActivityConversionInfo.Builder");
        G2H.put("com.google.android.gms.location.ActivityTransitionEvent", "com.huawei.hms.location.ActivityConversionData");
        G2H.put("com.google.android.gms.location.ActivityTransitionRequest", "com.huawei.hms.location.ActivityConversionRequest");
        G2H.put("com.google.android.gms.location.ActivityTransitionResult", "com.huawei.hms.location.ActivityConversionResponse");
        G2H.put("com.google.android.gms.location.DetectedActivity", "com.huawei.hms.location.ActivityIdentificationData");
        G2H.put("com.google.android.gms.location.FusedLocationProviderClient", "com.huawei.hms.location.FusedLocationProviderClient");
        G2H.put("com.google.android.gms.location.Geofence.Builder", "com.huawei.hms.location.Geofence.Builder");
        G2H.put("com.google.android.gms.location.Geofence", "com.huawei.hms.location.Geofence");
        G2H.put("com.google.android.gms.location.GeofenceStatusCodes", "com.huawei.hms.location.GeofenceErrorCodes");
        G2H.put("com.google.android.gms.location.GeofencingClient", "com.huawei.hms.location.GeofenceService");
        G2H.put("com.google.android.gms.location.GeofencingEvent", "com.huawei.hms.location.GeofenceData");
        G2H.put("com.google.android.gms.location.GeofencingRequest", "com.huawei.hms.location.GeofenceRequest");
        G2H.put("com.google.android.gms.location.GeofencingRequest.Builder", "com.huawei.hms.location.GeofenceRequest.Builder");
        G2H.put("com.google.android.gms.location.LocationAvailability", "com.huawei.hms.location.LocationAvailability");
        G2H.put("com.google.android.gms.location.LocationCallback", "com.huawei.hms.location.LocationCallback");
        G2H.put("com.google.android.gms.location.LocationRequest", "com.huawei.hms.location.LocationRequest");
        G2H.put("com.google.android.gms.location.LocationResult", "com.huawei.hms.location.LocationResult");
        G2H.put("com.google.android.gms.location.LocationServices", "com.huawei.hms.location.LocationServices");
        G2H.put("com.google.android.gms.location.LocationSettingsRequest", "com.huawei.hms.location.LocationSettingsRequest");
        G2H.put("com.google.android.gms.location.LocationSettingsRequest.Builder", "com.huawei.hms.location.LocationSettingsRequest.Builder");
        G2H.put("com.google.android.gms.location.LocationSettingsResponse", "com.huawei.hms.location.LocationSettingsResponse");
        G2H.put("com.google.android.gms.location.LocationSettingsResult", "com.huawei.hms.location.LocationSettingsResult");
        G2H.put("com.google.android.gms.location.LocationSettingsStates", "com.huawei.hms.location.LocationSettingsStates");
        G2H.put("com.google.android.gms.location.LocationSettingsStatusCodes", "com.huawei.hms.location.LocationSettingsStatusCodes");
        G2H.put("com.google.android.gms.location.SettingsClient", "com.huawei.hms.location.SettingsClient");
        G2H.put("com.google.android.gms.maps.CameraUpdate", "com.huawei.hms.maps.CameraUpdate");
        G2H.put("com.google.android.gms.maps.CameraUpdateFactory", "com.huawei.hms.maps.CameraUpdateFactory");
        G2H.put("com.google.android.gms.maps.GoogleMap", "com.huawei.hms.maps.HuaweiMap");
        G2H.put("com.google.android.gms.maps.GoogleMap.CancelableCallback", "com.huawei.hms.maps.HuaweiMap.CancelableCallback");
        G2H.put("com.google.android.gms.maps.GoogleMap.InfoWindowAdapter", "com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnCameraIdleListener", "com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnCameraMoveListener", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnCircleClickListener", "com.huawei.hms.maps.HuaweiMap.OnCircleClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener", "com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener", "com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener", "com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener", "com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener", "com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnMapClickListener", "com.huawei.hms.maps.HuaweiMap.OnMapClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback", "com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnMapLongClickListener", "com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnMarkerClickListener", "com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnMarkerDragListener", "com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener", "com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener", "com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnPoiClickListener", "com.huawei.hms.maps.HuaweiMap.OnPoiClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnPolygonClickListener", "com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.OnPolylineClickListener", "com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener");
        G2H.put("com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback", "com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback");
        G2H.put("com.google.android.gms.maps.GoogleMapOptions", "com.huawei.hms.maps.HuaweiMapOptions");
        G2H.put("com.google.android.gms.maps.LocationSource.OnLocationChangedListener", "com.huawei.hms.maps.LocationSource.OnLocationChangedListener");
        G2H.put("com.google.android.gms.maps.LocationSource", "com.huawei.hms.maps.LocationSource");
        G2H.put("com.google.android.gms.maps.MapView", "com.huawei.hms.maps.MapView");
        G2H.put("com.google.android.gms.maps.MapsInitializer", "com.huawei.hms.maps.MapsInitializer");
        G2H.put("com.google.android.gms.maps.OnMapReadyCallback", "com.huawei.hms.maps.OnMapReadyCallback");
        G2H.put("com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback", "com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback");
        G2H.put("com.google.android.gms.maps.Projection", "com.huawei.hms.maps.Projection");
        G2H.put("com.google.android.gms.maps.StreetViewPanorama", "com.huawei.hms.maps.StreetViewPanorama");
        G2H.put("com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener", "com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener");
        G2H.put("com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener", "com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener");
        G2H.put("com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener", "com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener");
        G2H.put("com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener", "com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener");
        G2H.put("com.google.android.gms.maps.StreetViewPanoramaFragment", "com.huawei.hms.maps.StreetViewPanoramaFragment");
        G2H.put("com.google.android.gms.maps.StreetViewPanoramaOptions", "com.huawei.hms.maps.StreetViewPanoramaOptions");
        G2H.put("com.google.android.gms.maps.StreetViewPanoramaView", "com.huawei.hms.maps.StreetViewPanoramaView");
        G2H.put("com.google.android.gms.maps.SupportStreetViewPanoramaFragment", "com.huawei.hms.maps.SupportStreetViewPanoramaFragment");
        G2H.put("com.google.android.gms.maps.UiSettings", "com.huawei.hms.maps.UiSettings");
        G2H.put("com.google.android.gms.maps.model.BitmapDescriptor", "com.huawei.hms.maps.model.BitmapDescriptor");
        G2H.put("com.google.android.gms.maps.model.BitmapDescriptorFactory", "com.huawei.hms.maps.model.BitmapDescriptorFactory");
        G2H.put("com.google.android.gms.maps.model.ButtCap", "com.huawei.hms.maps.model.ButtCap");
        G2H.put("com.google.android.gms.maps.model.CameraPosition", "com.huawei.hms.maps.model.CameraPosition");
        G2H.put("com.google.android.gms.maps.model.CameraPosition.Builder", "com.huawei.hms.maps.model.CameraPosition.Builder");
        G2H.put("com.google.android.gms.maps.model.Cap", "com.huawei.hms.maps.model.Cap");
        G2H.put("com.google.android.gms.maps.model.Circle", "com.huawei.hms.maps.model.Circle");
        G2H.put("com.google.android.gms.maps.model.CircleOptions", "com.huawei.hms.maps.model.CircleOptions");
        G2H.put("com.google.android.gms.maps.model.CustomCap", "com.huawei.hms.maps.model.CustomCap");
        G2H.put("com.google.android.gms.maps.model.Dash", "com.huawei.hms.maps.model.Dash");
        G2H.put("com.google.android.gms.maps.model.Dot", "com.huawei.hms.maps.model.Dot");
        G2H.put("com.google.android.gms.maps.model.Gap", "com.huawei.hms.maps.model.Gap");
        G2H.put("com.google.android.gms.maps.model.GroundOverlay", "com.huawei.hms.maps.model.GroundOverlay");
        G2H.put("com.google.android.gms.maps.model.GroundOverlayOptions", "com.huawei.hms.maps.model.GroundOverlayOptions");
        G2H.put("com.google.android.gms.maps.model.IndoorBuilding", "com.huawei.hms.maps.model.IndoorBuilding");
        G2H.put("com.google.android.gms.maps.model.IndoorLevel", "com.huawei.hms.maps.model.IndoorLevel");
        G2H.put("com.google.android.gms.maps.model.JointType", "com.huawei.hms.maps.model.JointType");
        G2H.put("com.google.android.gms.maps.model.LatLng", "com.huawei.hms.maps.model.LatLng");
        G2H.put("com.google.android.gms.maps.model.LatLngBounds", "com.huawei.hms.maps.model.LatLngBounds");
        G2H.put("com.google.android.gms.maps.model.LatLngBounds.Builder", "com.huawei.hms.maps.model.LatLngBounds.Builder");
        G2H.put("com.google.android.gms.maps.model.MapStyleOptions", "com.huawei.hms.maps.model.MapStyleOptions");
        G2H.put("com.google.android.gms.maps.model.Marker", "com.huawei.hms.maps.model.Marker");
        G2H.put("com.google.android.gms.maps.model.MarkerOptions", "com.huawei.hms.maps.model.MarkerOptions");
        G2H.put("com.google.android.gms.maps.model.PatternItem", "com.huawei.hms.maps.model.PatternItem");
        G2H.put("com.google.android.gms.maps.model.PointOfInterest", "com.huawei.hms.maps.model.PointOfInterest");
        G2H.put("com.google.android.gms.maps.model.Polygon", "com.huawei.hms.maps.model.Polygon");
        G2H.put("com.google.android.gms.maps.model.PolygonOptions", "com.huawei.hms.maps.model.PolygonOptions");
        G2H.put("com.google.android.gms.maps.model.Polyline", "com.huawei.hms.maps.model.Polyline");
        G2H.put("com.google.android.gms.maps.model.PolylineOptions", "com.huawei.hms.maps.model.PolylineOptions");
        G2H.put("com.google.android.gms.maps.model.RoundCap", "com.huawei.hms.maps.model.RoundCap");
        G2H.put("com.google.android.gms.maps.model.RuntimeRemoteException", "com.huawei.hms.maps.model.RuntimeRemoteException");
        G2H.put("com.google.android.gms.maps.model.SquareCap", "com.huawei.hms.maps.model.SquareCap");
        G2H.put("com.google.android.gms.maps.model.StreetViewPanoramaCamera", "com.huawei.hms.maps.model.StreetViewPanoramaCamera");
        G2H.put("com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder", "com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder");
        G2H.put("com.google.android.gms.maps.model.StreetViewPanoramaLink", "com.huawei.hms.maps.model.StreetViewPanoramaLink");
        G2H.put("com.google.android.gms.maps.model.StreetViewPanoramaLocation", "com.huawei.hms.maps.model.StreetViewPanoramaLocation");
        G2H.put("com.google.android.gms.maps.model.StreetViewPanoramaOrientation", "com.huawei.hms.maps.model.StreetViewPanoramaOrientation");
        G2H.put("com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder", "com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder");
        G2H.put("com.google.android.gms.maps.model.StreetViewSource", "com.huawei.hms.maps.model.StreetViewSource");
        G2H.put("com.google.android.gms.maps.model.Tile", "com.huawei.hms.maps.model.Tile");
        G2H.put("com.google.android.gms.maps.model.TileOverlay", "com.huawei.hms.maps.model.TileOverlay");
        G2H.put("com.google.android.gms.maps.model.TileOverlayOptions", "com.huawei.hms.maps.model.TileOverlayOptions");
        G2H.put("com.google.android.gms.maps.model.TileProvider", "com.huawei.hms.maps.model.TileProvider");
        G2H.put("com.google.android.gms.maps.model.UrlTileProvider", "com.huawei.hms.maps.model.UrlTileProvider");
        G2H.put("com.google.android.gms.maps.model.VisibleRegion", "com.huawei.hms.maps.model.VisibleRegion");
        G2H.put("com.google.android.gms.security.ProviderInstaller", "com.huawei.hms.security.SecComponentInstallWizard");
        G2H.put("com.google.android.gms.security.ProviderInstaller.ProviderInstallListener", "com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener");
        G2H.put("com.google.android.gms.tasks.CancellationToken", "com.huawei.hmf.tasks.CancellationToken");
        G2H.put("com.google.android.gms.tasks.CancellationTokenSource", "com.huawei.hmf.tasks.CancellationTokenSource");
        G2H.put("com.google.android.gms.tasks.Continuation", "com.huawei.hmf.tasks.Continuation");
        G2H.put("com.google.android.gms.tasks.OnCanceledListener", "com.huawei.hmf.tasks.OnCanceledListener");
        G2H.put("com.google.android.gms.tasks.OnCompleteListener", "com.huawei.hmf.tasks.OnCompleteListener");
        G2H.put("com.google.android.gms.tasks.OnFailureListener", "com.huawei.hmf.tasks.OnFailureListener");
        G2H.put("com.google.android.gms.tasks.OnSuccessListener", "com.huawei.hmf.tasks.OnSuccessListener");
        G2H.put("com.google.android.gms.tasks.SuccessContinuation", "com.huawei.hmf.tasks.SuccessContinuation");
        G2H.put("com.google.android.gms.tasks.Task", "com.huawei.hmf.tasks.Task");
        G2H.put("com.google.android.gms.tasks.TaskCompletionSource", "com.huawei.hmf.tasks.TaskCompletionSource");
        G2H.put("com.google.android.gms.tasks.Tasks", "com.huawei.hmf.tasks.Tasks");
        H2G.put("com.huawei.hms.actions.SearchIntents", "com.google.android.gms.actions.SearchIntents");
        H2G.put("com.huawei.hms.api.ConnectionResult", "com.google.android.gms.common.ConnectionResult");
        H2G.put("com.huawei.hms.common.ErrorDialogFragment", "com.google.android.gms.common.ErrorDialogFragment");
        H2G.put("com.huawei.hms.api.HuaweiApiAvailability", "com.google.android.gms.common.GoogleApiAvailability");
        H2G.put("com.huawei.hms.api.HuaweiServicesNotAvailableException", "com.google.android.gms.common.GooglePlayServicesNotAvailableException");
        H2G.put("com.huawei.hms.api.HuaweiServicesRepairableException", "com.google.android.gms.common.GooglePlayServicesRepairableException");
        H2G.put("com.huawei.hms.api.HuaweiMobileServicesUtil", "com.google.android.gms.common.GooglePlayServicesUtil");
        H2G.put("com.huawei.hms.common.ErrDlgFragmentForSupport", "com.google.android.gms.common.SupportErrorDialogFragment");
        H2G.put("com.huawei.hms.api.UserRecoverableException", "com.google.android.gms.common.UserRecoverableException");
        H2G.put("com.huawei.hms.api.Api", "com.google.android.gms.common.api.Api");
        H2G.put("com.huawei.hms.api.Api.ApiOptions.HasOptions", "com.google.android.gms.common.api.Api.ApiOptions.HasOptions");
        H2G.put("com.huawei.hms.api.Api.ApiOptions.NoOptions", "com.google.android.gms.common.api.Api.ApiOptions.NoOptions");
        H2G.put("com.huawei.hms.api.Api.ApiOptions.NotRequiredOptions", "com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions");
        H2G.put("com.huawei.hms.api.Api.ApiOptions.Optional", "com.google.android.gms.common.api.Api.ApiOptions.Optional");
        H2G.put("com.huawei.hms.api.Api.ApiOptions", "com.google.android.gms.common.api.Api.ApiOptions");
        H2G.put("com.huawei.hms.common.ApiException", "com.google.android.gms.common.api.ApiException");
        H2G.put("com.huawei.hms.common.api.AvailabilityException", "com.google.android.gms.common.api.AvailabilityException");
        H2G.put("com.huawei.hms.common.api.BooleanResult", "com.google.android.gms.common.api.BooleanResult");
        H2G.put("com.huawei.hms.common.api.CommonStatusCodes", "com.google.android.gms.common.api.CommonStatusCodes");
        H2G.put("com.huawei.hms.api.HuaweiApiClient.Builder", "com.google.android.gms.common.api.GoogleApiClient.Builder");
        H2G.put("com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks", "com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks");
        H2G.put("com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener", "com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener");
        H2G.put("com.huawei.hms.api.HuaweiApiClient", "com.google.android.gms.common.api.GoogleApiClient");
        H2G.put("com.huawei.hms.common.api.OptionalPendingResult", "com.google.android.gms.common.api.OptionalPendingResult");
        H2G.put("com.huawei.hms.support.api.client.PendingResult", "com.google.android.gms.common.api.PendingResult");
        H2G.put("com.huawei.hms.support.api.client.PendingResultsCreator", "com.google.android.gms.common.api.PendingResults");
        H2G.put("com.huawei.hms.common.api.Releasable", "com.google.android.gms.common.api.Releasable");
        H2G.put("com.huawei.hms.common.ResolvableApiException", "com.google.android.gms.common.api.ResolvableApiException");
        H2G.put("com.huawei.hms.support.api.client.ResolvingResultCallbacks", "com.google.android.gms.common.api.ResolvingResultCallbacks");
        H2G.put("com.huawei.hms.common.api.Response", "com.google.android.gms.common.api.Response");
        H2G.put("com.huawei.hms.support.api.client.Result", "com.google.android.gms.common.api.Result");
        H2G.put("com.huawei.hms.support.api.client.ResultCallback", "com.google.android.gms.common.api.ResultCallback");
        H2G.put("com.huawei.hms.support.api.client.ResultCallbacks", "com.google.android.gms.common.api.ResultCallbacks");
        H2G.put("com.huawei.hms.support.api.client.ResultConvert", "com.google.android.gms.common.api.ResultTransform");
        H2G.put("com.huawei.hms.support.api.entity.auth.Scope", "com.google.android.gms.common.api.Scope");
        H2G.put("com.huawei.hms.support.api.client.Status", "com.google.android.gms.common.api.Status");
        H2G.put("com.huawei.hms.support.api.client.ConvertedResult", "com.google.android.gms.common.api.TransformedResult");
        H2G.put("com.huawei.hms.common.api.UnsupportedApiCallException", "com.google.android.gms.common.api.UnsupportedApiCallException");
        H2G.put("com.huawei.hms.common.data.AbstractDataBuffer", "com.google.android.gms.common.data.AbstractDataBuffer");
        H2G.put("com.huawei.hms.common.data.DataBuffer", "com.google.android.gms.common.data.DataBuffer");
        H2G.put("com.huawei.hms.common.data.DataBufferObserver", "com.google.android.gms.common.data.DataBufferObserver");
        H2G.put("com.huawei.hms.common.data.DataBufferUtils", "com.google.android.gms.common.data.DataBufferUtils");
        H2G.put("com.huawei.hms.common.data.Freezable", "com.google.android.gms.common.data.Freezable");
        H2G.put("com.huawei.hms.common.data.FreezableUtils", "com.google.android.gms.common.data.FreezableUtils");
        H2G.put("com.huawei.hms.common.size.Size", "com.google.android.gms.common.images.Size");
        H2G.put("com.huawei.hms.common.webserverpic.WebServerPic", "com.google.android.gms.common.images.WebImage");
        H2G.put("com.huawei.hms.location.ActivityIdentification", "com.google.android.gms.location.ActivityRecognition");
        H2G.put("com.huawei.hms.location.ActivityIdentificationService", "com.google.android.gms.location.ActivityRecognitionClient");
        H2G.put("com.huawei.hms.location.ActivityIdentificationResponse", "com.google.android.gms.location.ActivityRecognitionResult");
        H2G.put("com.huawei.hms.location.ActivityConversionInfo", "com.google.android.gms.location.ActivityTransition");
        H2G.put("com.huawei.hms.location.ActivityConversionInfo.Builder", "com.google.android.gms.location.ActivityTransition.Builder");
        H2G.put("com.huawei.hms.location.ActivityConversionData", "com.google.android.gms.location.ActivityTransitionEvent");
        H2G.put("com.huawei.hms.location.ActivityConversionRequest", "com.google.android.gms.location.ActivityTransitionRequest");
        H2G.put("com.huawei.hms.location.ActivityConversionResponse", "com.google.android.gms.location.ActivityTransitionResult");
        H2G.put("com.huawei.hms.location.ActivityIdentificationData", "com.google.android.gms.location.DetectedActivity");
        H2G.put("com.huawei.hms.location.FusedLocationProviderClient", "com.google.android.gms.location.FusedLocationProviderClient");
        H2G.put("com.huawei.hms.location.Geofence.Builder", "com.google.android.gms.location.Geofence.Builder");
        H2G.put("com.huawei.hms.location.Geofence", "com.google.android.gms.location.Geofence");
        H2G.put("com.huawei.hms.location.GeofenceErrorCodes", "com.google.android.gms.location.GeofenceStatusCodes");
        H2G.put("com.huawei.hms.location.GeofenceService", "com.google.android.gms.location.GeofencingClient");
        H2G.put("com.huawei.hms.location.GeofenceData", "com.google.android.gms.location.GeofencingEvent");
        H2G.put("com.huawei.hms.location.GeofenceRequest", "com.google.android.gms.location.GeofencingRequest");
        H2G.put("com.huawei.hms.location.GeofenceRequest.Builder", "com.google.android.gms.location.GeofencingRequest.Builder");
        H2G.put("com.huawei.hms.location.LocationAvailability", "com.google.android.gms.location.LocationAvailability");
        H2G.put("com.huawei.hms.location.LocationCallback", "com.google.android.gms.location.LocationCallback");
        H2G.put("com.huawei.hms.location.LocationRequest", "com.google.android.gms.location.LocationRequest");
        H2G.put("com.huawei.hms.location.LocationResult", "com.google.android.gms.location.LocationResult");
        H2G.put("com.huawei.hms.location.LocationServices", "com.google.android.gms.location.LocationServices");
        H2G.put("com.huawei.hms.location.LocationSettingsRequest", "com.google.android.gms.location.LocationSettingsRequest");
        H2G.put("com.huawei.hms.location.LocationSettingsRequest.Builder", "com.google.android.gms.location.LocationSettingsRequest.Builder");
        H2G.put("com.huawei.hms.location.LocationSettingsResponse", "com.google.android.gms.location.LocationSettingsResponse");
        H2G.put("com.huawei.hms.location.LocationSettingsResult", "com.google.android.gms.location.LocationSettingsResult");
        H2G.put("com.huawei.hms.location.LocationSettingsStates", "com.google.android.gms.location.LocationSettingsStates");
        H2G.put("com.huawei.hms.location.LocationSettingsStatusCodes", "com.google.android.gms.location.LocationSettingsStatusCodes");
        H2G.put("com.huawei.hms.location.SettingsClient", "com.google.android.gms.location.SettingsClient");
        H2G.put("com.huawei.hms.maps.CameraUpdate", "com.google.android.gms.maps.CameraUpdate");
        H2G.put("com.huawei.hms.maps.CameraUpdateFactory", "com.google.android.gms.maps.CameraUpdateFactory");
        H2G.put("com.huawei.hms.maps.HuaweiMap", "com.google.android.gms.maps.GoogleMap");
        H2G.put("com.huawei.hms.maps.HuaweiMap.CancelableCallback", "com.google.android.gms.maps.GoogleMap.CancelableCallback");
        H2G.put("com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter", "com.google.android.gms.maps.GoogleMap.InfoWindowAdapter");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener", "com.google.android.gms.maps.GoogleMap.OnCameraIdleListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener", "com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener", "com.google.android.gms.maps.GoogleMap.OnCameraMoveListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener", "com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnCircleClickListener", "com.google.android.gms.maps.GoogleMap.OnCircleClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener", "com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener", "com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener", "com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener", "com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener", "com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnMapClickListener", "com.google.android.gms.maps.GoogleMap.OnMapClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback", "com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener", "com.google.android.gms.maps.GoogleMap.OnMapLongClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener", "com.google.android.gms.maps.GoogleMap.OnMarkerClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener", "com.google.android.gms.maps.GoogleMap.OnMarkerDragListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener", "com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener", "com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnPoiClickListener", "com.google.android.gms.maps.GoogleMap.OnPoiClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener", "com.google.android.gms.maps.GoogleMap.OnPolygonClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener", "com.google.android.gms.maps.GoogleMap.OnPolylineClickListener");
        H2G.put("com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback", "com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback");
        H2G.put("com.huawei.hms.maps.HuaweiMapOptions", "com.google.android.gms.maps.GoogleMapOptions");
        H2G.put("com.huawei.hms.maps.LocationSource.OnLocationChangedListener", "com.google.android.gms.maps.LocationSource.OnLocationChangedListener");
        H2G.put("com.huawei.hms.maps.LocationSource", "com.google.android.gms.maps.LocationSource");
        H2G.put("com.huawei.hms.maps.MapView", "com.google.android.gms.maps.MapView");
        H2G.put("com.huawei.hms.maps.MapsInitializer", "com.google.android.gms.maps.MapsInitializer");
        H2G.put("com.huawei.hms.maps.OnMapReadyCallback", "com.google.android.gms.maps.OnMapReadyCallback");
        H2G.put("com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback", "com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback");
        H2G.put("com.huawei.hms.maps.Projection", "com.google.android.gms.maps.Projection");
        H2G.put("com.huawei.hms.maps.StreetViewPanorama", "com.google.android.gms.maps.StreetViewPanorama");
        H2G.put("com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener", "com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener");
        H2G.put("com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener", "com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener");
        H2G.put("com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener", "com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener");
        H2G.put("com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener", "com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener");
        H2G.put("com.huawei.hms.maps.StreetViewPanoramaFragment", "com.google.android.gms.maps.StreetViewPanoramaFragment");
        H2G.put("com.huawei.hms.maps.StreetViewPanoramaOptions", "com.google.android.gms.maps.StreetViewPanoramaOptions");
        H2G.put("com.huawei.hms.maps.StreetViewPanoramaView", "com.google.android.gms.maps.StreetViewPanoramaView");
        H2G.put("com.huawei.hms.maps.SupportStreetViewPanoramaFragment", "com.google.android.gms.maps.SupportStreetViewPanoramaFragment");
        H2G.put("com.huawei.hms.maps.UiSettings", "com.google.android.gms.maps.UiSettings");
        H2G.put("com.huawei.hms.maps.model.BitmapDescriptor", "com.google.android.gms.maps.model.BitmapDescriptor");
        H2G.put("com.huawei.hms.maps.model.BitmapDescriptorFactory", "com.google.android.gms.maps.model.BitmapDescriptorFactory");
        H2G.put("com.huawei.hms.maps.model.ButtCap", "com.google.android.gms.maps.model.ButtCap");
        H2G.put("com.huawei.hms.maps.model.CameraPosition", "com.google.android.gms.maps.model.CameraPosition");
        H2G.put("com.huawei.hms.maps.model.CameraPosition.Builder", "com.google.android.gms.maps.model.CameraPosition.Builder");
        H2G.put("com.huawei.hms.maps.model.Cap", "com.google.android.gms.maps.model.Cap");
        H2G.put("com.huawei.hms.maps.model.Circle", "com.google.android.gms.maps.model.Circle");
        H2G.put("com.huawei.hms.maps.model.CircleOptions", "com.google.android.gms.maps.model.CircleOptions");
        H2G.put("com.huawei.hms.maps.model.CustomCap", "com.google.android.gms.maps.model.CustomCap");
        H2G.put("com.huawei.hms.maps.model.Dash", "com.google.android.gms.maps.model.Dash");
        H2G.put("com.huawei.hms.maps.model.Dot", "com.google.android.gms.maps.model.Dot");
        H2G.put("com.huawei.hms.maps.model.Gap", "com.google.android.gms.maps.model.Gap");
        H2G.put("com.huawei.hms.maps.model.GroundOverlay", "com.google.android.gms.maps.model.GroundOverlay");
        H2G.put("com.huawei.hms.maps.model.GroundOverlayOptions", "com.google.android.gms.maps.model.GroundOverlayOptions");
        H2G.put("com.huawei.hms.maps.model.IndoorBuilding", "com.google.android.gms.maps.model.IndoorBuilding");
        H2G.put("com.huawei.hms.maps.model.IndoorLevel", "com.google.android.gms.maps.model.IndoorLevel");
        H2G.put("com.huawei.hms.maps.model.JointType", "com.google.android.gms.maps.model.JointType");
        H2G.put("com.huawei.hms.maps.model.LatLng", "com.google.android.gms.maps.model.LatLng");
        H2G.put("com.huawei.hms.maps.model.LatLngBounds", "com.google.android.gms.maps.model.LatLngBounds");
        H2G.put("com.huawei.hms.maps.model.LatLngBounds.Builder", "com.google.android.gms.maps.model.LatLngBounds.Builder");
        H2G.put("com.huawei.hms.maps.model.MapStyleOptions", "com.google.android.gms.maps.model.MapStyleOptions");
        H2G.put("com.huawei.hms.maps.model.Marker", "com.google.android.gms.maps.model.Marker");
        H2G.put("com.huawei.hms.maps.model.MarkerOptions", "com.google.android.gms.maps.model.MarkerOptions");
        H2G.put("com.huawei.hms.maps.model.PatternItem", "com.google.android.gms.maps.model.PatternItem");
        H2G.put("com.huawei.hms.maps.model.PointOfInterest", "com.google.android.gms.maps.model.PointOfInterest");
        H2G.put("com.huawei.hms.maps.model.Polygon", "com.google.android.gms.maps.model.Polygon");
        H2G.put("com.huawei.hms.maps.model.PolygonOptions", "com.google.android.gms.maps.model.PolygonOptions");
        H2G.put("com.huawei.hms.maps.model.Polyline", "com.google.android.gms.maps.model.Polyline");
        H2G.put("com.huawei.hms.maps.model.PolylineOptions", "com.google.android.gms.maps.model.PolylineOptions");
        H2G.put("com.huawei.hms.maps.model.RoundCap", "com.google.android.gms.maps.model.RoundCap");
        H2G.put("com.huawei.hms.maps.model.RuntimeRemoteException", "com.google.android.gms.maps.model.RuntimeRemoteException");
        H2G.put("com.huawei.hms.maps.model.SquareCap", "com.google.android.gms.maps.model.SquareCap");
        H2G.put("com.huawei.hms.maps.model.StreetViewPanoramaCamera", "com.google.android.gms.maps.model.StreetViewPanoramaCamera");
        H2G.put("com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder", "com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder");
        H2G.put("com.huawei.hms.maps.model.StreetViewPanoramaLink", "com.google.android.gms.maps.model.StreetViewPanoramaLink");
        H2G.put("com.huawei.hms.maps.model.StreetViewPanoramaLocation", "com.google.android.gms.maps.model.StreetViewPanoramaLocation");
        H2G.put("com.huawei.hms.maps.model.StreetViewPanoramaOrientation", "com.google.android.gms.maps.model.StreetViewPanoramaOrientation");
        H2G.put("com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder", "com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder");
        H2G.put("com.huawei.hms.maps.model.StreetViewSource", "com.google.android.gms.maps.model.StreetViewSource");
        H2G.put("com.huawei.hms.maps.model.Tile", "com.google.android.gms.maps.model.Tile");
        H2G.put("com.huawei.hms.maps.model.TileOverlay", "com.google.android.gms.maps.model.TileOverlay");
        H2G.put("com.huawei.hms.maps.model.TileOverlayOptions", "com.google.android.gms.maps.model.TileOverlayOptions");
        H2G.put("com.huawei.hms.maps.model.TileProvider", "com.google.android.gms.maps.model.TileProvider");
        H2G.put("com.huawei.hms.maps.model.UrlTileProvider", "com.google.android.gms.maps.model.UrlTileProvider");
        H2G.put("com.huawei.hms.maps.model.VisibleRegion", "com.google.android.gms.maps.model.VisibleRegion");
        H2G.put("com.huawei.hms.security.SecComponentInstallWizard", "com.google.android.gms.security.ProviderInstaller");
        H2G.put("com.huawei.hms.security.SecComponentInstallWizard.SecComponentInstallWizardListener", "com.google.android.gms.security.ProviderInstaller.ProviderInstallListener");
        H2G.put("com.huawei.hmf.tasks.CancellationToken", "com.google.android.gms.tasks.CancellationToken");
        H2G.put("com.huawei.hmf.tasks.CancellationTokenSource", "com.google.android.gms.tasks.CancellationTokenSource");
        H2G.put("com.huawei.hmf.tasks.Continuation", "com.google.android.gms.tasks.Continuation");
        H2G.put("com.huawei.hmf.tasks.OnCanceledListener", "com.google.android.gms.tasks.OnCanceledListener");
        H2G.put("com.huawei.hmf.tasks.OnCompleteListener", "com.google.android.gms.tasks.OnCompleteListener");
        H2G.put("com.huawei.hmf.tasks.OnFailureListener", "com.google.android.gms.tasks.OnFailureListener");
        H2G.put("com.huawei.hmf.tasks.OnSuccessListener", "com.google.android.gms.tasks.OnSuccessListener");
        H2G.put("com.huawei.hmf.tasks.SuccessContinuation", "com.google.android.gms.tasks.SuccessContinuation");
        H2G.put("com.huawei.hmf.tasks.Task", "com.google.android.gms.tasks.Task");
        H2G.put("com.huawei.hmf.tasks.TaskCompletionSource", "com.google.android.gms.tasks.TaskCompletionSource");
        H2G.put("com.huawei.hmf.tasks.Tasks", "com.google.android.gms.tasks.Tasks");
    }
}
