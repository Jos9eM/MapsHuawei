package org.xms.g.maps.model;

public final class Tile extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.maps.model.Tile createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.maps.model.Tile gReturn = null;
            com.huawei.hms.maps.model.Tile hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.maps.model.Tile.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.maps.model.Tile.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.maps.model.Tile(gReturn, hReturn);
        }
        
        public org.xms.g.maps.model.Tile[] newArray(int param0) {
            return new org.xms.g.maps.model.Tile[param0];
        }
    };
    
    public Tile(com.google.android.gms.maps.model.Tile param0, com.huawei.hms.maps.model.Tile param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public Tile(int param0, int param1, byte[] param2) {
        super(((com.google.android.gms.maps.model.Tile) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.Tile(param0, param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.Tile(param0, param1, param2));
        }
    }
    
    public byte[] getData() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Tile) this.getHInstance()).data");
            return ((com.huawei.hms.maps.model.Tile) this.getHInstance()).data;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Tile) this.getGInstance()).data");
            return ((com.google.android.gms.maps.model.Tile) this.getGInstance()).data;
        }
    }
    
    public int getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Tile) this.getHInstance()).height");
            return ((com.huawei.hms.maps.model.Tile) this.getHInstance()).height;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Tile) this.getGInstance()).height");
            return ((com.google.android.gms.maps.model.Tile) this.getGInstance()).height;
        }
    }
    
    public int getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Tile) this.getHInstance()).width");
            return ((com.huawei.hms.maps.model.Tile) this.getHInstance()).width;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Tile) this.getGInstance()).width");
            return ((com.google.android.gms.maps.model.Tile) this.getGInstance()).width;
        }
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Tile) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.Tile) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Tile) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.Tile) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.maps.model.Tile dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Tile) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Tile;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Tile;
        }
    }
}