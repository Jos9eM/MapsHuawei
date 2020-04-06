package org.xms.g.common.api;

public class BooleanResult extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public BooleanResult(com.google.android.gms.common.api.BooleanResult param0, com.huawei.hms.common.api.BooleanResult param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).equals(param0);
        }
    }
    
    public org.xms.g.common.api.Status getStatus() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).getStatus()");
            com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).getStatus();
            return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).getStatus()");
            com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).getStatus();
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(gReturn, null)));
        }
    }
    
    public boolean getValue() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).getValue()");
            return ((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).getValue();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).getValue()");
            return ((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).getValue();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).hashCode();
        }
    }
    
    public static org.xms.g.common.api.BooleanResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.BooleanResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.BooleanResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.BooleanResult;
        }
    }
}