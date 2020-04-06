package org.xms.g.location;

public class LocationSettingsStatusCodes extends org.xms.g.common.api.CommonStatusCodes {
    private boolean wrapper = true;
    
    public LocationSettingsStatusCodes(com.google.android.gms.location.LocationSettingsStatusCodes param0, com.huawei.hms.location.LocationSettingsStatusCodes param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public static int getSETTINGS_CHANGE_UNAVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE");
            return com.huawei.hms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE");
            return com.google.android.gms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE;
        }
    }
    
    public static org.xms.g.location.LocationSettingsStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsStatusCodes) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsStatusCodes;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsStatusCodes;
        }
    }
}