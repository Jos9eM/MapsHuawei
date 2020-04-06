package org.xms.g.maps.model;

public final class RuntimeRemoteException extends java.lang.RuntimeException implements org.xms.g.utils.XGettable {
    public com.google.android.gms.maps.model.RuntimeRemoteException gInstance;
    public com.huawei.hms.maps.model.RuntimeRemoteException hInstance;
    
    public RuntimeRemoteException(com.google.android.gms.maps.model.RuntimeRemoteException param0, com.huawei.hms.maps.model.RuntimeRemoteException param1) {
        gInstance = param0;
        hInstance = param1;
    }
    
    public RuntimeRemoteException(android.os.RemoteException param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.RuntimeRemoteException(param0));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.RuntimeRemoteException(param0));
        }
    }
    
    public void setGInstance(com.google.android.gms.maps.model.RuntimeRemoteException param0) {
        this.gInstance = param0;
    }
    
    public void setHInstance(com.huawei.hms.maps.model.RuntimeRemoteException param0) {
        this.hInstance = param0;
    }
    
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    public static org.xms.g.maps.model.RuntimeRemoteException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.RuntimeRemoteException) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.RuntimeRemoteException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.RuntimeRemoteException;
        }
    }
}