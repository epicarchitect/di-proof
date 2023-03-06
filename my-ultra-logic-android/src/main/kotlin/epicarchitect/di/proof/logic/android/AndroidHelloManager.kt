package epicarchitect.di.proof.logic.android

import android.content.Context
import android.widget.Toast
import epicarchitect.di.proof.logic.HelloManager

class AndroidHelloManager(private val context: Context) : HelloManager {
    override fun showHello(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}