package org.xms.g.maps;

public final class StreetViewPanoramaOptions extends org.xms.g.utils.XObject {
    
    public StreetViewPanoramaOptions(com.google.android.gms.maps.StreetViewPanoramaOptions param0, com.huawei.hms.maps.StreetViewPanoramaOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public StreetViewPanoramaOptions() {
        super(((com.google.android.gms.maps.StreetViewPanoramaOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.StreetViewPanoramaOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.StreetViewPanoramaOptions());
        }
    }
    
    public final java.lang.Boolean getPanningGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPanningGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPanningGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPanningGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPanningGesturesEnabled();
        }
    }
    
    public final java.lang.String getPanoramaId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPanoramaId()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPanoramaId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPanoramaId()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPanoramaId();
        }
    }
    
    public final org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPosition()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPosition()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final java.lang.Integer getRadius() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getRadius()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getRadius();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getRadius()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getRadius();
        }
    }
    
    public final org.xms.g.maps.model.StreetViewSource getSource() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getSource()");
            com.huawei.hms.maps.model.StreetViewSource hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getSource();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getSource()");
            com.google.android.gms.maps.model.StreetViewSource gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getSource();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(gReturn, null)));
        }
    }
    
    public final java.lang.Boolean getStreetNamesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getStreetNamesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getStreetNamesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getStreetNamesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getStreetNamesEnabled();
        }
    }
    
    public final org.xms.g.maps.model.StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getStreetViewPanoramaCamera()");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getStreetViewPanoramaCamera();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getStreetViewPanoramaCamera()");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getStreetViewPanoramaCamera();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(gReturn, null)));
        }
    }
    
    public final java.lang.Boolean getUseViewLifecycleInFragment() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getUseViewLifecycleInFragment()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getUseViewLifecycleInFragment();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getUseViewLifecycleInFragment()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getUseViewLifecycleInFragment();
        }
    }
    
    public final java.lang.Boolean getUserNavigationEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getUserNavigationEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getUserNavigationEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getUserNavigationEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getUserNavigationEnabled();
        }
    }
    
    public final java.lang.Boolean getZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getZoomGesturesEnabled();
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions panningGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panningGesturesEnabled(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panningGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panningGesturesEnabled(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panningGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions panoramaCamera(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panoramaCamera(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panoramaCamera(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panoramaCamera(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panoramaCamera(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions panoramaId(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panoramaId(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panoramaId(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panoramaId(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panoramaId(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions position(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions position(org.xms.g.maps.model.LatLng param0, java.lang.Integer param1, org.xms.g.maps.model.StreetViewSource param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))))");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))))");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions position(org.xms.g.maps.model.LatLng param0, java.lang.Integer param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions position(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.StreetViewSource param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))))");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))))");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions streetNamesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).streetNamesEnabled(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).streetNamesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).streetNamesEnabled(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).streetNamesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).toString();
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions useViewLifecycleInFragment(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).useViewLifecycleInFragment(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).useViewLifecycleInFragment(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).useViewLifecycleInFragment(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).useViewLifecycleInFragment(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions userNavigationEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).userNavigationEnabled(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).userNavigationEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).userNavigationEnabled(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).userNavigationEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public final org.xms.g.maps.StreetViewPanoramaOptions zoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).zoomGesturesEnabled(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).zoomGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).zoomGesturesEnabled(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).zoomGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.StreetViewPanoramaOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.StreetViewPanoramaOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanoramaOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanoramaOptions;
        }
    }
}