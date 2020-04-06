package org.xms.g.location;

public class GeofencingClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {
    private boolean wrapper = true;
    
    public GeofencingClient(com.google.android.gms.location.GeofencingClient param0, com.huawei.hms.location.GeofenceService param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> addGeofences(org.xms.g.location.GeofencingRequest param0, android.app.PendingIntent param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceService) this.getHInstance()).createGeofenceList(((com.huawei.hms.location.GeofenceRequest) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.GeofenceService) this.getHInstance()).createGeofenceList(((com.huawei.hms.location.GeofenceRequest) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingClient) this.getGInstance()).addGeofences(((com.google.android.gms.location.GeofencingRequest) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.GeofencingClient) this.getGInstance()).addGeofences(((com.google.android.gms.location.GeofencingRequest) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> removeGeofences(java.util.List<java.lang.String> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceService) this.getHInstance()).deleteGeofenceList(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.GeofenceService) this.getHInstance()).deleteGeofenceList(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingClient) this.getGInstance()).removeGeofences(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.GeofencingClient) this.getGInstance()).removeGeofences(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public org.xms.g.tasks.Task<java.lang.Void> removeGeofences(android.app.PendingIntent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceService) this.getHInstance()).deleteGeofenceList(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.GeofenceService) this.getHInstance()).deleteGeofenceList(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingClient) this.getGInstance()).removeGeofences(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.GeofencingClient) this.getGInstance()).removeGeofences(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(gReturn, null)));
        }
    }
    
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.GeofencingClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.GeofencingClient) {
            return ((org.xms.g.location.GeofencingClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.GeofencingClient gReturn = ((com.google.android.gms.location.GeofencingClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.GeofenceService hReturn = ((com.huawei.hms.location.GeofenceService) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.GeofencingClient(gReturn, hReturn);
        }
        return ((org.xms.g.location.GeofencingClient) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceService;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofencingClient;
        }
    }
}