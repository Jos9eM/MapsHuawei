package org.xms.g.maps.model;

public final class Polygon extends org.xms.g.utils.XObject {
    
    public Polygon(com.google.android.gms.maps.model.Polygon param0, com.huawei.hms.maps.model.Polygon param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).equals(param0);
        }
    }
    
    public final int getFillColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getFillColor()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getFillColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getFillColor()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getFillColor();
        }
    }
    
    public final java.util.List<java.util.List<org.xms.g.maps.model.LatLng>> getHoles() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getHoles()");
            java.util.List<java.util.List<com.huawei.hms.maps.model.LatLng>> hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getHoles();
            return hReturn.stream().map(e -> org.xms.g.utils.Utils.<org.xms.g.maps.model.LatLng,com.huawei.hms.maps.model.LatLng>mapList2X(e, true)).collect(java.util.stream.Collectors.toList());
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getHoles()");
            java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getHoles();
            return gReturn.stream().map(e -> org.xms.g.utils.Utils.<org.xms.g.maps.model.LatLng,com.google.android.gms.maps.model.LatLng>mapList2X(e, true)).collect(java.util.stream.Collectors.toList());
        }
    }
    
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getId();
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.LatLng> getPoints() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getPoints()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {
                
                public org.xms.g.maps.model.LatLng apply(com.huawei.hms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getPoints()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {
                
                public org.xms.g.maps.model.LatLng apply(com.google.android.gms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(param0, null);
                }
            }));
        }
    }
    
    public final int getStrokeColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeColor()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeColor()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeColor();
        }
    }
    
    public final int getStrokeJointType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeJointType()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeJointType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeJointType()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeJointType();
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.PatternItem> getStrokePattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokePattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokePattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(param0, null);
                }
            }));
        }
    }
    
    public final float getStrokeWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeWidth()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeWidth()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeWidth();
        }
    }
    
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getTag();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getZIndex();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).hashCode();
        }
    }
    
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isClickable();
        }
    }
    
    public final boolean isGeodesic() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isGeodesic()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isGeodesic();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isGeodesic()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isGeodesic();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isVisible();
        }
    }
    
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).remove();
        }
    }
    
    public final void setClickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setClickable(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setClickable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setClickable(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setClickable(param0);
        }
    }
    
    public final void setFillColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setFillColor(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setFillColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setFillColor(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setFillColor(param0);
        }
    }
    
    public final void setGeodesic(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setGeodesic(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setGeodesic(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setGeodesic(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setGeodesic(param0);
        }
    }
    
    public final void setHoles(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setHoles(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setHoles(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setHoles(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setHoles(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }
    
    public final void setPoints(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }
    
    public final void setStrokeColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeColor(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeColor(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeColor(param0);
        }
    }
    
    public final void setStrokeJointType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeJointType(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeJointType(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeJointType(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeJointType(param0);
        }
    }
    
    public final void setStrokePattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }
    
    public final void setStrokeWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeWidth(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeWidth(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeWidth(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeWidth(param0);
        }
    }
    
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setTag(param0);
        }
    }
    
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setVisible(param0);
        }
    }
    
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setZIndex(param0);
        }
    }
    
    public static org.xms.g.maps.model.Polygon dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Polygon) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Polygon;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Polygon;
        }
    }
}