package org.xms.g.maps.model;

public class StreetViewPanoramaLink extends org.xms.g.utils.XObject implements android.os.Parcelable {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.StreetViewPanoramaLink createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.StreetViewPanoramaLink gReturn = null;
            com.huawei.hms.maps.model.StreetViewPanoramaLink hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.StreetViewPanoramaLink.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.StreetViewPanoramaLink.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.StreetViewPanoramaLink(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.StreetViewPanoramaLink[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewPanoramaLink[param0];
        }
    };
    
    public StreetViewPanoramaLink(com.google.android.gms.maps.model.StreetViewPanoramaLink param0, com.huawei.hms.maps.model.StreetViewPanoramaLink param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).bearing");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).bearing;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).bearing");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).bearing;
        }
    }
    
    public java.lang.String getPanoId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).panoId");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).panoId;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).panoId");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).panoId;
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).equals(param0);
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).hashCode();
        }
    }
    
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.StreetViewPanoramaLink dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewPanoramaLink) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaLink;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaLink;
        }
    }
}