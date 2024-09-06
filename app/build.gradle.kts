plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.mobileappdev"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mobileappdev"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //天気用の追加部分(APIリクエスト送信用)
    implementation("com.squareup.retrofit2:retrofit:2.9.0") //Retrofitライブラリ
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") //Gsonコンバータ

}