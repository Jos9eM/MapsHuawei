package org.xms.g.maps.model;

public final class CircleOptions extends org.xms.g.utils.XObject {
    
    public CircleOptions(com.google.android.gms.maps.model.CircleOptions param0, com.huawei.hms.maps.model.CircleOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public CircleOptions() {
        super(((com.google.android.gms.maps.model.CircleOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.CircleOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.CircleOptions());
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions center(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).center(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).center(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).center(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).center(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions clickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).clickable(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).clickable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).clickable(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).clickable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions fillColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).fillColor(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).fillColor(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).fillColor(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).fillColor(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.LatLng getCenter() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getCenter()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getCenter();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getCenter()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getCenter();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final int getFillColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getFillColor()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getFillColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getFillColor()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getFillColor();
        }
    }
    
    public final double getRadius() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getRadius()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getRadius();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getRadius()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getRadius();
        }
    }
    
    public final int getStrokeColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokeColor()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokeColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokeColor()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokeColor();
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.PatternItem> getStrokePattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokePattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokePattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(param0, null);
                }
            }));
        }
    }
    
    public final float getStrokeWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokeWidth()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokeWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokeWidth()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokeWidth();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getZIndex();
        }
    }
    
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).isClickable();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).isVisible();
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions radius(double param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).radius(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).radius(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).radius(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).radius(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions strokeColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokeColor(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokeColor(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokeColor(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokeColor(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions strokePattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions strokeWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokeWidth(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokeWidth(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokeWidth(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokeWidth(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.CircleOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.model.CircleOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.CircleOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.CircleOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.CircleOptions;
        }
    }
}