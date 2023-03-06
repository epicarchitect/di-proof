plugins {
    id("convention.android.application")
}

android {
    namespace = "epicarchitect.di.proof"

    defaultConfig {
        applicationId = "epicarchitect.di.proof"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(projects.di.holder)
    implementation(projects.di.declarationAndroid)
}