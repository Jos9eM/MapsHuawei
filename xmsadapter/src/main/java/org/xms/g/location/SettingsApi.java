package org.xms.g.location;

public interface SettingsApi extends org.xms.g.utils.XInterface {
    
    public org.xms.g.common.api.PendingResult<org.xms.g.location.LocationSettingsResult> checkLocationSettings(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationSettingsRequest param1);
    
    default com.google.android.gms.location.SettingsApi getGInstanceSettingsApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceSettingsApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.SettingsApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.SettingsApi {
        
        public XImpl(com.google.android.gms.location.SettingsApi param0, java.lang.Object param1) {
            super(param0, param1);
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.location.LocationSettingsResult> checkLocationSettings(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationSettingsRequest param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}