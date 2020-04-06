package org.xms.g.maps.model;

public final class TileOverlay extends org.xms.g.utils.XObject {
    
    public TileOverlay(com.google.android.gms.maps.model.TileOverlay param0, com.huawei.hms.maps.model.TileOverlay param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final void clearTileCache() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).clearTileCache()");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).clearTileCache();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).clearTileCache()");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).clearTileCache();
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).equals(param0);
        }
    }
    
    public final boolean getFadeIn() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getFadeIn()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getFadeIn();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getFadeIn()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getFadeIn();
        }
    }
    
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getId();
        }
    }
    
    public final float getTransparency() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getTransparency()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getTransparency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getTransparency()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getTransparency();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getZIndex();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).hashCode();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).isVisible();
        }
    }
    
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).remove();
        }
    }
    
    public final void setFadeIn(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setFadeIn(param0)");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setFadeIn(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setFadeIn(param0)");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setFadeIn(param0);
        }
    }
    
    public final void setTransparency(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setTransparency(param0)");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setTransparency(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setTransparency(param0)");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setTransparency(param0);
        }
    }
    
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setVisible(param0);
        }
    }
    
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setZIndex(param0);
        }
    }
    
    public static org.xms.g.maps.model.TileOverlay dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.TileOverlay) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.TileOverlay;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.TileOverlay;
        }
    }
}