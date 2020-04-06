package org.xms.g.maps.model;

public final class BitmapDescriptor extends org.xms.g.utils.XObject {
    
    public BitmapDescriptor(com.google.android.gms.maps.model.BitmapDescriptor param0, com.huawei.hms.maps.model.BitmapDescriptor param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static org.xms.g.maps.model.BitmapDescriptor dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.BitmapDescriptor) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.BitmapDescriptor;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.BitmapDescriptor;
        }
    }
}