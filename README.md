<div align="center">

# GateWay APK
<p>A basic Android app template for user login and signup with OTP verification</p>
<img src="https://github.com/user-attachments/assets/6761f331-e132-4ddf-b174-f8ee9759aa49" height="500" width="230" />&nbsp;&nbsp;
<img src="https://github.com/user-attachments/assets/0be1e093-831f-4359-94a7-7f4605606293" height="500" width="230" />&nbsp;&nbsp;
<img src="https://github.com/user-attachments/assets/7431ec05-008a-4ff6-99f1-0351c83dd3d1" height="500" width="230" /></div>

## Common Errors and Solutions
### 1. Error: `SDK location not found`
<p>This errors occurs if the SDK path is not correctly set, or if the Android SDK is not installed.</p>

- Update the `sdk.dir` path in the `local.properties` file to the correct SDK location. You can verify the SDK path from Android Studio:
<img width="504" alt="sdk" src="https://github.com/user-attachments/assets/c8df6c3e-dffb-4e4a-9cca-85b158ce9a17">

- Go to Android Studio > Preferences > Appearance & Behavior > System Settings > Android SDK.
- Copy the SDK location shown in the SDK Manager.
<img width="504" alt="sdk2" src="https://github.com/user-attachments/assets/36c03517-4fa5-4d83-b5ca-b680caa20bf2">

### 2. Error: `Could not find local.properties`
<p>This error happens if the local.properties file is missing in the project root directory.</p>

- Create a new `local.properties` file in the root of your project if it doesn't exist.
- Add the correct `sdk.dir` path in the file.
