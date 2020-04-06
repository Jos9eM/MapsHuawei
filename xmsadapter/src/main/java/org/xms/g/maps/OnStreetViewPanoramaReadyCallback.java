package org.xms.g.maps;

public interface OnStreetViewPanoramaReadyCallback extends org.xms.g.utils.XInterface {
    
    public void onStreetViewPanoramaReady(org.xms.g.maps.StreetViewPanorama param0);
    
    default com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback getGInstanceOnStreetViewPanoramaReadyCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback() {
            
            public void onStreetViewPanoramaReady(com.google.android.gms.maps.StreetViewPanorama param0) {
                org.xms.g.maps.OnStreetViewPanoramaReadyCallback.this.onStreetViewPanoramaReady(((param0) == null ? null : (new org.xms.g.maps.StreetViewPanorama(param0, null))));
            }
        };
    }
    
    default com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback getHInstanceOnStreetViewPanoramaReadyCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback() {
            
            public void onStreetViewPanoramaReady(com.huawei.hms.maps.StreetViewPanorama param0) {
                org.xms.g.maps.OnStreetViewPanoramaReadyCallback.this.onStreetViewPanoramaReady(((param0) == null ? null : (new org.xms.g.maps.StreetViewPanorama(null, param0))));
            }
        };
    }
    
    public static org.xms.g.maps.OnStreetViewPanoramaReadyCallback dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.maps.OnStreetViewPanoramaReadyCallback) {
            return ((org.xms.g.maps.OnStreetViewPanoramaReadyCallback) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback gReturn = ((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback hReturn = ((com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.maps.OnStreetViewPanoramaReadyCallback.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.maps.OnStreetViewPanoramaReadyCallback) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
            }
        }
        return param0 instanceof org.xms.g.maps.OnStreetViewPanoramaReadyCallback;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.OnStreetViewPanoramaReadyCallback {
        
        public XImpl(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback param0, com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback param1) {
            super(param0, param1);
        }
        
        public void onStreetViewPanoramaReady(org.xms.g.maps.StreetViewPanorama param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback) this.getHInstance()).onStreetViewPanoramaReady(((com.huawei.hms.maps.StreetViewPanorama) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback) this.getHInstance()).onStreetViewPanoramaReady(((com.huawei.hms.maps.StreetViewPanorama) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) this.getGInstance()).onStreetViewPanoramaReady(((com.google.android.gms.maps.StreetViewPanorama) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback) this.getGInstance()).onStreetViewPanoramaReady(((com.google.android.gms.maps.StreetViewPanorama) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }
}