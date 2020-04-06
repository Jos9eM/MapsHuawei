package org.xms.g.maps;

public final class ExtensionMapOptions extends org.xms.g.utils.XObject {
    
    public ExtensionMapOptions(com.google.android.gms.maps.GoogleMapOptions param0, com.huawei.hms.maps.HuaweiMapOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public ExtensionMapOptions() {
        super(((com.google.android.gms.maps.GoogleMapOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.HuaweiMapOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.GoogleMapOptions());
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions ambientEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).ambientEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).ambientEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).ambientEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).ambientEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions camera(org.xms.g.maps.model.CameraPosition param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).camera(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).camera(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).camera(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).camera(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions compassEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).compassEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).compassEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).compassEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).compassEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public static final org.xms.g.maps.ExtensionMapOptions createFromAttributes(android.content.Context param0, android.util.AttributeSet param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMapOptions.createFromAttributes(param0, param1)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = com.huawei.hms.maps.HuaweiMapOptions.createFromAttributes(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(param0, param1)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final java.lang.Boolean getAmbientEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getAmbientEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getAmbientEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getAmbientEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getAmbientEnabled();
        }
    }
    
    public final org.xms.g.maps.model.CameraPosition getCamera() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getCamera()");
            com.huawei.hms.maps.model.CameraPosition hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getCamera();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getCamera()");
            com.google.android.gms.maps.model.CameraPosition gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getCamera();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(gReturn, null)));
        }
    }
    
    public final java.lang.Boolean getCompassEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getCompassEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getCompassEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getCompassEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getCompassEnabled();
        }
    }
    
    public final org.xms.g.maps.model.LatLngBounds getLatLngBoundsForCameraTarget() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getLatLngBoundsForCameraTarget()");
            com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getLatLngBoundsForCameraTarget();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getLatLngBoundsForCameraTarget()");
            com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getLatLngBoundsForCameraTarget();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(gReturn, null)));
        }
    }
    
    public final java.lang.Boolean getLiteMode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getLiteMode()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getLiteMode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getLiteMode()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getLiteMode();
        }
    }
    
    public final java.lang.Boolean getMapToolbarEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMapToolbarEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMapToolbarEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMapToolbarEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMapToolbarEnabled();
        }
    }
    
    public final int getMapType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMapType()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMapType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMapType()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMapType();
        }
    }
    
    public final java.lang.Float getMaxZoomPreference() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMaxZoomPreference()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMaxZoomPreference();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMaxZoomPreference()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMaxZoomPreference();
        }
    }
    
    public final java.lang.Float getMinZoomPreference() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMinZoomPreference()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMinZoomPreference();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMinZoomPreference()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMinZoomPreference();
        }
    }
    
    public final java.lang.Boolean getRotateGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getRotateGesturesEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getRotateGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getRotateGesturesEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getRotateGesturesEnabled();
        }
    }
    
    public final java.lang.Boolean getScrollGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getScrollGesturesEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getScrollGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getScrollGesturesEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getScrollGesturesEnabled();
        }
    }
    
    public final java.lang.Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return false;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getScrollGesturesEnabledDuringRotateOrZoom()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getScrollGesturesEnabledDuringRotateOrZoom();
        }
    }
    
    public final java.lang.Boolean getTiltGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getTiltGesturesEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getTiltGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getTiltGesturesEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getTiltGesturesEnabled();
        }
    }
    
    public final java.lang.Boolean getUseViewLifecycleInFragment() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getUseViewLifecycleInFragment()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getUseViewLifecycleInFragment();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getUseViewLifecycleInFragment()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getUseViewLifecycleInFragment();
        }
    }
    
    public final java.lang.Boolean getZOrderOnTop() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZOrderOnTop()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZOrderOnTop();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZOrderOnTop()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZOrderOnTop();
        }
    }
    
    public final java.lang.Boolean getZoomControlsEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZoomControlsEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZoomControlsEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZoomControlsEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZoomControlsEnabled();
        }
    }
    
    public final java.lang.Boolean getZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZoomGesturesEnabled();
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions latLngBoundsForCameraTarget(org.xms.g.maps.model.LatLngBounds param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).latLngBoundsForCameraTarget(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).latLngBoundsForCameraTarget(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).latLngBoundsForCameraTarget(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).latLngBoundsForCameraTarget(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions liteMode(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).liteMode(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).liteMode(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).liteMode(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).liteMode(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions mapToolbarEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).mapToolbarEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).mapToolbarEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).mapToolbarEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).mapToolbarEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions mapType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).mapType(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).mapType(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).mapType(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).mapType(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions maxZoomPreference(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).maxZoomPreference(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).maxZoomPreference(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).maxZoomPreference(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).maxZoomPreference(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions minZoomPreference(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).minZoomPreference(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).minZoomPreference(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).minZoomPreference(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).minZoomPreference(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions rotateGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).rotateGesturesEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).rotateGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).rotateGesturesEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).rotateGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions scrollGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).scrollGesturesEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).scrollGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).scrollGesturesEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).scrollGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return null;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).scrollGesturesEnabledDuringRotateOrZoom(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).scrollGesturesEnabledDuringRotateOrZoom(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions tiltGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).tiltGesturesEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).tiltGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).tiltGesturesEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).tiltGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).toString();
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions useViewLifecycleInFragment(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).useViewLifecycleInFragment(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).useViewLifecycleInFragment(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).useViewLifecycleInFragment(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).useViewLifecycleInFragment(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions zOrderOnTop(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zOrderOnTop(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zOrderOnTop(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zOrderOnTop(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zOrderOnTop(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions zoomControlsEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zoomControlsEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zoomControlsEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zoomControlsEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zoomControlsEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.ExtensionMapOptions zoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zoomGesturesEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zoomGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zoomGesturesEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zoomGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.ExtensionMapOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.ExtensionMapOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMapOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMapOptions;
        }
    }
}