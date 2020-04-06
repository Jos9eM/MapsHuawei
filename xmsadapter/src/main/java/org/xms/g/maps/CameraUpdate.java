package org.xms.g.maps;

public final class CameraUpdate extends org.xms.g.utils.XObject {
    
    public CameraUpdate(com.google.android.gms.maps.CameraUpdate param0, com.huawei.hms.maps.CameraUpdate param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static org.xms.g.maps.CameraUpdate dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.CameraUpdate) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.CameraUpdate;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.CameraUpdate;
        }
    }
}