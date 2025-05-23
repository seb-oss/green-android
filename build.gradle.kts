import com.vanniktech.maven.publish.SonatypeHost

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.dokka)
    alias(libs.plugins.vanniktech.maven.publish)
//    alias(libs.plugins.nexus.publish)
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

/*
nexusPublishing {
    repositories {
        sonatype {
            username.set(System.getenv("SONATYPE_USERNAME"))
            password.set(System.getenv("SONATYPE_PASSWORD"))
            nexusUrl.set(uri("https://ossrh-staging-api.central.sonatype.com/service/local/"))
            snapshotRepositoryUrl.set(uri("https://central.sonatype.com/repository/maven-snapshots/"))
        }

        packageGroup.set("io.github.sebopensource")
    }
}*/

mavenPublishing {
    coordinates("io.github.sebopensource", "components", "0.0.7") // Ensure artifactId matches your module
    pom {
        name.set("Green Design System for Android")
        description.set("The official Android implementation of SEB's Green Design System.")
        url.set("https://github.com/seb-oss/green-android")
        licenses { license { name.set("The Apache License, Version 2.0"); url.set("http://www.apache.org/licenses/LICENSE-2.0.txt") } }
        developers { developer { id.set("sebopensource"); name.set("SEB Open Source"); email.set("opensource@seb.se") } }
        scm { connection.set("scm:git:git://github.com/seb-oss/green-android.git"); developerConnection.set("scm:git:ssh://github.com/seb-oss/green-android.git"); url.set("https://github.com/seb-oss/green-android") }
    }

    // This line is CRITICAL for enabling Sonatype Central publishing
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL, automaticRelease = true)

    // This handles GPG signing using the signing plugin
    signAllPublications()
}
