# This document provides brief instructions for app developers.
# More information can be obtained from the following URL: https://developer.huawei.com/consumer/en/doc/development/Tools-Guides/90419706
# Please read the "*" sections to apply our module.

Content:
1. Overview
2. Dependency *
3. AndroidManifest *
4. How to use *

1. Overview
Convertor is a code conversion tool supporting Java and Kotlin projects. It helps developers to automatically convert GMS APIs called by apps into corresponding HMS APIs, implementing quick conversion and HMS integration.
Convertor tool generates code in a separate module (named as xmsadapter) and provides it as a separate Android Library.
In order to ensure the normal use of the module, it is strongly recommended not to modify the generated convertor code.

2. Dependency
The following kit is identified as being used in your code:
Kit Name            Dependencies
Map                 com.google.android.gms:play-services-base:17.1.0
                    com.google.android.gms:play-services-maps:17.0.0
                    com.google.android.gms:play-services-basement:17.1.0
                    com.huawei.hms:maps:4.0.0.301
                    com.google.android.gms:play-services-location:17.0.0
                    com.huawei.hms:location:4.0.2.300
                    com.huawei.hms:base:4.0.2.300
                    com.google.android.material:material:1.0.0-rc01
The generated convertor code are written into PROJECT_PATH/xmsadapter/src/main/java, and we have added these dependencies to the build.gradle of xmsadapter module(only for compile).

3. AndroidManifest
Please add permissions into "AndroidManifest.xml" of your own module instead of the xmsadapter module!
For example, if you use "Account" kit, you have to add '<users-permission android:name="android.permission.MANAGE_ACCOUNTS">'. Otherwise, it will generate "Missing permissions..." error when compiling.
More information about permission you can refer to this URL: https://developer.android.com/reference/android/Manifest.permission.
NOTICE: If you want to build xmsadapter module itself instead of the whole project, you may need copy permissions into "AndroidManifest.xml" of xmsadapter module.
Because our convertor code requires these permissions when compiling separately.

4. How to use a separate module
Step 1: Please add "implementation project (path: ':xmsadapter')" into the dependency part of build.gradle file of the other module that depends on the convertor code.
Step 2: Add ‘xmsadapter’ to the settings.gradle file.
Step 3(Optional): Remove GMS related dependencies in your original build.gradle file, because we have added them in "xmsadapter" module.
Notice:
If you need more services(kits) and want to generate the corresponding convertor code, please refer the following tips:
Choice 1: Please add the dependencies of new kit into build.gradle file of xmsadapter, and start a new conversion.
Choice 2: Add the dependencies of new kit into build.gradle file of your own project;
After rescanning with our plugin(start a new conversion), copy the newly generated dependencies to build.gradle of xmsadapter. Because the newly generated code will depend on the new kit dependencies.

