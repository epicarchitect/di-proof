package epicarchitect.di.proof

import android.app.Application
import epicarchitect.di.proof.logic.android.mySuperLogicAndroidModule
import epicarchitect.di.proof.logic.mySuperLogicModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(
                mySuperLogicModule,
                mySuperLogicAndroidModule
            )
        }
    }
}