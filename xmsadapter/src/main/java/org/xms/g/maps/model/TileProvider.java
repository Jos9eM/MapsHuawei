package org.xms.g.maps.model;

public interface TileProvider extends org.xms.g.utils.XInterface {
    
    public static org.xms.g.maps.model.Tile getNO_TILE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.TileProvider.NO_TILE");
            com.huawei.hms.maps.model.Tile hReturn = null;
            hReturn = com.huawei.hms.maps.model.TileProvider.NO_TILE;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Tile(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.TileProvider.NO_TILE");
            com.google.android.gms.maps.model.Tile gReturn = null;
            gReturn = com.google.android.gms.maps.model.TileProvider.NO_TILE;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Tile(gReturn, null)));
        }
    }
    
    public org.xms.g.maps.model.Tile getTile(int param0, int param1, int param2);
    
    default com.google.android.gms.maps.model.TileProvider getGInstanceTileProvider() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.maps.model.TileProvider) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.maps.model.TileProvider() {
            
            public com.google.android.gms.maps.model.Tile getTile(int param0, int param1, int param2) {
                org.xms.g.maps.model.Tile xResult = org.xms.g.maps.model.TileProvider.this.getTile(param0, param1, param2);
                return ((com.google.android.gms.maps.model.Tile) ((xResult) == null ? null : (xResult.getGInstance())));
            }
        };
    }
    
    default com.huawei.hms.maps.model.TileProvider getHInstanceTileProvider() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.maps.model.TileProvider) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.maps.model.TileProvider() {
            
            public com.huawei.hms.maps.model.Tile getTile(int param0, int param1, int param2) {
                org.xms.g.maps.model.Tile xResult = org.xms.g.maps.model.TileProvider.this.getTile(param0, param1, param2);
                return ((com.huawei.hms.maps.model.Tile) ((xResult) == null ? null : (xResult.getHInstance())));
            }
        };
    }
    
    public static org.xms.g.maps.model.TileProvider dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.maps.model.TileProvider) {
            return ((org.xms.g.maps.model.TileProvider) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.maps.model.TileProvider gReturn = ((com.google.android.gms.maps.model.TileProvider) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.maps.model.TileProvider hReturn = ((com.huawei.hms.maps.model.TileProvider) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.maps.model.TileProvider.XImpl(gReturn, hReturn);
        }
        return ((org.xms.g.maps.model.TileProvider) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.TileProvider;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.TileProvider;
            }
        }
        return param0 instanceof org.xms.g.maps.model.TileProvider;
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.model.TileProvider {
        
        public XImpl(com.google.android.gms.maps.model.TileProvider param0, com.huawei.hms.maps.model.TileProvider param1) {
            super(param0, param1);
        }
        
        public org.xms.g.maps.model.Tile getTile(int param0, int param1, int param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileProvider) this.getHInstance()).getTile(param0, param1, param2)");
                com.huawei.hms.maps.model.Tile hReturn = ((com.huawei.hms.maps.model.TileProvider) this.getHInstance()).getTile(param0, param1, param2);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.Tile(null, hReturn)));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileProvider) this.getGInstance()).getTile(param0, param1, param2)");
                com.google.android.gms.maps.model.Tile gReturn = ((com.google.android.gms.maps.model.TileProvider) this.getGInstance()).getTile(param0, param1, param2);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.Tile(gReturn, null)));
            }
        }
    }
}