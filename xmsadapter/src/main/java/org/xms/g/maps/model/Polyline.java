package org.xms.g.maps.model;

public final class Polyline extends org.xms.g.utils.XObject {
    
    public Polyline(com.google.android.gms.maps.model.Polyline param0, com.huawei.hms.maps.model.Polyline param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).equals(param0);
        }
    }
    
    public final int getColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getColor()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getColor()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getColor();
        }
    }
    
    public final org.xms.g.maps.model.Cap getEndCap() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getEndCap()");
            com.huawei.hms.maps.model.Cap hReturn = ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getEndCap();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Cap(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getEndCap()");
            com.google.android.gms.maps.model.Cap gReturn = ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getEndCap();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Cap(gReturn, null)));
        }
    }
    
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getId();
        }
    }
    
    public final int getJointType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getJointType()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getJointType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getJointType()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getJointType();
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.PatternItem> getPattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getPattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getPattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getPattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getPattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(param0, null);
                }
            }));
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.LatLng> getPoints() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getPoints()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {
                
                public org.xms.g.maps.model.LatLng apply(com.huawei.hms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getPoints()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {
                
                public org.xms.g.maps.model.LatLng apply(com.google.android.gms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(param0, null);
                }
            }));
        }
    }
    
    public final org.xms.g.maps.model.Cap getStartCap() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getStartCap()");
            com.huawei.hms.maps.model.Cap hReturn = ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getStartCap();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Cap(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getStartCap()");
            com.google.android.gms.maps.model.Cap gReturn = ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getStartCap();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Cap(gReturn, null)));
        }
    }
    
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getTag();
        }
    }
    
    public final float getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getWidth();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getZIndex();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).hashCode();
        }
    }
    
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isClickable();
        }
    }
    
    public final boolean isGeodesic() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isGeodesic()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isGeodesic();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isGeodesic()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isGeodesic();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isVisible();
        }
    }
    
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).remove();
        }
    }
    
    public final void setClickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setClickable(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setClickable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setClickable(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setClickable(param0);
        }
    }
    
    public final void setColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setColor(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setColor(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setColor(param0);
        }
    }
    
    public final void setEndCap(org.xms.g.maps.model.Cap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setEndCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setEndCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setEndCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setEndCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setGeodesic(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setGeodesic(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setGeodesic(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setGeodesic(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setGeodesic(param0);
        }
    }
    
    public final void setJointType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setJointType(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setJointType(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setJointType(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setJointType(param0);
        }
    }
    
    public final void setPattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setPattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setPattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setPattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setPattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }
    
    public final void setPoints(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }
    
    public final void setStartCap(org.xms.g.maps.model.Cap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setStartCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setStartCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setStartCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setStartCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setTag(param0);
        }
    }
    
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setVisible(param0);
        }
    }
    
    public final void setWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setWidth(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setWidth(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setWidth(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setWidth(param0);
        }
    }
    
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setZIndex(param0);
        }
    }
    
    public static org.xms.g.maps.model.Polyline dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Polyline) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Polyline;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Polyline;
        }
    }
}