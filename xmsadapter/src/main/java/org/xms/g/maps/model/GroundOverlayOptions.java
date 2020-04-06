package org.xms.g.maps.model;

public final class GroundOverlayOptions extends org.xms.g.utils.XObject {
    
    public GroundOverlayOptions(com.google.android.gms.maps.model.GroundOverlayOptions param0, com.huawei.hms.maps.model.GroundOverlayOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public GroundOverlayOptions() {
        super(((com.google.android.gms.maps.model.GroundOverlayOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.GroundOverlayOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.GroundOverlayOptions());
        }
    }
    
    public static float getNO_DIMENSION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.GroundOverlayOptions.NO_DIMENSION");
            return com.huawei.hms.maps.model.GroundOverlayOptions.NO_DIMENSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.GroundOverlayOptions.NO_DIMENSION");
            return com.google.android.gms.maps.model.GroundOverlayOptions.NO_DIMENSION;
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions anchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).anchor(param0, param1)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).anchor(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).anchor(param0, param1)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).anchor(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions bearing(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).bearing(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).bearing(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).bearing(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).bearing(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions clickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).clickable(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).clickable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).clickable(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).clickable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final float getAnchorU() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getAnchorU()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getAnchorU();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getAnchorU()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getAnchorU();
        }
    }
    
    public final float getAnchorV() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getAnchorV()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getAnchorV();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getAnchorV()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getAnchorV();
        }
    }
    
    public final float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getBearing()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getBearing();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getBearing()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getBearing();
        }
    }
    
    public final org.xms.g.maps.model.LatLngBounds getBounds() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getBounds()");
            com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getBounds();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getBounds()");
            com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getBounds();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(gReturn, null)));
        }
    }
    
    public final float getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getHeight()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getHeight();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getHeight()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getHeight();
        }
    }
    
    public final org.xms.g.maps.model.BitmapDescriptor getImage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getImage()");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getImage();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getImage()");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getImage();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.LatLng getLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getLocation()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getLocation();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getLocation()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getLocation();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final float getTransparency() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getTransparency()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getTransparency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getTransparency()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getTransparency();
        }
    }
    
    public final float getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getWidth();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getZIndex();
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions image(org.xms.g.maps.model.BitmapDescriptor param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).image(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).image(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).image(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).image(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).isClickable();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).isVisible();
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions position(org.xms.g.maps.model.LatLng param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions position(org.xms.g.maps.model.LatLng param0, float param1, float param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, param2)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, param2);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, param2)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, param2);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions positionFromBounds(org.xms.g.maps.model.LatLngBounds param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).positionFromBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).positionFromBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).positionFromBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).positionFromBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions transparency(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).transparency(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).transparency(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).transparency(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).transparency(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlayOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.model.GroundOverlayOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.GroundOverlayOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.GroundOverlayOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.GroundOverlayOptions;
        }
    }
}