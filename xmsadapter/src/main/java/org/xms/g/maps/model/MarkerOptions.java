package org.xms.g.maps.model;

public final class MarkerOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.MarkerOptions createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.MarkerOptions gReturn = null;
            com.huawei.hms.maps.model.MarkerOptions hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.MarkerOptions.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.MarkerOptions.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.MarkerOptions(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.MarkerOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.MarkerOptions[param0];
        }
    };
    
    public MarkerOptions(com.google.android.gms.maps.model.MarkerOptions param0, com.huawei.hms.maps.model.MarkerOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public MarkerOptions() {
        super(((com.google.android.gms.maps.model.MarkerOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.MarkerOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.MarkerOptions());
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions alpha(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).alpha(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).alpha(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).alpha(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).alpha(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions anchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).anchor(param0, param1)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).anchor(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).anchor(param0, param1)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).anchor(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions draggable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).draggable(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).draggable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).draggable(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).draggable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions flat(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).flat(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).flat(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).flat(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).flat(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final float getAlpha() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAlpha()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAlpha();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAlpha()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAlpha();
        }
    }
    
    public final float getAnchorU() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAnchorU()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAnchorU();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAnchorU()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAnchorU();
        }
    }
    
    public final float getAnchorV() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAnchorV()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAnchorV();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAnchorV()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAnchorV();
        }
    }
    
    public final org.xms.g.maps.model.BitmapDescriptor getIcon() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getIcon()");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getIcon();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getIcon()");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getIcon();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(gReturn, null)));
        }
    }
    
    public final float getInfoWindowAnchorU() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getInfoWindowAnchorU()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getInfoWindowAnchorU();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getInfoWindowAnchorU()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getInfoWindowAnchorU();
        }
    }
    
    public final float getInfoWindowAnchorV() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getInfoWindowAnchorV()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getInfoWindowAnchorV();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getInfoWindowAnchorV()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getInfoWindowAnchorV();
        }
    }
    
    public final org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getPosition()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getPosition()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final float getRotation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getRotation()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getRotation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getRotation()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getRotation();
        }
    }
    
    public final java.lang.String getSnippet() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getSnippet()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getSnippet();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getSnippet()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getSnippet();
        }
    }
    
    public final java.lang.String getTitle() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getTitle()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getTitle();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getTitle()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getTitle();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getZIndex();
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions icon(org.xms.g.maps.model.BitmapDescriptor param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).icon(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).icon(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).icon(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).icon(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions infoWindowAnchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).infoWindowAnchor(param0, param1)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).infoWindowAnchor(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).infoWindowAnchor(param0, param1)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).infoWindowAnchor(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final boolean isDraggable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isDraggable()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isDraggable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isDraggable()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isDraggable();
        }
    }
    
    public final boolean isFlat() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isFlat()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isFlat();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isFlat()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isFlat();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isVisible();
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions position(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions rotation(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).rotation(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).rotation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).rotation(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).rotation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions snippet(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).snippet(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).snippet(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).snippet(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).snippet(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions title(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).title(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).title(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).title(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).title(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public final org.xms.g.maps.model.MarkerOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(gReturn, null)));
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.MarkerOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.MarkerOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.MarkerOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.MarkerOptions;
        }
    }
}