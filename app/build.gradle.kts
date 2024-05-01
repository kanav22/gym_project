import java.util.Properties

fun loadProperties(filename: String): Properties {
    val properties = Properties()
    file(filename).inputStream().use {
        properties.load(it)
    }
    return properties
}

// val keyProperties = loadProperties("../key.properties")


plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)

    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    id("app.cash.paparazzi")
}

android {
    namespace = "com.wadhawan.mcp.gymsharkhomework"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.wadhawan.mcp.gymsharkhomework"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        // create("release") {
        //     keyAlias = keyProperties["keyAlias"].toString()
        //     keyPassword = keyProperties["keyPassword"].toString()
        //     storeFile = file(keyProperties["storeFile"].toString())
        //     storePassword = keyProperties["storePassword"].toString()
        // }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            // signingConfig  = signingConfigs.getByName("release")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }

    packaging {
        resources {
            excludes += "META-INF/"
            excludes += "okhttp3/"
            excludes += "kotlin/"
            excludes += "org/"
            excludes += ".properties"
            excludes += ".bin"
        }
    }

    testOptions {
        unitTests {
            isReturnDefaultValues = true
            isIncludeAndroidResources = true
        }
    }
}

dependencies {

    implementation(libs.androidx.navigation.compose)
    implementation(libs.glide)
    implementation(libs.coil.compose)
    implementation(libs.compose.runtime)
    implementation(libs.gson)

    implementation("androidx.compose.runtime:runtime-livedata")
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose")
    implementation("androidx.compose.material:material-icons-extended")

    implementation(libs.kotlinx.coroutines.android)

    implementation("com.google.dagger:hilt-android")
    implementation(libs.androidx.navigation.testing)
    kapt(libs.dagger.hilt.compiler)
    kapt(libs.hilt.ext.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    implementation(libs.accompanist.pager.layouts)
    implementation(libs.accompanist.pager.indicators)

    implementation(libs.androidx.core.splashscreen)

    implementation(libs.coil.compose.v260)

    implementation(libs.timber)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.material3.android)


    testImplementation(libs.hamcrest.hamcrest)
    testImplementation(libs.junit)
    testImplementation(libs.androidx.core)
    testImplementation(platform(libs.androidx.compose.bom))
    testImplementation(libs.androidx.ui.test.junit4)
    testImplementation(libs.androidx.espresso.core)
    testImplementation(libs.app.paparazzi)
    testImplementation(libs.mockito.core)
    testImplementation(libs.robolectric)


    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.app.paparazzi)


    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.6.6")
}


// TODO Remove when https://github.com/google/guava/issues/6567 is fixed.
// See also: https://github.com/google/guava/issues/6801.
dependencies.constraints {
    testImplementation("com.google.guava:guava") {
        attributes {
            attribute(
                TargetJvmEnvironment.TARGET_JVM_ENVIRONMENT_ATTRIBUTE,
                objects.named(TargetJvmEnvironment::class.java, TargetJvmEnvironment.STANDARD_JVM)
            )
        }
        because(
            "Paparazzi's layoutlib and sdk-common depend on Guava's -jre published variant." +
                    "See https://github.com/cashapp/paparazzi/issues/906."
        )
    }
}

kapt {
    correctErrorTypes = true
}