package org.xms.g.tasks;

public class CancellationTokenSource extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public CancellationTokenSource(com.google.android.gms.tasks.CancellationTokenSource param0, com.huawei.hmf.tasks.CancellationTokenSource param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public void cancel() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.CancellationTokenSource) this.getHInstance()).cancel()");
            ((com.huawei.hmf.tasks.CancellationTokenSource) this.getHInstance()).cancel();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.CancellationTokenSource) this.getGInstance()).cancel()");
            ((com.google.android.gms.tasks.CancellationTokenSource) this.getGInstance()).cancel();
        }
    }
    
    public org.xms.g.tasks.CancellationToken getToken() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.CancellationTokenSource) this.getHInstance()).getToken()");
            com.huawei.hmf.tasks.CancellationToken hReturn = ((com.huawei.hmf.tasks.CancellationTokenSource) this.getHInstance()).getToken();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.CancellationToken.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.CancellationTokenSource) this.getGInstance()).getToken()");
            com.google.android.gms.tasks.CancellationToken gReturn = ((com.google.android.gms.tasks.CancellationTokenSource) this.getGInstance()).getToken();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.CancellationToken.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.tasks.CancellationTokenSource dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.CancellationTokenSource) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.CancellationTokenSource;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.CancellationTokenSource;
        }
    }
}