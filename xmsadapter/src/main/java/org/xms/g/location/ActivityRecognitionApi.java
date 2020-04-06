package org.xms.g.location;

public interface ActivityRecognitionApi extends org.xms.g.utils.XInterface {
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1);
    
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, long param1, android.app.PendingIntent param2);
    
    default com.google.android.gms.location.ActivityRecognitionApi getGInstanceActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.ActivityRecognitionApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.ActivityRecognitionApi {
        
        public XImpl(com.google.android.gms.location.ActivityRecognitionApi param0, java.lang.Object param1) {
            super(param0, param1);
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, long param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}