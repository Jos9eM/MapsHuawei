package org.xms.g.location;

public class ActivityTransitionEvent extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.ActivityTransitionEvent createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.ActivityTransitionEvent gReturn = null;
            com.huawei.hms.location.ActivityConversionData hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.ActivityConversionData.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.ActivityTransitionEvent.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.ActivityTransitionEvent(gReturn, hReturn);
        }
        
        public org.xms.g.location.ActivityTransitionEvent[] newArray(int param0) {
            return new org.xms.g.location.ActivityTransitionEvent[param0];
        }
    };
    
    public ActivityTransitionEvent(com.google.android.gms.location.ActivityTransitionEvent param0, com.huawei.hms.location.ActivityConversionData param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public ActivityTransitionEvent(int param0, int param1, long param2) {
        super(((com.google.android.gms.location.ActivityTransitionEvent) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1, param2));
        } else {
            this.setGInstance(new GImpl(param0, param1, param2));
        }
        wrapper = false;
    }
    
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }
    
    public int getActivityType() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getActivityType()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getActivityType();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getActivityType()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getActivityType();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getActivityTypeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getActivityTypeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getActivityTypeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getActivityTypeCallSuper();
            }
        }
    }
    
    public long getElapsedRealTimeNanos() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getElapsedTimeFromReboot()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getElapsedTimeFromReboot();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getElapsedRealTimeNanos()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getElapsedRealTimeNanos();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getElapsedTimeFromRebootCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getElapsedTimeFromRebootCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getElapsedRealTimeNanosCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getElapsedRealTimeNanosCallSuper();
            }
        }
    }
    
    public int getTransitionType() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getConversionType()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getConversionType();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getTransitionType()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getTransitionType();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getConversionTypeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getConversionTypeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getTransitionTypeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getTransitionTypeCallSuper();
            }
        }
    }
    
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }
    
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).toString()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).toString()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).toStringCallSuper();
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }
    
    public static org.xms.g.location.ActivityTransitionEvent dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityTransitionEvent) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionData;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransitionEvent;
        }
    }
    
    private class GImpl extends com.google.android.gms.location.ActivityTransitionEvent {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionEvent.this.equals(param0);
        }
        
        public int getActivityType() {
            return org.xms.g.location.ActivityTransitionEvent.this.getActivityType();
        }
        
        public long getElapsedRealTimeNanos() {
            return org.xms.g.location.ActivityTransitionEvent.this.getElapsedRealTimeNanos();
        }
        
        public int getTransitionType() {
            return org.xms.g.location.ActivityTransitionEvent.this.getTransitionType();
        }
        
        public int hashCode() {
            return org.xms.g.location.ActivityTransitionEvent.this.hashCode();
        }
        
        public java.lang.String toString() {
            return org.xms.g.location.ActivityTransitionEvent.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionEvent.this.writeToParcel(param0, param1);
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public int getActivityTypeCallSuper() {
            return super.getActivityType();
        }
        
        public long getElapsedRealTimeNanosCallSuper() {
            return super.getElapsedRealTimeNanos();
        }
        
        public int getTransitionTypeCallSuper() {
            return super.getTransitionType();
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
        
        public GImpl(int param0, int param1, long param2) {
            super(param0, param1, param2);
        }
    }
    
    private class HImpl extends com.huawei.hms.location.ActivityConversionData {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionEvent.this.equals(param0);
        }
        
        public int getActivityType() {
            return org.xms.g.location.ActivityTransitionEvent.this.getActivityType();
        }
        
        public long getElapsedTimeFromReboot() {
            return org.xms.g.location.ActivityTransitionEvent.this.getElapsedRealTimeNanos();
        }
        
        public int getConversionType() {
            return org.xms.g.location.ActivityTransitionEvent.this.getTransitionType();
        }
        
        public int hashCode() {
            return org.xms.g.location.ActivityTransitionEvent.this.hashCode();
        }
        
        public java.lang.String toString() {
            return org.xms.g.location.ActivityTransitionEvent.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionEvent.this.writeToParcel(param0, param1);
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public int getActivityTypeCallSuper() {
            return super.getActivityType();
        }
        
        public long getElapsedTimeFromRebootCallSuper() {
            return super.getElapsedTimeFromReboot();
        }
        
        public int getConversionTypeCallSuper() {
            return super.getConversionType();
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
        
        public HImpl() {
            super();
        }
        
        public HImpl(int param0, int param1, long param2) {
            super(param0, param1, param2);
        }
    }
}