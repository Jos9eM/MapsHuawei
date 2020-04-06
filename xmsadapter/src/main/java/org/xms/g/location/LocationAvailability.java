package org.xms.g.location;

public final class LocationAvailability extends org.xms.g.utils.XObject {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.LocationAvailability createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.LocationAvailability gReturn = null;
            com.huawei.hms.location.LocationAvailability hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.LocationAvailability.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.LocationAvailability.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.LocationAvailability(gReturn, hReturn);
        }
        
        public org.xms.g.location.LocationAvailability[] newArray(int param0) {
            return new org.xms.g.location.LocationAvailability[param0];
        }
    };
    
    public LocationAvailability(com.google.android.gms.location.LocationAvailability param0, com.huawei.hms.location.LocationAvailability param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).equals(param0);
        }
    }
    
    public static org.xms.g.location.LocationAvailability extractLocationAvailability(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationAvailability.extractLocationAvailability(param0)");
            com.huawei.hms.location.LocationAvailability hReturn = com.huawei.hms.location.LocationAvailability.extractLocationAvailability(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationAvailability(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationAvailability.extractLocationAvailability(param0)");
            com.google.android.gms.location.LocationAvailability gReturn = com.google.android.gms.location.LocationAvailability.extractLocationAvailability(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationAvailability(gReturn, null)));
        }
    }
    
    public static boolean hasLocationAvailability(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationAvailability.hasLocationAvailability(param0)");
            return com.huawei.hms.location.LocationAvailability.hasLocationAvailability(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationAvailability.hasLocationAvailability(param0)");
            return com.google.android.gms.location.LocationAvailability.hasLocationAvailability(param0);
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).hashCode();
        }
    }
    
    public final boolean isLocationAvailable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).isLocationAvailable()");
            return ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).isLocationAvailable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).isLocationAvailable()");
            return ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).isLocationAvailable();
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public static org.xms.g.location.LocationAvailability dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationAvailability) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationAvailability;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationAvailability;
        }
    }
}