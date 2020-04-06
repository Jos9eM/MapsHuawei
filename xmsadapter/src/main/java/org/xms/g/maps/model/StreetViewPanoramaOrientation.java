package org.xms.g.maps.model;

public class StreetViewPanoramaOrientation extends org.xms.g.utils.XObject implements android.os.Parcelable {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.StreetViewPanoramaOrientation createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = null;
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.StreetViewPanoramaOrientation.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.StreetViewPanoramaOrientation.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.StreetViewPanoramaOrientation(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.StreetViewPanoramaOrientation[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewPanoramaOrientation[param0];
        }
    };
    
    public StreetViewPanoramaOrientation(com.google.android.gms.maps.model.StreetViewPanoramaOrientation param0, com.huawei.hms.maps.model.StreetViewPanoramaOrientation param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).bearing");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).bearing;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).bearing");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).bearing;
        }
    }
    
    public float getTilt() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).tilt");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).tilt;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).tilt");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).tilt;
        }
    }
    
    public static org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder builder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder()");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder hReturn = com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder()");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder gReturn = com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder builder(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder hReturn = com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder gReturn = com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(gReturn, null)));
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).equals(param0);
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).hashCode();
        }
    }
    
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.StreetViewPanoramaOrientation dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewPanoramaOrientation) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaOrientation;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder param0, com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder param1) {
            super(param0, null);
            this.setHInstance(param1);
        }
        
        public Builder() {
            super(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder());
            }
        }
        
        public Builder(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
            super(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance())))));
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }
        
        public float getBearing() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).bearing");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).bearing;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).bearing");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).bearing;
            }
        }
        
        public float getTilt() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).tilt");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).tilt;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).tilt");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).tilt;
            }
        }
        
        public final org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder bearing(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).bearing(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).bearing(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).bearing(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).bearing(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.StreetViewPanoramaOrientation build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).build()");
                com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).build()");
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder tilt(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).tilt(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).tilt(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).tilt(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).tilt(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(gReturn, null)));
            }
        }
        
        public static org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder;
            }
        }
    }
}