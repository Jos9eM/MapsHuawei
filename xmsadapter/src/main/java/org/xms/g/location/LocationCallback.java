package org.xms.g.location;

public class LocationCallback extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public LocationCallback(com.google.android.gms.location.LocationCallback param0, com.huawei.hms.location.LocationCallback param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public LocationCallback() {
        super(((com.google.android.gms.location.LocationCallback) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }
    
    public void onLocationAvailability(org.xms.g.location.LocationAvailability param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationCallback) this.getHInstance()).onLocationAvailability(((com.huawei.hms.location.LocationAvailability) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.location.LocationCallback) this.getHInstance()).onLocationAvailability(((com.huawei.hms.location.LocationAvailability) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationCallback) this.getGInstance()).onLocationAvailability(((com.google.android.gms.location.LocationAvailability) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.location.LocationCallback) this.getGInstance()).onLocationAvailability(((com.google.android.gms.location.LocationAvailability) ((param0) == null ? null : (param0.getGInstance()))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.LocationCallback) this.getHInstance())).onLocationAvailabilityCallSuper(((com.huawei.hms.location.LocationAvailability) ((param0) == null ? null : (param0.getHInstance()))))");
                ((HImpl) ((com.huawei.hms.location.LocationCallback) this.getHInstance())).onLocationAvailabilityCallSuper(((com.huawei.hms.location.LocationAvailability) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.LocationCallback) this.getGInstance())).onLocationAvailabilityCallSuper(((com.google.android.gms.location.LocationAvailability) ((param0) == null ? null : (param0.getGInstance()))))");
                ((GImpl) ((com.google.android.gms.location.LocationCallback) this.getGInstance())).onLocationAvailabilityCallSuper(((com.google.android.gms.location.LocationAvailability) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }
    
    public void onLocationResult(org.xms.g.location.LocationResult param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationCallback) this.getHInstance()).onLocationResult(((com.huawei.hms.location.LocationResult) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.location.LocationCallback) this.getHInstance()).onLocationResult(((com.huawei.hms.location.LocationResult) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationCallback) this.getGInstance()).onLocationResult(((com.google.android.gms.location.LocationResult) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.location.LocationCallback) this.getGInstance()).onLocationResult(((com.google.android.gms.location.LocationResult) ((param0) == null ? null : (param0.getGInstance()))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.LocationCallback) this.getHInstance())).onLocationResultCallSuper(((com.huawei.hms.location.LocationResult) ((param0) == null ? null : (param0.getHInstance()))))");
                ((HImpl) ((com.huawei.hms.location.LocationCallback) this.getHInstance())).onLocationResultCallSuper(((com.huawei.hms.location.LocationResult) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.LocationCallback) this.getGInstance())).onLocationResultCallSuper(((com.google.android.gms.location.LocationResult) ((param0) == null ? null : (param0.getGInstance()))))");
                ((GImpl) ((com.google.android.gms.location.LocationCallback) this.getGInstance())).onLocationResultCallSuper(((com.google.android.gms.location.LocationResult) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }
    
    public static org.xms.g.location.LocationCallback dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationCallback) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationCallback;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationCallback;
        }
    }
    
    private class GImpl extends com.google.android.gms.location.LocationCallback {
        
        public void onLocationAvailability(com.google.android.gms.location.LocationAvailability param0) {
            org.xms.g.location.LocationCallback.this.onLocationAvailability(((param0) == null ? null : (new org.xms.g.location.LocationAvailability(param0, null))));
        }
        
        public void onLocationResult(com.google.android.gms.location.LocationResult param0) {
            org.xms.g.location.LocationCallback.this.onLocationResult(((param0) == null ? null : (new org.xms.g.location.LocationResult(param0, null))));
        }
        
        public void onLocationAvailabilityCallSuper(com.google.android.gms.location.LocationAvailability param0) {
            super.onLocationAvailability(param0);
        }
        
        public void onLocationResultCallSuper(com.google.android.gms.location.LocationResult param0) {
            super.onLocationResult(param0);
        }
        
        public GImpl() {
            super();
        }
    }
    
    private class HImpl extends com.huawei.hms.location.LocationCallback {
        
        public void onLocationAvailability(com.huawei.hms.location.LocationAvailability param0) {
            org.xms.g.location.LocationCallback.this.onLocationAvailability(((param0) == null ? null : (new org.xms.g.location.LocationAvailability(null, param0))));
        }
        
        public void onLocationResult(com.huawei.hms.location.LocationResult param0) {
            org.xms.g.location.LocationCallback.this.onLocationResult(((param0) == null ? null : (new org.xms.g.location.LocationResult(null, param0))));
        }
        
        public void onLocationAvailabilityCallSuper(com.huawei.hms.location.LocationAvailability param0) {
            super.onLocationAvailability(param0);
        }
        
        public void onLocationResultCallSuper(com.huawei.hms.location.LocationResult param0) {
            super.onLocationResult(param0);
        }
        
        public HImpl() {
            super();
        }
    }
}