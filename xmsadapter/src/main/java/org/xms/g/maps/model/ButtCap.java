package org.xms.g.maps.model;

public final class ButtCap extends org.xms.g.maps.model.Cap {
    
    public ButtCap(com.google.android.gms.maps.model.ButtCap param0, com.huawei.hms.maps.model.ButtCap param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public ButtCap() {
        super(((com.google.android.gms.maps.model.ButtCap) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.ButtCap());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.ButtCap());
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.ButtCap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.ButtCap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.ButtCap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.ButtCap) this.getGInstance()).toString();
        }
    }
    
    public static org.xms.g.maps.model.ButtCap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.ButtCap) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.ButtCap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.ButtCap;
        }
    }
}