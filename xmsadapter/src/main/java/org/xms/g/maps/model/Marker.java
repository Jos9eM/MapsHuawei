package org.xms.g.maps.model;

public final class Marker extends org.xms.g.utils.XObject {
    
    public Marker(com.google.android.gms.maps.model.Marker param0, com.huawei.hms.maps.model.Marker param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).equals(param0);
        }
    }
    
    public final float getAlpha() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getAlpha()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getAlpha();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getAlpha()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getAlpha();
        }
    }
    
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getId();
        }
    }
    
    public final org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getPosition()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getPosition()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final float getRotation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getRotation()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getRotation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getRotation()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getRotation();
        }
    }
    
    public final java.lang.String getSnippet() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getSnippet()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getSnippet();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getSnippet()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getSnippet();
        }
    }
    
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getTag();
        }
    }
    
    public final java.lang.String getTitle() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getTitle()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getTitle();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getTitle()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getTitle();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getZIndex();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).hashCode();
        }
    }
    
    public final void hideInfoWindow() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).hideInfoWindow()");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).hideInfoWindow();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).hideInfoWindow()");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).hideInfoWindow();
        }
    }
    
    public final boolean isDraggable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).isDraggable()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).isDraggable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).isDraggable()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).isDraggable();
        }
    }
    
    public final boolean isFlat() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).isFlat()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).isFlat();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).isFlat()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).isFlat();
        }
    }
    
    public final boolean isInfoWindowShown() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).isInfoWindowShown()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).isInfoWindowShown();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).isInfoWindowShown()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).isInfoWindowShown();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).isVisible();
        }
    }
    
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).remove();
        }
    }
    
    public final void setAlpha(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setAlpha(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setAlpha(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setAlpha(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setAlpha(param0);
        }
    }
    
    public final void setAnchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setAnchor(param0, param1)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setAnchor(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setAnchor(param0, param1)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setAnchor(param0, param1);
        }
    }
    
    public final void setDraggable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setDraggable(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setDraggable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setDraggable(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setDraggable(param0);
        }
    }
    
    public final void setFlat(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setFlat(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setFlat(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setFlat(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setFlat(param0);
        }
    }
    
    public final void setIcon(org.xms.g.maps.model.BitmapDescriptor param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setIcon(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setIcon(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setIcon(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setIcon(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setInfoWindowAnchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setInfoWindowAnchor(param0, param1)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setInfoWindowAnchor(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setInfoWindowAnchor(param0, param1)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setInfoWindowAnchor(param0, param1);
        }
    }
    
    public final void setPosition(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setRotation(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setRotation(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setRotation(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setRotation(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setRotation(param0);
        }
    }
    
    public final void setSnippet(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setSnippet(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setSnippet(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setSnippet(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setSnippet(param0);
        }
    }
    
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setTag(param0);
        }
    }
    
    public final void setTitle(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setTitle(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setTitle(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setTitle(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setTitle(param0);
        }
    }
    
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setVisible(param0);
        }
    }
    
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setZIndex(param0);
        }
    }
    
    public final void showInfoWindow() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).showInfoWindow()");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).showInfoWindow();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).showInfoWindow()");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).showInfoWindow();
        }
    }
    
    public static org.xms.g.maps.model.Marker dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Marker) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Marker;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Marker;
        }
    }
}