package org.xms.g.location;

public interface GeofencingApi extends org.xms.g.utils.XInterface {
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> addGeofences(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.GeofencingRequest param1, android.app.PendingIntent param2);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> addGeofences(org.xms.g.common.api.ExtensionApiClient param0, java.util.List<org.xms.g.location.Geofence> param1, android.app.PendingIntent param2);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeGeofences(org.xms.g.common.api.ExtensionApiClient param0, java.util.List<java.lang.String> param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeGeofences(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1);
    
    default com.google.android.gms.location.GeofencingApi getGInstanceGeofencingApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceGeofencingApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.GeofencingApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.GeofencingApi {
        
        public XImpl(com.google.android.gms.location.GeofencingApi param0, java.lang.Object param1) {
            super(param0, param1);
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> addGeofences(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.GeofencingRequest param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> addGeofences(org.xms.g.common.api.ExtensionApiClient param0, java.util.List<org.xms.g.location.Geofence> param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeGeofences(org.xms.g.common.api.ExtensionApiClient param0, java.util.List<java.lang.String> param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeGeofences(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}