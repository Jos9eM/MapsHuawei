package org.xms.g.maps.model;

public class StreetViewPanoramaCamera extends org.xms.g.utils.XObject implements android.os.Parcelable {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.StreetViewPanoramaCamera createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = null;
            com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.StreetViewPanoramaCamera.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.StreetViewPanoramaCamera(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.StreetViewPanoramaCamera[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewPanoramaCamera[param0];
        }
    };
    
    public StreetViewPanoramaCamera(com.google.android.gms.maps.model.StreetViewPanoramaCamera param0, com.huawei.hms.maps.model.StreetViewPanoramaCamera param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).bearing");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).bearing;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).bearing");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).bearing;
        }
    }
    
    public float getTilt() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).tilt");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).tilt;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).tilt");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).tilt;
        }
    }
    
    public float getZoom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).zoom");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).zoom;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).zoom");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).zoom;
        }
    }
    
    public static org.xms.g.maps.model.StreetViewPanoramaCamera.Builder builder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder()");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder()");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.model.StreetViewPanoramaCamera.Builder builder(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(gReturn, null)));
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).equals(param0);
        }
    }
    
    public org.xms.g.maps.model.StreetViewPanoramaOrientation getOrientation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).getOrientation()");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).getOrientation();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).getOrientation()");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).getOrientation();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(gReturn, null)));
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).hashCode();
        }
    }
    
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.StreetViewPanoramaCamera dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewPanoramaCamera) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaCamera;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaCamera;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder param0, com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder param1) {
            super(param0, null);
            this.setHInstance(param1);
        }
        
        public Builder() {
            super(((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder());
            }
        }
        
        public Builder(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
            super(((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance())))));
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }
        
        public float getBearing() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).bearing");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).bearing;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).bearing");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).bearing;
            }
        }
        
        public float getTilt() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).tilt");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).tilt;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).tilt");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).tilt;
            }
        }
        
        public float getZoom() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).zoom");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).zoom;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).zoom");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).zoom;
            }
        }
        
        public final org.xms.g.maps.model.StreetViewPanoramaCamera.Builder bearing(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).bearing(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).bearing(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).bearing(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).bearing(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.StreetViewPanoramaCamera build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).build()");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).build()");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.StreetViewPanoramaCamera.Builder orientation(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).orientation(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).orientation(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).orientation(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).orientation(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.StreetViewPanoramaCamera.Builder tilt(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).tilt(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).tilt(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).tilt(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).tilt(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.StreetViewPanoramaCamera.Builder zoom(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).zoom(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).zoom(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).zoom(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).zoom(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(gReturn, null)));
            }
        }
        
        public static org.xms.g.maps.model.StreetViewPanoramaCamera.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.model.StreetViewPanoramaCamera.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder;
            }
        }
    }
}