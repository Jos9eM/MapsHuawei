package org.xms.g.maps;

public class StreetViewPanoramaView extends android.widget.FrameLayout implements org.xms.g.utils.XGettable {
    private boolean wrapper = true;
    public com.google.android.gms.maps.StreetViewPanoramaView gInstance;
    public com.huawei.hms.maps.StreetViewPanoramaView hInstance;
    
    public StreetViewPanoramaView(android.content.Context param0) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    public StreetViewPanoramaView(android.content.Context param0, android.util.AttributeSet param1) {
        super(param0, param1);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public StreetViewPanoramaView(android.content.Context param0, android.util.AttributeSet param1, int param2) {
        super(param0, param1, param2);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1, param2));
        } else {
            this.setGInstance(new GImpl(param0, param1, param2));
        }
        wrapper = false;
    }
    
    public StreetViewPanoramaView(android.content.Context param0, org.xms.g.maps.StreetViewPanoramaOptions param1) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, ((com.huawei.hms.maps.StreetViewPanoramaOptions) ((param1) == null ? null : (param1.getHInstance())))));
        } else {
            this.setGInstance(new GImpl(param0, ((com.google.android.gms.maps.StreetViewPanoramaOptions) ((param1) == null ? null : (param1.getGInstance())))));
        }
        wrapper = false;
    }
    
    public void getStreetViewPanoramaAsync(org.xms.g.maps.OnStreetViewPanoramaReadyCallback param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).getStreetViewPanoramaAsync(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaReadyCallback())))");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).getStreetViewPanoramaAsync(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaReadyCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).getStreetViewPanoramaAsync(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaReadyCallback())))");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).getStreetViewPanoramaAsync(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaReadyCallback())));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance())).getStreetViewPanoramaAsyncCallSuper(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaReadyCallback())))");
                ((HImpl) ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance())).getStreetViewPanoramaAsyncCallSuper(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaReadyCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).getStreetViewPanoramaAsyncCallSuper(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaReadyCallback())))");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).getStreetViewPanoramaAsyncCallSuper(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaReadyCallback())));
            }
        }
    }
    
    public final void onCreate(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onCreate(param0)");
            ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onCreate(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onCreate(param0)");
            ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onCreate(param0);
        }
    }
    
    public void onDestroy() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onDestroy()");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onDestroy();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onDestroy()");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onDestroy();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onDestroy()");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onDestroy();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onDestroyCallSuper()");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onDestroyCallSuper();
            }
        }
    }
    
    public final void onLowMemory() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onLowMemory()");
            ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onLowMemory();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onLowMemory()");
            ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onLowMemory();
        }
    }
    
    public final void onPause() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onPause()");
            ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onPause();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onPause()");
            ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onPause();
        }
    }
    
    public void onResume() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onResume()");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onResume();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onResume()");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onResume();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onResume()");
                ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onResume();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onResumeCallSuper()");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onResumeCallSuper();
            }
        }
    }
    
    public final void onSaveInstanceState(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onSaveInstanceState(param0)");
            ((com.huawei.hms.maps.StreetViewPanoramaView) this.getHInstance()).onSaveInstanceState(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onSaveInstanceState(param0)");
            ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onSaveInstanceState(param0);
        }
    }
    
    public void onStart() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onStart()");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onStart();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onStartCallSuper()");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onStartCallSuper();
            }
        }
    }
    
    public void onStop() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onStop()");
                ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance()).onStop();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onStopCallSuper()");
                ((GImpl) ((com.google.android.gms.maps.StreetViewPanoramaView) this.getGInstance())).onStopCallSuper();
            }
        }
    }
    
    public void setGInstance(com.google.android.gms.maps.StreetViewPanoramaView param0) {
        this.gInstance = param0;
        this.removeAllViews();
        this.addView(gInstance);
        this.setClickable(true);
    }
    
    public void setHInstance(com.huawei.hms.maps.StreetViewPanoramaView param0) {
        this.hInstance = param0;
        this.removeAllViews();
        this.addView(hInstance);
        this.setClickable(true);
    }
    
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }
    
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }
    
    public static org.xms.g.maps.StreetViewPanoramaView dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.StreetViewPanoramaView) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanoramaView;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanoramaView;
        }
    }
    
    public org.xms.g.maps.StreetViewPanoramaView wrapInst(com.google.android.gms.maps.StreetViewPanoramaView param0, com.huawei.hms.maps.StreetViewPanoramaView param1) {
        gInstance = param0;
        hInstance = param1;
        wrapper = true;
        return this;
    }
    
    private class GImpl extends com.google.android.gms.maps.StreetViewPanoramaView {
        
        public void getStreetViewPanoramaAsync(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback param0) {
            org.xms.g.maps.StreetViewPanoramaView.this.getStreetViewPanoramaAsync(((param0) == null ? null : (new org.xms.g.maps.OnStreetViewPanoramaReadyCallback.XImpl(param0, null))));
        }
        
        public void onDestroy() {
            org.xms.g.maps.StreetViewPanoramaView.this.onDestroy();
        }
        
        public void onResume() {
            org.xms.g.maps.StreetViewPanoramaView.this.onResume();
        }
        
        public void onStart() {
            org.xms.g.maps.StreetViewPanoramaView.this.onStart();
        }
        
        public void onStop() {
            org.xms.g.maps.StreetViewPanoramaView.this.onStop();
        }
        
        public void getStreetViewPanoramaAsyncCallSuper(com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback param0) {
            super.getStreetViewPanoramaAsync(param0);
        }
        
        public void onDestroyCallSuper() {
            super.onDestroy();
        }
        
        public void onResumeCallSuper() {
            super.onResume();
        }
        
        public void onStartCallSuper() {
            super.onStart();
        }
        
        public void onStopCallSuper() {
            super.onStop();
        }
        
        public GImpl(android.content.Context param0) {
            super(param0);
        }
        
        public GImpl(android.content.Context param0, android.util.AttributeSet param1) {
            super(param0, param1);
        }
        
        public GImpl(android.content.Context param0, android.util.AttributeSet param1, int param2) {
            super(param0, param1, param2);
        }
        
        public GImpl(android.content.Context param0, com.google.android.gms.maps.StreetViewPanoramaOptions param1) {
            super(param0, param1);
        }
    }
    
    private class HImpl extends com.huawei.hms.maps.StreetViewPanoramaView {
        
        public void getStreetViewPanoramaAsync(com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback param0) {
            org.xms.g.maps.StreetViewPanoramaView.this.getStreetViewPanoramaAsync(((param0) == null ? null : (new org.xms.g.maps.OnStreetViewPanoramaReadyCallback.XImpl(null, param0))));
        }
        
        public void getStreetViewPanoramaAsyncCallSuper(com.huawei.hms.maps.OnStreetViewPanoramaReadyCallback param0) {
            super.getStreetViewPanoramaAsync(param0);
        }
        
        public HImpl(android.content.Context param0) {
            super(param0);
        }
        
        public HImpl(android.content.Context param0, android.util.AttributeSet param1) {
            super(param0, param1);
        }
        
        public HImpl(android.content.Context param0, android.util.AttributeSet param1, int param2) {
            super(param0, param1, param2);
        }
        
        public HImpl(android.content.Context param0, com.huawei.hms.maps.StreetViewPanoramaOptions param1) {
            super(param0, param1);
        }
    }
}