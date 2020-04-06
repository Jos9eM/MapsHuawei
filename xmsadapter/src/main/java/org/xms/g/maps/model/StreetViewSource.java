package org.xms.g.maps.model;

public final class StreetViewSource extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.StreetViewSource createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.StreetViewSource gReturn = null;
            com.huawei.hms.maps.model.StreetViewSource hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.StreetViewSource.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.StreetViewSource.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.StreetViewSource(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.StreetViewSource[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewSource[param0];
        }
    };
    
    public StreetViewSource(com.google.android.gms.maps.model.StreetViewSource param0, com.huawei.hms.maps.model.StreetViewSource param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static org.xms.g.maps.model.StreetViewSource getDEFAULT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewSource.DEFAULT");
            com.huawei.hms.maps.model.StreetViewSource hReturn = null;
            hReturn = com.huawei.hms.maps.model.StreetViewSource.DEFAULT;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewSource.DEFAULT");
            com.google.android.gms.maps.model.StreetViewSource gReturn = null;
            gReturn = com.google.android.gms.maps.model.StreetViewSource.DEFAULT;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(gReturn, null)));
        }
    }
    
    public static org.xms.g.maps.model.StreetViewSource getOUTDOOR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewSource.OUTDOOR");
            com.huawei.hms.maps.model.StreetViewSource hReturn = null;
            hReturn = com.huawei.hms.maps.model.StreetViewSource.OUTDOOR;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewSource.OUTDOOR");
            com.google.android.gms.maps.model.StreetViewSource gReturn = null;
            gReturn = com.google.android.gms.maps.model.StreetViewSource.OUTDOOR;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(gReturn, null)));
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).equals(param0);
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).hashCode();
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).toString();
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.StreetViewSource dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewSource) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewSource;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewSource;
        }
    }
}