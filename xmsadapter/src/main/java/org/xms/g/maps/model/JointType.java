package org.xms.g.maps.model;

public final class JointType extends org.xms.g.utils.XObject {
    
    public JointType(com.google.android.gms.maps.model.JointType param0, com.huawei.hms.maps.model.JointType param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static int getBEVEL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.JointType.BEVEL");
            return com.huawei.hms.maps.model.JointType.BEVEL;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.JointType.BEVEL");
            return com.google.android.gms.maps.model.JointType.BEVEL;
        }
    }
    
    public static int getDEFAULT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.JointType.DEFAULT");
            return com.huawei.hms.maps.model.JointType.DEFAULT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.JointType.DEFAULT");
            return com.google.android.gms.maps.model.JointType.DEFAULT;
        }
    }
    
    public static int getROUND() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.JointType.ROUND");
            return com.huawei.hms.maps.model.JointType.ROUND;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.JointType.ROUND");
            return com.google.android.gms.maps.model.JointType.ROUND;
        }
    }
    
    public static org.xms.g.maps.model.JointType dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.JointType) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.JointType;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.JointType;
        }
    }
}