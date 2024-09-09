<div align="center">

# GateWay APK
<p>A basic Android app template for user login and signup with OTP verification</p>
<img src="https://github.com/user-attachments/assets/670ea799-1bd3-4a8f-b36d-9493c9956a33" height="500" width="230" />
<img src="https://github.com/user-attachments/assets/8007bb35-c9ad-4d98-82ff-57fd643efb76" height="500" width="230" />
<img src="https://github.com/user-attachments/assets/c1daec0d-9c67-4ecf-aa89-3f1ee4c3dc4b" height="500" width="230" /></div>

## Common Errors and Solutions
### 1. Error: `SDK location not found`
<p>This errors occurs if the SDK path is not correctly set, or if the Android SDK is not installed.</p>

- Update the `sdk.dir` path in the `local.properties` file to the correct SDK location. You can verify the SDK path from Android Studio:
<img width="504" alt="Screenshot 2024-09-07 at 11 45 31" src="https://github.com/user-attachments/assets/fd03c7b3-c135-40d3-a329-16d9fe95d5ff">

- Go to Android Studio > Preferences > Appearance & Behavior > System Settings > Android SDK.
- Copy the SDK location shown in the SDK Manager.
<img width="504" alt="Screenshot 2024-09-07 at 11 45 14" src="https://github.com/user-attachments/assets/420319ed-6adc-4e44-bb55-5ae345e84a74">

### 2. Error: `Could not find local.properties`
<p>This error happens if the local.properties file is missing in the project root directory.</p>

- Create a new `local.properties` file in the root of your project if it doesn't exist.
- Add the correct `sdk.dir` path in the file.
