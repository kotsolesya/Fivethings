# **Five Things**
Is a simple app for Android  about 
Five things every new programmer should know

Додаток для Android про п'ять речей, які краще знати початкуючим програмістам.
Особисто ними користуюся.

**Getting Started**

This sample uses the Gradle build system. To build this project, use the "gradlew build" command or use "Import Project" in Android Studio.

**How it works:**
Додаток можна скачати за допомогою команди git pull і запустити її на емуляторі чи телефоні з операціною системою Android.

**How to use:**
Запустивши додаток з назвою Five Things відкривається головна activity через яку можна ознайомитися, про що цей додаток і кнопка GO для переходу до самих 5 речей.
Всі 5 activity мають однаковий функціонал:
- 5 кнопок з номерами для переходу до відповідних речей
- кнопка HOME в ActionBar із зображенням для повернення на головну activity
- кнопка feedback в меню для переходу на activity з функціоналом RadioGroup та CheckBox. 

**Technical requirements**

    compileSdkVersion 23
    buildToolsVersion "23.0.2"

    defaultConfig {
        applicationId "com.example.olesya.fivethings"
        minSdkVersion 15
        targetSdkVersion 23
        versionCode 1
        versionName "1.0"
    }


**Author**

Olesya Kots for StudyJam CK 2016