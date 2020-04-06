package org.xms.g.maps;

public final class MapsInitializer extends org.xms.g.utils.XObject {
    
    public MapsInitializer(com.google.android.gms.maps.MapsInitializer param0, com.huawei.hms.maps.MapsInitializer param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static final int initialize(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.MapsInitializer.initialize(param0)");
            return com.huawei.hms.maps.MapsInitializer.initialize(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.MapsInitializer.initialize(param0)");
            return com.google.android.gms.maps.MapsInitializer.initialize(param0);
        }
    }
    
    public static org.xms.g.maps.MapsInitializer dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.MapsInitializer) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.MapsInitializer;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.MapsInitializer;
        }
    }
}