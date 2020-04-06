package org.xms.g.maps.model;

public final class VisibleRegion extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.VisibleRegion createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.VisibleRegion gReturn = null;
            com.huawei.hms.maps.model.VisibleRegion hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.VisibleRegion.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.VisibleRegion.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.VisibleRegion(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.VisibleRegion[] newArray(int param0) {
            return new org.xms.g.maps.model.VisibleRegion[param0];
        }
    };
    
    public VisibleRegion(com.google.android.gms.maps.model.VisibleRegion param0, com.huawei.hms.maps.model.VisibleRegion param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public VisibleRegion(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.LatLng param1, org.xms.g.maps.model.LatLng param2, org.xms.g.maps.model.LatLng param3, org.xms.g.maps.model.LatLngBounds param4) {
        super(((com.google.android.gms.maps.model.VisibleRegion) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.VisibleRegion(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.LatLng) ((param1) == null ? null : (param1.getHInstance()))), ((com.huawei.hms.maps.model.LatLng) ((param2) == null ? null : (param2.getHInstance()))), ((com.huawei.hms.maps.model.LatLng) ((param3) == null ? null : (param3.getHInstance()))), ((com.huawei.hms.maps.model.LatLngBounds) ((param4) == null ? null : (param4.getHInstance())))));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.VisibleRegion(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.LatLng) ((param1) == null ? null : (param1.getGInstance()))), ((com.google.android.gms.maps.model.LatLng) ((param2) == null ? null : (param2.getGInstance()))), ((com.google.android.gms.maps.model.LatLng) ((param3) == null ? null : (param3.getGInstance()))), ((com.google.android.gms.maps.model.LatLngBounds) ((param4) == null ? null : (param4.getGInstance())))));
        }
    }
    
    public org.xms.g.maps.model.LatLng getFarLeft() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).farLeft");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).farLeft;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).farLeft");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).farLeft;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public org.xms.g.maps.model.LatLng getFarRight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).farRight");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).farRight;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).farRight");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).farRight;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public org.xms.g.maps.model.LatLngBounds getLatLngBounds() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).latLngBounds");
            com.huawei.hms.maps.model.LatLngBounds hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).latLngBounds;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).latLngBounds");
            com.google.android.gms.maps.model.LatLngBounds gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).latLngBounds;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(gReturn, null)));
        }
    }
    
    public org.xms.g.maps.model.LatLng getNearLeft() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).nearLeft");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).nearLeft;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).nearLeft");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).nearLeft;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public org.xms.g.maps.model.LatLng getNearRight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).nearRight");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).nearRight;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).nearRight");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).nearRight;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).equals(param0);
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).hashCode();
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).toString();
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.VisibleRegion dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.VisibleRegion) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.VisibleRegion;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.VisibleRegion;
        }
    }
}