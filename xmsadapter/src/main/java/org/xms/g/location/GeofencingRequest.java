package org.xms.g.location;

public class GeofencingRequest extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.location.GeofencingRequest createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.location.GeofencingRequest gReturn = null;
            com.huawei.hms.location.GeofenceRequest hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.location.GeofenceRequest.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.location.GeofencingRequest.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.location.GeofencingRequest(gReturn, hReturn);
        }
        
        public org.xms.g.location.GeofencingRequest[] newArray(int param0) {
            return new org.xms.g.location.GeofencingRequest[param0];
        }
    };
    
    public GeofencingRequest(com.google.android.gms.location.GeofencingRequest param0, com.huawei.hms.location.GeofenceRequest param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public static int getINITIAL_TRIGGER_DWELL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceRequest.DWELL_INIT_CONVERSION");
            return com.huawei.hms.location.GeofenceRequest.DWELL_INIT_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_DWELL");
            return com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_DWELL;
        }
    }
    
    public static int getINITIAL_TRIGGER_ENTER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceRequest.ENTER_INIT_CONVERSION");
            return com.huawei.hms.location.GeofenceRequest.ENTER_INIT_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_ENTER");
            return com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_ENTER;
        }
    }
    
    public static int getINITIAL_TRIGGER_EXIT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceRequest.EXIT_INIT_CONVERSION");
            return com.huawei.hms.location.GeofenceRequest.EXIT_INIT_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_EXIT");
            return com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_EXIT;
        }
    }
    
    public java.util.List<org.xms.g.location.Geofence> getGeofences() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).getGeofences()");
            java.util.List hReturn = ((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).getGeofences();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.Geofence, org.xms.g.location.Geofence>() {
                
                public org.xms.g.location.Geofence apply(com.huawei.hms.location.Geofence param0) {
                    return new org.xms.g.location.Geofence.XImpl(null, param0);
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).getGeofences()");
            java.util.List gReturn = ((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).getGeofences();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.Geofence, org.xms.g.location.Geofence>() {
                
                public org.xms.g.location.Geofence apply(com.google.android.gms.location.Geofence param0) {
                    return new org.xms.g.location.Geofence.XImpl(param0, null);
                }
            }));
        }
    }
    
    public int getInitialTrigger() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).getInitConversions()");
            return ((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).getInitConversions();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).getInitialTrigger()");
            return ((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).getInitialTrigger();
        }
    }
    
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).toString();
        }
    }
    
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public static org.xms.g.location.GeofencingRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.GeofencingRequest) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofencingRequest;
        }
    }
    
    public static final class Builder extends org.xms.g.utils.XObject {
        
        public Builder(com.google.android.gms.location.GeofencingRequest.Builder param0, com.huawei.hms.location.GeofenceRequest.Builder param1) {
            super(param0, null);
            this.setHInstance(param1);
        }
        
        public Builder() {
            super(((com.google.android.gms.location.GeofencingRequest.Builder) null), null);
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.GeofenceRequest.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.GeofencingRequest.Builder());
            }
        }
        
        public org.xms.g.location.GeofencingRequest.Builder addGeofence(org.xms.g.location.Geofence param0) throws java.lang.NullPointerException, java.lang.IllegalArgumentException {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).createGeofence(((param0) == null ? null : (param0.getHInstanceGeofence())))");
                com.huawei.hms.location.GeofenceRequest.Builder hReturn = ((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).createGeofence(((param0) == null ? null : (param0.getHInstanceGeofence())));
                return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).addGeofence(((param0) == null ? null : (param0.getGInstanceGeofence())))");
                com.google.android.gms.location.GeofencingRequest.Builder gReturn = ((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).addGeofence(((param0) == null ? null : (param0.getGInstanceGeofence())));
                return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.GeofencingRequest.Builder addGeofences(java.util.List<org.xms.g.location.Geofence> param0) throws java.lang.IllegalArgumentException {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).createGeofenceList(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true)))");
                com.huawei.hms.location.GeofenceRequest.Builder hReturn = ((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).createGeofenceList(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true)));
                return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).addGeofences(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false)))");
                com.google.android.gms.location.GeofencingRequest.Builder gReturn = ((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).addGeofences(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false)));
                return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.GeofencingRequest build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.GeofenceRequest hReturn = ((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingRequest(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.GeofencingRequest gReturn = ((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingRequest(gReturn, null)));
            }
        }
        
        public final org.xms.g.location.GeofencingRequest.Builder setInitialTrigger(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).setInitConversions(param0)");
                com.huawei.hms.location.GeofenceRequest.Builder hReturn = ((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).setInitConversions(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).setInitialTrigger(param0)");
                com.google.android.gms.location.GeofencingRequest.Builder gReturn = ((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).setInitialTrigger(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(gReturn, null)));
            }
        }
        
        public static org.xms.g.location.GeofencingRequest.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.GeofencingRequest.Builder) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceRequest.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofencingRequest.Builder;
            }
        }
    }
}