package epicarchitect.di.proof

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import epicarchitect.di.proof.logic.android.HelloService
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val helloService by inject<HelloService>()

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