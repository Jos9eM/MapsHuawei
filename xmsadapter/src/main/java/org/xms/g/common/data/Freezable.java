package org.xms.g.common.data;

public interface Freezable<XT> extends org.xms.g.utils.XInterface {
    
    public XT freeze();
    
    public boolean isDataValid();
    
    default <T> com.google.android.gms.common.data.Freezable<T> getGInstanceFreezable() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.data.Freezable<T>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.common.data.Freezable<T>() {
            
            public T freeze() {
                XT xResult = ((XT) org.xms.g.common.data.Freezable.this.freeze());
                return ((T) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
            }
            
            public boolean isDataValid() {
                return org.xms.g.common.data.Freezable.this.isDataValid();
            }
        };
    }
    
    default <T> com.huawei.hms.common.data.Freezable<T> getHInstanceFreezable() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.common.data.Freezable<T>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.common.data.Freezable<T>() {
            
            public T freeze() {
                XT xResult = ((XT) org.xms.g.common.data.Freezable.this.freeze());
                return ((T) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
            }
            
            public boolean isDataValid() {
                return org.xms.g.common.data.Freezable.this.isDataValid();
            }
        };
    }
    
    public static org.xms.g.common.data.Freezable dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.data.Freezable) {
            return ((org.xms.g.common.data.Freezable) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.data.Freezable gReturn = ((com.google.android.gms.common.data.Freezable) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.common.data.Freezable hReturn = ((com.huawei.hms.common.data.Freezable) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.data.Freezable.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.common.data.Freezable) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.Freezable;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.Freezable;
            }
        }
        return param0 instanceof org.xms.g.common.data.Freezable;
    }
    
    public static class XImpl<XT> extends org.xms.g.utils.XObject implements org.xms.g.common.data.Freezable<XT> {
        
        public XImpl(com.google.android.gms.common.data.Freezable param0, com.huawei.hms.common.data.Freezable param1) {
            super(param0, param1);
        }
        
        public XT freeze() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.Freezable) this.getHInstance()).freeze()");
                java.lang.Object hmsObj = ((com.huawei.hms.common.data.Freezable) this.getHInstance()).freeze();
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.Freezable) this.getGInstance()).freeze()");
                java.lang.Object gmsObj = ((com.google.android.gms.common.data.Freezable) this.getGInstance()).freeze();
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }
        
        public boolean isDataValid() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.Freezable) this.getHInstance()).isDataValid()");
                return ((com.huawei.hms.common.data.Freezable) this.getHInstance()).isDataValid();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.Freezable) this.getGInstance()).isDataValid()");
                return ((com.google.android.gms.common.data.Freezable) this.getGInstance()).isDataValid();
            }
        }
    }
}