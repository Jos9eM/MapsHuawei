package org.xms.g.maps;

public final class Projection extends org.xms.g.utils.XObject {
    
    public Projection(com.google.android.gms.maps.Projection param0, com.huawei.hms.maps.Projection param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final org.xms.g.maps.model.LatLng fromScreenLocation(android.graphics.Point param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.Projection) this.getHInstance()).fromScreenLocation(param0)");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.Projection) this.getHInstance()).fromScreenLocation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.Projection) this.getGInstance()).fromScreenLocation(param0)");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.Projection) this.getGInstance()).fromScreenLocation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.VisibleRegion getVisibleRegion() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.Projection) this.getHInstance()).getVisibleRegion()");
            com.huawei.hms.maps.model.VisibleRegion hReturn = ((com.huawei.hms.maps.Projection) this.getHInstance()).getVisibleRegion();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.VisibleRegion(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.Projection) this.getGInstance()).getVisibleRegion()");
            com.google.android.gms.maps.model.VisibleRegion gReturn = ((com.google.android.gms.maps.Projection) this.getGInstance()).getVisibleRegion();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.VisibleRegion(gReturn, null)));
        }
    }
    
    public final android.graphics.Point toScreenLocation(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.Projection) this.getHInstance()).toScreenLocation(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.Projection) this.getHInstance()).toScreenLocation(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.Projection) this.getGInstance()).toScreenLocation(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.Projection) this.getGInstance()).toScreenLocation(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public static org.xms.g.maps.Projection dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.Projection) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.Projection;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.Projection;
        }
    }
}