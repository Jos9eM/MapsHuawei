package org.xms.g.tasks;

public interface Continuation<XTResult, XTContinuationResult> extends org.xms.g.utils.XInterface {
    
    public XTContinuationResult then(org.xms.g.tasks.Task<XTResult> param0) throws java.lang.Exception;
    
    default <TResult, TContinuationResult> com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> getGInstanceContinuation() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.tasks.Continuation<TResult, TContinuationResult>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.tasks.Continuation<TResult, TContinuationResult>() {
            
            public TContinuationResult then(com.google.android.gms.tasks.Task<TResult> param0) throws java.lang.Exception {
                XTContinuationResult xResult = ((XTContinuationResult) org.xms.g.tasks.Continuation.this.then(((param0) == null ? null : (new org.xms.g.tasks.Task.XImpl(param0, null)))));
                return ((TContinuationResult) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
            }
        };
    }
    
    default <TResult, TContinuationResult> com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult> getHInstanceContinuation() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult>() {
            
            public TContinuationResult then(com.huawei.hmf.tasks.Task<TResult> param0) throws java.lang.Exception {
                XTContinuationResult xResult = ((XTContinuationResult) org.xms.g.tasks.Continuation.this.then(((param0) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, param0)))));
                return ((TContinuationResult) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
            }
        };
    }
    
    public static org.xms.g.tasks.Continuation dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.tasks.Continuation) {
            return ((org.xms.g.tasks.Continuation) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.tasks.Continuation gReturn = ((com.google.android.gms.tasks.Continuation) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hmf.tasks.Continuation hReturn = ((com.huawei.hmf.tasks.Continuation) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.tasks.Continuation.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.tasks.Continuation) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.Continuation;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.Continuation;
            }
        }
        return param0 instanceof org.xms.g.tasks.Continuation;
    }
    
    public static class XImpl<XTResult, XTContinuationResult> extends org.xms.g.utils.XObject implements org.xms.g.tasks.Continuation<XTResult, XTContinuationResult> {
        
        public XImpl(com.google.android.gms.tasks.Continuation param0, com.huawei.hmf.tasks.Continuation param1) {
            super(param0, param1);
        }
        
        public XTContinuationResult then(org.xms.g.tasks.Task<XTResult> param0) throws java.lang.Exception {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Continuation) this.getHInstance()).then(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))))");
                java.lang.Object hmsObj = ((com.huawei.hmf.tasks.Continuation) this.getHInstance()).then(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))));
                return ((XTContinuationResult) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Continuation) this.getGInstance()).then(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))))");
                java.lang.Object gmsObj = ((com.google.android.gms.tasks.Continuation) this.getGInstance()).then(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))));
                return ((XTContinuationResult) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }
    }
}