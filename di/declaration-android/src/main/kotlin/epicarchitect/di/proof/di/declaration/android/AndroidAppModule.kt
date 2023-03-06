package epicarchitect.di.proof.di.declaration.android

import android.content.Context
import epicarchitect.di.proof.di.declaration.AppModule
import epicarchitect.di.proof.logic.MyUltraLogic
import epicarchitect.di.proof.logic.android.AndroidHelloManager

class AndroidAppModule(private val context: Context): AppModule {
    override val myUltraLogic by lazy {
        MyUltraLogic(
            helloManager = AndroidHelloManager(context)
        )
    }
}