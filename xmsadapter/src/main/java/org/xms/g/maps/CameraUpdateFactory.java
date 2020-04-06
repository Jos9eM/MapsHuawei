package org.xms.g.maps;

public final class CameraUpdateFactory extends org.xms.g.utils.XObject {
    
    public CameraUpdateFactory(com.google.android.gms.maps.CameraUpdateFactory param0, com.huawei.hms.maps.CameraUpdateFactory param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static final org.xms.g.maps.CameraUpdate newCameraPosition(org.xms.g.maps.model.CameraPosition param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newCameraPosition(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newCameraPosition(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static final org.xms.g.maps.CameraUpdate newLatLng(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newLatLng(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newLatLng(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newLatLng(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static final org.xms.g.maps.CameraUpdate newLatLngBounds(org.xms.g.maps.model.LatLngBounds param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static final org.xms.g.maps.CameraUpdate newLatLngBounds(org.xms.g.maps.model.LatLngBounds param0, int param1, int param2, int param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))), param1, param2, param3)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))), param1, param2, param3);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))), param1, param2, param3)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))), param1, param2, param3);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static final org.xms.g.maps.CameraUpdate newLatLngZoom(org.xms.g.maps.model.LatLng param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newLatLngZoom(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newLatLngZoom(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.CameraUpdate scrollBy(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.scrollBy(param0, param1)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.scrollBy(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.scrollBy(param0, param1)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.scrollBy(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static final org.xms.g.maps.CameraUpdate zoomBy(float param0, android.graphics.Point param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomBy(param0, param1)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomBy(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomBy(param0, param1)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomBy(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.CameraUpdate zoomBy(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomBy(param0)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomBy(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomBy(param0)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomBy(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.CameraUpdate zoomIn() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomIn()");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomIn();
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomIn()");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomIn();
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.CameraUpdate zoomOut() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomOut()");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomOut();
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomOut()");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomOut();
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.CameraUpdate zoomTo(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomTo(param0)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomTo(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomTo(param0)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomTo(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.CameraUpdateFactory dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.CameraUpdateFactory) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.CameraUpdateFactory;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.CameraUpdateFactory;
        }
    }
}