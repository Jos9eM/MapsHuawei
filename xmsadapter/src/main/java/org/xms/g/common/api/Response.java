package org.xms.g.common.api;

public class Response<XT extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject {
    private boolean wrapper = true;
    
    public Response(com.google.android.gms.common.api.Response param0, com.huawei.hms.common.api.Response param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public Response() {
        super(((com.google.android.gms.common.api.Response) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }
    
    public Response(XT param0) {
        super(((com.google.android.gms.common.api.Response) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            this.setHInstance(new HImpl(hObj0));
        } else {
            com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            this.setGInstance(new GImpl(gObj0));
        }
        wrapper = false;
    }
    
    public void setResult(XT param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.Response) this.getHInstance()).setResult(hObj0)");
                ((com.huawei.hms.common.api.Response) this.getHInstance()).setResult(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Response) this.getGInstance()).setResult(gObj0)");
                ((com.google.android.gms.common.api.Response) this.getGInstance()).setResult(gObj0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.api.Response) this.getHInstance())).setResultCallSuper(hObj0)");
                ((HImpl) ((com.huawei.hms.common.api.Response) this.getHInstance())).setResultCallSuper(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.Response) this.getGInstance())).setResultCallSuper(gObj0)");
                ((GImpl) ((com.google.android.gms.common.api.Response) this.getGInstance())).setResultCallSuper(gObj0);
            }
        }
    }
    
    protected XT getResult() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                java.lang.Object[] params = new java.lang.Object[0];
                java.lang.Class[] types = new java.lang.Class[0];
                java.lang.Object hmsObj = org.xms.g.utils.Utils.invokeProtectMethod(((com.huawei.hms.common.api.Response) this.getHInstance()), com.huawei.hms.common.api.Response.class, "getResult", types, params);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                java.lang.Object[] params = new java.lang.Object[0];
                java.lang.Class[] types = new java.lang.Class[0];
                java.lang.Object gmsObj = org.xms.g.utils.Utils.invokeProtectMethod(((com.google.android.gms.common.api.Response) this.getGInstance()), com.google.android.gms.common.api.Response.class, "getResult", types, params);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.api.Response) this.getHInstance())).getResultCallSuper()");
                java.lang.Object hmsObj = ((HImpl) ((com.huawei.hms.common.api.Response) this.getHInstance())).getResultCallSuper();
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.Response) this.getGInstance())).getResultCallSuper()");
                java.lang.Object gmsObj = ((GImpl) ((com.google.android.gms.common.api.Response) this.getGInstance())).getResultCallSuper();
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }
    }
    
    public static org.xms.g.common.api.Response dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.Response) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.Response;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Response;
        }
    }
    
    private class GImpl<T extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.Response<T> {
        
        public void setResult(T param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeBridgeMethod(org.xms.g.common.api.Response.this, "setResult", params, types, false);
        }
        
        protected T getResult() {
            XT xResult = ((XT) org.xms.g.common.api.Response.this.getResult());
            return ((T) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
        }
        
        public void setResultCallSuper(T param0) {
            super.setResult(param0);
        }
        
        protected T getResultCallSuper() {
            return super.getResult();
        }
        
        public GImpl() {
            super();
        }
        
        protected GImpl(T param0) {
            super(param0);
        }
    }
    
    private class HImpl<T extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.common.api.Response<T> {
        
        public void setResult(T param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeBridgeMethod(org.xms.g.common.api.Response.this, "setResult", params, types, true);
        }
        
        protected T getResult() {
            XT xResult = ((XT) org.xms.g.common.api.Response.this.getResult());
            return ((T) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
        }
        
        public void setResultCallSuper(T param0) {
            super.setResult(param0);
        }
        
        protected T getResultCallSuper() {
            return super.getResult();
        }
        
        public HImpl() {
            super();
        }
        
        protected HImpl(T param0) {
            super(param0);
        }
    }
}