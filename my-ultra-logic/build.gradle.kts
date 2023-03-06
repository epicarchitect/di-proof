plugins {
    id("convention.android.library")
}

android {
    namespace = "epicarchitect.di.proof.logic"
}

dependencies {
    api("io.insert-koin:koin-android:3.3.3")
}