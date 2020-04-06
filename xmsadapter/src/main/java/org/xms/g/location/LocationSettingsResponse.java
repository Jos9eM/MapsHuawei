package org.xms.g.location;

public class LocationSettingsResponse extends org.xms.g.common.api.Response<org.xms.g.location.LocationSettingsResult> {
    private boolean wrapper = true;
    
    public LocationSettingsResponse(com.google.android.gms.location.LocationSettingsResponse param0, com.huawei.hms.location.LocationSettingsResponse param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public org.xms.g.location.LocationSettingsStates getLocationSettingsStates() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsResponse) this.getHInstance()).getLocationSettingsStates()");
            com.huawei.hms.location.LocationSettingsStates hReturn = ((com.huawei.hms.location.LocationSettingsResponse) this.getHInstance()).getLocationSettingsStates();
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsResponse) this.getGInstance()).getLocationSettingsStates()");
            com.google.android.gms.location.LocationSettingsStates gReturn = ((com.google.android.gms.location.LocationSettingsResponse) this.getGInstance()).getLocationSettingsStates();
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.LocationSettingsResponse dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsResponse) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsResponse;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsResponse;
        }
    }
}