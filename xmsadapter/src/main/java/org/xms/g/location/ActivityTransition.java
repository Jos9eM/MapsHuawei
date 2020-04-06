package org.xms.g.location;

public class ActivityTransition extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.ActivityTransition createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.ActivityTransition gReturn = null;
            com.huawei.hms.location.ActivityConversionInfo hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.ActivityConversionInfo.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.ActivityTransition.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.ActivityTransition(gReturn, hReturn);
        }
        
        public org.xms.g.location.ActivityTransition[] newArray(int param0) {
            return new org.xms.g.location.ActivityTransition[param0];
        }
    };
    
    public ActivityTransition(com.google.android.gms.location.ActivityTransition param0, com.huawei.hms.location.ActivityConversionInfo param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public static int getACTIVITY_TRANSITION_ENTER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionInfo.ENTER_ACTIVITY_CONVERSION");
            return com.huawei.hms.location.ActivityConversionInfo.ENTER_ACTIVITY_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_ENTER");
            return com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_ENTER;
        }
    }
    
    public static int getACTIVITY_TRANSITION_EXIT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionInfo.EXIT_ACTIVITY_CONVERSION");
            return com.huawei.hms.location.ActivityConversionInfo.EXIT_ACTIVITY_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_EXIT");
            return com.google.android.gms.location.ActivityTransition.ACTIVITY_TRANSITION_EXIT;
        }
    }
    
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).equals(param0);
        }
    }
    
    public int getActivityType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).getActivityType()");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).getActivityType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).getActivityType()");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).getActivityType();
        }
    }
    
    public int getTransitionType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).getConversionType()");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).getConversionType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).getTransitionType()");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).getTransitionType();
        }
    }
    
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).hashCode();
        }
    }
    
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.ActivityConversionInfo) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.ActivityTransition) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public static org.xms.g.location.ActivityTransition dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityTransition) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionInfo;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransition;
        }
    }
    
    public static class Builder extends org.xms.g.utils.XObject {
        
        public Builder(com.google.android.gms.location.ActivityTransition.Builder param0, com.huawei.hms.location.ActivityConversionInfo.Builder param1) {
            super(param0, null);
            this.setHInstance(param1);
        }
        
        public Builder() {
            super(((com.google.android.gms.location.ActivityTransition.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.ActivityConversionInfo.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.ActivityTransition.Builder());
            }
        }
        
        public org.xms.g.location.ActivityTransition build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.ActivityConversionInfo hReturn = ((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.ActivityTransition(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.ActivityTransition gReturn = ((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.ActivityTransition(gReturn, null)));
            }
        }
        
        public org.xms.g.location.ActivityTransition.Builder setActivityTransition(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).setConversionType(param0)");
                com.huawei.hms.location.ActivityConversionInfo.Builder hReturn = ((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).setConversionType(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.ActivityTransition.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).setActivityTransition(param0)");
                com.google.android.gms.location.ActivityTransition.Builder gReturn = ((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).setActivityTransition(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.ActivityTransition.Builder(gReturn, null)));
            }
        }
        
        public org.xms.g.location.ActivityTransition.Builder setActivityType(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).setActivityType(param0)");
                com.huawei.hms.location.ActivityConversionInfo.Builder hReturn = ((com.huawei.hms.location.ActivityConversionInfo.Builder) this.getHInstance()).setActivityType(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.ActivityTransition.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).setActivityType(param0)");
                com.google.android.gms.location.ActivityTransition.Builder gReturn = ((com.google.android.gms.location.ActivityTransition.Builder) this.getGInstance()).setActivityType(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.ActivityTransition.Builder(gReturn, null)));
            }
        }
        
        public static org.xms.g.location.ActivityTransition.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.ActivityTransition.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionInfo.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransition.Builder;
            }
        }
    }
}