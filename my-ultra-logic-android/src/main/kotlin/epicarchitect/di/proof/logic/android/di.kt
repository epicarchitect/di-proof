package epicarchitect.di.proof.logic.android

import epicarchitect.di.proof.logic.HelloManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val mySuperLogicAndroidModule = module {
    single { HelloService() }
    single<HelloManager> { AndroidHelloManager(context = androidContext()) }
}