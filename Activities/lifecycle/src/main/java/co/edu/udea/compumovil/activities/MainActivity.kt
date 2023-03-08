package co.edu.udea.compumovil.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import co.edu.udea.compumovil.activities.Models.TestModel
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")
        val myButton = findViewById<Button>(R.id.btn_1)
        myButton.setOnClickListener {
            val i = Intent(this,MainActivity2::class.java)
            var a ="My Value"
            var gson = Gson()
            var jsonString = gson.toJson(TestModel(1,"Test"))
            i.putExtra("mykey",jsonString)

            startActivity(i)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.v(TAG, "onPause")
    }

    companion object {
        private const val TAG = "Lifecycle"
    }
}
