package epicarchitect.di.proof.di

import epicarchitect.di.proof.logic.HelloManager
import epicarchitect.di.proof.logic.MyUltraLogic
import epicarchitect.di.proof.logic.android.AndroidHelloManager
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    single<HelloManager> {
        AndroidHelloManager(
            context = androidApplication()
        )
    }
    single {
        MyUltraLogic(
            helloManager = get()
        )
    }
}