package epicarchitect.di.proof.service

import epicarchitect.di.proof.logic.MyUltraLogic
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MyService : KoinComponent {
    private val myLogic by inject<MyUltraLogic>()

    fun startService() {
        myLogic.hello()
    }
}