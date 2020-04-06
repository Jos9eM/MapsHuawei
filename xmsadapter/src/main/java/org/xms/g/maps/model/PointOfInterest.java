package org.xms.g.maps.model;

public final class PointOfInterest extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.PointOfInterest createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.PointOfInterest gReturn = null;
            com.huawei.hms.maps.model.PointOfInterest hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.PointOfInterest.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.PointOfInterest.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.PointOfInterest(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.PointOfInterest[] newArray(int param0) {
            return new org.xms.g.maps.model.PointOfInterest[param0];
        }
    };
    
    public PointOfInterest(com.google.android.gms.maps.model.PointOfInterest param0, com.huawei.hms.maps.model.PointOfInterest param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public PointOfInterest(org.xms.g.maps.model.LatLng param0, java.lang.String param1, java.lang.String param2) {
        super(((com.google.android.gms.maps.model.PointOfInterest) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.PointOfInterest(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.PointOfInterest(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, param2));
        }
    }
    
    public org.xms.g.maps.model.LatLng getLatLng() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).latLng");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).latLng;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).latLng");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).latLng;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public java.lang.String getName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).name");
            return ((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).name;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).name");
            return ((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).name;
        }
    }
    
    public java.lang.String getPlaceId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).placeId");
            return ((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).placeId;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).placeId");
            return ((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).placeId;
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.PointOfInterest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.PointOfInterest) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.PointOfInterest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.PointOfInterest;
        }
    }
}