plugins {
    alias(libs.plugins.android.application)
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id ("dagger.hilt.android.plugin")
    id ("kotlin-parcelize")
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.chattingapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.chattingapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            excludes += "META-INF/DEPENDENCIES"
            excludes +="META-INF/LICENSE"
            excludes +="META-INF/LICENSE.txt"
            excludes +="META-INF/NOTICE"
            excludes +="META-INF/NOTICE.txt"
            excludes +="mozilla/public-suffix-list.txt"
        }
    }
}

dependencies {

//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation(libs.androidx.activity.compose)
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    implementation(libs.androidx.material3)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
//
//    implementation(libs.dagger.hilt.android)
//    implementation(libs.firebase.crashlytics.buildtools)
//    kapt(libs.dagger.hilt.compiler)
//    implementation(libs.dagger.hilt.compose)
//    implementation(libs.coil)
//    implementation(platform("com.google.firebase:firebase-bom:32.8.0"))
//    implementation(libs.firebase.analytics)
//    implementation(libs.google.firebase.auth)

    implementation(libs.firebase.bom)
    implementation(libs.firebase.database.ktx)


    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.palette.ktx)
    implementation(libs.androidx.work.runtime.ktx)
    implementation(libs.androidx.camera.core)
    implementation(libs.androidx.camera.camera2)
    implementation(libs.androidx.camera.lifecycle)
    implementation(libs.androidx.camera.video)
    implementation(libs.androidx.camera.view)
    implementation(libs.androidx.camera.extensions)
    implementation(libs.datetime)
    implementation(libs.retrofit)
    implementation(libs.androidx.ui)
    implementation(libs.coil.compose)
    implementation(libs.firebase.auth)
    implementation (libs.converter.gson)
    implementation(libs.androidx.core.ktx)
    implementation(libs.play.services.auth)
    implementation(libs.androidx.material3)
    implementation(libs.facebook.android.sdk)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.accompanist.flowlayout)
    implementation(libs.animated.navigation.bar)
    implementation(libs.androidx.runtime.livedata)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.kotlinx.coroutines.play.services)
    implementation(libs.androidx.constraintlayout.compose)
    implementation(libs.androidx.material.icons.extended)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.material3.window.size.android)


    testImplementation(libs.junit)

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation (libs.hilt.android)
    ksp (libs.hilt.android.compiler)
    ksp (libs.androidx.hilt.compiler)
    implementation (libs.androidx.hilt.navigation.compose)

    implementation (libs.socket.io.client)
    implementation (libs.json)

    implementation(libs.gitlive.firebase.database)
    implementation(libs.firebase.messaging)

    implementation("com.github.ZEGOCLOUD:zego_uikit_prebuilt_call_android:+")
    implementation("com.guolindev.permissionx:permissionx:1.8.0")

    implementation ("io.github.jan-tennert.supabase:storage-kt:1.4.7")
    implementation ("io.github.jan-tennert.supabase:compose-auth:1.4.7")

    val ktor_version = "2.3.13"
    implementation ("io.ktor:ktor-client-android:$ktor_version")
    implementation ("io.ktor:ktor-client-core:$ktor_version")
    implementation ("io.ktor:ktor-utils:$ktor_version")

    implementation ("com.google.auth:google-auth-library-oauth2-http:1.19.0")

    implementation(libs.volley)
}