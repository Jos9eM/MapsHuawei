package org.xms.g.common.api;

public final class PendingResults extends org.xms.g.utils.XObject {
    
    public PendingResults(com.google.android.gms.common.api.PendingResults param0, com.huawei.hms.support.api.client.PendingResultsCreator param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> canceledPendingResult() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult()");
            com.huawei.hms.support.api.client.PendingResult hReturn = com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult();
            return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.PendingResults.canceledPendingResult()");
            com.google.android.gms.common.api.PendingResult gReturn = com.google.android.gms.common.api.PendingResults.canceledPendingResult();
            return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(gReturn, null)));
        }
    }
    
    public static <XR extends org.xms.g.common.api.Result> org.xms.g.common.api.PendingResult<XR> canceledPendingResult(XR param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult(hObj0)");
            com.huawei.hms.support.api.client.PendingResult hReturn = com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult(hObj0);
            return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(null, hReturn)));
        } else {
            com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.PendingResults.canceledPendingResult(gObj0)");
            com.google.android.gms.common.api.PendingResult gReturn = com.google.android.gms.common.api.PendingResults.canceledPendingResult(gObj0);
            return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(gReturn, null)));
        }
    }
    
    public static <XR extends org.xms.g.common.api.Result> org.xms.g.common.api.OptionalPendingResult<XR> immediatePendingResult(XR param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(hObj0)");
            com.huawei.hms.common.api.OptionalPendingResult hReturn = com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(hObj0);
            return ((hReturn) == null ? null : (new org.xms.g.common.api.OptionalPendingResult.XImpl(null, hReturn)));
        } else {
            com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.PendingResults.immediatePendingResult(gObj0)");
            com.google.android.gms.common.api.OptionalPendingResult gReturn = com.google.android.gms.common.api.PendingResults.immediatePendingResult(gObj0);
            return ((gReturn) == null ? null : (new org.xms.g.common.api.OptionalPendingResult.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> immediatePendingResult(org.xms.g.common.api.Status param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.support.api.client.PendingResult hReturn = com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.PendingResults.immediatePendingResult(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.common.api.PendingResult gReturn = com.google.android.gms.common.api.PendingResults.immediatePendingResult(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(gReturn, null)));
        }
    }
    
    public static org.xms.g.common.api.PendingResults dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.PendingResults) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.PendingResultsCreator;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.PendingResults;
        }
    }
}