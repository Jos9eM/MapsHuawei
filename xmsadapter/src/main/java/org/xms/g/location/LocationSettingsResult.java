package org.xms.g.location;

public final class LocationSettingsResult extends org.xms.g.utils.XObject implements org.xms.g.common.api.Result, android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.LocationSettingsResult createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.LocationSettingsResult gReturn = null;
            com.huawei.hms.location.LocationSettingsResult hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.LocationSettingsResult.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.LocationSettingsResult.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.LocationSettingsResult(gReturn, hReturn);
        }
        
        public org.xms.g.location.LocationSettingsResult[] newArray(int param0) {
            return new org.xms.g.location.LocationSettingsResult[param0];
        }
    };
    
    public LocationSettingsResult(com.google.android.gms.location.LocationSettingsResult param0, com.huawei.hms.location.LocationSettingsResult param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final org.xms.g.location.LocationSettingsStates getLocationSettingsStates() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).getLocationSettingsStates()");
            com.huawei.hms.location.LocationSettingsStates hReturn = ((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).getLocationSettingsStates();
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).getLocationSettingsStates()");
            com.google.android.gms.location.LocationSettingsStates gReturn = ((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).getLocationSettingsStates();
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(gReturn, null)));
        }
    }
    
    public final org.xms.g.common.api.Status getStatus() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).getStatus()");
            com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).getStatus();
            return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).getStatus()");
            com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).getStatus();
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(gReturn, null)));
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.LocationSettingsResult dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.LocationSettingsResult) {
            return ((org.xms.g.location.LocationSettingsResult) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.LocationSettingsResult gReturn = ((com.google.android.gms.location.LocationSettingsResult) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.LocationSettingsResult hReturn = ((com.huawei.hms.location.LocationSettingsResult) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.LocationSettingsResult(gReturn, hReturn);
        }
        return ((org.xms.g.location.LocationSettingsResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsResult;
        }
    }
}