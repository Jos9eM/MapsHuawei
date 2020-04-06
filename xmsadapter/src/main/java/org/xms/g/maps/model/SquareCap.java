package org.xms.g.maps.model;

public final class SquareCap extends org.xms.g.maps.model.Cap {
    
    public SquareCap(com.google.android.gms.maps.model.SquareCap param0, com.huawei.hms.maps.model.SquareCap param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public SquareCap() {
        super(((com.google.android.gms.maps.model.SquareCap) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.SquareCap());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.SquareCap());
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.SquareCap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.SquareCap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.SquareCap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.SquareCap) this.getGInstance()).toString();
        }
    }
    
    public static org.xms.g.maps.model.SquareCap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.SquareCap) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.SquareCap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.SquareCap;
        }
    }
}