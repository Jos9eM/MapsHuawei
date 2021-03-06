package org.xms.g.maps.model;

public final class Dash extends org.xms.g.maps.model.PatternItem {
    
    public Dash(com.google.android.gms.maps.model.Dash param0, com.huawei.hms.maps.model.Dash param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public Dash(float param0) {
        super(((com.google.android.gms.maps.model.Dash) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.Dash(param0));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.Dash(param0));
        }
    }
    
    public float getLength() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Dash) this.getHInstance()).length");
            return ((com.huawei.hms.maps.model.Dash) this.getHInstance()).length;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Dash) this.getGInstance()).length");
            return ((com.google.android.gms.maps.model.Dash) this.getGInstance()).length;
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Dash) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.Dash) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Dash) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.Dash) this.getGInstance()).toString();
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.Dash dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Dash) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Dash;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Dash;
        }
    }
}