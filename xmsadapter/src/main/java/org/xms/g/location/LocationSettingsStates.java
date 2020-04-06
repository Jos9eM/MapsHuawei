package org.xms.g.location;

public final class LocationSettingsStates extends org.xms.g.utils.XObject {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.LocationSettingsStates createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.LocationSettingsStates gReturn = null;
            com.huawei.hms.location.LocationSettingsStates hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.LocationSettingsStates.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.LocationSettingsStates.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.LocationSettingsStates(gReturn, hReturn);
        }
        
        public org.xms.g.location.LocationSettingsStates[] newArray(int param0) {
            return new org.xms.g.location.LocationSettingsStates[param0];
        }
    };
    
    public LocationSettingsStates(com.google.android.gms.location.LocationSettingsStates param0, com.huawei.hms.location.LocationSettingsStates param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static org.xms.g.location.LocationSettingsStates fromIntent(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationSettingsStates.fromIntent(param0)");
            com.huawei.hms.location.LocationSettingsStates hReturn = com.huawei.hms.location.LocationSettingsStates.fromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationSettingsStates.fromIntent(param0)");
            com.google.android.gms.location.LocationSettingsStates gReturn = com.google.android.gms.location.LocationSettingsStates.fromIntent(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(gReturn, null)));
        }
    }
    
    public final boolean isBlePresent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isBlePresent()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isBlePresent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isBlePresent()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isBlePresent();
        }
    }
    
    public final boolean isBleUsable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isBleUsable()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isBleUsable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isBleUsable()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isBleUsable();
        }
    }
    
    public final boolean isGpsPresent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isGpsPresent()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isGpsPresent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isGpsPresent()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isGpsPresent();
        }
    }
    
    public final boolean isGpsUsable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isGpsUsable()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isGpsUsable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isGpsUsable()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isGpsUsable();
        }
    }
    
    public final boolean isLocationPresent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isLocationPresent()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isLocationPresent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isLocationPresent()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isLocationPresent();
        }
    }
    
    public final boolean isLocationUsable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isLocationUsable()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isLocationUsable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isLocationUsable()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isLocationUsable();
        }
    }
    
    public final boolean isNetworkLocationPresent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isNetworkLocationPresent()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isNetworkLocationPresent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isNetworkLocationPresent()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isNetworkLocationPresent();
        }
    }
    
    public final boolean isNetworkLocationUsable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isNetworkLocationUsable()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isNetworkLocationUsable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isNetworkLocationUsable()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isNetworkLocationUsable();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public static org.xms.g.location.LocationSettingsStates dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsStates) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsStates;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsStates;
        }
    }
}