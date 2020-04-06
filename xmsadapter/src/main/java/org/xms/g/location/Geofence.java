package org.xms.g.location;

public interface Geofence extends org.xms.g.utils.XInterface {
    
    public static int getGEOFENCE_TRANSITION_DWELL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.Geofence.DWELL_GEOFENCE_CONVERSION");
            return com.huawei.hms.location.Geofence.DWELL_GEOFENCE_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_DWELL");
            return com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_DWELL;
        }
    }
    
    public static int getGEOFENCE_TRANSITION_ENTER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.Geofence.ENTER_GEOFENCE_CONVERSION");
            return com.huawei.hms.location.Geofence.ENTER_GEOFENCE_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_ENTER");
            return com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_ENTER;
        }
    }
    
    public static int getGEOFENCE_TRANSITION_EXIT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.Geofence.EXIT_GEOFENCE_CONVERSION");
            return com.huawei.hms.location.Geofence.EXIT_GEOFENCE_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_EXIT");
            return com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_EXIT;
        }
    }
    
    public static long getNEVER_EXPIRE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.Geofence.GEOFENCE_NEVER_EXPIRE");
            return com.huawei.hms.location.Geofence.GEOFENCE_NEVER_EXPIRE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.Geofence.NEVER_EXPIRE");
            return com.google.android.gms.location.Geofence.NEVER_EXPIRE;
        }
    }
    
    public java.lang.String getRequestId();
    
    default com.google.android.gms.location.Geofence getGInstanceGeofence() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.location.Geofence) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.location.Geofence() {
            
            public java.lang.String getRequestId() {
                return org.xms.g.location.Geofence.this.getRequestId();
            }
        };
    }
    
    default com.huawei.hms.location.Geofence getHInstanceGeofence() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.location.Geofence) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.location.Geofence() {
            
            public java.lang.String getUniqueId() {
                return org.xms.g.location.Geofence.this.getRequestId();
            }
        };
    }
    
    public static org.xms.g.location.Geofence dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.Geofence) {
            return ((org.xms.g.location.Geofence) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.Geofence gReturn = ((com.google.android.gms.location.Geofence) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.Geofence hReturn = ((com.huawei.hms.location.Geofence) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.Geofence.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.location.Geofence) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.Geofence;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.Geofence;
            }
        }
        return param0 instanceof org.xms.g.location.Geofence;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.Geofence {
        
        public XImpl(com.google.android.gms.location.Geofence param0, com.huawei.hms.location.Geofence param1) {
            super(param0, param1);
        }
        
        public java.lang.String getRequestId() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence) this.getHInstance()).getUniqueId()");
                return ((com.huawei.hms.location.Geofence) this.getHInstance()).getUniqueId();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence) this.getGInstance()).getRequestId()");
                return ((com.google.android.gms.location.Geofence) this.getGInstance()).getRequestId();
            }
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(com.google.android.gms.location.Geofence.Builder param0, com.huawei.hms.location.Geofence.Builder param1) {
            super(param0, null);
            this.setHInstance(param1);
        }
        
        public Builder() {
            super(((com.google.android.gms.location.Geofence.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.Geofence.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.Geofence.Builder());
            }
        }
        
        public final org.xms.g.location.Geofence build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.Geofence hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.XImpl(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.Geofence gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.XImpl(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.Geofence.Builder setCircularRegion(double param0, double param1, float param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setRoundArea(param0, param1, param2)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setRoundArea(param0, param1, param2);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setCircularRegion(param0, param1, param2)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setCircularRegion(param0, param1, param2);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.Geofence.Builder setExpirationDuration(long param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setValidContinueTime(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setValidContinueTime(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setExpirationDuration(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setExpirationDuration(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.Geofence.Builder setLoiteringDelay(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setDwellDelayTime(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setDwellDelayTime(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setLoiteringDelay(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setLoiteringDelay(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.Geofence.Builder setNotificationResponsiveness(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setNotificationInterval(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setNotificationInterval(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setNotificationResponsiveness(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setNotificationResponsiveness(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.Geofence.Builder setRequestId(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setUniqueId(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setUniqueId(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setRequestId(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setRequestId(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.Geofence.Builder setTransitionTypes(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setConversions(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setConversions(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setTransitionTypes(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setTransitionTypes(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(gReturn, null)));
            }
        }
        
        public static org.xms.g.location.Geofence.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.Geofence.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.Geofence.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.Geofence.Builder;
            }
        }
    }
}