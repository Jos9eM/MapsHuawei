package org.xms.g.common.images;

public final class Size extends org.xms.g.utils.XObject {
    
    public Size(com.google.android.gms.common.images.Size param0, com.huawei.hms.common.size.Size param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public Size(int param0, int param1) {
        super(((com.google.android.gms.common.images.Size) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.common.size.Size(param0, param1));
        } else {
            this.setGInstance(new com.google.android.gms.common.images.Size(param0, param1));
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.size.Size) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.common.size.Size) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.Size) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.images.Size) this.getGInstance()).equals(param0);
        }
    }
    
    public final int getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.size.Size) this.getHInstance()).getHeight()");
            return ((com.huawei.hms.common.size.Size) this.getHInstance()).getHeight();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.Size) this.getGInstance()).getHeight()");
            return ((com.google.android.gms.common.images.Size) this.getGInstance()).getHeight();
        }
    }
    
    public final int getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.size.Size) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.common.size.Size) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.Size) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.common.images.Size) this.getGInstance()).getWidth();
        }
    }
    
    public final int hashCode() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final org.xms.g.common.images.Size parseSize(java.lang.String param0) throws java.lang.NumberFormatException, java.lang.NullPointerException {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.size.Size) this.getHInstance()).toString()");
            return ((com.huawei.hms.common.size.Size) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.Size) this.getGInstance()).toString()");
            return ((com.google.android.gms.common.images.Size) this.getGInstance()).toString();
        }
    }
    
    public static org.xms.g.common.images.Size dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.images.Size) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.size.Size;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.images.Size;
        }
    }
}