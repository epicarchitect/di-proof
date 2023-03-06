package epicarchitect.di.proof.logic.android

import epicarchitect.di.proof.logic.MyUltraLogic
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class HelloService : KoinComponent {
    private val myLogic by inject<MyUltraLogic>()

    fun startService() {
        myLogic.hello()
    }
}