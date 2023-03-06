plugins {
    id("convention.android.library")
}

android {
    namespace = "epicarchitect.di.proof.logic.android"
}

dependencies {
    api(projects.myUltraLogic)
}