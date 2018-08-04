package journaler.com.learnkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import journaler.com.learnkotlin.R.layout.activity_display_toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener(){
            Log.i("MainActivity", "btnShowToast clicked")
            Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()

            var intent = Intent(this, DisplayToastActivity:: class.java)
            startActivity(intent)
        }
    }
}
