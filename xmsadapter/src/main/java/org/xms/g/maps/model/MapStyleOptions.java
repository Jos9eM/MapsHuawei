package org.xms.g.maps.model;

public final class MapStyleOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.MapStyleOptions createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.MapStyleOptions gReturn = null;
            com.huawei.hms.maps.model.MapStyleOptions hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.MapStyleOptions.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.MapStyleOptions.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.MapStyleOptions(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.MapStyleOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.MapStyleOptions[param0];
        }
    };
    
    public MapStyleOptions(com.google.android.gms.maps.model.MapStyleOptions param0, com.huawei.hms.maps.model.MapStyleOptions param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public MapStyleOptions(java.lang.String param0) {
        super(((com.google.android.gms.maps.model.MapStyleOptions) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.MapStyleOptions(param0));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.MapStyleOptions(param0));
        }
    }
    
    public static final org.xms.g.maps.model.MapStyleOptions loadRawResourceStyle(android.content.Context param0, int param1) throws android.content.res.Resources.NotFoundException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.MapStyleOptions.loadRawResourceStyle(param0, param1)");
            com.huawei.hms.maps.model.MapStyleOptions hReturn = com.huawei.hms.maps.model.MapStyleOptions.loadRawResourceStyle(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MapStyleOptions(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(param0, param1)");
            com.google.android.gms.maps.model.MapStyleOptions gReturn = com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MapStyleOptions(gReturn, null)));
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MapStyleOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.MapStyleOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MapStyleOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.MapStyleOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.MapStyleOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.MapStyleOptions) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.MapStyleOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.MapStyleOptions;
        }
    }
}