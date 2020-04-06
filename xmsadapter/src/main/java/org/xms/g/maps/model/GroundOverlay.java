package org.xms.g.maps.model;

public final class GroundOverlay extends org.xms.g.utils.XObject {
    
    public GroundOverlay(com.google.android.gms.maps.model.GroundOverlay param0, com.huawei.hms.maps.model.GroundOverlay param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).equals(param0);
        }
    }
    
    public final float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getBearing()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getBearing();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getBearing()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getBearing();
        }
    }
    
    public final org.xms.g.maps.model.LatLngBounds getBounds() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getBounds()");
            com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getBounds();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getBounds()");
            com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getBounds();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(gReturn, null)));
        }
    }
    
    public final float getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getHeight()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getHeight();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getHeight()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getHeight();
        }
    }
    
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getId();
        }
    }
    
    public final org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getPosition()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getPosition()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getTag();
        }
    }
    
    public final float getTransparency() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getTransparency()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getTransparency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getTransparency()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getTransparency();
        }
    }
    
    public final float getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getWidth();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getZIndex();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).hashCode();
        }
    }
    
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).isClickable();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).isVisible();
        }
    }
    
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).remove();
        }
    }
    
    public final void setBearing(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setBearing(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setBearing(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setBearing(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setBearing(param0);
        }
    }
    
    public final void setClickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setClickable(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setClickable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setClickable(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setClickable(param0);
        }
    }
    
    public final void setDimensions(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setDimensions(param0, param1)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setDimensions(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setDimensions(param0, param1)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setDimensions(param0, param1);
        }
    }
    
    public final void setDimensions(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setDimensions(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setDimensions(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setDimensions(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setDimensions(param0);
        }
    }
    
    public final void setImage(org.xms.g.maps.model.BitmapDescriptor param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setImage(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setImage(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setImage(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setImage(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setPosition(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setPositionFromBounds(org.xms.g.maps.model.LatLngBounds param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setPositionFromBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setPositionFromBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setPositionFromBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setPositionFromBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setTag(param0);
        }
    }
    
    public final void setTransparency(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setTransparency(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setTransparency(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setTransparency(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setTransparency(param0);
        }
    }
    
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setVisible(param0);
        }
    }
    
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setZIndex(param0);
        }
    }
    
    public static org.xms.g.maps.model.GroundOverlay dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.GroundOverlay) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.GroundOverlay;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.GroundOverlay;
        }
    }
}