# **Five Things**
Is a simple app for Android  about 
Five things every new programmer should know
[Presentation](https://docs.google.com/presentation/d/1XrWibljd9WLswOdzunRz6-FN6TJ0tpby-euajv3vr2E/edit?usp=sharing)

--
Додаток для Android про п'ять речей, які краще знати початкуючим програмістам.
Особисто ними користуюся.
Ідея з’явилася не відразу, і взагалі було витрачено багато часу для пошуку самої теми додатку. Вигляд і приблизний функціонал вималювався відразу – створити кілька Layouts із кнопками, щоб можна було їх переключити, і потрапити на будь-який Layout. Також іконка Home в Action bar, для повернення на головний слой та  функціональний Feedback, що викликається з меню (верхній правий кут).
Сама ідея - це описані п’ять речей, які є одночасно нагадуванням для мене, чим потрібно користуватися і що потрібно ще вчити. 


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
contact email: kots.olesya@gmail.com