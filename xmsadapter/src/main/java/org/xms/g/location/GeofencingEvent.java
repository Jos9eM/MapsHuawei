package org.xms.g.location;

public class GeofencingEvent extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public GeofencingEvent(com.google.android.gms.location.GeofencingEvent param0, com.huawei.hms.location.GeofenceData param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public static org.xms.g.location.GeofencingEvent fromIntent(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceData.getDataFromIntent(param0)");
            com.huawei.hms.location.GeofenceData hReturn = com.huawei.hms.location.GeofenceData.getDataFromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingEvent(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofencingEvent.fromIntent(param0)");
            com.google.android.gms.location.GeofencingEvent gReturn = com.google.android.gms.location.GeofencingEvent.fromIntent(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingEvent(gReturn, null)));
        }
    }
    
    public int getErrorCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).getErrorCode()");
            return ((com.huawei.hms.location.GeofenceData) this.getHInstance()).getErrorCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getErrorCode()");
            return ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getErrorCode();
        }
    }
    
    public int getGeofenceTransition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConversion()");
            return ((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConversion();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getGeofenceTransition()");
            return ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getGeofenceTransition();
        }
    }
    
    public java.util.List<org.xms.g.location.Geofence> getTriggeringGeofences() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConvertingGeofenceList()");
            java.util.List hReturn = ((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConvertingGeofenceList();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.Geofence, org.xms.g.location.Geofence>() {
                
                public org.xms.g.location.Geofence apply(com.huawei.hms.location.Geofence param0) {
                    return new org.xms.g.location.Geofence.XImpl(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getTriggeringGeofences()");
            java.util.List gReturn = ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getTriggeringGeofences();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.Geofence, org.xms.g.location.Geofence>() {
                
                public org.xms.g.location.Geofence apply(com.google.android.gms.location.Geofence param0) {
                    return new org.xms.g.location.Geofence.XImpl(param0, null);
                }
            }));
        }
    }
    
    public android.location.Location getTriggeringLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConvertingLocation()");
            return ((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConvertingLocation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getTriggeringLocation()");
            return ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getTriggeringLocation();
        }
    }
    
    public boolean hasError() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).isFailure()");
            return ((com.huawei.hms.location.GeofenceData) this.getHInstance()).isFailure();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).hasError()");
            return ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).hasError();
        }
    }
    
    public static org.xms.g.location.GeofencingEvent dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.GeofencingEvent) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceData;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofencingEvent;
        }
    }
}