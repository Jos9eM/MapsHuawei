package org.xms.g.location;

public interface FusedLocationProviderApi extends org.xms.g.utils.XInterface {
    
    public static java.lang.String getKEY_LOCATION_CHANGED() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static java.lang.String getKEY_MOCK_LOCATION() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> flushLocations(org.xms.g.common.api.ExtensionApiClient param0);
    
    public android.location.Location getLastLocation(org.xms.g.common.api.ExtensionApiClient param0);
    
    public org.xms.g.location.LocationAvailability getLocationAvailability(org.xms.g.common.api.ExtensionApiClient param0);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationListener param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationCallback param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationListener param2) throws java.lang.IllegalStateException;
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationCallback param2, android.os.Looper param3);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationListener param2, android.os.Looper param3);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, android.app.PendingIntent param2);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> setMockLocation(org.xms.g.common.api.ExtensionApiClient param0, android.location.Location param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> setMockMode(org.xms.g.common.api.ExtensionApiClient param0, boolean param1);
    
    default com.google.android.gms.location.FusedLocationProviderApi getGInstanceFusedLocationProviderApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceFusedLocationProviderApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.FusedLocationProviderApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.FusedLocationProviderApi {
        
        public XImpl(com.google.android.gms.location.FusedLocationProviderApi param0, java.lang.Object param1) {
            super(param0, param1);
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> flushLocations(org.xms.g.common.api.ExtensionApiClient param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public android.location.Location getLastLocation(org.xms.g.common.api.ExtensionApiClient param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.location.LocationAvailability getLocationAvailability(org.xms.g.common.api.ExtensionApiClient param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationListener param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationCallback param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationListener param2) throws java.lang.IllegalStateException {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationCallback param2, android.os.Looper param3) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationListener param2, android.os.Looper param3) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> setMockLocation(org.xms.g.common.api.ExtensionApiClient param0, android.location.Location param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> setMockMode(org.xms.g.common.api.ExtensionApiClient param0, boolean param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}