package org.xms.g.location;

public final class LocationSettingsRequest extends org.xms.g.utils.XObject {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.LocationSettingsRequest createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.LocationSettingsRequest gReturn = null;
            com.huawei.hms.location.LocationSettingsRequest hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.LocationSettingsRequest.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.LocationSettingsRequest.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.LocationSettingsRequest(gReturn, hReturn);
        }
        
        public org.xms.g.location.LocationSettingsRequest[] newArray(int param0) {
            return new org.xms.g.location.LocationSettingsRequest[param0];
        }
    };
    
    public LocationSettingsRequest(com.google.android.gms.location.LocationSettingsRequest param0, com.huawei.hms.location.LocationSettingsRequest param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationSettingsRequest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationSettingsRequest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public static org.xms.g.location.LocationSettingsRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsRequest) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsRequest;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(com.google.android.gms.location.LocationSettingsRequest.Builder param0, com.huawei.hms.location.LocationSettingsRequest.Builder param1) {
            super(param0, null);
            this.setHInstance(param1);
        }
        
        public Builder() {
            super(((com.google.android.gms.location.LocationSettingsRequest.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.LocationSettingsRequest.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.LocationSettingsRequest.Builder());
            }
        }
        
        public final org.xms.g.location.LocationSettingsRequest.Builder addAllLocationRequests(java.util.Collection<org.xms.g.location.LocationRequest> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(gReturn, null)));
            }
        }
        
        public org.xms.g.location.LocationSettingsRequest.Builder addLocationRequest(org.xms.g.location.LocationRequest param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addLocationRequest(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addLocationRequest(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addLocationRequest(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addLocationRequest(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.LocationSettingsRequest build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.LocationSettingsRequest hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.LocationSettingsRequest gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.LocationSettingsRequest.Builder setAlwaysShow(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setAlwaysShow(param0)");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setAlwaysShow(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setAlwaysShow(param0)");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setAlwaysShow(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.LocationSettingsRequest.Builder setNeedBle(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setNeedBle(param0)");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setNeedBle(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setNeedBle(param0)");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setNeedBle(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(gReturn, null)));
            }
        }
        
        public static org.xms.g.location.LocationSettingsRequest.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.LocationSettingsRequest.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsRequest.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsRequest.Builder;
            }
        }
    }
}