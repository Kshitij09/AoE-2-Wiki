plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "com.kshitijpatil.aoe2.android"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    dependencies {
        implementation(project(":core"))
        implementation("com.google.android.material:material:1.4.0")
        implementation("androidx.appcompat:appcompat:1.3.1")
        implementation("androidx.constraintlayout:constraintlayout:2.1.0")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.3")
    }
}


