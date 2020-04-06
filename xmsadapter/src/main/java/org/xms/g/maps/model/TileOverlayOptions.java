package org.xms.g.maps.model;

public final class TileOverlayOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.TileOverlayOptions createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = null;
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.TileOverlayOptions.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.TileOverlayOptions.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.TileOverlayOptions(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.TileOverlayOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.TileOverlayOptions[param0];
        }
    };
    
    public TileOverlayOptions(com.google.android.gms.maps.model.TileOverlayOptions param0, com.huawei.hms.maps.model.TileOverlayOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public TileOverlayOptions() {
        super(((com.google.android.gms.maps.model.TileOverlayOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.TileOverlayOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.TileOverlayOptions());
        }
    }
    
    public final org.xms.g.maps.model.TileOverlayOptions fadeIn(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).fadeIn(param0)");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).fadeIn(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).fadeIn(param0)");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).fadeIn(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(gReturn, null)));
        }
    }
    
    public final boolean getFadeIn() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getFadeIn()");
            return ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getFadeIn();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getFadeIn()");
            return ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getFadeIn();
        }
    }
    
    public final org.xms.g.maps.model.TileProvider getTileProvider() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getTileProvider()");
            com.huawei.hms.maps.model.TileProvider hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getTileProvider();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileProvider.XImpl(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getTileProvider()");
            com.google.android.gms.maps.model.TileProvider gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getTileProvider();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileProvider.XImpl(gReturn, null)));
        }
    }
    
    public final float getTransparency() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getTransparency()");
            return ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getTransparency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getTransparency()");
            return ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getTransparency();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getZIndex();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).isVisible();
        }
    }
    
    public final org.xms.g.maps.model.TileOverlayOptions tileProvider(org.xms.g.maps.model.TileProvider param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).tileProvider(((param0) == null ? null : (param0.getHInstanceTileProvider())))");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).tileProvider(((param0) == null ? null : (param0.getHInstanceTileProvider())));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).tileProvider(((param0) == null ? null : (param0.getGInstanceTileProvider())))");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).tileProvider(((param0) == null ? null : (param0.getGInstanceTileProvider())));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.TileOverlayOptions transparency(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).transparency(param0)");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).transparency(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).transparency(param0)");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).transparency(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.TileOverlayOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(gReturn, null)));
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public final org.xms.g.maps.model.TileOverlayOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(gReturn, null)));
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.TileOverlayOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.TileOverlayOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.TileOverlayOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.TileOverlayOptions;
        }
    }
}