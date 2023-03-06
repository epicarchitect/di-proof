package epicarchitect.di.proof

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import epicarchitect.di.proof.logic.android.HelloService

class MainActivity : Activity() {

    private val helloService by lazy {
        HelloService()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            FrameLayout(this).apply {
                addView(
                    Button(context).apply {
                        text = "Start service"
                        setOnClickListener {
                            helloService.startService()
                        }
                    }
                )
            }
        )
    }
}