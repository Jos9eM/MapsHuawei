package org.xms.g.maps.model;

public class PatternItem extends org.xms.g.utils.XObject implements android.os.Parcelable {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.PatternItem createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.PatternItem gReturn = null;
            com.huawei.hms.maps.model.PatternItem hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.PatternItem.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.PatternItem.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.PatternItem(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.PatternItem[] newArray(int param0) {
            return new org.xms.g.maps.model.PatternItem[param0];
        }
    };
    
    public PatternItem(com.google.android.gms.maps.model.PatternItem param0, com.huawei.hms.maps.model.PatternItem param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public PatternItem(int param0, float param1) {
        super(((com.google.android.gms.maps.model.PatternItem) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PatternItem) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.maps.model.PatternItem) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PatternItem) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.maps.model.PatternItem) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.PatternItem) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.maps.model.PatternItem) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.PatternItem) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.maps.model.PatternItem) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }
    
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PatternItem) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.maps.model.PatternItem) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PatternItem) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.maps.model.PatternItem) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.PatternItem) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.maps.model.PatternItem) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.PatternItem) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.maps.model.PatternItem) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }
    
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PatternItem) this.getHInstance()).toString()");
                return ((com.huawei.hms.maps.model.PatternItem) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PatternItem) this.getGInstance()).toString()");
                return ((com.google.android.gms.maps.model.PatternItem) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.PatternItem) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.maps.model.PatternItem) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.PatternItem) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.maps.model.PatternItem) this.getGInstance())).toStringCallSuper();
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PatternItem) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.maps.model.PatternItem) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PatternItem) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.maps.model.PatternItem) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.model.PatternItem) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.maps.model.PatternItem) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.model.PatternItem) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.maps.model.PatternItem) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.PatternItem dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.PatternItem) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.PatternItem;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.PatternItem;
        }
    }
    
    private class GImpl extends com.google.android.gms.maps.model.PatternItem {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.maps.model.PatternItem.this.equals(param0);
        }
        
        public int hashCode() {
            return org.xms.g.maps.model.PatternItem.this.hashCode();
        }
        
        public java.lang.String toString() {
            return org.xms.g.maps.model.PatternItem.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.maps.model.PatternItem.this.writeToParcel(param0, param1);
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
        
        public GImpl(int param0, float param1) {
            super(param0, param1);
        }
    }
    
    private class HImpl extends com.huawei.hms.maps.model.PatternItem {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.maps.model.PatternItem.this.equals(param0);
        }
        
        public int hashCode() {
            return org.xms.g.maps.model.PatternItem.this.hashCode();
        }
        
        public java.lang.String toString() {
            return org.xms.g.maps.model.PatternItem.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.maps.model.PatternItem.this.writeToParcel(param0, param1);
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
        
        public HImpl(int param0, float param1) {
            super(param0, param1);
        }
    }
}