import com.vanniktech.maven.publish.AndroidSingleVariantLibrary

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.dokka)
    alias(libs.plugins.vanniktech.maven.publish)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "se.seb.gds.components"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

group = "io.github.sebopensource"
version = "0.0.21"
var artifactName = "components"

mavenPublishing {
    coordinates(group.toString(), artifactName, version.toString())
    configure(AndroidSingleVariantLibrary(
        variant = "release",
        publishJavadocJar = true,
        sourcesJar = true,
    ))
}
signing {
    isRequired = false
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.kotlin.reflect)
    debugImplementation(libs.androidx.ui.tooling)
    implementation(libs.jvm.tokens)
    implementation(libs.android.tokens)
    api(libs.components.schema)
    api(libs.kotlinx.serialization)
    api(libs.kotlinx.serialization.json)
}
