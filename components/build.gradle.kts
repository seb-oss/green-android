import java.util.Properties

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.dokka)
    id("maven-publish")
    id("signing")
}

android {
    namespace = "se.seb.gds.components"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")

        aarMetadata {
            minCompileSdk = 24
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
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
    get() = "0.0.6"

val libraryArtifactId: String
    get() = "components"

val localProperties = Properties().apply {
    file("local.properties").takeIf { it.exists() }?.inputStream()?.use { load(it) }
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "se.seb.gds"
            artifactId = libraryArtifactId
            version = versionName

            afterEvaluate {
                from(components["release"])
            }

            pom {
                name.set("Green Design System for Android") // A user-friendly name
                description.set("The official Android implementation of SEB's Green Design System.")
                url.set("https://github.com/seb-oss/green-android")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("seb-oss")
                        name.set("SEB Open Source")
                        email.set("opensource@seb.se")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/seb-oss/green-android.git")
                    developerConnection.set("scm:git:ssh://github.com/seb-oss/green-android.git")
                    url.set("https://github.com/seb-oss/green-android")
                }
            }
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

        maven {
            name = "Sonatype"
            url = uri("https://central.sonatype.com/service/local")
            credentials {
                username = System.getenv("SONATYPE_USERNAME") ?: localProperties.getProperty("sonatype.username", "")
                password = System.getenv("SONATYPE_PASSWORD") ?: localProperties.getProperty("sonatype.token", "")
            }
        }
    }
}

signing {
    // Sign the 'release' publication we defined in the publishing block
    sign(publishing.publications["release"])

    // Use GPG key from environment variables for security
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")
    val signingKey = System.getenv("GPG_SIGNING_KEY")
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")

    useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
}