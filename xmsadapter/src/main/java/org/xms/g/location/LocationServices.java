package org.xms.g.location;

public class LocationServices extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public LocationServices(com.google.android.gms.location.LocationServices param0, com.huawei.hms.location.LocationServices param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public static org.xms.g.common.api.Api getAPI() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.FusedLocationProviderApi getFusedLocationApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.GeofencingApi getGeofencingApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.SettingsApi getSettingsApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.FusedLocationProviderClient getFusedLocationProviderClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(param0)");
            com.huawei.hms.location.FusedLocationProviderClient hReturn = com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.FusedLocationProviderClient(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(param0)");
            com.google.android.gms.location.FusedLocationProviderClient gReturn = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.FusedLocationProviderClient(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.FusedLocationProviderClient getFusedLocationProviderClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(param0)");
            com.huawei.hms.location.FusedLocationProviderClient hReturn = com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.FusedLocationProviderClient(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(param0)");
            com.google.android.gms.location.FusedLocationProviderClient gReturn = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.FusedLocationProviderClient(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.GeofencingClient getGeofencingClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getGeofenceService(param0)");
            com.huawei.hms.location.GeofenceService hReturn = com.huawei.hms.location.LocationServices.getGeofenceService(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingClient(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getGeofencingClient(param0)");
            com.google.android.gms.location.GeofencingClient gReturn = com.google.android.gms.location.LocationServices.getGeofencingClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingClient(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.GeofencingClient getGeofencingClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getGeofenceService(param0)");
            com.huawei.hms.location.GeofenceService hReturn = com.huawei.hms.location.LocationServices.getGeofenceService(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingClient(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getGeofencingClient(param0)");
            com.google.android.gms.location.GeofencingClient gReturn = com.google.android.gms.location.LocationServices.getGeofencingClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingClient(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.SettingsClient getSettingsClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getSettingsClient(param0)");
            com.huawei.hms.location.SettingsClient hReturn = com.huawei.hms.location.LocationServices.getSettingsClient(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.SettingsClient(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getSettingsClient(param0)");
            com.google.android.gms.location.SettingsClient gReturn = com.google.android.gms.location.LocationServices.getSettingsClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.SettingsClient(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.SettingsClient getSettingsClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getSettingsClient(param0)");
            com.huawei.hms.location.SettingsClient hReturn = com.huawei.hms.location.LocationServices.getSettingsClient(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.SettingsClient(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getSettingsClient(param0)");
            com.google.android.gms.location.SettingsClient gReturn = com.google.android.gms.location.LocationServices.getSettingsClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.SettingsClient(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.LocationServices dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationServices) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationServices;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationServices;
        }
    }
}