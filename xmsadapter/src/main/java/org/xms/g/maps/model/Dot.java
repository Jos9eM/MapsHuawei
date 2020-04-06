package org.xms.g.maps.model;

public final class Dot extends org.xms.g.maps.model.PatternItem {
    
    public Dot(com.google.android.gms.maps.model.Dot param0, com.huawei.hms.maps.model.Dot param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public Dot() {
        super(((com.google.android.gms.maps.model.Dot) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.Dot());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.Dot());
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Dot) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.Dot) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Dot) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.Dot) this.getGInstance()).toString();
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.Dot dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Dot) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Dot;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Dot;
        }
    }
}