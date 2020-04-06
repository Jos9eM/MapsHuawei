package org.xms.g.location;

public class DetectedActivity extends org.xms.g.utils.XObject implements android.os.Parcelable {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.DetectedActivity createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.DetectedActivity gReturn = null;
            com.huawei.hms.location.ActivityIdentificationData hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.ActivityIdentificationData.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.DetectedActivity.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.DetectedActivity(gReturn, hReturn);
        }
        
        public org.xms.g.location.DetectedActivity[] newArray(int param0) {
            return new org.xms.g.location.DetectedActivity[param0];
        }
    };
    
    public DetectedActivity(com.google.android.gms.location.DetectedActivity param0, com.huawei.hms.location.ActivityIdentificationData param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public DetectedActivity(int param0, int param1) {
        super(((com.google.android.gms.location.DetectedActivity) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public static int getIN_VEHICLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.VEHICLE");
            return com.huawei.hms.location.ActivityIdentificationData.VEHICLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.IN_VEHICLE");
            return com.google.android.gms.location.DetectedActivity.IN_VEHICLE;
        }
    }
    
    public static int getON_BICYCLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.BIKE");
            return com.huawei.hms.location.ActivityIdentificationData.BIKE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.ON_BICYCLE");
            return com.google.android.gms.location.DetectedActivity.ON_BICYCLE;
        }
    }
    
    public static int getON_FOOT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.FOOT");
            return com.huawei.hms.location.ActivityIdentificationData.FOOT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.ON_FOOT");
            return com.google.android.gms.location.DetectedActivity.ON_FOOT;
        }
    }
    
    public static int getRUNNING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.RUNNING");
            return com.huawei.hms.location.ActivityIdentificationData.RUNNING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.RUNNING");
            return com.google.android.gms.location.DetectedActivity.RUNNING;
        }
    }
    
    public static int getSTILL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.STILL");
            return com.huawei.hms.location.ActivityIdentificationData.STILL;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.STILL");
            return com.google.android.gms.location.DetectedActivity.STILL;
        }
    }
    
    public static int getTILTING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.TILTING");
            return com.huawei.hms.location.ActivityIdentificationData.TILTING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.TILTING");
            return com.google.android.gms.location.DetectedActivity.TILTING;
        }
    }
    
    public static int getUNKNOWN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.OTHERS");
            return com.huawei.hms.location.ActivityIdentificationData.OTHERS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.UNKNOWN");
            return com.google.android.gms.location.DetectedActivity.UNKNOWN;
        }
    }
    
    public static int getWALKING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.WALKING");
            return com.huawei.hms.location.ActivityIdentificationData.WALKING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.WALKING");
            return com.google.android.gms.location.DetectedActivity.WALKING;
        }
    }
    
    public int getConfidence() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).getPossibility()");
                return ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).getPossibility();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.DetectedActivity) this.getGInstance()).getConfidence()");
                return ((com.google.android.gms.location.DetectedActivity) this.getGInstance()).getConfidence();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).getPossibilityCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).getPossibilityCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).getConfidenceCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).getConfidenceCallSuper();
            }
        }
    }
    
    public int getType() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).getIdentificationActivity()");
                return ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).getIdentificationActivity();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.DetectedActivity) this.getGInstance()).getType()");
                return ((com.google.android.gms.location.DetectedActivity) this.getGInstance()).getType();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).getIdentificationActivityCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).getIdentificationActivityCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).getTypeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).getTypeCallSuper();
            }
        }
    }
    
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).toString()");
                return ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.DetectedActivity) this.getGInstance()).toString()");
                return ((com.google.android.gms.location.DetectedActivity) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).toStringCallSuper();
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.DetectedActivity) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.DetectedActivity) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.DetectedActivity dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.DetectedActivity) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityIdentificationData;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.DetectedActivity;
        }
    }
    
    private class GImpl extends com.google.android.gms.location.DetectedActivity {
        
        public int getConfidence() {
            return org.xms.g.location.DetectedActivity.this.getConfidence();
        }
        
        public int getType() {
            return org.xms.g.location.DetectedActivity.this.getType();
        }
        
        public java.lang.String toString() {
            return org.xms.g.location.DetectedActivity.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.DetectedActivity.this.writeToParcel(param0, param1);
        }
        
        public int getConfidenceCallSuper() {
            return super.getConfidence();
        }
        
        public int getTypeCallSuper() {
            return super.getType();
        }
        
        public java.lang.String toStringCallSuper() {
            return super.toString();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public GImpl(int param0, int param1) {
            super(param0, param1);
        }
    }
    
    private class HImpl extends com.huawei.hms.location.ActivityIdentificationData {
        
        public int getPossibility() {
            return org.xms.g.location.DetectedActivity.this.getConfidence();
        }
        
        public int getIdentificationActivity() {
            return org.xms.g.location.DetectedActivity.this.getType();
        }
        
        public java.lang.String toString() {
            return org.xms.g.location.DetectedActivity.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.DetectedActivity.this.writeToParcel(param0, param1);
        }
        
        public int getPossibilityCallSuper() {
            return super.getPossibility();
        }
        
        public int getIdentificationActivityCallSuper() {
            return super.getIdentificationActivity();
        }
        
        public java.lang.String toStringCallSuper() {
            return super.toString();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public HImpl(int param0, int param1) {
            super(param0, param1);
        }
    }
}