package epicarchitect.di.proof.di.holder

import epicarchitect.di.proof.di.declaration.AppModule
import kotlin.properties.Delegates

object DI {
    var appModule: AppModule by Delegates.notNull()
}