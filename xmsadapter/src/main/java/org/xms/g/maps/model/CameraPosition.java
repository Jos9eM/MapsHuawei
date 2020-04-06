package org.xms.g.maps.model;

public final class CameraPosition extends org.xms.g.utils.XObject {
    
    public CameraPosition(com.google.android.gms.maps.model.CameraPosition param0, com.huawei.hms.maps.model.CameraPosition param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public CameraPosition(org.xms.g.maps.model.LatLng param0, float param1, float param2, float param3) {
        super(((com.google.android.gms.maps.model.CameraPosition) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.CameraPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, param2, param3));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.CameraPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, param2, param3));
        }
    }
    
    public float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).bearing");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).bearing;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).bearing");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).bearing;
        }
    }
    
    public org.xms.g.maps.model.LatLng getTarget() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).target");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).target;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).target");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).target;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public float getTilt() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).tilt");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).tilt;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).tilt");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).tilt;
        }
    }
    
    public float getZoom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).zoom");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).zoom;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).zoom");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).zoom;
        }
    }
    
    public static org.xms.g.maps.model.CameraPosition.Builder builder(org.xms.g.maps.model.CameraPosition param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.CameraPosition.builder(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.CameraPosition.Builder hReturn = com.huawei.hms.maps.model.CameraPosition.builder(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.CameraPosition.builder(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.CameraPosition.Builder gReturn = com.google.android.gms.maps.model.CameraPosition.builder(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.model.CameraPosition.Builder builder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.CameraPosition.builder()");
            com.huawei.hms.maps.model.CameraPosition.Builder hReturn = com.huawei.hms.maps.model.CameraPosition.builder();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.CameraPosition.builder()");
            com.google.android.gms.maps.model.CameraPosition.Builder gReturn = com.google.android.gms.maps.model.CameraPosition.builder();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(gReturn, null)));
        }
    }
    
    public static final org.xms.g.maps.model.CameraPosition createFromAttributes(android.content.Context param0, android.util.AttributeSet param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.CameraPosition.createFromAttributes(param0, param1)");
            com.huawei.hms.maps.model.CameraPosition hReturn = com.huawei.hms.maps.model.CameraPosition.createFromAttributes(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.CameraPosition.createFromAttributes(param0, param1)");
            com.google.android.gms.maps.model.CameraPosition gReturn = com.google.android.gms.maps.model.CameraPosition.createFromAttributes(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(gReturn, null)));
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).equals(param0);
        }
    }
    
    public static final org.xms.g.maps.model.CameraPosition fromLatLngZoom(org.xms.g.maps.model.LatLng param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.CameraPosition.fromLatLngZoom(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.model.CameraPosition hReturn = com.huawei.hms.maps.model.CameraPosition.fromLatLngZoom(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.CameraPosition.fromLatLngZoom(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.model.CameraPosition gReturn = com.google.android.gms.maps.model.CameraPosition.fromLatLngZoom(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(gReturn, null)));
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).hashCode();
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).toString();
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.CameraPosition) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.CameraPosition) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public static org.xms.g.maps.model.CameraPosition dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.CameraPosition) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.CameraPosition;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.CameraPosition;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(com.google.android.gms.maps.model.CameraPosition.Builder param0, com.huawei.hms.maps.model.CameraPosition.Builder param1) {
            super(param0, null);
            this.setHInstance(param1);
        }
        
        public Builder() {
            super(((com.google.android.gms.maps.model.CameraPosition.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.CameraPosition.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.CameraPosition.Builder());
            }
        }
        
        public Builder(org.xms.g.maps.model.CameraPosition param0) {
            super(((com.google.android.gms.maps.model.CameraPosition.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.CameraPosition.Builder(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance())))));
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.CameraPosition.Builder(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition.Builder bearing(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).bearing(param0)");
                com.huawei.hms.maps.model.CameraPosition.Builder hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).bearing(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).bearing(param0)");
                com.google.android.gms.maps.model.CameraPosition.Builder gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).bearing(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).build()");
                com.huawei.hms.maps.model.CameraPosition hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).build()");
                com.google.android.gms.maps.model.CameraPosition gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition.Builder target(org.xms.g.maps.model.LatLng param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).target(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.maps.model.CameraPosition.Builder hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).target(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).target(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.maps.model.CameraPosition.Builder gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).target(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition.Builder tilt(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).tilt(param0)");
                com.huawei.hms.maps.model.CameraPosition.Builder hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).tilt(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).tilt(param0)");
                com.google.android.gms.maps.model.CameraPosition.Builder gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).tilt(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.CameraPosition.Builder zoom(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).zoom(param0)");
                com.huawei.hms.maps.model.CameraPosition.Builder hReturn = ((com.huawei.hms.maps.model.CameraPosition.Builder) this.getHInstance()).zoom(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).zoom(param0)");
                com.google.android.gms.maps.model.CameraPosition.Builder gReturn = ((com.google.android.gms.maps.model.CameraPosition.Builder) this.getGInstance()).zoom(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition.Builder(gReturn, null)));
            }
        }
        
        public static org.xms.g.maps.model.CameraPosition.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.model.CameraPosition.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.CameraPosition.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.CameraPosition.Builder;
            }
        }
    }
}