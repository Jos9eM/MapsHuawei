package org.xms.g.maps.model;

public final class PolygonOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.PolygonOptions createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.PolygonOptions gReturn = null;
            com.huawei.hms.maps.model.PolygonOptions hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.PolygonOptions.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.PolygonOptions.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.PolygonOptions(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.PolygonOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.PolygonOptions[param0];
        }
    };
    
    public PolygonOptions(com.google.android.gms.maps.model.PolygonOptions param0, com.huawei.hms.maps.model.PolygonOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public PolygonOptions() {
        super(((com.google.android.gms.maps.model.PolygonOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.PolygonOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.PolygonOptions());
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions add(org.xms.g.maps.model.LatLng... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.LatLng.class, x -> (com.huawei.hms.maps.model.LatLng)x.getHInstance())))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.LatLng.class, x -> (com.huawei.hms.maps.model.LatLng)x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.LatLng.class, x -> (com.google.android.gms.maps.model.LatLng)x.getGInstance())))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.LatLng.class, x -> (com.google.android.gms.maps.model.LatLng)x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions add(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions addAll(java.lang.Iterable<org.xms.g.maps.model.LatLng> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions addHole(java.lang.Iterable<org.xms.g.maps.model.LatLng> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).addHole(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).addHole(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).addHole(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).addHole(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions clickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).clickable(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).clickable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).clickable(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).clickable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions fillColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).fillColor(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).fillColor(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).fillColor(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).fillColor(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions geodesic(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).geodesic(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).geodesic(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).geodesic(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).geodesic(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final int getFillColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getFillColor()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getFillColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getFillColor()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getFillColor();
        }
    }
    
    public final java.util.List<java.util.List<org.xms.g.maps.model.LatLng>> getHoles() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getHoles()");
            java.util.List<java.util.List<com.huawei.hms.maps.model.LatLng>> hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getHoles();
            return hReturn.stream().map(e -> org.xms.g.utils.Utils.<org.xms.g.maps.model.LatLng,com.huawei.hms.maps.model.LatLng>mapList2X(e, true)).collect(java.util.stream.Collectors.toList());
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getHoles()");
            java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getHoles();
            return gReturn.stream().map(e -> org.xms.g.utils.Utils.<org.xms.g.maps.model.LatLng,com.google.android.gms.maps.model.LatLng>mapList2X(e, true)).collect(java.util.stream.Collectors.toList());
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.LatLng> getPoints() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getPoints()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {
                
                public org.xms.g.maps.model.LatLng apply(com.huawei.hms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getPoints()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {
                
                public org.xms.g.maps.model.LatLng apply(com.google.android.gms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(param0, null);
                }
            }));
        }
    }
    
    public final int getStrokeColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeColor()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeColor()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeColor();
        }
    }
    
    public final int getStrokeJointType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeJointType()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeJointType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeJointType()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeJointType();
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.PatternItem> getStrokePattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokePattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokePattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(param0, null);
                }
            }));
        }
    }
    
    public final float getStrokeWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeWidth()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeWidth()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeWidth();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getZIndex();
        }
    }
    
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isClickable();
        }
    }
    
    public final boolean isGeodesic() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isGeodesic()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isGeodesic();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isGeodesic()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isGeodesic();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isVisible();
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions strokeColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeColor(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeColor(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeColor(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeColor(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions strokeJointType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeJointType(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeJointType(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeJointType(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeJointType(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions strokePattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions strokeWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeWidth(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeWidth(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeWidth(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeWidth(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public final org.xms.g.maps.model.PolygonOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(gReturn, null)));
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.PolygonOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.PolygonOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.PolygonOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.PolygonOptions;
        }
    }
}