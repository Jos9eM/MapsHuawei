package org.xms.g.maps.model;

public final class IndoorBuilding extends org.xms.g.utils.XObject {
    
    public IndoorBuilding(com.google.android.gms.maps.model.IndoorBuilding param0, com.huawei.hms.maps.model.IndoorBuilding param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).equals(param0);
        }
    }
    
    public final int getActiveLevelIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getActiveLevelIndex()");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getActiveLevelIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getActiveLevelIndex()");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getActiveLevelIndex();
        }
    }
    
    public final int getDefaultLevelIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getDefaultLevelIndex()");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getDefaultLevelIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getDefaultLevelIndex()");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getDefaultLevelIndex();
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.IndoorLevel> getLevels() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getLevels()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getLevels();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.IndoorLevel, org.xms.g.maps.model.IndoorLevel>() {
                
                public org.xms.g.maps.model.IndoorLevel apply(com.huawei.hms.maps.model.IndoorLevel param0) {
                    return new org.xms.g.maps.model.IndoorLevel(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getLevels()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getLevels();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.IndoorLevel, org.xms.g.maps.model.IndoorLevel>() {
                
                public org.xms.g.maps.model.IndoorLevel apply(com.google.android.gms.maps.model.IndoorLevel param0) {
                    return new org.xms.g.maps.model.IndoorLevel(param0, null);
                }
            }));
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).hashCode();
        }
    }
    
    public final boolean isUnderground() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).isUnderground()");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).isUnderground();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).isUnderground()");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).isUnderground();
        }
    }
    
    public static org.xms.g.maps.model.IndoorBuilding dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.IndoorBuilding) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.IndoorBuilding;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.IndoorBuilding;
        }
    }
}