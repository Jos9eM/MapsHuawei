package org.xms.g.maps;

public class StreetViewPanorama extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public StreetViewPanorama(com.google.android.gms.maps.StreetViewPanorama param0, com.huawei.hms.maps.StreetViewPanorama param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public void animateTo(org.xms.g.maps.model.StreetViewPanoramaCamera param0, long param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).animateTo(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).animateTo(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))), param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).animateTo(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).animateTo(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))), param1);
        }
    }
    
    public org.xms.g.maps.model.StreetViewPanoramaLocation getLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getLocation()");
            com.huawei.hms.maps.model.StreetViewPanoramaLocation hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getLocation();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getLocation()");
            com.google.android.gms.maps.model.StreetViewPanoramaLocation gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getLocation();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(gReturn, null)));
        }
    }
    
    public org.xms.g.maps.model.StreetViewPanoramaCamera getPanoramaCamera() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getPanoramaCamera()");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getPanoramaCamera();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getPanoramaCamera()");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getPanoramaCamera();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(gReturn, null)));
        }
    }
    
    public boolean isPanningGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isPanningGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isPanningGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isPanningGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isPanningGesturesEnabled();
        }
    }
    
    public boolean isStreetNamesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isStreetNamesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isStreetNamesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isStreetNamesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isStreetNamesEnabled();
        }
    }
    
    public boolean isUserNavigationEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isUserNavigationEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isUserNavigationEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isUserNavigationEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isUserNavigationEnabled();
        }
    }
    
    public boolean isZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isZoomGesturesEnabled();
        }
    }
    
    public android.graphics.Point orientationToPoint(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).orientationToPoint(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).orientationToPoint(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).orientationToPoint(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).orientationToPoint(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public org.xms.g.maps.model.StreetViewPanoramaOrientation pointToOrientation(android.graphics.Point param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).pointToOrientation(param0)");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).pointToOrientation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).pointToOrientation(param0)");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).pointToOrientation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(gReturn, null)));
        }
    }
    
    public void setOnStreetViewPanoramaCameraChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaCameraChangeListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaCameraChangeListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaCameraChangeListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaCameraChangeListener())));
        }
    }
    
    public void setOnStreetViewPanoramaChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaChangeListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaChangeListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaChangeListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaChangeListener())));
        }
    }
    
    public void setOnStreetViewPanoramaClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaClickListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaClickListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaClickListener())));
        }
    }
    
    public void setOnStreetViewPanoramaLongClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaLongClickListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaLongClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaLongClickListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaLongClickListener())));
        }
    }
    
    public void setPanningGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPanningGesturesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPanningGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPanningGesturesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPanningGesturesEnabled(param0);
        }
    }
    
    public void setPosition(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.StreetViewSource param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))));
        }
    }
    
    public void setPosition(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public void setPosition(org.xms.g.maps.model.LatLng param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
        }
    }
    
    public void setPosition(org.xms.g.maps.model.LatLng param0, int param1, org.xms.g.maps.model.StreetViewSource param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))));
        }
    }
    
    public void setPosition(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(param0);
        }
    }
    
    public void setStreetNamesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setStreetNamesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setStreetNamesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setStreetNamesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setStreetNamesEnabled(param0);
        }
    }
    
    public void setUserNavigationEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setUserNavigationEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setUserNavigationEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setUserNavigationEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setUserNavigationEnabled(param0);
        }
    }
    
    public void setZoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setZoomGesturesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setZoomGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setZoomGesturesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setZoomGesturesEnabled(param0);
        }
    }
    
    public static org.xms.g.maps.StreetViewPanorama dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.StreetViewPanorama) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama;
        }
    }
    
    public static interface OnStreetViewPanoramaCameraChangeListener extends org.xms.g.utils.XInterface {
        
        public void onStreetViewPanoramaCameraChange(org.xms.g.maps.model.StreetViewPanoramaCamera param0);
        
        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener getGInstanceOnStreetViewPanoramaCameraChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() {
                
                public void onStreetViewPanoramaCameraChange(com.google.android.gms.maps.model.StreetViewPanoramaCamera param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.this.onStreetViewPanoramaCameraChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener getHInstanceOnStreetViewPanoramaCameraChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() {
                
                public void onStreetViewPanoramaCameraChange(com.huawei.hms.maps.model.StreetViewPanoramaCamera param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.this.onStreetViewPanoramaCameraChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) {
                return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener gReturn = ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener hReturn = ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener {
            
            public XImpl(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener param0, com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener param1) {
                super(param0, param1);
            }
            
            public void onStreetViewPanoramaCameraChange(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getHInstance()).onStreetViewPanoramaCameraChange(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getHInstance()).onStreetViewPanoramaCameraChange(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getGInstance()).onStreetViewPanoramaCameraChange(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getGInstance()).onStreetViewPanoramaCameraChange(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnStreetViewPanoramaChangeListener extends org.xms.g.utils.XInterface {
        
        public void onStreetViewPanoramaChange(org.xms.g.maps.model.StreetViewPanoramaLocation param0);
        
        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener getGInstanceOnStreetViewPanoramaChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener() {
                
                public void onStreetViewPanoramaChange(com.google.android.gms.maps.model.StreetViewPanoramaLocation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.this.onStreetViewPanoramaChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener getHInstanceOnStreetViewPanoramaChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener() {
                
                public void onStreetViewPanoramaChange(com.huawei.hms.maps.model.StreetViewPanoramaLocation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.this.onStreetViewPanoramaChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) {
                return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener gReturn = ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener hReturn = ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener {
            
            public XImpl(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener param0, com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener param1) {
                super(param0, param1);
            }
            
            public void onStreetViewPanoramaChange(org.xms.g.maps.model.StreetViewPanoramaLocation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getHInstance()).onStreetViewPanoramaChange(((com.huawei.hms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getHInstance()).onStreetViewPanoramaChange(((com.huawei.hms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getGInstance()).onStreetViewPanoramaChange(((com.google.android.gms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getGInstance()).onStreetViewPanoramaChange(((com.google.android.gms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnStreetViewPanoramaClickListener extends org.xms.g.utils.XInterface {
        
        public void onStreetViewPanoramaClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0);
        
        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener getGInstanceOnStreetViewPanoramaClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener() {
                
                public void onStreetViewPanoramaClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.this.onStreetViewPanoramaClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener getHInstanceOnStreetViewPanoramaClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener() {
                
                public void onStreetViewPanoramaClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.this.onStreetViewPanoramaClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) {
                return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener gReturn = ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener hReturn = ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener {
            
            public XImpl(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener param0, com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener param1) {
                super(param0, param1);
            }
            
            public void onStreetViewPanoramaClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getHInstance()).onStreetViewPanoramaClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getHInstance()).onStreetViewPanoramaClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getGInstance()).onStreetViewPanoramaClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getGInstance()).onStreetViewPanoramaClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnStreetViewPanoramaLongClickListener extends org.xms.g.utils.XInterface {
        
        public void onStreetViewPanoramaLongClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0);
        
        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener getGInstanceOnStreetViewPanoramaLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener() {
                
                public void onStreetViewPanoramaLongClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.this.onStreetViewPanoramaLongClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener getHInstanceOnStreetViewPanoramaLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener() {
                
                public void onStreetViewPanoramaLongClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.this.onStreetViewPanoramaLongClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) {
                return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener gReturn = ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener hReturn = ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener {
            
            public XImpl(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener param0, com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener param1) {
                super(param0, param1);
            }
            
            public void onStreetViewPanoramaLongClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getHInstance()).onStreetViewPanoramaLongClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getHInstance()).onStreetViewPanoramaLongClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getGInstance()).onStreetViewPanoramaLongClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getGInstance()).onStreetViewPanoramaLongClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
}