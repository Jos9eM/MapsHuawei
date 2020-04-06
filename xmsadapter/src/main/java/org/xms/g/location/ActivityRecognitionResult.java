package org.xms.g.location;

public class ActivityRecognitionResult extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.ActivityRecognitionResult createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.ActivityRecognitionResult gReturn = null;
            com.huawei.hms.location.ActivityIdentificationResponse hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.ActivityIdentificationResponse.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.ActivityRecognitionResult.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.ActivityRecognitionResult(gReturn, hReturn);
        }
        
        public org.xms.g.location.ActivityRecognitionResult[] newArray(int param0) {
            return new org.xms.g.location.ActivityRecognitionResult[param0];
        }
    };
    
    public ActivityRecognitionResult(com.google.android.gms.location.ActivityRecognitionResult param0, com.huawei.hms.location.ActivityIdentificationResponse param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public ActivityRecognitionResult(java.util.List<org.xms.g.location.DetectedActivity> param0, long param1, long param2) {
        super(((com.google.android.gms.location.ActivityRecognitionResult) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true)), param1, param2));
        } else {
            this.setGInstance(new GImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false)), param1, param2));
        }
        wrapper = false;
    }
    
    public ActivityRecognitionResult(org.xms.g.location.DetectedActivity param0, long param1, long param2) {
        super(((com.google.android.gms.location.ActivityRecognitionResult) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((com.huawei.hms.location.ActivityIdentificationData) ((param0) == null ? null : (param0.getHInstance()))), param1, param2));
        } else {
            this.setGInstance(new GImpl(((com.google.android.gms.location.DetectedActivity) ((param0) == null ? null : (param0.getGInstance()))), param1, param2));
        }
        wrapper = false;
    }
    
    public static org.xms.g.location.ActivityRecognitionResult extractResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationResponse.getDataFromIntent(param0)");
            com.huawei.hms.location.ActivityIdentificationResponse hReturn = com.huawei.hms.location.ActivityIdentificationResponse.getDataFromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionResult(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityRecognitionResult.extractResult(param0)");
            com.google.android.gms.location.ActivityRecognitionResult gReturn = com.google.android.gms.location.ActivityRecognitionResult.extractResult(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionResult(gReturn, null)));
        }
    }
    
    public int getActivityConfidence(int param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getActivityPossibility(param0)");
                return ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getActivityPossibility(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getActivityConfidence(param0)");
                return ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getActivityConfidence(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getActivityPossibilityCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getActivityPossibilityCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getActivityConfidenceCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getActivityConfidenceCallSuper(param0);
            }
        }
    }
    
    public long getElapsedRealtimeMillis() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getElapsedTimeFromReboot()");
                return ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getElapsedTimeFromReboot();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getElapsedRealtimeMillis()");
                return ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getElapsedRealtimeMillis();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getElapsedTimeFromRebootCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getElapsedTimeFromRebootCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getElapsedRealtimeMillisCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getElapsedRealtimeMillisCallSuper();
            }
        }
    }
    
    public org.xms.g.location.DetectedActivity getMostProbableActivity() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getMostActivityIdentification()");
                com.huawei.hms.location.ActivityIdentificationData hReturn = ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getMostActivityIdentification();
                return ((hReturn) == null ? null : (new org.xms.g.location.DetectedActivity(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getMostProbableActivity()");
                com.google.android.gms.location.DetectedActivity gReturn = ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getMostProbableActivity();
                return ((gReturn) == null ? null : (new org.xms.g.location.DetectedActivity(gReturn, null)));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getMostActivityIdentificationCallSuper()");
                com.huawei.hms.location.ActivityIdentificationData hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getMostActivityIdentificationCallSuper();
                return ((hReturn) == null ? null : (new org.xms.g.location.DetectedActivity(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getMostProbableActivityCallSuper()");
                com.google.android.gms.location.DetectedActivity gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getMostProbableActivityCallSuper();
                return ((gReturn) == null ? null : (new org.xms.g.location.DetectedActivity(gReturn, null)));
            }
        }
    }
    
    public java.util.List<org.xms.g.location.DetectedActivity> getProbableActivities() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getActivityIdentificationDatas()");
                java.util.List hReturn = ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getActivityIdentificationDatas();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.ActivityIdentificationData, org.xms.g.location.DetectedActivity>() {
                    
                    public org.xms.g.location.DetectedActivity apply(com.huawei.hms.location.ActivityIdentificationData param0) {
                        return new org.xms.g.location.DetectedActivity(null, param0);
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getProbableActivities()");
                java.util.List gReturn = ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getProbableActivities();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.DetectedActivity, org.xms.g.location.DetectedActivity>() {
                    
                    public org.xms.g.location.DetectedActivity apply(com.google.android.gms.location.DetectedActivity param0) {
                        return new org.xms.g.location.DetectedActivity(param0, null);
                    }
                }));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getActivityIdentificationDatasCallSuper()");
                java.util.List hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getActivityIdentificationDatasCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.ActivityIdentificationData, org.xms.g.location.DetectedActivity>() {
                    
                    public org.xms.g.location.DetectedActivity apply(com.huawei.hms.location.ActivityIdentificationData param0) {
                        return new org.xms.g.location.DetectedActivity(null, param0);
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getProbableActivitiesCallSuper()");
                java.util.List gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getProbableActivitiesCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.DetectedActivity, org.xms.g.location.DetectedActivity>() {
                    
                    public org.xms.g.location.DetectedActivity apply(com.google.android.gms.location.DetectedActivity param0) {
                        return new org.xms.g.location.DetectedActivity(param0, null);
                    }
                }));
            }
        }
    }
    
    public long getTime() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getTime()");
                return ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getTime();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getTime()");
                return ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getTime();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getTimeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getTimeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getTimeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getTimeCallSuper();
            }
        }
    }
    
    public static boolean hasResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationResponse.containDataFromIntent(param0)");
            return com.huawei.hms.location.ActivityIdentificationResponse.containDataFromIntent(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityRecognitionResult.hasResult(param0)");
            return com.google.android.gms.location.ActivityRecognitionResult.hasResult(param0);
        }
    }
    
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).toString()");
                return ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).toString()");
                return ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).toStringCallSuper();
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }
    
    public static org.xms.g.location.ActivityRecognitionResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityRecognitionResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityIdentificationResponse;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityRecognitionResult;
        }
    }
    
    private class GImpl extends com.google.android.gms.location.ActivityRecognitionResult {
        
        public int getActivityConfidence(int param0) {
            return org.xms.g.location.ActivityRecognitionResult.this.getActivityConfidence(param0);
        }
        
        public long getElapsedRealtimeMillis() {
            return org.xms.g.location.ActivityRecognitionResult.this.getElapsedRealtimeMillis();
        }
        
        public com.google.android.gms.location.DetectedActivity getMostProbableActivity() {
            org.xms.g.location.DetectedActivity xResult = org.xms.g.location.ActivityRecognitionResult.this.getMostProbableActivity();
            return ((com.google.android.gms.location.DetectedActivity) ((xResult) == null ? null : (xResult.getGInstance())));
        }
        
        public java.util.List<com.google.android.gms.location.DetectedActivity> getProbableActivities() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.location.ActivityRecognitionResult.this.getProbableActivities(), false));
        }
        
        public long getTime() {
            return org.xms.g.location.ActivityRecognitionResult.this.getTime();
        }
        
        public java.lang.String toString() {
            return org.xms.g.location.ActivityRecognitionResult.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityRecognitionResult.this.writeToParcel(param0, param1);
        }
        
        public int getActivityConfidenceCallSuper(int param0) {
            return super.getActivityConfidence(param0);
        }
        
        public long getElapsedRealtimeMillisCallSuper() {
            return super.getElapsedRealtimeMillis();
        }
        
        public com.google.android.gms.location.DetectedActivity getMostProbableActivityCallSuper() {
            return super.getMostProbableActivity();
        }
        
        public java.util.List<com.google.android.gms.location.DetectedActivity> getProbableActivitiesCallSuper() {
            return super.getProbableActivities();
        }
        
        public long getTimeCallSuper() {
            return super.getTime();
        }
        
        public java.lang.String toStringCallSuper() {
            return super.toString();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public GImpl(java.util.List<com.google.android.gms.location.DetectedActivity> param0, long param1, long param2) {
            super(param0, param1, param2);
        }
        
        public GImpl(com.google.android.gms.location.DetectedActivity param0, long param1, long param2) {
            super(param0, param1, param2);
        }
    }
    
    private class HImpl extends com.huawei.hms.location.ActivityIdentificationResponse {
        
        public int getActivityPossibility(int param0) {
            return org.xms.g.location.ActivityRecognitionResult.this.getActivityConfidence(param0);
        }
        
        public long getElapsedTimeFromReboot() {
            return org.xms.g.location.ActivityRecognitionResult.this.getElapsedRealtimeMillis();
        }
        
        public com.huawei.hms.location.ActivityIdentificationData getMostActivityIdentification() {
            org.xms.g.location.DetectedActivity xResult = org.xms.g.location.ActivityRecognitionResult.this.getMostProbableActivity();
            return ((com.huawei.hms.location.ActivityIdentificationData) ((xResult) == null ? null : (xResult.getHInstance())));
        }
        
        public java.util.List<com.huawei.hms.location.ActivityIdentificationData> getActivityIdentificationDatas() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.location.ActivityRecognitionResult.this.getProbableActivities(), true));
        }
        
        public long getTime() {
            return org.xms.g.location.ActivityRecognitionResult.this.getTime();
        }
        
        public java.lang.String toString() {
            return org.xms.g.location.ActivityRecognitionResult.this.toString();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityRecognitionResult.this.writeToParcel(param0, param1);
        }
        
        public int getActivityPossibilityCallSuper(int param0) {
            return super.getActivityPossibility(param0);
        }
        
        public long getElapsedTimeFromRebootCallSuper() {
            return super.getElapsedTimeFromReboot();
        }
        
        public com.huawei.hms.location.ActivityIdentificationData getMostActivityIdentificationCallSuper() {
            return super.getMostActivityIdentification();
        }
        
        public java.util.List<com.huawei.hms.location.ActivityIdentificationData> getActivityIdentificationDatasCallSuper() {
            return super.getActivityIdentificationDatas();
        }
        
        public long getTimeCallSuper() {
            return super.getTime();
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
        
        public HImpl(java.util.List<com.huawei.hms.location.ActivityIdentificationData> param0, long param1, long param2) {
            super(param0, param1, param2);
        }
        
        public HImpl(com.huawei.hms.location.ActivityIdentificationData param0, long param1, long param2) {
            super(param0, param1, param2);
        }
    }
}