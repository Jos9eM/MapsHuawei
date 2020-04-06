package org.xms.g.location;

public class FusedLocationProviderClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {
    private boolean wrapper = true;
    
    public FusedLocationProviderClient(com.google.android.gms.location.FusedLocationProviderClient param0, com.huawei.hms.location.FusedLocationProviderClient param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public static java.lang.String getKEY_VERTICAL_ACCURACY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY");
            return com.huawei.hms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY");
            return com.google.android.gms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY;
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> flushLocations() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).flushLocations()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).flushLocations();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).flushLocations()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).flushLocations();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<android.location.Location> getLastLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).getLastLocation()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).getLastLocation();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).getLastLocation()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).getLastLocation();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<org.xms.g.location.LocationAvailability> getLocationAvailability() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).getLocationAvailability()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).getLocationAvailability();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).getLocationAvailability()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).getLocationAvailability();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> removeLocationUpdates(android.app.PendingIntent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).removeLocationUpdates(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).removeLocationUpdates(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).removeLocationUpdates(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).removeLocationUpdates(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> removeLocationUpdates(org.xms.g.location.LocationCallback param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).removeLocationUpdates(((com.huawei.hms.location.LocationCallback) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).removeLocationUpdates(((com.huawei.hms.location.LocationCallback) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).removeLocationUpdates(((com.google.android.gms.location.LocationCallback) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).removeLocationUpdates(((com.google.android.gms.location.LocationCallback) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> requestLocationUpdates(org.xms.g.location.LocationRequest param0, org.xms.g.location.LocationCallback param1, android.os.Looper param2) throws java.lang.IllegalStateException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).requestLocationUpdates(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.location.LocationCallback) ((param1) == null ? null : (param1.getHInstance()))), param2)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).requestLocationUpdates(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.location.LocationCallback) ((param1) == null ? null : (param1.getHInstance()))), param2);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).requestLocationUpdates(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.location.LocationCallback) ((param1) == null ? null : (param1.getGInstance()))), param2)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).requestLocationUpdates(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.location.LocationCallback) ((param1) == null ? null : (param1.getGInstance()))), param2);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> requestLocationUpdates(org.xms.g.location.LocationRequest param0, android.app.PendingIntent param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).requestLocationUpdates(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).requestLocationUpdates(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).requestLocationUpdates(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).requestLocationUpdates(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> setMockLocation(android.location.Location param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).setMockLocation(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).setMockLocation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).setMockLocation(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).setMockLocation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> setMockMode(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).setMockMode(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) this.getHInstance()).setMockMode(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).setMockMode(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) this.getGInstance()).setMockMode(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.FusedLocationProviderClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.FusedLocationProviderClient) {
            return ((org.xms.g.location.FusedLocationProviderClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.FusedLocationProviderClient gReturn = ((com.google.android.gms.location.FusedLocationProviderClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.FusedLocationProviderClient hReturn = ((com.huawei.hms.location.FusedLocationProviderClient) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.FusedLocationProviderClient(gReturn, hReturn);
        }
        return ((org.xms.g.location.FusedLocationProviderClient) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.FusedLocationProviderClient;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.FusedLocationProviderClient;
        }
    }
}