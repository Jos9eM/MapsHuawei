package org.xms.g.maps.model;

public final class CustomCap extends org.xms.g.maps.model.Cap {
    
    public CustomCap(com.google.android.gms.maps.model.CustomCap param0, com.huawei.hms.maps.model.CustomCap param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public CustomCap(org.xms.g.maps.model.BitmapDescriptor param0, float param1) {
        super(((com.google.android.gms.maps.model.CustomCap) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.CustomCap(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))), param1));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.CustomCap(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))), param1));
        }
    }
    
    public CustomCap(org.xms.g.maps.model.BitmapDescriptor param0) {
        super(((com.google.android.gms.maps.model.CustomCap) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.CustomCap(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance())))));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.CustomCap(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance())))));
        }
    }
    
    public org.xms.g.maps.model.BitmapDescriptor getBitmapDescriptor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).bitmapDescriptor");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).bitmapDescriptor;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).bitmapDescriptor");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).bitmapDescriptor;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(gReturn, null)));
        }
    }
    
    public float getRefWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).refWidth");
            return ((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).refWidth;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).refWidth");
            return ((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).refWidth;
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).toString();
        }
    }
    
    public static org.xms.g.maps.model.CustomCap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.CustomCap) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.CustomCap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.CustomCap;
        }
    }
}