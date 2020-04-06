package org.xms.g.common;

public final class ConnectionResult extends org.xms.g.utils.XObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {
        
        public org.xms.g.common.ConnectionResult createFromParcel(android.os.Parcel param0) {
            com.google.android.gms.common.ConnectionResult gReturn = null;
            com.huawei.hms.api.ConnectionResult hReturn = null;
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                hReturn = com.huawei.hms.api.ConnectionResult.CREATOR.createFromParcel(param0);
            } else {
                gReturn = com.google.android.gms.common.ConnectionResult.CREATOR.createFromParcel(param0);
            }
            return new org.xms.g.common.ConnectionResult(gReturn, hReturn);
        }
        
        public org.xms.g.common.ConnectionResult[] newArray(int param0) {
            return new org.xms.g.common.ConnectionResult[param0];
        }
    };
    
    public ConnectionResult(com.google.android.gms.common.ConnectionResult param0, com.huawei.hms.api.ConnectionResult param1) {
        super(param0, null);
        this.setHInstance(param1);
    }
    
    public ConnectionResult(int param0) {
        super(((com.google.android.gms.common.ConnectionResult) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.api.ConnectionResult(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.ConnectionResult(param0));
        }
    }
    
    public ConnectionResult(int param0, android.app.PendingIntent param1) {
        super(((com.google.android.gms.common.ConnectionResult) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.api.ConnectionResult(param0, param1));
        } else {
            this.setGInstance(new com.google.android.gms.common.ConnectionResult(param0, param1));
        }
    }
    
    public ConnectionResult(int param0, android.app.PendingIntent param1, java.lang.String param2) {
        super(((com.google.android.gms.common.ConnectionResult) null), null);
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.api.ConnectionResult(param0, param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.common.ConnectionResult(param0, param1, param2));
        }
    }
    
    public static int getAPI_UNAVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.API_UNAVAILABLE");
            return com.huawei.hms.api.ConnectionResult.API_UNAVAILABLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.API_UNAVAILABLE");
            return com.google.android.gms.common.ConnectionResult.API_UNAVAILABLE;
        }
    }
    
    public static int getCANCELED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.CANCELED");
            return com.huawei.hms.api.ConnectionResult.CANCELED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.CANCELED");
            return com.google.android.gms.common.ConnectionResult.CANCELED;
        }
    }
    
    public static int getDEVELOPER_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.DEVELOPER_ERROR");
            return com.huawei.hms.api.ConnectionResult.DEVELOPER_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.DEVELOPER_ERROR");
            return com.google.android.gms.common.ConnectionResult.DEVELOPER_ERROR;
        }
    }
    
    public static int getDRIVE_EXTERNAL_STORAGE_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED");
            return com.huawei.hms.api.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED");
            return com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        }
    }
    
    public static int getINTERNAL_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.INTERNAL_ERROR");
            return com.huawei.hms.api.ConnectionResult.INTERNAL_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.INTERNAL_ERROR");
            return com.google.android.gms.common.ConnectionResult.INTERNAL_ERROR;
        }
    }
    
    public static int getINTERRUPTED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.INTERRUPTED");
            return com.huawei.hms.api.ConnectionResult.INTERRUPTED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.INTERRUPTED");
            return com.google.android.gms.common.ConnectionResult.INTERRUPTED;
        }
    }
    
    public static int getINVALID_ACCOUNT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.INVALID_ACCOUNT");
            return com.huawei.hms.api.ConnectionResult.INVALID_ACCOUNT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.INVALID_ACCOUNT");
            return com.google.android.gms.common.ConnectionResult.INVALID_ACCOUNT;
        }
    }
    
    public static int getLICENSE_CHECK_FAILED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.LICENSE_CHECK_FAILED");
            return com.huawei.hms.api.ConnectionResult.LICENSE_CHECK_FAILED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.LICENSE_CHECK_FAILED");
            return com.google.android.gms.common.ConnectionResult.LICENSE_CHECK_FAILED;
        }
    }
    
    public static int getNETWORK_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.NETWORK_ERROR");
            return com.huawei.hms.api.ConnectionResult.NETWORK_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.NETWORK_ERROR");
            return com.google.android.gms.common.ConnectionResult.NETWORK_ERROR;
        }
    }
    
    public static int getRESOLUTION_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.RESOLUTION_REQUIRED");
            return com.huawei.hms.api.ConnectionResult.RESOLUTION_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.RESOLUTION_REQUIRED");
            return com.google.android.gms.common.ConnectionResult.RESOLUTION_REQUIRED;
        }
    }
    
    public static int getRESTRICTED_PROFILE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.RESTRICTED_PROFILE");
            return com.huawei.hms.api.ConnectionResult.RESTRICTED_PROFILE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.RESTRICTED_PROFILE");
            return com.google.android.gms.common.ConnectionResult.RESTRICTED_PROFILE;
        }
    }
    
    public static int getSERVICE_DISABLED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_DISABLED");
            return com.huawei.hms.api.ConnectionResult.SERVICE_DISABLED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_DISABLED");
            return com.google.android.gms.common.ConnectionResult.SERVICE_DISABLED;
        }
    }
    
    public static int getSERVICE_INVALID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_INVALID");
            return com.huawei.hms.api.ConnectionResult.SERVICE_INVALID;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_INVALID");
            return com.google.android.gms.common.ConnectionResult.SERVICE_INVALID;
        }
    }
    
    public static int getSERVICE_MISSING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_MISSING");
            return com.huawei.hms.api.ConnectionResult.SERVICE_MISSING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_MISSING");
            return com.google.android.gms.common.ConnectionResult.SERVICE_MISSING;
        }
    }
    
    public static int getSERVICE_MISSING_PERMISSION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION");
            return com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_MISSING_PERMISSION");
            return com.google.android.gms.common.ConnectionResult.SERVICE_MISSING_PERMISSION;
        }
    }
    
    public static int getSERVICE_UPDATING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_UPDATING");
            return com.huawei.hms.api.ConnectionResult.SERVICE_UPDATING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_UPDATING");
            return com.google.android.gms.common.ConnectionResult.SERVICE_UPDATING;
        }
    }
    
    public static int getSERVICE_VERSION_UPDATE_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED");
            return com.huawei.hms.api.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED");
            return com.google.android.gms.common.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED;
        }
    }
    
    public static int getSIGN_IN_FAILED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SIGN_IN_FAILED");
            return com.huawei.hms.api.ConnectionResult.SIGN_IN_FAILED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SIGN_IN_FAILED");
            return com.google.android.gms.common.ConnectionResult.SIGN_IN_FAILED;
        }
    }
    
    public static int getSIGN_IN_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SIGN_IN_REQUIRED");
            return com.huawei.hms.api.ConnectionResult.SIGN_IN_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SIGN_IN_REQUIRED");
            return com.google.android.gms.common.ConnectionResult.SIGN_IN_REQUIRED;
        }
    }
    
    public static int getSUCCESS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SUCCESS");
            return com.huawei.hms.api.ConnectionResult.SUCCESS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SUCCESS");
            return com.google.android.gms.common.ConnectionResult.SUCCESS;
        }
    }
    
    public static int getTIMEOUT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.TIMEOUT");
            return com.huawei.hms.api.ConnectionResult.TIMEOUT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.TIMEOUT");
            return com.google.android.gms.common.ConnectionResult.TIMEOUT;
        }
    }
    
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).equals(param0);
        }
    }
    
    public final int getErrorCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getErrorCode()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getErrorCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getErrorCode()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getErrorCode();
        }
    }
    
    public final java.lang.String getErrorMessage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getErrorMessage()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getErrorMessage();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getErrorMessage()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getErrorMessage();
        }
    }
    
    public final android.app.PendingIntent getResolution() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getResolution()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getResolution();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getResolution()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getResolution();
        }
    }
    
    public final boolean hasResolution() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).hasResolution()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).hasResolution();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).hasResolution()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).hasResolution();
        }
    }
    
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).hashCode();
        }
    }
    
    public final boolean isSuccess() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).isSuccess()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).isSuccess();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).isSuccess()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).isSuccess();
        }
    }
    
    public void startResolutionForResult(android.app.Activity param0, int param1) throws android.content.IntentSender.SendIntentException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).startResolutionForResult(param0, param1)");
            ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).startResolutionForResult(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).startResolutionForResult(param0, param1)");
            ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).startResolutionForResult(param0, param1);
        }
    }
    
    public final java.lang.String toString() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
    
    public static org.xms.g.common.ConnectionResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ConnectionResult) param0);
    }
    
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.ConnectionResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.ConnectionResult;
        }
    }
}