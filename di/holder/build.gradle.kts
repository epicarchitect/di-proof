plugins {
    id("convention.android.library")
}

android {
    namespace = "epicarchitect.di.proof.di.holder"
}

dependencies {
    api(projects.di.declaration)
}