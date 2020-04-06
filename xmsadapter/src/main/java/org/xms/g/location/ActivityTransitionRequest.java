package org.xms.g.location;

public class ActivityTransitionRequest extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.ActivityTransitionRequest createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.ActivityTransitionRequest gReturn = null;
            com.huawei.hms.location.ActivityConversionRequest hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.ActivityConversionRequest.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.ActivityTransitionRequest.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.ActivityTransitionRequest(gReturn, hReturn);
        }
        
        public org.xms.g.location.ActivityTransitionRequest[] newArray(int param0) {
            return new org.xms.g.location.ActivityTransitionRequest[param0];
        }
    };
    
    public ActivityTransitionRequest(com.google.android.gms.location.ActivityTransitionRequest param0, com.huawei.hms.location.ActivityConversionRequest param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public ActivityTransitionRequest(java.util.List<org.xms.g.location.ActivityTransition> param0) {
        super(((com.google.android.gms.location.ActivityTransitionRequest) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true))));
        } else {
            this.setGInstance(new GImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false))));
        }
        wrapper = false;
    }
    
    public static java.util.Comparator getIS_SAME_TRANSITION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionRequest.IS_EQUAL_CONVERSION");
            return com.huawei.hms.location.ActivityConversionRequest.IS_EQUAL_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransitionRequest.IS_SAME_TRANSITION");
            return com.google.android.gms.location.ActivityTransitionRequest.IS_SAME_TRANSITION;
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }
    
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }
    
    public void serializeToIntentExtra(android.content.Intent param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).setDataToIntent(param0)");
                ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).setDataToIntent(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).serializeToIntentExtra(param0)");
                ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).serializeToIntentExtra(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).setDataToIntentCallSuper(param0)");
                ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).setDataToIntentCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).serializeToIntentExtraCallSuper(param0)");
                ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).serializeToIntentExtraCallSuper(param0);
            }
        }
    }
    
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).toString()");
                return ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).toString()");
                return ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).toStringCallSuper();
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }
    
    public static org.xms.g.location.ActivityTransitionRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityTransitionRequest) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransitionRequest;
        }
    }
    
    private class GImpl extends com.google.android.gms.location.ActivityTransitionRequest {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionRequest.this.equals(param0);
        }
        
        public int hashCode() {
            return org.xms.g.location.ActivityTransitionRequest.this.hashCode();
        }
        
        public void serializeToIntentExtra(android.content.Intent param0) {
            org.xms.g.location.ActivityTransitionRequest.this.serializeToIntentExtra(param0);
        }
        
        public java.lang.String toString() {
            return org.xms.g.location.ActivityTransitionRequest.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionRequest.this.writeToParcel(param0, param1);
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public int hashCodeCallSuper() {
            return super.hashCode();
        }
        
        public void serializeToIntentExtraCallSuper(android.content.Intent param0) {
            super.serializeToIntentExtra(param0);
        }
        
        public java.lang.String toStringCallSuper() {
            return super.toString();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public GImpl(java.util.List<com.google.android.gms.location.ActivityTransition> param0) {
            super(param0);
        }
    }
    
    private class HImpl extends com.huawei.hms.location.ActivityConversionRequest {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionRequest.this.equals(param0);
        }
        
        public int hashCode() {
            return org.xms.g.location.ActivityTransitionRequest.this.hashCode();
        }
        
        public void setDataToIntent(android.content.Intent param0) {
            org.xms.g.location.ActivityTransitionRequest.this.serializeToIntentExtra(param0);
        }
        
        public java.lang.String toString() {
            return org.xms.g.location.ActivityTransitionRequest.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionRequest.this.writeToParcel(param0, param1);
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public int hashCodeCallSuper() {
            return super.hashCode();
        }
        
        public void setDataToIntentCallSuper(android.content.Intent param0) {
            super.setDataToIntent(param0);
        }
        
        public java.lang.String toStringCallSuper() {
            return super.toString();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public HImpl() {
            super();
        }
        
        protected HImpl(android.os.Parcel param0) {
            super(param0);
        }
        
        public HImpl(java.util.List<com.huawei.hms.location.ActivityConversionInfo> param0) {
            super(param0);
        }
    }
}