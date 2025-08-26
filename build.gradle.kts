// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.dokka)
    alias(libs.plugins.vanniktech.maven.publish) apply false
    alias(libs.plugins.spotless)
}

subprojects {
    plugins.apply("org.jetbrains.dokka")
    apply(plugin = "com.diffplug.spotless")
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        kotlin {
            target("src/*/kotlin/**/*.kt")
            ktlint()
        }

        kotlinGradle {
            target("*.gradle.kts")
            ktlint()
        }
    }
}