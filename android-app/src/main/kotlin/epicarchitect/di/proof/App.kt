package epicarchitect.di.proof

import android.app.Application
import epicarchitect.di.proof.di.declaration.android.AndroidAppModule
import epicarchitect.di.proof.di.holder.DI

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        DI.appModule = AndroidAppModule(this)
    }
}