package org.xms.g.location;

public class ActivityRecognitionClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {
    private boolean wrapper = true;
    
    public ActivityRecognitionClient(com.google.android.gms.location.ActivityRecognitionClient param0, com.huawei.hms.location.ActivityIdentificationService param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public ActivityRecognitionClient(android.app.Activity param0) {
        super(((com.google.android.gms.location.ActivityRecognitionClient) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    public ActivityRecognitionClient(android.content.Context param0) {
        super(((com.google.android.gms.location.ActivityRecognitionClient) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(android.app.PendingIntent param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).deleteActivityConversionUpdates(param0)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).deleteActivityConversionUpdates(param0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).removeActivityTransitionUpdates(param0)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).removeActivityTransitionUpdates(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).deleteActivityConversionUpdatesCallSuper(param0)");
                com.huawei.hmf.tasks.Task hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).deleteActivityConversionUpdatesCallSuper(param0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).removeActivityTransitionUpdatesCallSuper(param0)");
                com.google.android.gms.tasks.Task gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).removeActivityTransitionUpdatesCallSuper(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> removeActivityUpdates(android.app.PendingIntent param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).deleteActivityIdentificationUpdates(param0)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).deleteActivityIdentificationUpdates(param0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).removeActivityUpdates(param0)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).removeActivityUpdates(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).deleteActivityIdentificationUpdatesCallSuper(param0)");
                com.huawei.hmf.tasks.Task hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).deleteActivityIdentificationUpdatesCallSuper(param0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).removeActivityUpdatesCallSuper(param0)");
                com.google.android.gms.tasks.Task gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).removeActivityUpdatesCallSuper(param0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(org.xms.g.location.ActivityTransitionRequest param0, android.app.PendingIntent param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).createActivityConversionUpdates(((com.huawei.hms.location.ActivityConversionRequest) ((param0) == null ? null : (param0.getHInstance()))), param1)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).createActivityConversionUpdates(((com.huawei.hms.location.ActivityConversionRequest) ((param0) == null ? null : (param0.getHInstance()))), param1);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).requestActivityTransitionUpdates(((com.google.android.gms.location.ActivityTransitionRequest) ((param0) == null ? null : (param0.getGInstance()))), param1)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).requestActivityTransitionUpdates(((com.google.android.gms.location.ActivityTransitionRequest) ((param0) == null ? null : (param0.getGInstance()))), param1);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).createActivityConversionUpdatesCallSuper(((com.huawei.hms.location.ActivityConversionRequest) ((param0) == null ? null : (param0.getHInstance()))), param1)");
                com.huawei.hmf.tasks.Task hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).createActivityConversionUpdatesCallSuper(((com.huawei.hms.location.ActivityConversionRequest) ((param0) == null ? null : (param0.getHInstance()))), param1);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).requestActivityTransitionUpdatesCallSuper(((com.google.android.gms.location.ActivityTransitionRequest) ((param0) == null ? null : (param0.getGInstance()))), param1)");
                com.google.android.gms.tasks.Task gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).requestActivityTransitionUpdatesCallSuper(((com.google.android.gms.location.ActivityTransitionRequest) ((param0) == null ? null : (param0.getGInstance()))), param1);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> requestActivityUpdates(long param0, android.app.PendingIntent param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).createActivityIdentificationUpdates(param0, param1)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance()).createActivityIdentificationUpdates(param0, param1);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).requestActivityUpdates(param0, param1)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance()).requestActivityUpdates(param0, param1);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).createActivityIdentificationUpdatesCallSuper(param0, param1)");
                com.huawei.hmf.tasks.Task hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationService) this.getHInstance())).createActivityIdentificationUpdatesCallSuper(param0, param1);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).requestActivityUpdatesCallSuper(param0, param1)");
                com.google.android.gms.tasks.Task gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionClient) this.getGInstance())).requestActivityUpdatesCallSuper(param0, param1);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
    }
    
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.ActivityRecognitionClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.ActivityRecognitionClient) {
            return ((org.xms.g.location.ActivityRecognitionClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.ActivityRecognitionClient gReturn = ((com.google.android.gms.location.ActivityRecognitionClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.ActivityIdentificationService hReturn = ((com.huawei.hms.location.ActivityIdentificationService) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.ActivityRecognitionClient(gReturn, hReturn);
        }
        return ((org.xms.g.location.ActivityRecognitionClient) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityIdentificationService;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityRecognitionClient;
        }
    }
    
    private class GImpl extends com.google.android.gms.location.ActivityRecognitionClient {
        
        public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(android.app.PendingIntent param0) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.removeActivityTransitionUpdates(param0);
            return ((com.google.android.gms.tasks.Task) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdates(android.app.PendingIntent param0) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.removeActivityUpdates(param0);
            return ((com.google.android.gms.tasks.Task) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(com.google.android.gms.location.ActivityTransitionRequest param0, android.app.PendingIntent param1) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.requestActivityTransitionUpdates(((param0) == null ? null : (new org.xms.g.location.ActivityTransitionRequest(param0, null))), param1);
            return ((com.google.android.gms.tasks.Task) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdates(long param0, android.app.PendingIntent param1) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.requestActivityUpdates(param0, param1);
            return ((com.google.android.gms.tasks.Task) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdatesCallSuper(android.app.PendingIntent param0) {
            return super.removeActivityTransitionUpdates(param0);
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdatesCallSuper(android.app.PendingIntent param0) {
            return super.removeActivityUpdates(param0);
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdatesCallSuper(com.google.android.gms.location.ActivityTransitionRequest param0, android.app.PendingIntent param1) {
            return super.requestActivityTransitionUpdates(param0, param1);
        }
        
        public com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdatesCallSuper(long param0, android.app.PendingIntent param1) {
            return super.requestActivityUpdates(param0, param1);
        }
        
        public GImpl(android.app.Activity param0) {
            super(param0);
        }
        
        public GImpl(android.content.Context param0) {
            super(param0);
        }
    }
    
    private class HImpl extends com.huawei.hms.location.ActivityIdentificationService {
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> deleteActivityConversionUpdates(android.app.PendingIntent param0) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.removeActivityTransitionUpdates(param0);
            return ((com.huawei.hmf.tasks.Task) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> deleteActivityIdentificationUpdates(android.app.PendingIntent param0) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.removeActivityUpdates(param0);
            return ((com.huawei.hmf.tasks.Task) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> createActivityConversionUpdates(com.huawei.hms.location.ActivityConversionRequest param0, android.app.PendingIntent param1) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.requestActivityTransitionUpdates(((param0) == null ? null : (new org.xms.g.location.ActivityTransitionRequest(null, param0))), param1);
            return ((com.huawei.hmf.tasks.Task) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> createActivityIdentificationUpdates(long param0, android.app.PendingIntent param1) {
            org.xms.g.tasks.Task xResult = org.xms.g.location.ActivityRecognitionClient.this.requestActivityUpdates(param0, param1);
            return ((com.huawei.hmf.tasks.Task) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> deleteActivityConversionUpdatesCallSuper(android.app.PendingIntent param0) {
            return super.deleteActivityConversionUpdates(param0);
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> deleteActivityIdentificationUpdatesCallSuper(android.app.PendingIntent param0) {
            return super.deleteActivityIdentificationUpdates(param0);
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> createActivityConversionUpdatesCallSuper(com.huawei.hms.location.ActivityConversionRequest param0, android.app.PendingIntent param1) {
            return super.createActivityConversionUpdates(param0, param1);
        }
        
        public com.huawei.hmf.tasks.Task<java.lang.Void> createActivityIdentificationUpdatesCallSuper(long param0, android.app.PendingIntent param1) {
            return super.createActivityIdentificationUpdates(param0, param1);
        }
        
        public HImpl(android.content.Context param0) {
            super(param0);
        }
        
        public HImpl(android.app.Activity param0) {
            super(param0);
        }
    }
}