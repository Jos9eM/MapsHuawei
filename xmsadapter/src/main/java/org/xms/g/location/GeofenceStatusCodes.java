package org.xms.g.location;

public final class GeofenceStatusCodes extends org.xms.g.common.api.CommonStatusCodes {
    
    public GeofenceStatusCodes(com.google.android.gms.location.GeofenceStatusCodes param0, com.huawei.hms.location.GeofenceErrorCodes param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static int getGEOFENCE_NOT_AVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_UNAVAILABLE");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_UNAVAILABLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE");
            return com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE;
        }
    }
    
    public static int getGEOFENCE_TOO_MANY_GEOFENCES() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES");
            return com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES;
        }
    }
    
    public static int getGEOFENCE_TOO_MANY_PENDING_INTENTS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS");
            return com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS;
        }
    }
    
    public static java.lang.String getStatusCodeString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.getErrorMessage(param0)");
            return com.huawei.hms.location.GeofenceErrorCodes.getErrorMessage(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofenceStatusCodes.getStatusCodeString(param0)");
            return com.google.android.gms.location.GeofenceStatusCodes.getStatusCodeString(param0);
        }
    }
    
    public static org.xms.g.location.GeofenceStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.GeofenceStatusCodes) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceErrorCodes;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofenceStatusCodes;
        }
    }
}