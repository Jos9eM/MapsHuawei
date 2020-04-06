package org.xms.g.maps.model;

public final class IndoorLevel extends org.xms.g.utils.XObject {
    
    public IndoorLevel(com.google.android.gms.maps.model.IndoorLevel param0, com.huawei.hms.maps.model.IndoorLevel param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final void activate() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).activate()");
            ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).activate();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).activate()");
            ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).activate();
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).equals(param0);
        }
    }
    
    public final java.lang.String getName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).getName()");
            return ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).getName();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).getName()");
            return ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).getName();
        }
    }
    
    public final java.lang.String getShortName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).getShortName()");
            return ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).getShortName();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).getShortName()");
            return ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).getShortName();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).hashCode();
        }
    }
    
    public static org.xms.g.maps.model.IndoorLevel dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.IndoorLevel) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.IndoorLevel;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.IndoorLevel;
        }
    }
}