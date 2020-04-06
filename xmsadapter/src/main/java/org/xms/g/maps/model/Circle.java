package org.xms.g.maps.model;

public final class Circle extends org.xms.g.utils.XObject {
    
    public Circle(com.google.android.gms.maps.model.Circle param0, com.huawei.hms.maps.model.Circle param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final org.xms.g.maps.model.LatLng getCenter() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getCenter()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getCenter();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getCenter()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getCenter();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final int getFillColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getFillColor()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getFillColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getFillColor()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getFillColor();
        }
    }
    
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getId();
        }
    }
    
    public final double getRadius() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getRadius()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getRadius();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getRadius()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getRadius();
        }
    }
    
    public final int getStrokeColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokeColor()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokeColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokeColor()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokeColor();
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.PatternItem> getStrokePattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokePattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokePattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(param0, null);
                }
            }));
        }
    }
    
    public final float getStrokeWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokeWidth()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokeWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokeWidth()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokeWidth();
        }
    }
    
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getTag();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getZIndex();
        }
    }
    
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).isClickable();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).isVisible();
        }
    }
    
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).remove();
        }
    }
    
    public final void setCenter(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setCenter(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setCenter(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setCenter(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setCenter(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setClickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setClickable(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setClickable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setClickable(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setClickable(param0);
        }
    }
    
    public final void setFillColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setFillColor(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setFillColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setFillColor(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setFillColor(param0);
        }
    }
    
    public final void setRadius(double param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setRadius(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setRadius(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setRadius(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setRadius(param0);
        }
    }
    
    public final void setStrokeColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokeColor(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokeColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokeColor(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokeColor(param0);
        }
    }
    
    public final void setStrokePattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }
    
    public final void setStrokeWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokeWidth(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokeWidth(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokeWidth(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokeWidth(param0);
        }
    }
    
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setTag(param0);
        }
    }
    
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setVisible(param0);
        }
    }
    
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setZIndex(param0);
        }
    }
    
    public static org.xms.g.maps.model.Circle dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Circle) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Circle;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Circle;
        }
    }
}