package epicarchitect.di.proof

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import epicarchitect.di.proof.service.MyService

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val serviceButton: Button by lazy {
        findViewById(R.id.service_button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myService = MyService()
        serviceButton.setOnClickListener {
            myService.startService()
        }
    }
}