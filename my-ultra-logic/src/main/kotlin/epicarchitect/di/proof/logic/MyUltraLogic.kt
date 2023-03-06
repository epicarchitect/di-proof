package epicarchitect.di.proof.logic

class MyUltraLogic(private val helloManager: HelloManager) {
    fun hello() {
        helloManager.showHello("hello")
    }
}