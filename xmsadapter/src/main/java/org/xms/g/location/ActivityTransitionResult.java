package org.xms.g.location;

public class ActivityTransitionResult extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.ActivityTransitionResult createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.ActivityTransitionResult gReturn = null;
            com.huawei.hms.location.ActivityConversionResponse hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.ActivityConversionResponse.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.ActivityTransitionResult.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.ActivityTransitionResult(gReturn, hReturn);
        }
        
        public org.xms.g.location.ActivityTransitionResult[] newArray(int param0) {
            return new org.xms.g.location.ActivityTransitionResult[param0];
        }
    };
    
    public ActivityTransitionResult(com.google.android.gms.location.ActivityTransitionResult param0, com.huawei.hms.location.ActivityConversionResponse param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public ActivityTransitionResult(java.util.List<org.xms.g.location.ActivityTransitionEvent> param0) {
        super(((com.google.android.gms.location.ActivityTransitionResult) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true))));
        } else {
            this.setGInstance(new GImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false))));
        }
        wrapper = false;
    }
    
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }
    
    public static org.xms.g.location.ActivityTransitionResult extractResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionResponse.getDataFromIntent(param0)");
            com.huawei.hms.location.ActivityConversionResponse hReturn = com.huawei.hms.location.ActivityConversionResponse.getDataFromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.ActivityTransitionResult(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransitionResult.extractResult(param0)");
            com.google.android.gms.location.ActivityTransitionResult gReturn = com.google.android.gms.location.ActivityTransitionResult.extractResult(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.ActivityTransitionResult(gReturn, null)));
        }
    }
    
    public java.util.List<org.xms.g.location.ActivityTransitionEvent> getTransitionEvents() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).getActivityConversionDatas()");
                java.util.List hReturn = ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).getActivityConversionDatas();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.ActivityConversionData, org.xms.g.location.ActivityTransitionEvent>() {
                    
                    public org.xms.g.location.ActivityTransitionEvent apply(com.huawei.hms.location.ActivityConversionData param0) {
                        return new org.xms.g.location.ActivityTransitionEvent(null, param0);
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).getTransitionEvents()");
                java.util.List gReturn = ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).getTransitionEvents();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.ActivityTransitionEvent, org.xms.g.location.ActivityTransitionEvent>() {
                    
                    public org.xms.g.location.ActivityTransitionEvent apply(com.google.android.gms.location.ActivityTransitionEvent param0) {
                        return new org.xms.g.location.ActivityTransitionEvent(param0, null);
                    }
                }));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).getActivityConversionDatasCallSuper()");
                java.util.List hReturn = ((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).getActivityConversionDatasCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.ActivityConversionData, org.xms.g.location.ActivityTransitionEvent>() {
                    
                    public org.xms.g.location.ActivityTransitionEvent apply(com.huawei.hms.location.ActivityConversionData param0) {
                        return new org.xms.g.location.ActivityTransitionEvent(null, param0);
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).getTransitionEventsCallSuper()");
                java.util.List gReturn = ((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).getTransitionEventsCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.ActivityTransitionEvent, org.xms.g.location.ActivityTransitionEvent>() {
                    
                    public org.xms.g.location.ActivityTransitionEvent apply(com.google.android.gms.location.ActivityTransitionEvent param0) {
                        return new org.xms.g.location.ActivityTransitionEvent(param0, null);
                    }
                }));
            }
        }
    }
    
    public static boolean hasResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionResponse.containDataFromIntent(param0)");
            return com.huawei.hms.location.ActivityConversionResponse.containDataFromIntent(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransitionResult.hasResult(param0)");
            return com.google.android.gms.location.ActivityTransitionResult.hasResult(param0);
        }
    }
    
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }
    
    public static org.xms.g.location.ActivityTransitionResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityTransitionResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionResponse;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransitionResult;
        }
    }
    
    private class GImpl extends com.google.android.gms.location.ActivityTransitionResult {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionResult.this.equals(param0);
        }
        
        public java.util.List<com.google.android.gms.location.ActivityTransitionEvent> getTransitionEvents() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.location.ActivityTransitionResult.this.getTransitionEvents(), false));
        }
        
        public int hashCode() {
            return org.xms.g.location.ActivityTransitionResult.this.hashCode();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionResult.this.writeToParcel(param0, param1);
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public java.util.List<com.google.android.gms.location.ActivityTransitionEvent> getTransitionEventsCallSuper() {
            return super.getTransitionEvents();
        }
        
        public int hashCodeCallSuper() {
            return super.hashCode();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public GImpl(java.util.List<com.google.android.gms.location.ActivityTransitionEvent> param0) {
            super(param0);
        }
    }
    
    private class HImpl extends com.huawei.hms.location.ActivityConversionResponse {
        
        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionResult.this.equals(param0);
        }
        
        public java.util.List<com.huawei.hms.location.ActivityConversionData> getActivityConversionDatas() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.location.ActivityTransitionResult.this.getTransitionEvents(), true));
        }
        
        public int hashCode() {
            return org.xms.g.location.ActivityTransitionResult.this.hashCode();
        }
        
        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionResult.this.writeToParcel(param0, param1);
        }
        
        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }
        
        public java.util.List<com.huawei.hms.location.ActivityConversionData> getActivityConversionDatasCallSuper() {
            return super.getActivityConversionDatas();
        }
        
        public int hashCodeCallSuper() {
            return super.hashCode();
        }
        
        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
        
        public HImpl() {
            super();
        }
        
        public HImpl(java.util.List<com.huawei.hms.location.ActivityConversionData> param0) {
            super(param0);
        }
    }
}