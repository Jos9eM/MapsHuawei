package org.xms.g.tasks;

public final class Tasks extends org.xms.g.utils.XObject {
    
    public Tasks(com.google.android.gms.tasks.Tasks param0, com.huawei.hmf.tasks.Tasks param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static <XTResult> XTResult await(org.xms.g.tasks.Task<XTResult> param0, long param1, java.util.concurrent.TimeUnit param2) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.await(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))), param1, param2)");
            java.lang.Object hmsObj = com.huawei.hmf.tasks.Tasks.await(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))), param1, param2);
            return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))), param1, param2)");
            java.lang.Object gmsObj = com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))), param1, param2);
            return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
        }
    }
    
    public static <XTResult> XTResult await(org.xms.g.tasks.Task<XTResult> param0) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.await(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))))");
            java.lang.Object hmsObj = com.huawei.hmf.tasks.Tasks.await(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))));
            return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))))");
            java.lang.Object gmsObj = com.google.android.gms.tasks.Tasks.await(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))));
            return ((XTResult) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
        }
    }
    
    public static <XTResult> org.xms.g.tasks.Task<XTResult> call(java.util.concurrent.Callable<XTResult> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            com.huawei.hmf.tasks.Task hReturn = null;
            hReturn = com.huawei.hmf.tasks.Tasks.callInBackground(com.huawei.hmf.tasks.TaskExecutors.uiThread(),param0);
            if(hReturn==null){
                return null;
            }
            return new org.xms.g.tasks.Task.XImpl(null, hReturn);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.call(param0)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.call(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static <XTResult> org.xms.g.tasks.Task<XTResult> call(java.util.concurrent.Executor param0, java.util.concurrent.Callable<XTResult> param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.callInBackground(param0, param1)");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.callInBackground(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.call(param0, param1)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.call(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static <XTResult> org.xms.g.tasks.Task<XTResult> forCanceled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.fromCanceled()");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.fromCanceled();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.forCanceled()");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.forCanceled();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static <XTResult> org.xms.g.tasks.Task<XTResult> forException(java.lang.Exception param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.fromException(param0)");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.fromException(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.forException(param0)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.forException(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static <XTResult> org.xms.g.tasks.Task<XTResult> forResult(XTResult param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            XTResult hObj0 = ((XTResult) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.fromResult(hObj0)");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.fromResult(hObj0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            XTResult gObj0 = ((XTResult) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.forResult(gObj0)");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.forResult(gObj0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.tasks.Task<java.lang.Void> whenAll(org.xms.g.tasks.Task<?>... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.join(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.join(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAll(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAll(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.tasks.Task<java.lang.Void> whenAll(java.util.Collection<? extends org.xms.g.tasks.Task<?>> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.join(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.join(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAll(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAll(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.tasks.Task<java.util.List<org.xms.g.tasks.Task<?>>> whenAllComplete(org.xms.g.tasks.Task<?>... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.allOf(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.allOf(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAllComplete(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAllComplete(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.tasks.Task<java.util.List<org.xms.g.tasks.Task<?>>> whenAllComplete(java.util.Collection<? extends org.xms.g.tasks.Task<?>> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.allOf(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.allOf(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAllComplete(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAllComplete(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static <XTResult> org.xms.g.tasks.Task<java.util.List<XTResult>> whenAllSuccess(org.xms.g.tasks.Task<?>... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.successOf(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.successOf(((com.huawei.hmf.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hmf.tasks.Task.class, x -> (com.huawei.hmf.tasks.Task)x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAllSuccess(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAllSuccess(((com.google.android.gms.tasks.Task[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.tasks.Task.class, x -> (com.google.android.gms.tasks.Task)x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static <XTResult> org.xms.g.tasks.Task<java.util.List<XTResult>> whenAllSuccess(java.util.Collection param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hmf.tasks.Tasks.successOf(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
            com.huawei.hmf.tasks.Task hReturn = com.huawei.hmf.tasks.Tasks.successOf(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.Tasks.whenAllSuccess(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
            com.google.android.gms.tasks.Task gReturn = com.google.android.gms.tasks.Tasks.whenAllSuccess(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.tasks.Tasks dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.Tasks) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.Tasks;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.Tasks;
        }
    }
}