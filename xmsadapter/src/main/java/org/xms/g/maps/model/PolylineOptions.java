package org.xms.g.maps.model;

public final class PolylineOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.PolylineOptions createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.PolylineOptions gReturn = null;
            com.huawei.hms.maps.model.PolylineOptions hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.PolylineOptions.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.PolylineOptions.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.PolylineOptions(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.PolylineOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.PolylineOptions[param0];
        }
    };
    
    public PolylineOptions(com.google.android.gms.maps.model.PolylineOptions param0, com.huawei.hms.maps.model.PolylineOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public PolylineOptions() {
        super(((com.google.android.gms.maps.model.PolylineOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.PolylineOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.PolylineOptions());
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions add(org.xms.g.maps.model.LatLng... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.LatLng.class, x -> (com.huawei.hms.maps.model.LatLng)x.getHInstance())))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.LatLng.class, x -> (com.huawei.hms.maps.model.LatLng)x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.LatLng.class, x -> (com.google.android.gms.maps.model.LatLng)x.getGInstance())))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.LatLng.class, x -> (com.google.android.gms.maps.model.LatLng)x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions add(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions addAll(java.lang.Iterable param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).addAll(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).addAll(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).addAll(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).addAll(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions clickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).clickable(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).clickable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).clickable(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).clickable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions color(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).color(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).color(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).color(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).color(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions endCap(org.xms.g.maps.model.Cap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).endCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).endCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).endCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).endCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions geodesic(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).geodesic(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).geodesic(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).geodesic(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).geodesic(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final int getColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getColor()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getColor()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getColor();
        }
    }
    
    public final org.xms.g.maps.model.Cap getEndCap() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getEndCap()");
            com.huawei.hms.maps.model.Cap hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getEndCap();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Cap(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getEndCap()");
            com.google.android.gms.maps.model.Cap gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getEndCap();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Cap(gReturn, null)));
        }
    }
    
    public final int getJointType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getJointType()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getJointType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getJointType()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getJointType();
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.PatternItem> getPattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getPattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getPattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getPattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getPattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {
                
                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(param0, null);
                }
            }));
        }
    }
    
    public final java.util.List<org.xms.g.maps.model.LatLng> getPoints() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getPoints()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {
                
                public org.xms.g.maps.model.LatLng apply(com.huawei.hms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getPoints()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {
                
                public org.xms.g.maps.model.LatLng apply(com.google.android.gms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(param0, null);
                }
            }));
        }
    }
    
    public final org.xms.g.maps.model.Cap getStartCap() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getStartCap()");
            com.huawei.hms.maps.model.Cap hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getStartCap();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Cap(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getStartCap()");
            com.google.android.gms.maps.model.Cap gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getStartCap();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Cap(gReturn, null)));
        }
    }
    
    public final float getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getWidth();
        }
    }
    
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getZIndex();
        }
    }
    
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isClickable();
        }
    }
    
    public final boolean isGeodesic() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isGeodesic()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isGeodesic();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isGeodesic()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isGeodesic();
        }
    }
    
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isVisible();
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions jointType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).jointType(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).jointType(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).jointType(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).jointType(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions pattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).pattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).pattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).pattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).pattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions startCap(org.xms.g.maps.model.Cap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).startCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).startCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).startCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).startCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions width(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).width(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).width(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).width(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).width(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public final org.xms.g.maps.model.PolylineOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(gReturn, null)));
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.PolylineOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.PolylineOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.PolylineOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.PolylineOptions;
        }
    }
}