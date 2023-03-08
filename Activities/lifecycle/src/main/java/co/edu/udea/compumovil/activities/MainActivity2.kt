package co.edu.udea.compumovil.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import co.edu.udea.compumovil.activities.Models.TestModel
import com.google.gson.Gson

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle = intent.extras;
        val dato = bundle?.getString("mykey")
        val gson = Gson()
        if (dato != null) {
            var testModel = gson.fromJson(dato, TestModel::class.java)
            Log.d(TAG,dato)
            Log.d(TAG, testModel.toString())
        }
    }

    companion object {
        private const val TAG = "Lifecycle"
    }
}