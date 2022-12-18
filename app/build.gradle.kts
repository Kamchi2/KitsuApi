plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    // Kapt
    id("kotlin-kapt")

    // Hilt
    id("com.google.dagger.hilt.android")

    // Navigation Safe args
    id("androidx.navigation.safeargs")
}

android {
    namespace = "com.example.kitsuapi"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.kitsuapi"
        minSdk = 24
        targetSdk = 32
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures.viewBinding = true
}

dependencies {

    // Core
    implementation("androidx.core:core-ktx:1.7.0")

    // AppCompat
    implementation("androidx.appcompat:appcompat:1.5.1")

    // Material
    implementation("com.google.android.material:material:1.7.0")

    // ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.databinding:viewbinding:7.3.1")

    // NavComponent
    val nav_version = "2.5.3"

    implementation("androidx.navigation:navigation-fragment:$nav_version")
    implementation("androidx.navigation:navigation-ui:$nav_version")

    // Kapt
    implementation("com.google.dagger:hilt-android:2.44")

    // Hilt
    kapt("com.google.dagger:hilt-android-compiler:2.44")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    // Gson
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // OkHttp
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.10.0"))
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")

    //Lifecycle
    val lifecycle_version = "2.5.1"

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")

    //LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    //ViewBindingPropertyDelegate
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:1.5.6")

    //Coil
    implementation("io.coil-kt:coil:2.2.2")


    // Paging 3
    val paging_version = "3.1.1"

    implementation("androidx.paging:paging-runtime:$paging_version")
}