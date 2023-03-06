package epicarchitect.di.proof.logic.android

import epicarchitect.di.proof.di.holder.DI

class HelloService {
    private val myLogic by lazy {
        DI.appModule.myUltraLogic
    }

    fun startService() {
        myLogic.hello()
    }
}