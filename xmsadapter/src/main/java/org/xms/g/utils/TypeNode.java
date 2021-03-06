package org.xms.g.utils;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

public class TypeNode implements Serializable {
    private Type type;

    /**
     * method parameter
     */
    private Parameter parameter;

    /**
     * owner to resolve current type
     */
    private TypeNode owner;

    /**
     * component type if current is array
     */
    private TypeNode componentType;

    /**
     * class resolved by current type
     */
    private Class<?> clazz;

    private TypeNode superClassType;

    private List<TypeNode> interfaceTypes;

    private TypeNode(Type type, Parameter parameter, TypeNode owner) {
        this.type = type;
        this.parameter = parameter;
        this.owner = owner;
        this.clazz = getClassByType();
    }

    /**
     * @return get java type
     */
    public Type getType() {
        return this.type;
    }

    public Class<?> getClazz() {
        return this.clazz;
    }

    /**
     * Create TypeNode by Type or Parameter
     *
     * @param methodParameter method parameter
     * @param targetType set it null if method parameter is not null
     * @return TypeNode
     */
    public static TypeNode createMethodParameterType(Parameter methodParameter, Type targetType) {
        TypeNode receiverClassNode = createTypeNode(methodParameter.getReceiverClass(), null, null);
        TypeNode owner = receiverClassNode.findTypeNodeFromOwner(methodParameter.getDeclaringClass());
        return createTypeNode(targetType, methodParameter, owner);
    }

    /**
     * @return Component TypeNode if this is Array type
     */
    public TypeNode resolveComponentType() {
        if (this.type == null) {
            return null;
        }
        if (this.componentType != null) {
            return this.componentType;
        }
        if (this.type instanceof Class) {
            Class<?> componentType = ((Class<?>) this.type).getComponentType();
            return createTypeNode(componentType, null, this.owner);
        }
        if (this.type instanceof GenericArrayType) {
            return createTypeNode(((GenericArrayType) this.type).getGenericComponentType(), null, this.owner);
        }
        return handleSpecialType().resolveComponentType();
    }

    /**
     *
     * @return true or false
     */
    private boolean isArray() {
        if (this.type == null) {
            return false;
        }

        if (this.type instanceof Class) {
            Class<?> cl = (Class<?>) this.type;
            return cl.isArray();
        }

        if (this.type instanceof GenericArrayType) {
            return true;
        }

        TypeNode node = handleSpecialType();
        return node.isArray();
    }

    /**
     * resolve declaringClass from receiver class
     *
     * @param declaringClass declaring class of current method parameter
     * @return
     */
    private TypeNode findTypeNodeFromOwner(Class<?> declaringClass) {
        if (this.type == null || this.clazz == null || this.clazz == declaringClass) {
            return this;
        }

        for (TypeNode interfaceType : getInterfaces()) {
            TypeNode iNode = interfaceType.findTypeNodeFromOwner(declaringClass);
            if (iNode.getType() != null) {
                return iNode;
            }
        }
        return getSuperClassType().findTypeNodeFromOwner(declaringClass);
    }

    /**
     * generate super class TypeNode
     *
     * @return super class TypeNode
     */
    private TypeNode getSuperClassType() {
        if (this.clazz == null || this.clazz.getGenericSuperclass() == null) {
            return createTypeNode(null, null, null);
        }
        if (this.superClassType == null) {
            this.superClassType = createTypeNode(this.clazz.getGenericSuperclass(), null, this);
        }
        return this.superClassType;
    }

    /**
     * @return list of interface TypeNode
     */
    private List<TypeNode> getInterfaces() {
        if (this.clazz == null) {
            return new ArrayList<>();
        }

        if (this.interfaceTypes == null) {
            this.interfaceTypes = new ArrayList();
            Type[] genericInterfaces = this.clazz.getGenericInterfaces();
            for (int i = 0; i < genericInterfaces.length; i++) {
                this.interfaceTypes.add(createTypeNode(genericInterfaces[i], null, this));
            }
        }
        return this.interfaceTypes;
    }

    /**
     * @return class resolved by type
     */
    private Class<?> getClassByType() {
        if (this.type == null) {
            return null;
        }
        if (this.type instanceof Class) {
            return (Class<?>) this.type;
        }
        if (this.type instanceof GenericArrayType) {
            Class<?> component = resolveComponentType().getClazz();
            if (component == null) {
                return null;
            } else {
                return Array.newInstance(component, 0).getClass();
            }
        }
        return handleSpecialType().getClazz();
    }

    /**
     * This is to handler special Type as TypeVariable, WildcardType, ParameterizedType
     * 
     * @return TypeNode
     */
    private TypeNode handleSpecialType() {
        if (this.type instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable<?>) this.type;
            if (this.owner != null) {
                TypeNode node = this.owner.handleVariable(typeVariable);
                if (node.getType() != null) {
                    return node;
                }
            }
            return createTypeNode(getBounds(typeVariable.getBounds()), null, this.owner);
        }
        if (this.type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) this.type;
            Type node = getBounds(wildcardType.getUpperBounds());
            if (node == null) {
                node = getBounds(wildcardType.getLowerBounds());
            }
            return createTypeNode(node, null, this.owner);
        }
        if (this.type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = ((ParameterizedType) this.type);
            return createTypeNode(parameterizedType.getRawType(), null, this.owner);
        }
        return createTypeNode(null, null, null);
    }

    private Type getBounds(Type[] bounds) {
        if (bounds.length == 0) {
            return null;
        }

        if (bounds[0] == Object.class) {
            return null;
        }

        return bounds[0];
    }

    /**
     * @param typeVariable TypeVariable
     * @return TypeNode from TypeVariable
     */
    private TypeNode handleVariable(TypeVariable<?> typeVariable) {
        if (this.type instanceof TypeVariable) {
            return handleSpecialType().handleVariable(typeVariable);
        }
        if (this.type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) this.type;
            if (this.clazz == null) {
                return createTypeNode(null, null, null);
            }
            TypeVariable<?>[] variables = this.clazz.getTypeParameters();
            for (int i = 0; i < variables.length; i++) {
                if (variables[i].getName().equals(typeVariable.getName())) {
                    Type actualType = parameterizedType.getActualTypeArguments()[i];
                    return createTypeNode(actualType, null, this.owner);
                }
            }
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                return createTypeNode(ownerType, null, this.owner).handleVariable(typeVariable);
            }
        }
        if (this.owner != null) {
            return this.owner.handleVariable(typeVariable);
        }

        return createTypeNode(null, null, null);
    }

    /**
     * @param type type node
     * @param parameter method parameter
     * @param owner the owner to resolve current type
     * @return TypeNode
     */
    private static TypeNode createTypeNode(Type type, Parameter parameter, TypeNode owner) {
        if (type == null && parameter != null) {
            type = parameter.toGenericType();
        }

        return new TypeNode(type, parameter, owner);
    }
}
