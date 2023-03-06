plugins {
    id("convention.android.library")
}

android {
    namespace = "epicarchitect.di.proof.di.declaration.android"
}

dependencies { 
    api(projects.di.declaration)
    api(projects.myUltraLogicAndroid)
}