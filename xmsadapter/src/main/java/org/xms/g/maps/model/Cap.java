package org.xms.g.maps.model;

public class Cap extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public Cap(com.google.android.gms.maps.model.Cap param0, com.huawei.hms.maps.model.Cap param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Cap) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.Cap) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Cap) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.Cap) this.getGInstance()).equals(param0);
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Cap) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.Cap) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Cap) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.Cap) this.getGInstance()).hashCode();
        }
    }
    
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Cap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.Cap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Cap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.Cap) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Cap) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.Cap) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Cap) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.Cap) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public static org.xms.g.maps.model.Cap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Cap) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Cap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Cap;
        }
    }
}