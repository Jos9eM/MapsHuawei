package org.xms.g.location;

public final class LocationRequest extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.LocationRequest createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.LocationRequest gReturn = null;
            com.huawei.hms.location.LocationRequest hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.LocationRequest.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.LocationRequest.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.LocationRequest(gReturn, hReturn);
        }
        
        public org.xms.g.location.LocationRequest[] newArray(int param0) {
            return new org.xms.g.location.LocationRequest[param0];
        }
    };
    
    public LocationRequest(com.google.android.gms.location.LocationRequest param0, com.huawei.hms.location.LocationRequest param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public LocationRequest() {
        super(((com.google.android.gms.location.LocationRequest) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.location.LocationRequest());
        } else {
            this.setGInstance(new com.google.android.gms.location.LocationRequest());
        }
    }
    
    public static int getPRIORITY_BALANCED_POWER_ACCURACY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY");
            return com.huawei.hms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY");
            return com.google.android.gms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY;
        }
    }
    
    public static int getPRIORITY_HIGH_ACCURACY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.PRIORITY_HIGH_ACCURACY");
            return com.huawei.hms.location.LocationRequest.PRIORITY_HIGH_ACCURACY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY");
            return com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY;
        }
    }
    
    public static int getPRIORITY_LOW_POWER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.PRIORITY_LOW_POWER");
            return com.huawei.hms.location.LocationRequest.PRIORITY_LOW_POWER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.PRIORITY_LOW_POWER");
            return com.google.android.gms.location.LocationRequest.PRIORITY_LOW_POWER;
        }
    }
    
    public static int getPRIORITY_NO_POWER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.PRIORITY_NO_POWER");
            return com.huawei.hms.location.LocationRequest.PRIORITY_NO_POWER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.PRIORITY_NO_POWER");
            return com.google.android.gms.location.LocationRequest.PRIORITY_NO_POWER;
        }
    }
    
    public static org.xms.g.location.LocationRequest create() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.create()");
            com.huawei.hms.location.LocationRequest hReturn = com.huawei.hms.location.LocationRequest.create();
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.create()");
            com.google.android.gms.location.LocationRequest gReturn = com.google.android.gms.location.LocationRequest.create();
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).equals(param0);
        }
    }
    
    public final long getExpirationTime() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getExpirationTime()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getExpirationTime();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getExpirationTime()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getExpirationTime();
        }
    }
    
    public final long getFastestInterval() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getFastestInterval()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getFastestInterval();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getFastestInterval()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getFastestInterval();
        }
    }
    
    public final long getInterval() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getInterval()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getInterval();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getInterval()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getInterval();
        }
    }
    
    public final long getMaxWaitTime() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getMaxWaitTime()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getMaxWaitTime();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getMaxWaitTime()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getMaxWaitTime();
        }
    }
    
    public final int getNumUpdates() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getNumUpdates()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getNumUpdates();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getNumUpdates()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getNumUpdates();
        }
    }
    
    public final int getPriority() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getPriority()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getPriority();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getPriority()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getPriority();
        }
    }
    
    public final float getSmallestDisplacement() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getSmallestDisplacement()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getSmallestDisplacement();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getSmallestDisplacement()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getSmallestDisplacement();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).hashCode();
        }
    }
    
    public final boolean isFastestIntervalExplicitlySet() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).isFastestIntervalExplicitlySet()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).isFastestIntervalExplicitlySet();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).isFastestIntervalExplicitlySet()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).isFastestIntervalExplicitlySet();
        }
    }
    
    public final org.xms.g.location.LocationRequest setExpirationDuration(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setExpirationDuration(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setExpirationDuration(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setExpirationDuration(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setExpirationDuration(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public final org.xms.g.location.LocationRequest setExpirationTime(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setExpirationTime(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setExpirationTime(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setExpirationTime(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setExpirationTime(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public final org.xms.g.location.LocationRequest setFastestInterval(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setFastestInterval(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setFastestInterval(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setFastestInterval(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setFastestInterval(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public final org.xms.g.location.LocationRequest setInterval(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setInterval(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setInterval(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setInterval(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setInterval(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public final org.xms.g.location.LocationRequest setMaxWaitTime(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setMaxWaitTime(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setMaxWaitTime(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setMaxWaitTime(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setMaxWaitTime(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public final org.xms.g.location.LocationRequest setNumUpdates(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setNumUpdates(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setNumUpdates(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setNumUpdates(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setNumUpdates(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public final org.xms.g.location.LocationRequest setPriority(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setPriority(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setPriority(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setPriority(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setPriority(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public final org.xms.g.location.LocationRequest setSmallestDisplacement(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setSmallestDisplacement(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setSmallestDisplacement(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setSmallestDisplacement(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setSmallestDisplacement(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(gReturn, null)));
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationRequest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationRequest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.LocationRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationRequest) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationRequest;
        }
    }
}