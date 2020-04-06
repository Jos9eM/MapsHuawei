package org.xms.g.tasks;

public abstract class Task<XTResult> extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public Task(com.google.android.gms.tasks.Task param0, com.huawei.hmf.tasks.Task param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public org.xms.g.tasks.Task<XTResult> addOnCanceledListener(org.xms.g.tasks.OnCanceledListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCanceledListener(((param0) == null ? null : (param0.getHInstanceOnCanceledListener())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCanceledListener(((param0) == null ? null : (param0.getHInstanceOnCanceledListener())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCanceledListener(((param0) == null ? null : (param0.getGInstanceOnCanceledListener())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCanceledListener(((param0) == null ? null : (param0.getGInstanceOnCanceledListener())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<XTResult> addOnCanceledListener(java.util.concurrent.Executor param0, org.xms.g.tasks.OnCanceledListener param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCanceledListener(param0, ((param1) == null ? null : (param1.getHInstanceOnCanceledListener())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCanceledListener(param0, ((param1) == null ? null : (param1.getHInstanceOnCanceledListener())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCanceledListener(param0, ((param1) == null ? null : (param1.getGInstanceOnCanceledListener())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCanceledListener(param0, ((param1) == null ? null : (param1.getGInstanceOnCanceledListener())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<XTResult> addOnCanceledListener(android.app.Activity param0, org.xms.g.tasks.OnCanceledListener param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCanceledListener(param0, ((param1) == null ? null : (param1.getHInstanceOnCanceledListener())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCanceledListener(param0, ((param1) == null ? null : (param1.getHInstanceOnCanceledListener())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCanceledListener(param0, ((param1) == null ? null : (param1.getGInstanceOnCanceledListener())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCanceledListener(param0, ((param1) == null ? null : (param1.getGInstanceOnCanceledListener())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<XTResult> addOnCompleteListener(org.xms.g.tasks.OnCompleteListener<XTResult> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCompleteListener(((param0) == null ? null : (param0.getHInstanceOnCompleteListener())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCompleteListener(((param0) == null ? null : (param0.getHInstanceOnCompleteListener())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCompleteListener(((param0) == null ? null : (param0.getGInstanceOnCompleteListener())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCompleteListener(((param0) == null ? null : (param0.getGInstanceOnCompleteListener())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<XTResult> addOnCompleteListener(android.app.Activity param0, org.xms.g.tasks.OnCompleteListener<XTResult> param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCompleteListener(param0, ((param1) == null ? null : (param1.getHInstanceOnCompleteListener())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCompleteListener(param0, ((param1) == null ? null : (param1.getHInstanceOnCompleteListener())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCompleteListener(param0, ((param1) == null ? null : (param1.getGInstanceOnCompleteListener())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCompleteListener(param0, ((param1) == null ? null : (param1.getGInstanceOnCompleteListener())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<XTResult> addOnCompleteListener(java.util.concurrent.Executor param0, org.xms.g.tasks.OnCompleteListener<XTResult> param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCompleteListener(param0, ((param1) == null ? null : (param1.getHInstanceOnCompleteListener())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnCompleteListener(param0, ((param1) == null ? null : (param1.getHInstanceOnCompleteListener())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCompleteListener(param0, ((param1) == null ? null : (param1.getGInstanceOnCompleteListener())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnCompleteListener(param0, ((param1) == null ? null : (param1.getGInstanceOnCompleteListener())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public abstract org.xms.g.tasks.Task<XTResult> addOnFailureListener(android.app.Activity param0, org.xms.g.tasks.OnFailureListener param1);
    
    public abstract org.xms.g.tasks.Task<XTResult> addOnFailureListener(org.xms.g.tasks.OnFailureListener param0);
    
    public abstract org.xms.g.tasks.Task<XTResult> addOnFailureListener(java.util.concurrent.Executor param0, org.xms.g.tasks.OnFailureListener param1);
    
    public abstract org.xms.g.tasks.Task<XTResult> addOnSuccessListener(java.util.concurrent.Executor param0, org.xms.g.tasks.OnSuccessListener<? super XTResult> param1);
    
    public abstract org.xms.g.tasks.Task<XTResult> addOnSuccessListener(org.xms.g.tasks.OnSuccessListener<? super XTResult> param0);
    
    public abstract org.xms.g.tasks.Task<XTResult> addOnSuccessListener(android.app.Activity param0, org.xms.g.tasks.OnSuccessListener<? super XTResult> param1);
    
    public <XTContinuationResult> org.xms.g.tasks.Task<XTContinuationResult> continueWith(org.xms.g.tasks.Continuation<XTResult, XTContinuationResult> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).continueWith(((param0) == null ? null : (param0.getHInstanceContinuation())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).continueWith(((param0) == null ? null : (param0.getHInstanceContinuation())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).continueWith(((param0) == null ? null : (param0.getGInstanceContinuation())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).continueWith(((param0) == null ? null : (param0.getGInstanceContinuation())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public <XTContinuationResult> org.xms.g.tasks.Task<XTContinuationResult> continueWith(java.util.concurrent.Executor param0, org.xms.g.tasks.Continuation<XTResult, XTContinuationResult> param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).continueWith(param0, ((param1) == null ? null : (param1.getHInstanceContinuation())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).continueWith(param0, ((param1) == null ? null : (param1.getHInstanceContinuation())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).continueWith(param0, ((param1) == null ? null : (param1.getGInstanceContinuation())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).continueWith(param0, ((param1) == null ? null : (param1.getGInstanceContinuation())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public <XTContinuationResult> org.xms.g.tasks.Task<XTContinuationResult> continueWithTask(org.xms.g.tasks.Continuation<XTResult, org.xms.g.tasks.Task<XTContinuationResult>> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).continueWithTask(((param0) == null ? null : (param0.getHInstanceContinuation())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).continueWithTask(((param0) == null ? null : (param0.getHInstanceContinuation())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).continueWithTask(((param0) == null ? null : (param0.getGInstanceContinuation())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).continueWithTask(((param0) == null ? null : (param0.getGInstanceContinuation())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public <XTContinuationResult> org.xms.g.tasks.Task<XTContinuationResult> continueWithTask(java.util.concurrent.Executor param0, org.xms.g.tasks.Continuation<XTResult, org.xms.g.tasks.Task<XTContinuationResult>> param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).continueWithTask(param0, ((param1) == null ? null : (param1.getHInstanceContinuation())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).continueWithTask(param0, ((param1) == null ? null : (param1.getHInstanceContinuation())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).continueWithTask(param0, ((param1) == null ? null : (param1.getGInstanceContinuation())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).continueWithTask(param0, ((param1) == null ? null : (param1.getGInstanceContinuation())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public abstract java.lang.Exception getException();
    
    public abstract XTResult getResult();
    
    public abstract <XX extends java.lang.Throwable> XTResult getResult(java.lang.Class<XX> param0) throws XX;
    
    public abstract boolean isCanceled();
    
    public abstract boolean isComplete();
    
    public abstract boolean isSuccessful();
    
    public <XTContinuationResult> org.xms.g.tasks.Task<XTContinuationResult> onSuccessTask(java.util.concurrent.Executor param0, org.xms.g.tasks.SuccessContinuation<XTResult, XTContinuationResult> param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).onSuccessTask(param0, ((param1) == null ? null : (param1.getHInstanceSuccessContinuation())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).onSuccessTask(param0, ((param1) == null ? null : (param1.getHInstanceSuccessContinuation())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).onSuccessTask(param0, ((param1) == null ? null : (param1.getGInstanceSuccessContinuation())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).onSuccessTask(param0, ((param1) == null ? null : (param1.getGInstanceSuccessContinuation())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public <XTContinuationResult> org.xms.g.tasks.Task<XTContinuationResult> onSuccessTask(org.xms.g.tasks.SuccessContinuation<XTResult, XTContinuationResult> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).onSuccessTask(((param0) == null ? null : (param0.getHInstanceSuccessContinuation())))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).onSuccessTask(((param0) == null ? null : (param0.getHInstanceSuccessContinuation())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).onSuccessTask(((param0) == null ? null : (param0.getGInstanceSuccessContinuation())))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).onSuccessTask(((param0) == null ? null : (param0.getGInstanceSuccessContinuation())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.tasks.Task dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.tasks.Task) {
            return ((org.xms.g.tasks.Task) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.tasks.Task.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.tasks.Task) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.Task;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.Task;
        }
    }
    
    public static class XImpl<XTResult> extends org.xms.g.tasks.Task<XTResult> {
        
        public XImpl(com.google.android.gms.tasks.Task param0, com.huawei.hmf.tasks.Task param1) {
            super(param0, param1);
        }
        
        public org.xms.g.tasks.Task<XTResult> addOnFailureListener(android.app.Activity param0, org.xms.g.tasks.OnFailureListener param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnFailureListener(param0, ((param1) == null ? null : (param1.getHInstanceOnFailureListener())))");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnFailureListener(param0, ((param1) == null ? null : (param1.getHInstanceOnFailureListener())));
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnFailureListener(param0, ((param1) == null ? null : (param1.getGInstanceOnFailureListener())))");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnFailureListener(param0, ((param1) == null ? null : (param1.getGInstanceOnFailureListener())));
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
        
        public org.xms.g.tasks.Task<XTResult> addOnFailureListener(org.xms.g.tasks.OnFailureListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnFailureListener(((param0) == null ? null : (param0.getHInstanceOnFailureListener())))");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnFailureListener(((param0) == null ? null : (param0.getHInstanceOnFailureListener())));
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnFailureListener(((param0) == null ? null : (param0.getGInstanceOnFailureListener())))");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnFailureListener(((param0) == null ? null : (param0.getGInstanceOnFailureListener())));
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
        
        public org.xms.g.tasks.Task<XTResult> addOnFailureListener(java.util.concurrent.Executor param0, org.xms.g.tasks.OnFailureListener param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnFailureListener(param0, ((param1) == null ? null : (param1.getHInstanceOnFailureListener())))");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnFailureListener(param0, ((param1) == null ? null : (param1.getHInstanceOnFailureListener())));
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnFailureListener(param0, ((param1) == null ? null : (param1.getGInstanceOnFailureListener())))");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnFailureListener(param0, ((param1) == null ? null : (param1.getGInstanceOnFailureListener())));
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
        
        public org.xms.g.tasks.Task<XTResult> addOnSuccessListener(java.util.concurrent.Executor param0, org.xms.g.tasks.OnSuccessListener<? super XTResult> param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnSuccessListener(param0, ((param1) == null ? null : (param1.getHInstanceOnSuccessListener())))");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnSuccessListener(param0, ((param1) == null ? null : (param1.getHInstanceOnSuccessListener())));
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnSuccessListener(param0, ((param1) == null ? null : (param1.getGInstanceOnSuccessListener())))");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnSuccessListener(param0, ((param1) == null ? null : (param1.getGInstanceOnSuccessListener())));
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
        
        public org.xms.g.tasks.Task<XTResult> addOnSuccessListener(org.xms.g.tasks.OnSuccessListener<? super XTResult> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnSuccessListener(((param0) == null ? null : (param0.getHInstanceOnSuccessListener())))");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnSuccessListener(((param0) == null ? null : (param0.getHInstanceOnSuccessListener())));
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnSuccessListener(((param0) == null ? null : (param0.getGInstanceOnSuccessListener())))");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnSuccessListener(((param0) == null ? null : (param0.getGInstanceOnSuccessListener())));
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
        
        public org.xms.g.tasks.Task<XTResult> addOnSuccessListener(android.app.Activity param0, org.xms.g.tasks.OnSuccessListener<? super XTResult> param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnSuccessListener(param0, ((param1) == null ? null : (param1.getHInstanceOnSuccessListener())))");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.Task) this.getHInstance()).addOnSuccessListener(param0, ((param1) == null ? null : (param1.getHInstanceOnSuccessListener())));
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).addOnSuccessListener(param0, ((param1) == null ? null : (param1.getGInstanceOnSuccessListener())))");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.Task) this.getGInstance()).addOnSuccessListener(param0, ((param1) == null ? null : (param1.getGInstanceOnSuccessListener())));
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
            }
        }
        
        public java.lang.Exception getException() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).getException()");
                return ((com.huawei.hmf.tasks.Task) this.getHInstance()).getException();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).getException()");
                return ((com.google.android.gms.tasks.Task) this.getGInstance()).getException();
            }
        }
        
        public XTResult getResult() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).getResult()");
                java.lang.Object hmsObj = ((com.huawei.hmf.tasks.Task) this.getHInstance()).getResult();
                return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).getResult()");
                java.lang.Object gmsObj = ((com.google.android.gms.tasks.Task) this.getGInstance()).getResult();
                return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }
        
        public <XX extends java.lang.Throwable> XTResult getResult(java.lang.Class<XX> param0) throws XX {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                try {
                    java.lang.Class hObj0 = ((java.lang.Class) org.xms.g.utils.Utils.getHmsClassWithXmsClass(param0));
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).getResultThrowException(hObj0)");
                    java.lang.Object hmsObj = ((com.huawei.hmf.tasks.Task) this.getHInstance()).getResultThrowException(hObj0);
                    return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
                }
                catch (java.lang.Throwable e) {
                    throw ((XX) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(e));
                }
            } else {
                try {
                    java.lang.Class gObj0 = ((java.lang.Class) org.xms.g.utils.Utils.getGmsClassWithXmsClass(param0));
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).getResult(gObj0)");
                    java.lang.Object gmsObj = ((com.google.android.gms.tasks.Task) this.getGInstance()).getResult(gObj0);
                    return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
                }
                catch (java.lang.Throwable e) {
                    throw ((XX) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(e));
                }
            }
        }
        
        public boolean isCanceled() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).isCanceled()");
                return ((com.huawei.hmf.tasks.Task) this.getHInstance()).isCanceled();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).isCanceled()");
                return ((com.google.android.gms.tasks.Task) this.getGInstance()).isCanceled();
            }
        }
        
        public boolean isComplete() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).isComplete()");
                return ((com.huawei.hmf.tasks.Task) this.getHInstance()).isComplete();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).isComplete()");
                return ((com.google.android.gms.tasks.Task) this.getGInstance()).isComplete();
            }
        }
        
        public boolean isSuccessful() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Task) this.getHInstance()).isSuccessful()");
                return ((com.huawei.hmf.tasks.Task) this.getHInstance()).isSuccessful();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Task) this.getGInstance()).isSuccessful()");
                return ((com.google.android.gms.tasks.Task) this.getGInstance()).isSuccessful();
            }
        }
    }
}