package org.xms.g.maps;

public final class UiSettings extends org.xms.g.utils.XObject {
    
    public UiSettings(com.google.android.gms.maps.UiSettings param0, com.huawei.hms.maps.UiSettings param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final boolean isCompassEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isCompassEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isCompassEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isCompassEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isCompassEnabled();
        }
    }
    
    public final boolean isIndoorLevelPickerEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isIndoorLevelPickerEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isIndoorLevelPickerEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isIndoorLevelPickerEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isIndoorLevelPickerEnabled();
        }
    }
    
    public final boolean isMapToolbarEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isMapToolbarEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isMapToolbarEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isMapToolbarEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isMapToolbarEnabled();
        }
    }
    
    public final boolean isMyLocationButtonEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isMyLocationButtonEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isMyLocationButtonEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isMyLocationButtonEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isMyLocationButtonEnabled();
        }
    }
    
    public final boolean isRotateGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isRotateGesturesEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isRotateGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isRotateGesturesEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isRotateGesturesEnabled();
        }
    }
    
    public final boolean isScrollGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isScrollGesturesEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isScrollGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isScrollGesturesEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isScrollGesturesEnabled();
        }
    }
    
    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isScrollGesturesEnabledDuringRotateOrZoom()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isScrollGesturesEnabledDuringRotateOrZoom();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isScrollGesturesEnabledDuringRotateOrZoom()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isScrollGesturesEnabledDuringRotateOrZoom();
        }
    }
    
    public final boolean isTiltGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isTiltGesturesEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isTiltGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isTiltGesturesEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isTiltGesturesEnabled();
        }
    }
    
    public final boolean isZoomControlsEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isZoomControlsEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isZoomControlsEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isZoomControlsEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isZoomControlsEnabled();
        }
    }
    
    public final boolean isZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isZoomGesturesEnabled();
        }
    }
    
    public final void setAllGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setAllGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setAllGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setAllGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setAllGesturesEnabled(param0);
        }
    }
    
    public final void setCompassEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setCompassEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setCompassEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setCompassEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setCompassEnabled(param0);
        }
    }
    
    public final void setIndoorLevelPickerEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setIndoorLevelPickerEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setIndoorLevelPickerEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setIndoorLevelPickerEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setIndoorLevelPickerEnabled(param0);
        }
    }
    
    public final void setMapToolbarEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setMapToolbarEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setMapToolbarEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setMapToolbarEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setMapToolbarEnabled(param0);
        }
    }
    
    public final void setMyLocationButtonEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setMyLocationButtonEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setMyLocationButtonEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setMyLocationButtonEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setMyLocationButtonEnabled(param0);
        }
    }
    
    public final void setRotateGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setRotateGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setRotateGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setRotateGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setRotateGesturesEnabled(param0);
        }
    }
    
    public final void setScrollGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setScrollGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setScrollGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setScrollGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setScrollGesturesEnabled(param0);
        }
    }
    
    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setScrollGesturesEnabledDuringRotateOrZoom(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setScrollGesturesEnabledDuringRotateOrZoom(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setScrollGesturesEnabledDuringRotateOrZoom(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setScrollGesturesEnabledDuringRotateOrZoom(param0);
        }
    }
    
    public final void setTiltGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setTiltGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setTiltGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setTiltGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setTiltGesturesEnabled(param0);
        }
    }
    
    public final void setZoomControlsEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setZoomControlsEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setZoomControlsEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setZoomControlsEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setZoomControlsEnabled(param0);
        }
    }
    
    public final void setZoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setZoomGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setZoomGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setZoomGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setZoomGesturesEnabled(param0);
        }
    }
    
    public static org.xms.g.maps.UiSettings dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.UiSettings) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.UiSettings;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.UiSettings;
        }
    }
}