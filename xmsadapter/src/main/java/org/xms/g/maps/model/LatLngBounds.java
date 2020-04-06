package org.xms.g.maps.model;

public final class LatLngBounds extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.LatLngBounds createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.LatLngBounds gReturn = null;
            com.huawei.hms.maps.model.LatLngBounds hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.LatLngBounds.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.LatLngBounds.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.LatLngBounds(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.LatLngBounds[] newArray(int param0) {
            return new org.xms.g.maps.model.LatLngBounds[param0];
        }
    };
    
    public LatLngBounds(com.google.android.gms.maps.model.LatLngBounds param0, com.huawei.hms.maps.model.LatLngBounds param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public LatLngBounds(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.LatLng param1) {
        super(((com.google.android.gms.maps.model.LatLngBounds) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.LatLngBounds(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.LatLng) ((param1) == null ? null : (param1.getHInstance())))));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.LatLngBounds(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.LatLng) ((param1) == null ? null : (param1.getGInstance())))));
        }
    }
    
    public org.xms.g.maps.model.LatLng getNortheast() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).northeast");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).northeast;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).northeast");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).northeast;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public org.xms.g.maps.model.LatLng getSouthwest() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).southwest");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).southwest;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).southwest");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).southwest;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public static final org.xms.g.maps.model.LatLngBounds.Builder builder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.LatLngBounds.builder()");
            com.huawei.hms.maps.model.LatLngBounds.Builder hReturn = com.huawei.hms.maps.model.LatLngBounds.builder();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds.Builder(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.LatLngBounds.builder()");
            com.google.android.gms.maps.model.LatLngBounds.Builder gReturn = com.google.android.gms.maps.model.LatLngBounds.builder();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds.Builder(gReturn, null)));
        }
    }
    
    public final boolean contains(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).contains(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).contains(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).contains(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).contains(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public static final org.xms.g.maps.model.LatLngBounds createFromAttributes(android.content.Context param0, android.util.AttributeSet param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.LatLngBounds.createFromAttributes(param0, param1)");
            com.huawei.hms.maps.model.LatLngBounds hReturn = com.huawei.hms.maps.model.LatLngBounds.createFromAttributes(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.LatLngBounds.createFromAttributes(param0, param1)");
            com.google.android.gms.maps.model.LatLngBounds gReturn = com.google.android.gms.maps.model.LatLngBounds.createFromAttributes(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(gReturn, null)));
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).equals(param0);
        }
    }
    
    public final org.xms.g.maps.model.LatLng getCenter() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).getCenter()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).getCenter();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).getCenter()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).getCenter();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).hashCode();
        }
    }
    
    public final org.xms.g.maps.model.LatLngBounds including(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).including(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).including(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).including(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).including(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(gReturn, null)));
        }
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).toString();
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.LatLngBounds dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.LatLngBounds) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.LatLngBounds;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.LatLngBounds;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(com.google.android.gms.maps.model.LatLngBounds.Builder param0, com.huawei.hms.maps.model.LatLngBounds.Builder param1) {
            super(param0, null);
            this.setHInstance(param1);
        }
        
        public Builder() {
            super(((com.google.android.gms.maps.model.LatLngBounds.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.LatLngBounds.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.LatLngBounds.Builder());
            }
        }
        
        public final org.xms.g.maps.model.LatLngBounds build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds.Builder) this.getHInstance()).build()");
                com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.model.LatLngBounds.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds.Builder) this.getGInstance()).build()");
                com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.model.LatLngBounds.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(gReturn, null)));
            }
        }
        
        public final org.xms.g.maps.model.LatLngBounds.Builder include(org.xms.g.maps.model.LatLng param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds.Builder) this.getHInstance()).include(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.maps.model.LatLngBounds.Builder hReturn = ((com.huawei.hms.maps.model.LatLngBounds.Builder) this.getHInstance()).include(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds.Builder) this.getGInstance()).include(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.maps.model.LatLngBounds.Builder gReturn = ((com.google.android.gms.maps.model.LatLngBounds.Builder) this.getGInstance()).include(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds.Builder(gReturn, null)));
            }
        }
        
        public static org.xms.g.maps.model.LatLngBounds.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.model.LatLngBounds.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.LatLngBounds.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.LatLngBounds.Builder;
            }
        }
    }
}