plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "epicarchitect.di.proof.di"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion("11")
        targetCompatibility = JavaVersion.toVersion("11")
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    api(projects.myUltraLogicAndroid)
    api("io.insert-koin:koin-android:3.3.3")
}