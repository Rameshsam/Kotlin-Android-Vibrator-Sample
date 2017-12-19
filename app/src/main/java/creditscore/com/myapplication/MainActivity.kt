package creditscore.com.myapplication

import android.content.Context
import android.os.Bundle
import android.os.Vibrator
import android.support.v7.app.AppCompatActivity
import android.widget.Button



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val btn_click_me = findViewById(R.id.btn_vibrate) as Button
        btn_click_me.setOnClickListener {
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(500)

        }
    }
}
