package epicarchitect.di.proof.logic

import org.koin.dsl.module

val mySuperLogicModule = module {
    single { MyUltraLogic(helloManager = get()) }
}