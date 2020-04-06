package org.xms.g.location;

public interface LocationListener extends org.xms.g.utils.XInterface {
    
    public void onLocationChanged(android.location.Location param0);
    
    default com.google.android.gms.location.LocationListener getGInstanceLocationListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    default java.lang.Object getHInstanceLocationListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.location.LocationListener dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.LocationListener {
        
        public XImpl(com.google.android.gms.location.LocationListener param0, java.lang.Object param1) {
            super(param0, param1);
        }
        
        public void onLocationChanged(android.location.Location param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}