package org.xms.g.maps.model;

public class StreetViewPanoramaLocation extends org.xms.g.utils.XObject implements android.os.Parcelable {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.StreetViewPanoramaLocation createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.StreetViewPanoramaLocation gReturn = null;
            com.huawei.hms.maps.model.StreetViewPanoramaLocation hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.StreetViewPanoramaLocation.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.StreetViewPanoramaLocation.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.StreetViewPanoramaLocation(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.StreetViewPanoramaLocation[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewPanoramaLocation[param0];
        }
    };
    
    public StreetViewPanoramaLocation(com.google.android.gms.maps.model.StreetViewPanoramaLocation param0, com.huawei.hms.maps.model.StreetViewPanoramaLocation param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public StreetViewPanoramaLocation(org.xms.g.maps.model.StreetViewPanoramaLink[] param0, org.xms.g.maps.model.LatLng param1, java.lang.String param2) {
        super(((com.google.android.gms.maps.model.StreetViewPanoramaLocation) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((com.huawei.hms.maps.model.StreetViewPanoramaLink[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.StreetViewPanoramaLink.class, x -> (com.huawei.hms.maps.model.StreetViewPanoramaLink)x.getHInstance())), ((com.huawei.hms.maps.model.LatLng) ((param1) == null ? null : (param1.getHInstance()))), param2));
        } else {
            this.setGInstance(new GImpl(((com.google.android.gms.maps.model.StreetViewPanoramaLink[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.StreetViewPanoramaLink.class, x -> (com.google.android.gms.maps.model.StreetViewPanoramaLink)x.getGInstance())), ((com.google.android.gms.maps.model.LatLng) ((param1) == null ? null : (param1.getGInstance()))), param2));
        }
        wrapper = false;
    }
    
    public org.xms.g.maps.model.StreetViewPanoramaLink[] getLinks() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).links");
            com.huawei.hms.maps.model.StreetViewPanoramaLink[] hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).links;
            return org.xms.g.utils.Utils.genericArrayCopy(hReturn, org.xms.g.maps.model.StreetViewPanoramaLink.class, new org.xms.g.utils.Function<com.huawei.hms.maps.model.StreetViewPanoramaLink, org.xms.g.maps.model.StreetViewPanoramaLink>() {
                
                public org.xms.g.maps.model.StreetViewPanoramaLink apply(com.huawei.hms.maps.model.StreetViewPanoramaLink param0) {
                    return new org.xms.g.maps.model.StreetViewPanoramaLink(null, param0);
                }
            });
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).links");
            com.google.android.gms.maps.model.StreetViewPanoramaLink[] gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).links;
            return org.xms.g.utils.Utils.genericArrayCopy(gReturn, org.xms.g.maps.model.StreetViewPanoramaLink.class, new org.xms.g.utils.Function<com.google.android.gms.maps.model.StreetViewPanoramaLink, org.xms.g.maps.model.StreetViewPanoramaLink>() {
                
                public org.xms.g.maps.model.StreetViewPanoramaLink apply(com.google.android.gms.maps.model.StreetViewPanoramaLink param0) {
                    return new org.xms.g.maps.model.StreetViewPanoramaLink(param0, null);
                }
            });
        }
    }
    
    public java.lang.String getPanoId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).panoId");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).panoId;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).panoId");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).panoId;
        }
    }
    
    public org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).position");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).position;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).position");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).position;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(gReturn, null)));
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }
    
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }
    
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).toString()");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).toString()");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).toStringCallSuper();
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.maps.model.StreetViewPanoramaLocation) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.maps.model.StreetViewPanoramaLocation) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.StreetViewPanoramaLocation dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewPanoramaLocation) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaLocation;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaLocation;
        }
    }
    
    private class GImpl extends com.google.android.gms.maps.model.StreetViewPanoramaLocation {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.equals(param0);
        }
        
        public int hashCode() {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.hashCode();
        }
        
        public java.lang.String toString() {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.maps.model.StreetViewPanoramaLocation.this.writeToParcel(param0, param1);
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public int hashCodeCallSuper() {
            return super.hashCode();
        }
        
        public java.lang.String toStringCallSuper() {
            return super.toString();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public GImpl(com.google.android.gms.maps.model.StreetViewPanoramaLink[] param0, com.google.android.gms.maps.model.LatLng param1, java.lang.String param2) {
            super(param0, param1, param2);
        }
    }
    
    private class HImpl extends com.huawei.hms.maps.model.StreetViewPanoramaLocation {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.equals(param0);
        }
        
        public int hashCode() {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.hashCode();
        }
        
        public java.lang.String toString() {
            return org.xms.g.maps.model.StreetViewPanoramaLocation.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.maps.model.StreetViewPanoramaLocation.this.writeToParcel(param0, param1);
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public int hashCodeCallSuper() {
            return super.hashCode();
        }
        
        public java.lang.String toStringCallSuper() {
            return super.toString();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public HImpl(com.huawei.hms.maps.model.StreetViewPanoramaLink[] param0, com.huawei.hms.maps.model.LatLng param1, java.lang.String param2) {
            super(param0, param1, param2);
        }
        
        protected HImpl(android.os.Parcel param0) {
            super(param0);
        }
    }
}