plugins {
    id("convention.android.library")
}

android {
    namespace = "epicarchitect.di.proof.di.declaration"
}

dependencies { 
    api(projects.myUltraLogic)
}