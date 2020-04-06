package org.xms.g.location;

public final class LocationResult extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.LocationResult createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.LocationResult gReturn = null;
            com.huawei.hms.location.LocationResult hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.LocationResult.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.LocationResult.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.LocationResult(gReturn, hReturn);
        }
        
        public org.xms.g.location.LocationResult[] newArray(int param0) {
            return new org.xms.g.location.LocationResult[param0];
        }
    };
    
    public LocationResult(com.google.android.gms.location.LocationResult param0, com.huawei.hms.location.LocationResult param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static org.xms.g.location.LocationResult create(java.util.List<android.location.Location> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationResult.create(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hms.location.LocationResult hReturn = com.huawei.hms.location.LocationResult.create(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationResult(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationResult.create(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.location.LocationResult gReturn = com.google.android.gms.location.LocationResult.create(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationResult(gReturn, null)));
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).equals(param0);
        }
    }
    
    public static org.xms.g.location.LocationResult extractResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationResult.extractResult(param0)");
            com.huawei.hms.location.LocationResult hReturn = com.huawei.hms.location.LocationResult.extractResult(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationResult(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationResult.extractResult(param0)");
            com.google.android.gms.location.LocationResult gReturn = com.google.android.gms.location.LocationResult.extractResult(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationResult(gReturn, null)));
        }
    }
    
    public final android.location.Location getLastLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).getLastLocation()");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).getLastLocation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).getLastLocation()");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).getLastLocation();
        }
    }
    
    public final java.util.List<android.location.Location> getLocations() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).getLocations()");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).getLocations();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).getLocations()");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).getLocations();
        }
    }
    
    public static boolean hasResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationResult.hasResult(param0)");
            return com.huawei.hms.location.LocationResult.hasResult(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationResult.hasResult(param0)");
            return com.google.android.gms.location.LocationResult.hasResult(param0);
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).hashCode();
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationResult) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationResult) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.LocationResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationResult;
        }
    }
}