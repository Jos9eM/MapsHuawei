package org.xms.g.maps.model;

public abstract class UrlTileProvider extends org.xms.g.utils.XObject implements org.xms.g.maps.model.TileProvider {
    private boolean wrapper = true;
    
    public UrlTileProvider(com.google.android.gms.maps.model.UrlTileProvider param0, com.huawei.hms.maps.model.UrlTileProvider param1) {
        super(param0, null);
        this.setHInstance(param1);
        wrapper = true;
    }
    
    public UrlTileProvider(int param0, int param1) {
        super(((com.google.android.gms.maps.model.UrlTileProvider) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }
    
    public final org.xms.g.maps.model.Tile getTile(int param0, int param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.UrlTileProvider) this.getHInstance()).getTile(param0, param1, param2)");
            com.huawei.hms.maps.model.Tile hReturn = ((com.huawei.hms.maps.model.UrlTileProvider) this.getHInstance()).getTile(param0, param1, param2);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Tile(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.UrlTileProvider) this.getGInstance()).getTile(param0, param1, param2)");
            com.google.android.gms.maps.model.Tile gReturn = ((com.google.android.gms.maps.model.UrlTileProvider) this.getGInstance()).getTile(param0, param1, param2);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Tile(gReturn, null)));
        }
    }
    
    public abstract java.net.URL getTileUrl(int param0, int param1, int param2);
    
    public static org.xms.g.maps.model.UrlTileProvider dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.maps.model.UrlTileProvider) {
            return ((org.xms.g.maps.model.UrlTileProvider) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.maps.model.UrlTileProvider gReturn = ((com.google.android.gms.maps.model.UrlTileProvider) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.maps.model.UrlTileProvider hReturn = ((com.huawei.hms.maps.model.UrlTileProvider) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.maps.model.UrlTileProvider.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.maps.model.UrlTileProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.UrlTileProvider;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.UrlTileProvider;
        }
    }
    
    private class GImpl extends com.google.android.gms.maps.model.UrlTileProvider {
        
        public java.net.URL getTileUrl(int param0, int param1, int param2) {
            return org.xms.g.maps.model.UrlTileProvider.this.getTileUrl(param0, param1, param2);
        }
        
        public GImpl(int param0, int param1) {
            super(param0, param1);
        }
    }
    
    private class HImpl extends com.huawei.hms.maps.model.UrlTileProvider {
        
        public java.net.URL getTileUrl(int param0, int param1, int param2) {
            return org.xms.g.maps.model.UrlTileProvider.this.getTileUrl(param0, param1, param2);
        }
        
        public HImpl(int param0, int param1) {
            super(param0, param1);
        }
    }
    
    public static class XImpl extends org.xms.g.maps.model.UrlTileProvider {
        
        public XImpl(com.google.android.gms.maps.model.UrlTileProvider param0, com.huawei.hms.maps.model.UrlTileProvider param1) {
            super(param0, param1);
        }
        
        public java.net.URL getTileUrl(int param0, int param1, int param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.UrlTileProvider) this.getHInstance()).getTileUrl(param0, param1, param2)");
                return ((com.huawei.hms.maps.model.UrlTileProvider) this.getHInstance()).getTileUrl(param0, param1, param2);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.UrlTileProvider) this.getGInstance()).getTileUrl(param0, param1, param2)");
                return ((com.google.android.gms.maps.model.UrlTileProvider) this.getGInstance()).getTileUrl(param0, param1, param2);
            }
        }
    }
}