package org.xms.g.tasks;

public final class TaskExecutors extends org.xms.g.utils.XObject {
    
    public TaskExecutors(com.google.android.gms.tasks.TaskExecutors param0, java.lang.Object param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static java.util.concurrent.Executor getMAIN_THREAD() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return com.huawei.hmf.tasks.TaskExecutors.uiThread();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD");
            return com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD;
        }
    }
    
    public static org.xms.g.tasks.TaskExecutors dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.TaskExecutors) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            throw new RuntimeException("hms branch not support");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.TaskExecutors;
        }
    }
}