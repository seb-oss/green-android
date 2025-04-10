import java.util.Properties

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("maven-publish")
}

android {
    namespace = "se.seb.green.components"
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

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    debugImplementation(libs.androidx.ui.tooling)
}

val versionName: String
    get() = "0.0.3"

val libraryArtifactId: String
    get() = "components"

val localProperties = Properties().apply {
    file("local.properties").takeIf { it.exists() }?.inputStream()?.use { load(it) }
}

// Task to create a source JAR
val sourceJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets["main"].java.srcDirs)
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "se.seb.green"
            artifactId = libraryArtifactId
            version = versionName
            artifact("build/outputs/aar/${libraryArtifactId}-release.aar")
            artifact(sourceJar.get()) // Add the source JAR
        }
    }

    repositories {
        // Setup Github Packages publication
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/seb-oss/green-android")
            credentials {
                username = System.getenv("GPR_USER") ?: localProperties.getProperty("gpr.user", "")
                password = System.getenv("GPR_TOKEN") ?: localProperties.getProperty("gpr.token", "")
            }
        }
    }
}