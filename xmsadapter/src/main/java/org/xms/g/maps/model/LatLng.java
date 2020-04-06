package org.xms.g.maps.model;

public final class LatLng extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.LatLng createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.LatLng gReturn = null;
            com.huawei.hms.maps.model.LatLng hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.LatLng.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.LatLng.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.LatLng(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.LatLng[] newArray(int param0) {
            return new org.xms.g.maps.model.LatLng[param0];
        }
    };
    
    public LatLng(com.google.android.gms.maps.model.LatLng param0, com.huawei.hms.maps.model.LatLng param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public LatLng(double param0, double param1) {
        super(((com.google.android.gms.maps.model.LatLng) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.LatLng(param0, param1));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.LatLng(param0, param1));
        }
    }
    
    public double getLatitude() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).latitude");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).latitude;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).latitude");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).latitude;
        }
    }
    
    public double getLongitude() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).longitude");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).longitude;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).longitude");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).longitude;
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).equals(param0);
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).hashCode();
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).toString();
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.LatLng dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.LatLng) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.LatLng;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.LatLng;
        }
    }
}