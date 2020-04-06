package org.xms.g.location;

public class SettingsClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {
    private boolean wrapper = true;
    
    public SettingsClient(com.google.android.gms.location.SettingsClient param0, com.huawei.hms.location.SettingsClient param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public org.xms.g.tasks.Task<org.xms.g.location.LocationSettingsResponse> checkLocationSettings(org.xms.g.location.LocationSettingsRequest param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.SettingsClient) this.getHInstance()).checkLocationSettings(((com.huawei.hms.location.LocationSettingsRequest) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.SettingsClient) this.getHInstance()).checkLocationSettings(((com.huawei.hms.location.LocationSettingsRequest) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.SettingsClient) this.getGInstance()).checkLocationSettings(((com.google.android.gms.location.LocationSettingsRequest) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.SettingsClient) this.getGInstance()).checkLocationSettings(((com.google.android.gms.location.LocationSettingsRequest) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.SettingsClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.SettingsClient) {
            return ((org.xms.g.location.SettingsClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.SettingsClient gReturn = ((com.google.android.gms.location.SettingsClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.SettingsClient hReturn = ((com.huawei.hms.location.SettingsClient) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.SettingsClient(gReturn, hReturn);
        }
        return ((org.xms.g.location.SettingsClient) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.SettingsClient;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.SettingsClient;
        }
    }
}