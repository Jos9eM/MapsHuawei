package org.xms.g.maps;

public final class ExtensionMap extends org.xms.g.utils.XObject {
    
    public ExtensionMap(com.google.android.gms.maps.GoogleMap param0, com.huawei.hms.maps.HuaweiMap param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public static int getMAP_TYPE_HYBRID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_HYBRID");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_HYBRID;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID;
        }
    }
    
    public static int getMAP_TYPE_NONE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NONE");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NONE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_NONE");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_NONE;
        }
    }
    
    public static int getMAP_TYPE_NORMAL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NORMAL");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NORMAL;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_NORMAL");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_NORMAL;
        }
    }
    
    public static int getMAP_TYPE_SATELLITE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_SATELLITE");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_SATELLITE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE;
        }
    }
    
    public static int getMAP_TYPE_TERRAIN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_TERRAIN");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_TERRAIN;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_TERRAIN");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_TERRAIN;
        }
    }
    
    public final org.xms.g.maps.model.Circle addCircle(org.xms.g.maps.model.CircleOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addCircle(((com.huawei.hms.maps.model.CircleOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.Circle hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addCircle(((com.huawei.hms.maps.model.CircleOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Circle(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addCircle(((com.google.android.gms.maps.model.CircleOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.Circle gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addCircle(((com.google.android.gms.maps.model.CircleOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Circle(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.GroundOverlay addGroundOverlay(org.xms.g.maps.model.GroundOverlayOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addGroundOverlay(((com.huawei.hms.maps.model.GroundOverlayOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.GroundOverlay hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addGroundOverlay(((com.huawei.hms.maps.model.GroundOverlayOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlay(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addGroundOverlay(((com.google.android.gms.maps.model.GroundOverlayOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.GroundOverlay gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addGroundOverlay(((com.google.android.gms.maps.model.GroundOverlayOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlay(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.Marker addMarker(org.xms.g.maps.model.MarkerOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addMarker(((com.huawei.hms.maps.model.MarkerOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.Marker hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addMarker(((com.huawei.hms.maps.model.MarkerOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Marker(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addMarker(((com.google.android.gms.maps.model.MarkerOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.Marker gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addMarker(((com.google.android.gms.maps.model.MarkerOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Marker(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.Polygon addPolygon(org.xms.g.maps.model.PolygonOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addPolygon(((com.huawei.hms.maps.model.PolygonOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.Polygon hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addPolygon(((com.huawei.hms.maps.model.PolygonOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Polygon(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addPolygon(((com.google.android.gms.maps.model.PolygonOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.Polygon gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addPolygon(((com.google.android.gms.maps.model.PolygonOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Polygon(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.Polyline addPolyline(org.xms.g.maps.model.PolylineOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addPolyline(((com.huawei.hms.maps.model.PolylineOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.Polyline hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addPolyline(((com.huawei.hms.maps.model.PolylineOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Polyline(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addPolyline(((com.google.android.gms.maps.model.PolylineOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.Polyline gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addPolyline(((com.google.android.gms.maps.model.PolylineOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Polyline(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.TileOverlay addTileOverlay(org.xms.g.maps.model.TileOverlayOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addTileOverlay(((com.huawei.hms.maps.model.TileOverlayOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.TileOverlay hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addTileOverlay(((com.huawei.hms.maps.model.TileOverlayOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlay(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addTileOverlay(((com.google.android.gms.maps.model.TileOverlayOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.TileOverlay gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addTileOverlay(((com.google.android.gms.maps.model.TileOverlayOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlay(gReturn, null)));
        }
    }
    
    public final void animateCamera(org.xms.g.maps.CameraUpdate param0, org.xms.g.maps.ExtensionMap.CancelableCallback param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))), ((param1) == null ? null : (param1.getHInstanceCancelableCallback())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))), ((param1) == null ? null : (param1.getHInstanceCancelableCallback())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))), ((param1) == null ? null : (param1.getGInstanceCancelableCallback())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))), ((param1) == null ? null : (param1.getGInstanceCancelableCallback())));
        }
    }
    
    public final void animateCamera(org.xms.g.maps.CameraUpdate param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void animateCamera(org.xms.g.maps.CameraUpdate param0, int param1, org.xms.g.maps.ExtensionMap.CancelableCallback param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))), param1, ((param2) == null ? null : (param2.getHInstanceCancelableCallback())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))), param1, ((param2) == null ? null : (param2.getHInstanceCancelableCallback())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))), param1, ((param2) == null ? null : (param2.getGInstanceCancelableCallback())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))), param1, ((param2) == null ? null : (param2.getGInstanceCancelableCallback())));
        }
    }
    
    public final void clear() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).clear()");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).clear();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).clear()");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).clear();
        }
    }
    
    public final org.xms.g.maps.model.CameraPosition getCameraPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getCameraPosition()");
            com.huawei.hms.maps.model.CameraPosition hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getCameraPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getCameraPosition()");
            com.google.android.gms.maps.model.CameraPosition gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getCameraPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.model.IndoorBuilding getFocusedBuilding() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getFocusedBuilding()");
            com.huawei.hms.maps.model.IndoorBuilding hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getFocusedBuilding();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.IndoorBuilding(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getFocusedBuilding()");
            com.google.android.gms.maps.model.IndoorBuilding gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getFocusedBuilding();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.IndoorBuilding(gReturn, null)));
        }
    }
    
    public final int getMapType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMapType()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMapType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMapType()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMapType();
        }
    }
    
    public final float getMaxZoomLevel() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMaxZoomLevel()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMaxZoomLevel();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMaxZoomLevel()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMaxZoomLevel();
        }
    }
    
    public final float getMinZoomLevel() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMinZoomLevel()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMinZoomLevel();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMinZoomLevel()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMinZoomLevel();
        }
    }
    
    public final android.location.Location getMyLocation() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final org.xms.g.maps.Projection getProjection() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getProjection()");
            com.huawei.hms.maps.Projection hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getProjection();
            return ((hReturn) == null ? null : (new org.xms.g.maps.Projection(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getProjection()");
            com.google.android.gms.maps.Projection gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getProjection();
            return ((gReturn) == null ? null : (new org.xms.g.maps.Projection(gReturn, null)));
        }
    }
    
    public final org.xms.g.maps.UiSettings getUiSettings() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getUiSettings()");
            com.huawei.hms.maps.UiSettings hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getUiSettings();
            return ((hReturn) == null ? null : (new org.xms.g.maps.UiSettings(null, hReturn)));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getUiSettings()");
            com.google.android.gms.maps.UiSettings gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getUiSettings();
            return ((gReturn) == null ? null : (new org.xms.g.maps.UiSettings(gReturn, null)));
        }
    }
    
    public final boolean isBuildingsEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isBuildingsEnabled()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isBuildingsEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isBuildingsEnabled()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isBuildingsEnabled();
        }
    }
    
    public final boolean isIndoorEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isIndoorEnabled()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isIndoorEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isIndoorEnabled()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isIndoorEnabled();
        }
    }
    
    public final boolean isMyLocationEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isMyLocationEnabled()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isMyLocationEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isMyLocationEnabled()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isMyLocationEnabled();
        }
    }
    
    public final boolean isTrafficEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isTrafficEnabled()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isTrafficEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isTrafficEnabled()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isTrafficEnabled();
        }
    }
    
    public final void moveCamera(org.xms.g.maps.CameraUpdate param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).moveCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).moveCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).moveCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).moveCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void resetMinMaxZoomPreference() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).resetMinMaxZoomPreference()");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).resetMinMaxZoomPreference();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).resetMinMaxZoomPreference()");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).resetMinMaxZoomPreference();
        }
    }
    
    public final void setBuildingsEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setBuildingsEnabled(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setBuildingsEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setBuildingsEnabled(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setBuildingsEnabled(param0);
        }
    }
    
    public final void setContentDescription(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setContentDescription(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setContentDescription(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setContentDescription(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setContentDescription(param0);
        }
    }
    
    public final boolean setIndoorEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setIndoorEnabled(param0)");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setIndoorEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setIndoorEnabled(param0)");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setIndoorEnabled(param0);
        }
    }
    
    public final void setInfoWindowAdapter(org.xms.g.maps.ExtensionMap.InfoWindowAdapter param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setInfoWindowAdapter(((param0) == null ? null : (param0.getHInstanceInfoWindowAdapter())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setInfoWindowAdapter(((param0) == null ? null : (param0.getHInstanceInfoWindowAdapter())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setInfoWindowAdapter(((param0) == null ? null : (param0.getGInstanceInfoWindowAdapter())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setInfoWindowAdapter(((param0) == null ? null : (param0.getGInstanceInfoWindowAdapter())));
        }
    }
    
    public final void setLatLngBoundsForCameraTarget(org.xms.g.maps.model.LatLngBounds param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setLatLngBoundsForCameraTarget(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setLatLngBoundsForCameraTarget(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setLatLngBoundsForCameraTarget(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setLatLngBoundsForCameraTarget(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setLocationSource(org.xms.g.maps.LocationSource param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setLocationSource(((param0) == null ? null : (param0.getHInstanceLocationSource())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setLocationSource(((param0) == null ? null : (param0.getHInstanceLocationSource())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setLocationSource(((param0) == null ? null : (param0.getGInstanceLocationSource())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setLocationSource(((param0) == null ? null : (param0.getGInstanceLocationSource())));
        }
    }
    
    public final boolean setMapStyle(org.xms.g.maps.model.MapStyleOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMapStyle(((com.huawei.hms.maps.model.MapStyleOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMapStyle(((com.huawei.hms.maps.model.MapStyleOptions) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMapStyle(((com.google.android.gms.maps.model.MapStyleOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMapStyle(((com.google.android.gms.maps.model.MapStyleOptions) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
    
    public final void setMapType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMapType(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMapType(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMapType(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMapType(param0);
        }
    }
    
    public final void setMaxZoomPreference(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMaxZoomPreference(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMaxZoomPreference(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMaxZoomPreference(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMaxZoomPreference(param0);
        }
    }
    
    public final void setMinZoomPreference(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMinZoomPreference(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMinZoomPreference(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMinZoomPreference(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMinZoomPreference(param0);
        }
    }
    
    public final void setMyLocationEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMyLocationEnabled(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMyLocationEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMyLocationEnabled(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMyLocationEnabled(param0);
        }
    }
    
    public final void setOnCameraChangeListener(org.xms.g.maps.ExtensionMap.OnCameraChangeListener param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final void setOnCameraIdleListener(org.xms.g.maps.ExtensionMap.OnCameraIdleListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraIdleListener(((param0) == null ? null : (param0.getHInstanceOnCameraIdleListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraIdleListener(((param0) == null ? null : (param0.getHInstanceOnCameraIdleListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraIdleListener(((param0) == null ? null : (param0.getGInstanceOnCameraIdleListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraIdleListener(((param0) == null ? null : (param0.getGInstanceOnCameraIdleListener())));
        }
    }
    
    public final void setOnCameraMoveCanceledListener(org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveCanceledListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveCanceledListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveCanceledListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveCanceledListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveCanceledListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveCanceledListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveCanceledListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveCanceledListener())));
        }
    }
    
    public final void setOnCameraMoveListener(org.xms.g.maps.ExtensionMap.OnCameraMoveListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveListener())));
        }
    }
    
    public final void setOnCameraMoveStartedListener(org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveStartedListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveStartedListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveStartedListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveStartedListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveStartedListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveStartedListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveStartedListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveStartedListener())));
        }
    }
    
    public final void setOnCircleClickListener(org.xms.g.maps.ExtensionMap.OnCircleClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCircleClickListener(((param0) == null ? null : (param0.getHInstanceOnCircleClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCircleClickListener(((param0) == null ? null : (param0.getHInstanceOnCircleClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCircleClickListener(((param0) == null ? null : (param0.getGInstanceOnCircleClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCircleClickListener(((param0) == null ? null : (param0.getGInstanceOnCircleClickListener())));
        }
    }
    
    public final void setOnGroundOverlayClickListener(org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnGroundOverlayClickListener(((param0) == null ? null : (param0.getHInstanceOnGroundOverlayClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnGroundOverlayClickListener(((param0) == null ? null : (param0.getHInstanceOnGroundOverlayClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnGroundOverlayClickListener(((param0) == null ? null : (param0.getGInstanceOnGroundOverlayClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnGroundOverlayClickListener(((param0) == null ? null : (param0.getGInstanceOnGroundOverlayClickListener())));
        }
    }
    
    public final void setOnIndoorStateChangeListener(org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnIndoorStateChangeListener(((param0) == null ? null : (param0.getHInstanceOnIndoorStateChangeListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnIndoorStateChangeListener(((param0) == null ? null : (param0.getHInstanceOnIndoorStateChangeListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnIndoorStateChangeListener(((param0) == null ? null : (param0.getGInstanceOnIndoorStateChangeListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnIndoorStateChangeListener(((param0) == null ? null : (param0.getGInstanceOnIndoorStateChangeListener())));
        }
    }
    
    public final void setOnInfoWindowClickListener(org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowClickListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowClickListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowClickListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowClickListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowClickListener())));
        }
    }
    
    public final void setOnInfoWindowCloseListener(org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowCloseListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowCloseListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowCloseListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowCloseListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowCloseListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowCloseListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowCloseListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowCloseListener())));
        }
    }
    
    public final void setOnInfoWindowLongClickListener(org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowLongClickListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowLongClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowLongClickListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowLongClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowLongClickListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowLongClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowLongClickListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowLongClickListener())));
        }
    }
    
    public final void setOnMapClickListener(org.xms.g.maps.ExtensionMap.OnMapClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapClickListener(((param0) == null ? null : (param0.getHInstanceOnMapClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapClickListener(((param0) == null ? null : (param0.getHInstanceOnMapClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapClickListener(((param0) == null ? null : (param0.getGInstanceOnMapClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapClickListener(((param0) == null ? null : (param0.getGInstanceOnMapClickListener())));
        }
    }
    
    public final void setOnMapLoadedCallback(org.xms.g.maps.ExtensionMap.OnMapLoadedCallback param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapLoadedCallback(((param0) == null ? null : (param0.getHInstanceOnMapLoadedCallback())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapLoadedCallback(((param0) == null ? null : (param0.getHInstanceOnMapLoadedCallback())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapLoadedCallback(((param0) == null ? null : (param0.getGInstanceOnMapLoadedCallback())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapLoadedCallback(((param0) == null ? null : (param0.getGInstanceOnMapLoadedCallback())));
        }
    }
    
    public final void setOnMapLongClickListener(org.xms.g.maps.ExtensionMap.OnMapLongClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapLongClickListener(((param0) == null ? null : (param0.getHInstanceOnMapLongClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapLongClickListener(((param0) == null ? null : (param0.getHInstanceOnMapLongClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapLongClickListener(((param0) == null ? null : (param0.getGInstanceOnMapLongClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapLongClickListener(((param0) == null ? null : (param0.getGInstanceOnMapLongClickListener())));
        }
    }
    
    public final void setOnMarkerClickListener(org.xms.g.maps.ExtensionMap.OnMarkerClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMarkerClickListener(((param0) == null ? null : (param0.getHInstanceOnMarkerClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMarkerClickListener(((param0) == null ? null : (param0.getHInstanceOnMarkerClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMarkerClickListener(((param0) == null ? null : (param0.getGInstanceOnMarkerClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMarkerClickListener(((param0) == null ? null : (param0.getGInstanceOnMarkerClickListener())));
        }
    }
    
    public final void setOnMarkerDragListener(org.xms.g.maps.ExtensionMap.OnMarkerDragListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMarkerDragListener(((param0) == null ? null : (param0.getHInstanceOnMarkerDragListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMarkerDragListener(((param0) == null ? null : (param0.getHInstanceOnMarkerDragListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMarkerDragListener(((param0) == null ? null : (param0.getGInstanceOnMarkerDragListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMarkerDragListener(((param0) == null ? null : (param0.getGInstanceOnMarkerDragListener())));
        }
    }
    
    public final void setOnMyLocationButtonClickListener(org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMyLocationButtonClickListener(((param0) == null ? null : (param0.getHInstanceOnMyLocationButtonClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMyLocationButtonClickListener(((param0) == null ? null : (param0.getHInstanceOnMyLocationButtonClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMyLocationButtonClickListener(((param0) == null ? null : (param0.getGInstanceOnMyLocationButtonClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMyLocationButtonClickListener(((param0) == null ? null : (param0.getGInstanceOnMyLocationButtonClickListener())));
        }
    }
    
    public final void setOnMyLocationChangeListener(org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final void setOnMyLocationClickListener(org.xms.g.maps.ExtensionMap.OnMyLocationClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMyLocationClickListener(((param0) == null ? null : (param0.getHInstanceOnMyLocationClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMyLocationClickListener(((param0) == null ? null : (param0.getHInstanceOnMyLocationClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMyLocationClickListener(((param0) == null ? null : (param0.getGInstanceOnMyLocationClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMyLocationClickListener(((param0) == null ? null : (param0.getGInstanceOnMyLocationClickListener())));
        }
    }
    
    public final void setOnPoiClickListener(org.xms.g.maps.ExtensionMap.OnPoiClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPoiClickListener(((param0) == null ? null : (param0.getHInstanceOnPoiClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPoiClickListener(((param0) == null ? null : (param0.getHInstanceOnPoiClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPoiClickListener(((param0) == null ? null : (param0.getGInstanceOnPoiClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPoiClickListener(((param0) == null ? null : (param0.getGInstanceOnPoiClickListener())));
        }
    }
    
    public final void setOnPolygonClickListener(org.xms.g.maps.ExtensionMap.OnPolygonClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPolygonClickListener(((param0) == null ? null : (param0.getHInstanceOnPolygonClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPolygonClickListener(((param0) == null ? null : (param0.getHInstanceOnPolygonClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPolygonClickListener(((param0) == null ? null : (param0.getGInstanceOnPolygonClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPolygonClickListener(((param0) == null ? null : (param0.getGInstanceOnPolygonClickListener())));
        }
    }
    
    public final void setOnPolylineClickListener(org.xms.g.maps.ExtensionMap.OnPolylineClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPolylineClickListener(((param0) == null ? null : (param0.getHInstanceOnPolylineClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPolylineClickListener(((param0) == null ? null : (param0.getHInstanceOnPolylineClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPolylineClickListener(((param0) == null ? null : (param0.getGInstanceOnPolylineClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPolylineClickListener(((param0) == null ? null : (param0.getGInstanceOnPolylineClickListener())));
        }
    }
    
    public final void setPadding(int param0, int param1, int param2, int param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setPadding(param0, param1, param2, param3)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setPadding(param0, param1, param2, param3);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setPadding(param0, param1, param2, param3)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setPadding(param0, param1, param2, param3);
        }
    }
    
    public final void setTrafficEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setTrafficEnabled(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setTrafficEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setTrafficEnabled(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setTrafficEnabled(param0);
        }
    }
    
    public final void snapshot(org.xms.g.maps.ExtensionMap.SnapshotReadyCallback param0, android.graphics.Bitmap param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).snapshot(((param0) == null ? null : (param0.getHInstanceSnapshotReadyCallback())), param1)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).snapshot(((param0) == null ? null : (param0.getHInstanceSnapshotReadyCallback())), param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).snapshot(((param0) == null ? null : (param0.getGInstanceSnapshotReadyCallback())), param1)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).snapshot(((param0) == null ? null : (param0.getGInstanceSnapshotReadyCallback())), param1);
        }
    }
    
    public final void snapshot(org.xms.g.maps.ExtensionMap.SnapshotReadyCallback param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).snapshot(((param0) == null ? null : (param0.getHInstanceSnapshotReadyCallback())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).snapshot(((param0) == null ? null : (param0.getHInstanceSnapshotReadyCallback())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).snapshot(((param0) == null ? null : (param0.getGInstanceSnapshotReadyCallback())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).snapshot(((param0) == null ? null : (param0.getGInstanceSnapshotReadyCallback())));
        }
    }
    
    public final void stopAnimation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).stopAnimation()");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).stopAnimation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).stopAnimation()");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).stopAnimation();
        }
    }
    
    public static org.xms.g.maps.ExtensionMap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.ExtensionMap) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap;
        }
    }
    
    public static interface CancelableCallback extends org.xms.g.utils.XInterface {
        
        public void onCancel();
        
        public void onFinish();
        
        default com.google.android.gms.maps.GoogleMap.CancelableCallback getGInstanceCancelableCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.CancelableCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.CancelableCallback() {
                
                public void onCancel() {
                    org.xms.g.maps.ExtensionMap.CancelableCallback.this.onCancel();
                }
                
                public void onFinish() {
                    org.xms.g.maps.ExtensionMap.CancelableCallback.this.onFinish();
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.CancelableCallback getHInstanceCancelableCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.CancelableCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.CancelableCallback() {
                
                public void onCancel() {
                    org.xms.g.maps.ExtensionMap.CancelableCallback.this.onCancel();
                }
                
                public void onFinish() {
                    org.xms.g.maps.ExtensionMap.CancelableCallback.this.onFinish();
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.CancelableCallback dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.CancelableCallback) {
                return ((org.xms.g.maps.ExtensionMap.CancelableCallback) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.CancelableCallback gReturn = ((com.google.android.gms.maps.GoogleMap.CancelableCallback) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.CancelableCallback hReturn = ((com.huawei.hms.maps.HuaweiMap.CancelableCallback) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.CancelableCallback.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.CancelableCallback) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.CancelableCallback;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.CancelableCallback;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.CancelableCallback;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.CancelableCallback {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.CancelableCallback param0, com.huawei.hms.maps.HuaweiMap.CancelableCallback param1) {
                super(param0, param1);
            }
            
            public void onCancel() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.CancelableCallback) this.getHInstance()).onCancel()");
                    ((com.huawei.hms.maps.HuaweiMap.CancelableCallback) this.getHInstance()).onCancel();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.CancelableCallback) this.getGInstance()).onCancel()");
                    ((com.google.android.gms.maps.GoogleMap.CancelableCallback) this.getGInstance()).onCancel();
                }
            }
            
            public void onFinish() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.CancelableCallback) this.getHInstance()).onFinish()");
                    ((com.huawei.hms.maps.HuaweiMap.CancelableCallback) this.getHInstance()).onFinish();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.CancelableCallback) this.getGInstance()).onFinish()");
                    ((com.google.android.gms.maps.GoogleMap.CancelableCallback) this.getGInstance()).onFinish();
                }
            }
        }
    }
    
    public static interface InfoWindowAdapter extends org.xms.g.utils.XInterface {
        
        public android.view.View getInfoContents(org.xms.g.maps.model.Marker param0);
        
        public android.view.View getInfoWindow(org.xms.g.maps.model.Marker param0);
        
        default com.google.android.gms.maps.GoogleMap.InfoWindowAdapter getGInstanceInfoWindowAdapter() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.InfoWindowAdapter() {
                
                public android.view.View getInfoContents(com.google.android.gms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.InfoWindowAdapter.this.getInfoContents(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
                
                public android.view.View getInfoWindow(com.google.android.gms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.InfoWindowAdapter.this.getInfoWindow(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter getHInstanceInfoWindowAdapter() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter() {
                
                public android.view.View getInfoContents(com.huawei.hms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.InfoWindowAdapter.this.getInfoContents(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
                
                public android.view.View getInfoWindow(com.huawei.hms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.InfoWindowAdapter.this.getInfoWindow(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.InfoWindowAdapter dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.InfoWindowAdapter) {
                return ((org.xms.g.maps.ExtensionMap.InfoWindowAdapter) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.InfoWindowAdapter gReturn = ((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter hReturn = ((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.InfoWindowAdapter.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.InfoWindowAdapter) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.InfoWindowAdapter;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.InfoWindowAdapter {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.InfoWindowAdapter param0, com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter param1) {
                super(param0, param1);
            }
            
            public android.view.View getInfoContents(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) this.getHInstance()).getInfoContents(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    return ((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) this.getHInstance()).getInfoContents(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) this.getGInstance()).getInfoContents(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    return ((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) this.getGInstance()).getInfoContents(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
            
            public android.view.View getInfoWindow(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) this.getHInstance()).getInfoWindow(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    return ((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) this.getHInstance()).getInfoWindow(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) this.getGInstance()).getInfoWindow(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    return ((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) this.getGInstance()).getInfoWindow(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnCameraChangeListener extends org.xms.g.utils.XInterface {
        
        public void onCameraChange(org.xms.g.maps.model.CameraPosition param0);
        
        default com.google.android.gms.maps.GoogleMap.OnCameraChangeListener getGInstanceOnCameraChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        default java.lang.Object getHInstanceOnCameraChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.g.maps.ExtensionMap.OnCameraChangeListener dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraChangeListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnCameraChangeListener param0, java.lang.Object param1) {
                super(param0, param1);
            }
            
            public void onCameraChange(org.xms.g.maps.model.CameraPosition param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
    
    public static interface OnCameraIdleListener extends org.xms.g.utils.XInterface {
        
        public void onCameraIdle();
        
        default com.google.android.gms.maps.GoogleMap.OnCameraIdleListener getGInstanceOnCameraIdleListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCameraIdleListener() {
                
                public void onCameraIdle() {
                    org.xms.g.maps.ExtensionMap.OnCameraIdleListener.this.onCameraIdle();
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener getHInstanceOnCameraIdleListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener() {
                
                public void onCameraIdle() {
                    org.xms.g.maps.ExtensionMap.OnCameraIdleListener.this.onCameraIdle();
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnCameraIdleListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraIdleListener) {
                return ((org.xms.g.maps.ExtensionMap.OnCameraIdleListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnCameraIdleListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnCameraIdleListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnCameraIdleListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCameraIdleListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraIdleListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraIdleListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnCameraIdleListener param0, com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener param1) {
                super(param0, param1);
            }
            
            public void onCameraIdle() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener) this.getHInstance()).onCameraIdle()");
                    ((com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener) this.getHInstance()).onCameraIdle();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) this.getGInstance()).onCameraIdle()");
                    ((com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) this.getGInstance()).onCameraIdle();
                }
            }
        }
    }
    
    public static interface OnCameraMoveCanceledListener extends org.xms.g.utils.XInterface {
        
        public void onCameraMoveCanceled();
        
        default com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener getGInstanceOnCameraMoveCanceledListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener() {
                
                public void onCameraMoveCanceled() {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.this.onCameraMoveCanceled();
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener getHInstanceOnCameraMoveCanceledListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener() {
                
                public void onCameraMoveCanceled() {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.this.onCameraMoveCanceled();
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener) {
                return ((org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener param0, com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener param1) {
                super(param0, param1);
            }
            
            public void onCameraMoveCanceled() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener) this.getHInstance()).onCameraMoveCanceled()");
                    ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener) this.getHInstance()).onCameraMoveCanceled();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener) this.getGInstance()).onCameraMoveCanceled()");
                    ((com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener) this.getGInstance()).onCameraMoveCanceled();
                }
            }
        }
    }
    
    public static interface OnCameraMoveListener extends org.xms.g.utils.XInterface {
        
        public void onCameraMove();
        
        default com.google.android.gms.maps.GoogleMap.OnCameraMoveListener getGInstanceOnCameraMoveListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCameraMoveListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCameraMoveListener() {
                
                public void onCameraMove() {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveListener.this.onCameraMove();
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener getHInstanceOnCameraMoveListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener() {
                
                public void onCameraMove() {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveListener.this.onCameraMove();
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnCameraMoveListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveListener) {
                return ((org.xms.g.maps.ExtensionMap.OnCameraMoveListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnCameraMoveListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnCameraMoveListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnCameraMoveListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnCameraMoveListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCameraMoveListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraMoveListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnCameraMoveListener param0, com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener param1) {
                super(param0, param1);
            }
            
            public void onCameraMove() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener) this.getHInstance()).onCameraMove()");
                    ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener) this.getHInstance()).onCameraMove();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCameraMoveListener) this.getGInstance()).onCameraMove()");
                    ((com.google.android.gms.maps.GoogleMap.OnCameraMoveListener) this.getGInstance()).onCameraMove();
                }
            }
        }
    }
    
    public static interface OnCameraMoveStartedListener extends org.xms.g.utils.XInterface {
        
        public static int getREASON_API_ANIMATION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_API_ANIMATION");
                return com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_API_ANIMATION;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_API_ANIMATION");
                return com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_API_ANIMATION;
            }
        }
        
        public static int getREASON_DEVELOPER_ANIMATION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION");
                return com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION");
                return com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION;
            }
        }
        
        public static int getREASON_GESTURE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_GESTURE");
                return com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_GESTURE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_GESTURE");
                return com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_GESTURE;
            }
        }
        
        public void onCameraMoveStarted(int param0);
        
        default com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener getGInstanceOnCameraMoveStartedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener() {
                
                public void onCameraMoveStarted(int param0) {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.this.onCameraMoveStarted(param0);
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener getHInstanceOnCameraMoveStartedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener() {
                
                public void onCameraMoveStarted(int param0) {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.this.onCameraMoveStarted(param0);
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener) {
                return ((org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener param0, com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener param1) {
                super(param0, param1);
            }
            
            public void onCameraMoveStarted(int param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener) this.getHInstance()).onCameraMoveStarted(param0)");
                    ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener) this.getHInstance()).onCameraMoveStarted(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener) this.getGInstance()).onCameraMoveStarted(param0)");
                    ((com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener) this.getGInstance()).onCameraMoveStarted(param0);
                }
            }
        }
    }
    
    public static interface OnCircleClickListener extends org.xms.g.utils.XInterface {
        
        public void onCircleClick(org.xms.g.maps.model.Circle param0);
        
        default com.google.android.gms.maps.GoogleMap.OnCircleClickListener getGInstanceOnCircleClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCircleClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCircleClickListener() {
                
                public void onCircleClick(com.google.android.gms.maps.model.Circle param0) {
                    org.xms.g.maps.ExtensionMap.OnCircleClickListener.this.onCircleClick(((param0) == null ? null : (new org.xms.g.maps.model.Circle(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnCircleClickListener getHInstanceOnCircleClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCircleClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCircleClickListener() {
                
                public void onCircleClick(com.huawei.hms.maps.model.Circle param0) {
                    org.xms.g.maps.ExtensionMap.OnCircleClickListener.this.onCircleClick(((param0) == null ? null : (new org.xms.g.maps.model.Circle(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnCircleClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnCircleClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnCircleClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnCircleClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnCircleClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnCircleClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnCircleClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnCircleClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnCircleClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCircleClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCircleClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCircleClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCircleClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnCircleClickListener param0, com.huawei.hms.maps.HuaweiMap.OnCircleClickListener param1) {
                super(param0, param1);
            }
            
            public void onCircleClick(org.xms.g.maps.model.Circle param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCircleClickListener) this.getHInstance()).onCircleClick(((com.huawei.hms.maps.model.Circle) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnCircleClickListener) this.getHInstance()).onCircleClick(((com.huawei.hms.maps.model.Circle) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCircleClickListener) this.getGInstance()).onCircleClick(((com.google.android.gms.maps.model.Circle) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnCircleClickListener) this.getGInstance()).onCircleClick(((com.google.android.gms.maps.model.Circle) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnGroundOverlayClickListener extends org.xms.g.utils.XInterface {
        
        public void onGroundOverlayClick(org.xms.g.maps.model.GroundOverlay param0);
        
        default com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener getGInstanceOnGroundOverlayClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener() {
                
                public void onGroundOverlayClick(com.google.android.gms.maps.model.GroundOverlay param0) {
                    org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.this.onGroundOverlayClick(((param0) == null ? null : (new org.xms.g.maps.model.GroundOverlay(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener getHInstanceOnGroundOverlayClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener() {
                
                public void onGroundOverlayClick(com.huawei.hms.maps.model.GroundOverlay param0) {
                    org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.this.onGroundOverlayClick(((param0) == null ? null : (new org.xms.g.maps.model.GroundOverlay(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener param0, com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener param1) {
                super(param0, param1);
            }
            
            public void onGroundOverlayClick(org.xms.g.maps.model.GroundOverlay param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener) this.getHInstance()).onGroundOverlayClick(((com.huawei.hms.maps.model.GroundOverlay) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener) this.getHInstance()).onGroundOverlayClick(((com.huawei.hms.maps.model.GroundOverlay) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener) this.getGInstance()).onGroundOverlayClick(((com.google.android.gms.maps.model.GroundOverlay) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener) this.getGInstance()).onGroundOverlayClick(((com.google.android.gms.maps.model.GroundOverlay) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnIndoorStateChangeListener extends org.xms.g.utils.XInterface {
        
        public void onIndoorBuildingFocused();
        
        public void onIndoorLevelActivated(org.xms.g.maps.model.IndoorBuilding param0);
        
        default com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener getGInstanceOnIndoorStateChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener() {
                
                public void onIndoorBuildingFocused() {
                    org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.this.onIndoorBuildingFocused();
                }
                
                public void onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding param0) {
                    org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.this.onIndoorLevelActivated(((param0) == null ? null : (new org.xms.g.maps.model.IndoorBuilding(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener getHInstanceOnIndoorStateChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener() {
                
                public void onIndoorBuildingFocused() {
                    org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.this.onIndoorBuildingFocused();
                }
                
                public void onIndoorLevelActivated(com.huawei.hms.maps.model.IndoorBuilding param0) {
                    org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.this.onIndoorLevelActivated(((param0) == null ? null : (new org.xms.g.maps.model.IndoorBuilding(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener) {
                return ((org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener param0, com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener param1) {
                super(param0, param1);
            }
            
            public void onIndoorBuildingFocused() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) this.getHInstance()).onIndoorBuildingFocused()");
                    ((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) this.getHInstance()).onIndoorBuildingFocused();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) this.getGInstance()).onIndoorBuildingFocused()");
                    ((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) this.getGInstance()).onIndoorBuildingFocused();
                }
            }
            
            public void onIndoorLevelActivated(org.xms.g.maps.model.IndoorBuilding param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) this.getHInstance()).onIndoorLevelActivated(((com.huawei.hms.maps.model.IndoorBuilding) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) this.getHInstance()).onIndoorLevelActivated(((com.huawei.hms.maps.model.IndoorBuilding) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) this.getGInstance()).onIndoorLevelActivated(((com.google.android.gms.maps.model.IndoorBuilding) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) this.getGInstance()).onIndoorLevelActivated(((com.google.android.gms.maps.model.IndoorBuilding) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnInfoWindowClickListener extends org.xms.g.utils.XInterface {
        
        public void onInfoWindowClick(org.xms.g.maps.model.Marker param0);
        
        default com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener getGInstanceOnInfoWindowClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() {
                
                public void onInfoWindowClick(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.this.onInfoWindowClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener getHInstanceOnInfoWindowClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener() {
                
                public void onInfoWindowClick(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.this.onInfoWindowClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener param0, com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener param1) {
                super(param0, param1);
            }
            
            public void onInfoWindowClick(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener) this.getHInstance()).onInfoWindowClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener) this.getHInstance()).onInfoWindowClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener) this.getGInstance()).onInfoWindowClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener) this.getGInstance()).onInfoWindowClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnInfoWindowCloseListener extends org.xms.g.utils.XInterface {
        
        public void onInfoWindowClose(org.xms.g.maps.model.Marker param0);
        
        default com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener getGInstanceOnInfoWindowCloseListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener() {
                
                public void onInfoWindowClose(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.this.onInfoWindowClose(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener getHInstanceOnInfoWindowCloseListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener() {
                
                public void onInfoWindowClose(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.this.onInfoWindowClose(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener) {
                return ((org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener param0, com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener param1) {
                super(param0, param1);
            }
            
            public void onInfoWindowClose(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener) this.getHInstance()).onInfoWindowClose(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener) this.getHInstance()).onInfoWindowClose(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener) this.getGInstance()).onInfoWindowClose(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener) this.getGInstance()).onInfoWindowClose(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnInfoWindowLongClickListener extends org.xms.g.utils.XInterface {
        
        public void onInfoWindowLongClick(org.xms.g.maps.model.Marker param0);
        
        default com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener getGInstanceOnInfoWindowLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener() {
                
                public void onInfoWindowLongClick(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.this.onInfoWindowLongClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener getHInstanceOnInfoWindowLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener() {
                
                public void onInfoWindowLongClick(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.this.onInfoWindowLongClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener param0, com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener param1) {
                super(param0, param1);
            }
            
            public void onInfoWindowLongClick(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener) this.getHInstance()).onInfoWindowLongClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener) this.getHInstance()).onInfoWindowLongClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener) this.getGInstance()).onInfoWindowLongClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener) this.getGInstance()).onInfoWindowLongClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnMapClickListener extends org.xms.g.utils.XInterface {
        
        public void onMapClick(org.xms.g.maps.model.LatLng param0);
        
        default com.google.android.gms.maps.GoogleMap.OnMapClickListener getGInstanceOnMapClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMapClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMapClickListener() {
                
                public void onMapClick(com.google.android.gms.maps.model.LatLng param0) {
                    org.xms.g.maps.ExtensionMap.OnMapClickListener.this.onMapClick(((param0) == null ? null : (new org.xms.g.maps.model.LatLng(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnMapClickListener getHInstanceOnMapClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMapClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMapClickListener() {
                
                public void onMapClick(com.huawei.hms.maps.model.LatLng param0) {
                    org.xms.g.maps.ExtensionMap.OnMapClickListener.this.onMapClick(((param0) == null ? null : (new org.xms.g.maps.model.LatLng(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnMapClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnMapClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnMapClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnMapClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnMapClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnMapClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnMapClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnMapClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnMapClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMapClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMapClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMapClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMapClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnMapClickListener param0, com.huawei.hms.maps.HuaweiMap.OnMapClickListener param1) {
                super(param0, param1);
            }
            
            public void onMapClick(org.xms.g.maps.model.LatLng param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMapClickListener) this.getHInstance()).onMapClick(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMapClickListener) this.getHInstance()).onMapClick(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMapClickListener) this.getGInstance()).onMapClick(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMapClickListener) this.getGInstance()).onMapClick(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnMapLoadedCallback extends org.xms.g.utils.XInterface {
        
        public void onMapLoaded();
        
        default com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback getGInstanceOnMapLoadedCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback() {
                
                public void onMapLoaded() {
                    org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.this.onMapLoaded();
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback getHInstanceOnMapLoadedCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback() {
                
                public void onMapLoaded() {
                    org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.this.onMapLoaded();
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnMapLoadedCallback dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnMapLoadedCallback) {
                return ((org.xms.g.maps.ExtensionMap.OnMapLoadedCallback) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback gReturn = ((com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback hReturn = ((com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnMapLoadedCallback) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMapLoadedCallback;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMapLoadedCallback {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback param0, com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback param1) {
                super(param0, param1);
            }
            
            public void onMapLoaded() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback) this.getHInstance()).onMapLoaded()");
                    ((com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback) this.getHInstance()).onMapLoaded();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) this.getGInstance()).onMapLoaded()");
                    ((com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) this.getGInstance()).onMapLoaded();
                }
            }
        }
    }
    
    public static interface OnMapLongClickListener extends org.xms.g.utils.XInterface {
        
        public void onMapLongClick(org.xms.g.maps.model.LatLng param0);
        
        default com.google.android.gms.maps.GoogleMap.OnMapLongClickListener getGInstanceOnMapLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMapLongClickListener() {
                
                public void onMapLongClick(com.google.android.gms.maps.model.LatLng param0) {
                    org.xms.g.maps.ExtensionMap.OnMapLongClickListener.this.onMapLongClick(((param0) == null ? null : (new org.xms.g.maps.model.LatLng(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener getHInstanceOnMapLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener() {
                
                public void onMapLongClick(com.huawei.hms.maps.model.LatLng param0) {
                    org.xms.g.maps.ExtensionMap.OnMapLongClickListener.this.onMapLongClick(((param0) == null ? null : (new org.xms.g.maps.model.LatLng(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnMapLongClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnMapLongClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnMapLongClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnMapLongClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnMapLongClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnMapLongClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMapLongClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMapLongClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnMapLongClickListener param0, com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener param1) {
                super(param0, param1);
            }
            
            public void onMapLongClick(org.xms.g.maps.model.LatLng param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener) this.getHInstance()).onMapLongClick(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener) this.getHInstance()).onMapLongClick(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) this.getGInstance()).onMapLongClick(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) this.getGInstance()).onMapLongClick(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnMarkerClickListener extends org.xms.g.utils.XInterface {
        
        public boolean onMarkerClick(org.xms.g.maps.model.Marker param0);
        
        default com.google.android.gms.maps.GoogleMap.OnMarkerClickListener getGInstanceOnMarkerClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMarkerClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() {
                
                public boolean onMarkerClick(com.google.android.gms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.OnMarkerClickListener.this.onMarkerClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener getHInstanceOnMarkerClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener() {
                
                public boolean onMarkerClick(com.huawei.hms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.OnMarkerClickListener.this.onMarkerClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnMarkerClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnMarkerClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnMarkerClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnMarkerClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnMarkerClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnMarkerClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnMarkerClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMarkerClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMarkerClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnMarkerClickListener param0, com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener param1) {
                super(param0, param1);
            }
            
            public boolean onMarkerClick(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener) this.getHInstance()).onMarkerClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    return ((com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener) this.getHInstance()).onMarkerClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMarkerClickListener) this.getGInstance()).onMarkerClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    return ((com.google.android.gms.maps.GoogleMap.OnMarkerClickListener) this.getGInstance()).onMarkerClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnMarkerDragListener extends org.xms.g.utils.XInterface {
        
        public void onMarkerDrag(org.xms.g.maps.model.Marker param0);
        
        public void onMarkerDragEnd(org.xms.g.maps.model.Marker param0);
        
        public void onMarkerDragStart(org.xms.g.maps.model.Marker param0);
        
        default com.google.android.gms.maps.GoogleMap.OnMarkerDragListener getGInstanceOnMarkerDragListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMarkerDragListener() {
                
                public void onMarkerDrag(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDrag(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
                
                public void onMarkerDragEnd(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDragEnd(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
                
                public void onMarkerDragStart(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDragStart(((param0) == null ? null : (new org.xms.g.maps.model.Marker(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener getHInstanceOnMarkerDragListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener() {
                
                public void onMarkerDrag(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDrag(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
                
                public void onMarkerDragEnd(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDragEnd(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
                
                public void onMarkerDragStart(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDragStart(((param0) == null ? null : (new org.xms.g.maps.model.Marker(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnMarkerDragListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnMarkerDragListener) {
                return ((org.xms.g.maps.ExtensionMap.OnMarkerDragListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnMarkerDragListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnMarkerDragListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnMarkerDragListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMarkerDragListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMarkerDragListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMarkerDragListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnMarkerDragListener param0, com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener param1) {
                super(param0, param1);
            }
            
            public void onMarkerDrag(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDrag(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDrag(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDrag(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDrag(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
            
            public void onMarkerDragEnd(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDragEnd(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDragEnd(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDragEnd(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDragEnd(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
            
            public void onMarkerDragStart(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDragStart(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDragStart(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDragStart(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDragStart(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnMyLocationButtonClickListener extends org.xms.g.utils.XInterface {
        
        public boolean onMyLocationButtonClick();
        
        default com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener getGInstanceOnMyLocationButtonClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener() {
                
                public boolean onMyLocationButtonClick() {
                    return org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.this.onMyLocationButtonClick();
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener getHInstanceOnMyLocationButtonClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener() {
                
                public boolean onMyLocationButtonClick() {
                    return org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.this.onMyLocationButtonClick();
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener param0, com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener param1) {
                super(param0, param1);
            }
            
            public boolean onMyLocationButtonClick() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener) this.getHInstance()).onMyLocationButtonClick()");
                    return ((com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener) this.getHInstance()).onMyLocationButtonClick();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) this.getGInstance()).onMyLocationButtonClick()");
                    return ((com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) this.getGInstance()).onMyLocationButtonClick();
                }
            }
        }
    }
    
    public static interface OnMyLocationChangeListener extends org.xms.g.utils.XInterface {
        
        public void onMyLocationChange(android.location.Location param0);
        
        default com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener getGInstanceOnMyLocationChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        default java.lang.Object getHInstanceOnMyLocationChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener param0, java.lang.Object param1) {
                super(param0, param1);
            }
            
            public void onMyLocationChange(android.location.Location param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
    
    public static interface OnMyLocationClickListener extends org.xms.g.utils.XInterface {
        
        public void onMyLocationClick(android.location.Location param0);
        
        default com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener getGInstanceOnMyLocationClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener() {
                
                public void onMyLocationClick(android.location.Location param0) {
                    org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.this.onMyLocationClick(param0);
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener getHInstanceOnMyLocationClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener() {
                
                public void onMyLocationClick(android.location.Location param0) {
                    org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.this.onMyLocationClick(param0);
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnMyLocationClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnMyLocationClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnMyLocationClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnMyLocationClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMyLocationClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMyLocationClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener param0, com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener param1) {
                super(param0, param1);
            }
            
            public void onMyLocationClick(android.location.Location param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener) this.getHInstance()).onMyLocationClick(param0)");
                    ((com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener) this.getHInstance()).onMyLocationClick(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener) this.getGInstance()).onMyLocationClick(param0)");
                    ((com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener) this.getGInstance()).onMyLocationClick(param0);
                }
            }
        }
    }
    
    public static interface OnPoiClickListener extends org.xms.g.utils.XInterface {
        
        public void onPoiClick(org.xms.g.maps.model.PointOfInterest param0);
        
        default com.google.android.gms.maps.GoogleMap.OnPoiClickListener getGInstanceOnPoiClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnPoiClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnPoiClickListener() {
                
                public void onPoiClick(com.google.android.gms.maps.model.PointOfInterest param0) {
                    org.xms.g.maps.ExtensionMap.OnPoiClickListener.this.onPoiClick(((param0) == null ? null : (new org.xms.g.maps.model.PointOfInterest(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnPoiClickListener getHInstanceOnPoiClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnPoiClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnPoiClickListener() {
                
                public void onPoiClick(com.huawei.hms.maps.model.PointOfInterest param0) {
                    org.xms.g.maps.ExtensionMap.OnPoiClickListener.this.onPoiClick(((param0) == null ? null : (new org.xms.g.maps.model.PointOfInterest(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnPoiClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnPoiClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnPoiClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnPoiClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnPoiClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnPoiClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnPoiClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnPoiClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnPoiClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnPoiClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnPoiClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnPoiClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnPoiClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnPoiClickListener param0, com.huawei.hms.maps.HuaweiMap.OnPoiClickListener param1) {
                super(param0, param1);
            }
            
            public void onPoiClick(org.xms.g.maps.model.PointOfInterest param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnPoiClickListener) this.getHInstance()).onPoiClick(((com.huawei.hms.maps.model.PointOfInterest) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnPoiClickListener) this.getHInstance()).onPoiClick(((com.huawei.hms.maps.model.PointOfInterest) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnPoiClickListener) this.getGInstance()).onPoiClick(((com.google.android.gms.maps.model.PointOfInterest) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnPoiClickListener) this.getGInstance()).onPoiClick(((com.google.android.gms.maps.model.PointOfInterest) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnPolygonClickListener extends org.xms.g.utils.XInterface {
        
        public void onPolygonClick(org.xms.g.maps.model.Polygon param0);
        
        default com.google.android.gms.maps.GoogleMap.OnPolygonClickListener getGInstanceOnPolygonClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnPolygonClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnPolygonClickListener() {
                
                public void onPolygonClick(com.google.android.gms.maps.model.Polygon param0) {
                    org.xms.g.maps.ExtensionMap.OnPolygonClickListener.this.onPolygonClick(((param0) == null ? null : (new org.xms.g.maps.model.Polygon(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener getHInstanceOnPolygonClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener() {
                
                public void onPolygonClick(com.huawei.hms.maps.model.Polygon param0) {
                    org.xms.g.maps.ExtensionMap.OnPolygonClickListener.this.onPolygonClick(((param0) == null ? null : (new org.xms.g.maps.model.Polygon(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnPolygonClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnPolygonClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnPolygonClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnPolygonClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnPolygonClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnPolygonClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnPolygonClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnPolygonClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnPolygonClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnPolygonClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnPolygonClickListener param0, com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener param1) {
                super(param0, param1);
            }
            
            public void onPolygonClick(org.xms.g.maps.model.Polygon param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener) this.getHInstance()).onPolygonClick(((com.huawei.hms.maps.model.Polygon) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener) this.getHInstance()).onPolygonClick(((com.huawei.hms.maps.model.Polygon) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnPolygonClickListener) this.getGInstance()).onPolygonClick(((com.google.android.gms.maps.model.Polygon) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnPolygonClickListener) this.getGInstance()).onPolygonClick(((com.google.android.gms.maps.model.Polygon) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface OnPolylineClickListener extends org.xms.g.utils.XInterface {
        
        public void onPolylineClick(org.xms.g.maps.model.Polyline param0);
        
        default com.google.android.gms.maps.GoogleMap.OnPolylineClickListener getGInstanceOnPolylineClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnPolylineClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnPolylineClickListener() {
                
                public void onPolylineClick(com.google.android.gms.maps.model.Polyline param0) {
                    org.xms.g.maps.ExtensionMap.OnPolylineClickListener.this.onPolylineClick(((param0) == null ? null : (new org.xms.g.maps.model.Polyline(param0, null))));
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener getHInstanceOnPolylineClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener() {
                
                public void onPolylineClick(com.huawei.hms.maps.model.Polyline param0) {
                    org.xms.g.maps.ExtensionMap.OnPolylineClickListener.this.onPolylineClick(((param0) == null ? null : (new org.xms.g.maps.model.Polyline(null, param0))));
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.OnPolylineClickListener dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.OnPolylineClickListener) {
                return ((org.xms.g.maps.ExtensionMap.OnPolylineClickListener) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.OnPolylineClickListener gReturn = ((com.google.android.gms.maps.GoogleMap.OnPolylineClickListener) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener hReturn = ((com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.OnPolylineClickListener.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.OnPolylineClickListener) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnPolylineClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnPolylineClickListener;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnPolylineClickListener {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.OnPolylineClickListener param0, com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener param1) {
                super(param0, param1);
            }
            
            public void onPolylineClick(org.xms.g.maps.model.Polyline param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener) this.getHInstance()).onPolylineClick(((com.huawei.hms.maps.model.Polyline) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener) this.getHInstance()).onPolylineClick(((com.huawei.hms.maps.model.Polyline) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnPolylineClickListener) this.getGInstance()).onPolylineClick(((com.google.android.gms.maps.model.Polyline) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnPolylineClickListener) this.getGInstance()).onPolylineClick(((com.google.android.gms.maps.model.Polyline) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
    
    public static interface SnapshotReadyCallback extends org.xms.g.utils.XInterface {
        
        public void onSnapshotReady(android.graphics.Bitmap param0);
        
        default com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback getGInstanceSnapshotReadyCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback() {
                
                public void onSnapshotReady(android.graphics.Bitmap param0) {
                    org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.this.onSnapshotReady(param0);
                }
            };
        }
        
        default com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback getHInstanceSnapshotReadyCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback() {
                
                public void onSnapshotReady(android.graphics.Bitmap param0) {
                    org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.this.onSnapshotReady(param0);
                }
            };
        }
        
        public static org.xms.g.maps.ExtensionMap.SnapshotReadyCallback dynamicCast(java.lang.Object param0) {
            if (param0 instanceof org.xms.g.maps.ExtensionMap.SnapshotReadyCallback) {
                return ((org.xms.g.maps.ExtensionMap.SnapshotReadyCallback) param0);
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback gReturn = ((com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback) ((org.xms.g.utils.XGettable) param0).getGInstance());
                com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback hReturn = ((com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback) ((org.xms.g.utils.XGettable) param0).getHInstance());
                return new org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.XImpl(gReturn, hReturn);
            }
            return ((org.xms.g.maps.ExtensionMap.SnapshotReadyCallback) param0);
        }
        
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.SnapshotReadyCallback;
        }
        
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.SnapshotReadyCallback {
            
            public XImpl(com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback param0, com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback param1) {
                super(param0, param1);
            }
            
            public void onSnapshotReady(android.graphics.Bitmap param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback) this.getHInstance()).onSnapshotReady(param0)");
                    ((com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback) this.getHInstance()).onSnapshotReady(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback) this.getGInstance()).onSnapshotReady(param0)");
                    ((com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback) this.getGInstance()).onSnapshotReady(param0);
                }
            }
        }
    }
}