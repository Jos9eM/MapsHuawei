package org.xms.g.maps.model;

public final class RoundCap extends org.xms.g.maps.model.Cap {
    
    public RoundCap(com.google.android.gms.maps.model.RoundCap param0, com.huawei.hms.maps.model.RoundCap param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public RoundCap() {
        super(((com.google.android.gms.maps.model.RoundCap) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.RoundCap());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.RoundCap());
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.RoundCap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.RoundCap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.RoundCap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.RoundCap) this.getGInstance()).toString();
        }
    }
    
    public static org.xms.g.maps.model.RoundCap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.RoundCap) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.RoundCap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.RoundCap;
        }
    }
}