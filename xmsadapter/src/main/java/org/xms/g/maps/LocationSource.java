package org.xms.g.maps;

public interface LocationSource extends org.xms.g.utils.XInterface {
    
    public void activate(org.xms.g.maps.LocationSource.OnLocationChangedListener param0);
    
    public void deactivate();
    
    default com.google.android.gms.maps.LocationSource getGInstanceLocationSource() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.maps.LocationSource) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.maps.LocationSource() {
            
            public void activate(com.google.android.gms.maps.LocationSource.OnLocationChangedListener param0) {
                org.xms.g.maps.LocationSource.this.activate(((param0) == null ? null : (new org.xms.g.maps.LocationSource.OnLocationChangedListener.XImpl(param0, null))));
            }
            
            public void deactivate() {
                org.xms.g.maps.LocationSource.this.deactivate();
            }
        };
    }
    
    default com.huawei.hms.maps.LocationSource getHInstanceLocationSource() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.maps.LocationSource) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.maps.LocationSource() {
            
            public void activate(com.huawei.hms.maps.LocationSource.OnLocationChangedListener param0) {
                org.xms.g.maps.LocationSource.this.activate(((param0) == null ? null : (new org.xms.g.maps.LocationSource.OnLocationChangedListener.XImpl(null, param0))));
            }
            
            public void deactivate() {
                org.xms.g.maps.LocationSource.this.deactivate();
            }
        };
    }
    
    public static org.xms.g.maps.LocationSource dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.maps.LocationSource) {
            return ((org.xms.g.maps.LocationSource) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.maps.LocationSource gReturn = ((com.google.android.gms.maps.LocationSource) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.maps.LocationSource hReturn = ((com.huawei.hms.maps.LocationSource) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.maps.LocationSource.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.maps.LocationSource) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.LocationSource;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.LocationSource;
            }
        }
        return param0 instanceof org.xms.g.maps.LocationSource;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.LocationSource {
        
        public XImpl(com.google.android.gms.maps.LocationSource param0, com.huawei.hms.maps.LocationSource param1) {
            super(param0, param1);
        }
        
        public void activate(org.xms.g.maps.LocationSource.OnLocationChangedListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.LocationSource) this.getHInstance()).activate(((param0) == null ? null : (param0.getHInstanceOnLocationChangedListener())))");
                ((com.huawei.hms.maps.LocationSource) this.getHInstance()).activate(((param0) == null ? null : (param0.getHInstanceOnLocationChangedListener())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.LocationSource) this.getGInstance()).activate(((param0) == null ? null : (param0.getGInstanceOnLocationChangedListener())))");
                ((com.google.android.gms.maps.LocationSource) this.getGInstance()).activate(((param0) == null ? null : (param0.getGInstanceOnLocationChangedListener())));
            }
        }
        
        public void deactivate() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.LocationSource) this.getHInstance()).deactivate()");
                ((com.huawei.hms.maps.LocationSource) this.getHInstance()).deactivate();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.LocationSource) this.getGInstance()).deactivate()");
                ((com.google.android.gms.maps.LocationSource) this.getGInstance()).deactivate();
            }
        }
    }
    
    public static interface OnLocationChangedListener extends org.xms.g.utils.XInterface {
        
        public void onLocationChanged(android.location.Location param0);
        
        default com.google.android.gms.maps.LocationSource.OnLocationChangedListener getGInstanceOnLocationChangedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.LocationSource.OnLocationChangedListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.LocationSource.OnLocationChangedListener() {
                
                public void onLocationChanged(android.location.Location param0) {
                    org.xms.g.maps.LocationSource.OnLocationChangedListener.this.onLocationChanged(param0);
                }
            };
        }
        
        default com.huawei.hms.maps.LocationSource.OnLocationChangedListener getHInstanceOnLocationChangedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.LocationSource.OnLocationChangedListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.LocationSource.OnLocationChangedListener() {
                
                public void onLocationChanged(android.location.Location param0) {
                    org.xms.g.maps.LocationSource.OnLocationChangedListener.this.onLocationChanged(param0);
                }
            };
        }
        
        public static org.xms.g.maps.LocationSource.OnLocationChangedListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.LocationSource.OnLocationChangedListener) {
                return ((org.xms.g.maps.LocationSource.OnLocationChangedListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.LocationSource.OnLocationChangedListener gReturn = ((com.google.android.gms.maps.LocationSource.OnLocationChangedListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.LocationSource.OnLocationChangedListener hReturn = ((com.huawei.hms.maps.LocationSource.OnLocationChangedListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.LocationSource.OnLocationChangedListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.LocationSource.OnLocationChangedListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.LocationSource.OnLocationChangedListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.LocationSource.OnLocationChangedListener;
                }
            }
            return param0 instanceof org.xms.g.maps.LocationSource.OnLocationChangedListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.LocationSource.OnLocationChangedListener {
            
            public XImpl(com.google.android.gms.maps.LocationSource.OnLocationChangedListener param0, com.huawei.hms.maps.LocationSource.OnLocationChangedListener param1) {
                super(param0, param1);
            }
            
            public void onLocationChanged(android.location.Location param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.LocationSource.OnLocationChangedListener) this.getHInstance()).onLocationChanged(param0)");
                    ((com.huawei.hms.maps.LocationSource.OnLocationChangedListener) this.getHInstance()).onLocationChanged(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.LocationSource.OnLocationChangedListener) this.getGInstance()).onLocationChanged(param0)");
                    ((com.google.android.gms.maps.LocationSource.OnLocationChangedListener) this.getGInstance()).onLocationChanged(param0);
                }
            }
        }
    }
}