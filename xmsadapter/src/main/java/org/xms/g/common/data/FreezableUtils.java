package org.xms.g.common.data;

public final class FreezableUtils extends org.xms.g.utils.XObject {
    
    public FreezableUtils(com.google.android.gms.common.data.FreezableUtils param0, com.huawei.hms.common.data.FreezableUtils param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public FreezableUtils() {
        super(((com.google.android.gms.common.data.FreezableUtils) null), null);
    }
    
    public static <XT, XE extends org.xms.g.common.data.Freezable<XT>> java.util.ArrayList<XT> freeze(XE[] param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.FreezableUtils.freeze(org.xms.g.utils.Utils.mapArray2GH(param0, com.huawei.hms.common.data.Freezable.class, true))");
            java.util.ArrayList hReturn = com.huawei.hms.common.data.FreezableUtils.freeze(org.xms.g.utils.Utils.mapArray2GH(param0, com.huawei.hms.common.data.Freezable.class, true));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.FreezableUtils.freeze(org.xms.g.utils.Utils.mapArray2GH(param0, com.google.android.gms.common.data.Freezable.class, false))");
            java.util.ArrayList gReturn = com.google.android.gms.common.data.FreezableUtils.freeze(org.xms.g.utils.Utils.mapArray2GH(param0, com.google.android.gms.common.data.Freezable.class, false));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }
    
    public static <XT, XE extends org.xms.g.common.data.Freezable<XT>> java.util.ArrayList<XT> freeze(java.util.ArrayList<XE> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.FreezableUtils.freeze(((java.util.ArrayList) org.xms.g.utils.Utils.mapList2GH(param0, true)))");
            java.util.ArrayList hReturn = com.huawei.hms.common.data.FreezableUtils.freeze(((java.util.ArrayList) org.xms.g.utils.Utils.mapList2GH(param0, true)));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.FreezableUtils.freeze(((java.util.ArrayList) org.xms.g.utils.Utils.mapList2GH(param0, false)))");
            java.util.ArrayList gReturn = com.google.android.gms.common.data.FreezableUtils.freeze(((java.util.ArrayList) org.xms.g.utils.Utils.mapList2GH(param0, false)));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }
    
    public static <XT, XE extends org.xms.g.common.data.Freezable<XT>> java.util.ArrayList<XT> freezeIterable(java.lang.Iterable<XE> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.FreezableUtils.freezeIterable(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)))");
            java.util.ArrayList hReturn = com.huawei.hms.common.data.FreezableUtils.freezeIterable(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.FreezableUtils.freezeIterable(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)))");
            java.util.ArrayList gReturn = com.google.android.gms.common.data.FreezableUtils.freezeIterable(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<Object, XT>() {
                
                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }
    
    public static org.xms.g.common.data.FreezableUtils dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.data.FreezableUtils) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.FreezableUtils;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.FreezableUtils;
        }
    }
}