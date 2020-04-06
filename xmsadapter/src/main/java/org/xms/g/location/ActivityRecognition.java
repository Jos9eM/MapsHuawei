package org.xms.g.location;

public class ActivityRecognition extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public ActivityRecognition(com.google.android.gms.location.ActivityRecognition param0, com.huawei.hms.location.ActivityIdentification param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public static java.lang.String getCLIENT_NAME() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.common.api.Api getAPI() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.ActivityRecognitionApi getActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.ActivityRecognitionClient getClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentification.getService(param0)");
            com.huawei.hms.location.ActivityIdentificationService hReturn = com.huawei.hms.location.ActivityIdentification.getService(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionClient(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityRecognition.getClient(param0)");
            com.google.android.gms.location.ActivityRecognitionClient gReturn = com.google.android.gms.location.ActivityRecognition.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionClient(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.ActivityRecognitionClient getClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentification.getService(param0)");
            com.huawei.hms.location.ActivityIdentificationService hReturn = com.huawei.hms.location.ActivityIdentification.getService(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionClient(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityRecognition.getClient(param0)");
            com.google.android.gms.location.ActivityRecognitionClient gReturn = com.google.android.gms.location.ActivityRecognition.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionClient(gReturn, null)));
        }
    }
    
    public static org.xms.g.location.ActivityRecognition dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityRecognition) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityIdentification;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityRecognition;
        }
    }
}