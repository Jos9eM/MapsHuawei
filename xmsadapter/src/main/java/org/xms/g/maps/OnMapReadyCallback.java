package org.xms.g.maps;

public interface OnMapReadyCallback extends org.xms.g.utils.XInterface {
    
    public void onMapReady(org.xms.g.maps.ExtensionMap param0);
    
    default com.google.android.gms.maps.OnMapReadyCallback getGInstanceOnMapReadyCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.maps.OnMapReadyCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.maps.OnMapReadyCallback() {
            
            public void onMapReady(com.google.android.gms.maps.GoogleMap param0) {
                org.xms.g.maps.OnMapReadyCallback.this.onMapReady(((param0) == null ? null : (new org.xms.g.maps.ExtensionMap(param0, null))));
            }
        };
    }
    
    default com.huawei.hms.maps.OnMapReadyCallback getHInstanceOnMapReadyCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.maps.OnMapReadyCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.maps.OnMapReadyCallback() {
            
            public void onMapReady(com.huawei.hms.maps.HuaweiMap param0) {
                org.xms.g.maps.OnMapReadyCallback.this.onMapReady(((param0) == null ? null : (new org.xms.g.maps.ExtensionMap(null, param0))));
            }
        };
    }
    
    public static org.xms.g.maps.OnMapReadyCallback dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.maps.OnMapReadyCallback) {
            return ((org.xms.g.maps.OnMapReadyCallback) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.maps.OnMapReadyCallback gReturn = ((com.google.android.gms.maps.OnMapReadyCallback) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.maps.OnMapReadyCallback hReturn = ((com.huawei.hms.maps.OnMapReadyCallback) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.maps.OnMapReadyCallback.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.maps.OnMapReadyCallback) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.OnMapReadyCallback;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.OnMapReadyCallback;
            }
        }
        return param0 instanceof org.xms.g.maps.OnMapReadyCallback;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.OnMapReadyCallback {
        
        public XImpl(com.google.android.gms.maps.OnMapReadyCallback param0, com.huawei.hms.maps.OnMapReadyCallback param1) {
            super(param0, param1);
        }
        
        public void onMapReady(org.xms.g.maps.ExtensionMap param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.OnMapReadyCallback) this.getHInstance()).onMapReady(((com.huawei.hms.maps.HuaweiMap) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.maps.OnMapReadyCallback) this.getHInstance()).onMapReady(((com.huawei.hms.maps.HuaweiMap) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.OnMapReadyCallback) this.getGInstance()).onMapReady(((com.google.android.gms.maps.GoogleMap) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.maps.OnMapReadyCallback) this.getGInstance()).onMapReady(((com.google.android.gms.maps.GoogleMap) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }
}