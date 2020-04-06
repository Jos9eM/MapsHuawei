package org.xms.g.maps;

public class MapView extends android.widget.FrameLayout implements org.xms.g.utils.XGettable {
    private boolean wrapper = true;
    public com.google.android.gms.maps.MapView gInstance;
    public com.huawei.hms.maps.MapView hInstance;
    
    public MapView(android.content.Context param0) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0));
        } else {
            this.setGInstance(new GImpl(param0));
        }
        wrapper = false;
    }
    
    public MapView(android.content.Context param0, android.util.AttributeSet param1) {
        super(param0, param1);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public MapView(android.content.Context param0, android.util.AttributeSet param1, int param2) {
        super(param0, param1, param2);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1, param2));
        } else {
            this.setGInstance(new GImpl(param0, param1, param2));
        }
        wrapper = false;
    }
    
    public MapView(android.content.Context param0, org.xms.g.maps.ExtensionMapOptions param1) {
        super(param0);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, ((com.huawei.hms.maps.HuaweiMapOptions) ((param1) == null ? null : (param1.getHInstance())))));
        } else {
            this.setGInstance(new GImpl(param0, ((com.google.android.gms.maps.GoogleMapOptions) ((param1) == null ? null : (param1.getGInstance())))));
        }
        wrapper = false;
    }
    
    public void getMapAsync(org.xms.g.maps.OnMapReadyCallback param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).getMapAsync(((param0) == null ? null : (param0.getHInstanceOnMapReadyCallback())))");
                ((com.huawei.hms.maps.MapView) this.getHInstance()).getMapAsync(((param0) == null ? null : (param0.getHInstanceOnMapReadyCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).getMapAsync(((param0) == null ? null : (param0.getGInstanceOnMapReadyCallback())))");
                ((com.google.android.gms.maps.MapView) this.getGInstance()).getMapAsync(((param0) == null ? null : (param0.getGInstanceOnMapReadyCallback())));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.maps.MapView) this.getHInstance())).getMapAsyncCallSuper(((param0) == null ? null : (param0.getHInstanceOnMapReadyCallback())))");
                ((HImpl) ((com.huawei.hms.maps.MapView) this.getHInstance())).getMapAsyncCallSuper(((param0) == null ? null : (param0.getHInstanceOnMapReadyCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.maps.MapView) this.getGInstance())).getMapAsyncCallSuper(((param0) == null ? null : (param0.getGInstanceOnMapReadyCallback())))");
                ((GImpl) ((com.google.android.gms.maps.MapView) this.getGInstance())).getMapAsyncCallSuper(((param0) == null ? null : (param0.getGInstanceOnMapReadyCallback())));
            }
        }
    }
    
    public final void onCreate(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onCreate(param0)");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onCreate(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onCreate(param0)");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onCreate(param0);
        }
    }
    
    public final void onDestroy() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onDestroy()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onDestroy();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onDestroy()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onDestroy();
        }
    }
    
    public final void onEnterAmbient(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onEnterAmbient(param0)");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onEnterAmbient(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onEnterAmbient(param0)");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onEnterAmbient(param0);
        }
    }
    
    public final void onExitAmbient() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onExitAmbient()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onExitAmbient();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onExitAmbient()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onExitAmbient();
        }
    }
    
    public final void onLowMemory() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onLowMemory()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onLowMemory();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onLowMemory()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onLowMemory();
        }
    }
    
    public final void onPause() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onPause()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onPause();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onPause()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onPause();
        }
    }
    
    public final void onResume() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onResume()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onResume();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onResume()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onResume();
        }
    }
    
    public final void onSaveInstanceState(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onSaveInstanceState(param0)");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onSaveInstanceState(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onSaveInstanceState(param0)");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onSaveInstanceState(param0);
        }
    }
    
    public final void onStart() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onStart()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onStart();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onStart()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onStart();
        }
    }
    
    public final void onStop() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.MapView) this.getHInstance()).onStop()");
            ((com.huawei.hms.maps.MapView) this.getHInstance()).onStop();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.MapView) this.getGInstance()).onStop()");
            ((com.google.android.gms.maps.MapView) this.getGInstance()).onStop();
        }
    }
    
    public void setGInstance(com.google.android.gms.maps.MapView param0) {
        this.gInstance = param0;
        this.removeAllViews();
        this.addView(gInstance);
        this.setClickable(true);
    }
    
    public void setHInstance(com.huawei.hms.maps.MapView param0) {
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
    
    public static org.xms.g.maps.MapView dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.MapView) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.MapView;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.MapView;
        }
    }
    
    public org.xms.g.maps.MapView wrapInst(com.google.android.gms.maps.MapView param0, com.huawei.hms.maps.MapView param1) {
        gInstance = param0;
        hInstance = param1;
        wrapper = true;
        return this;
    }
    
    private class GImpl extends com.google.android.gms.maps.MapView {
        
        public void getMapAsync(com.google.android.gms.maps.OnMapReadyCallback param0) {
            org.xms.g.maps.MapView.this.getMapAsync(((param0) == null ? null : (new org.xms.g.maps.OnMapReadyCallback.XImpl(param0, null))));
        }
        
        public void getMapAsyncCallSuper(com.google.android.gms.maps.OnMapReadyCallback param0) {
            super.getMapAsync(param0);
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
        
        public GImpl(android.content.Context param0, com.google.android.gms.maps.GoogleMapOptions param1) {
            super(param0, param1);
        }
    }
    
    private class HImpl extends com.huawei.hms.maps.MapView {
        
        public void getMapAsync(com.huawei.hms.maps.OnMapReadyCallback param0) {
            org.xms.g.maps.MapView.this.getMapAsync(((param0) == null ? null : (new org.xms.g.maps.OnMapReadyCallback.XImpl(null, param0))));
        }
        
        public void getMapAsyncCallSuper(com.huawei.hms.maps.OnMapReadyCallback param0) {
            super.getMapAsync(param0);
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
        
        public HImpl(android.content.Context param0, com.huawei.hms.maps.HuaweiMapOptions param1) {
            super(param0, param1);
        }
    }
}