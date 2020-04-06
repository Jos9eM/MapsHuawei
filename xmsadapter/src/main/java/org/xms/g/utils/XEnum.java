package org.xms.g.utils;

public abstract class XEnum<E extends XEnum<E>> extends XObject implements Comparable<E> {
    public XEnum(Object gInst, Object hInst) {
        super(gInst, hInst);
    }

    public final String name() {
        if (GlobalEnvSetting.isHms()) {
            return ((Enum) getHInstance()).name();
        } else {
            return ((Enum) getGInstance()).name();
        }
    }

    public final int ordinal() {
        if (GlobalEnvSetting.isHms()) {
            return ((Enum) getHInstance()).ordinal();
        } else {
            return ((Enum) getGInstance()).ordinal();
        }
    }

    public final boolean equals(Object other) {
        if (!(other instanceof XEnum)) {
            return false;
        }
        if (GlobalEnvSetting.isHms()) {
            return this.getHInstance() == ((XEnum) other).getHInstance();
        } else {
            return this.getGInstance() == ((XEnum) other).getGInstance();
        }
    }

    public final int hashCode() {
        if (GlobalEnvSetting.isHms()) {
            return getHInstance().hashCode();
        } else {
            return getGInstance().hashCode();
        }
    }

    public String toString() {
        if (GlobalEnvSetting.isHms()) {
            return getHInstance().toString();
        } else {
            return getGInstance().toString();
        }
    }

    @Override
    public final void setGInstance(Object gInst) {
        throw new RuntimeException("");
    }

    @Override
    public final void setHInstance(Object hInst) {
        throw new RuntimeException("");
    }

    public final int compareTo(E o) {
        XEnum<?> other = o;
        XEnum<E> self = this;
        if (self.getClass() != other.getClass() &&
                self.getDeclaringClass() != other.getDeclaringClass())
            throw new ClassCastException();
        return self.ordinal() - other.ordinal();
    }

    @SuppressWarnings("unchecked")
    public final Class<E> getDeclaringClass() {
        Class<?> clazz = getClass();
        Class<?> zuper = clazz.getSuperclass();
        return (zuper == Enum.class) ? (Class<E>) clazz : (Class<E>) zuper;
    }
}
