package org.xms.g.utils;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class Parameter {
    /**
     * parameter hosted in method
     */
    private Method method;

    /**
     * parameter index
     */
    private int parameterId;

    /**
     * receiver class
     */
    private Class<?> receiverClass;

    /**
     * @param m method
     * @param id parameter index
     * @param clazz
     */
    Parameter(Method m, int id, Class<?> clazz) {
        assert m != null;
        assert id < m.getParameterTypes().length;
        this.method = m;
        this.parameterId = id;
        this.receiverClass = clazz;
    }

    /**
     * @return method
     */
    public Method getMethod() {
        return this.method;
    }

    /**
     * @return declaring class of method
     */
    public Class<?> getDeclaringClass() {
        return this.method.getDeclaringClass();
    }

    /**
     * @return parameter id
     */
    public int getParameterId() {
        return this.parameterId;
    }

    /**
     * @return receiver Class
     */
    public Class<?> getReceiverClass() {
        return this.receiverClass;
    }

    @Override
    public String toString() {
        return "method name : " + method.getName() + " paramter id : " + this.parameterId + " declaring class : "
            + method.getDeclaringClass().toString();
    }

    public Type toGenericType() {
        return this.method.getGenericParameterTypes()[this.parameterId];
    }
}
