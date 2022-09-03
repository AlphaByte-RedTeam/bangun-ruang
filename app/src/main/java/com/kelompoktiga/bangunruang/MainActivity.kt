package com.kelompoktiga.bangunruang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.pow
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun cubeVolume(surface: Int): Int {
            return surface.toDouble().pow(3.0).roundToInt()
        }

        val surfaceInput = findViewById<EditText>(R.id.surfaceEdit)
        val calcButton = findViewById<Button>(R.id.btnCalculate)
        val resView = findViewById<TextView>(R.id.resultView)

        calcButton.setOnClickListener {
            if (TextUtils.isEmpty(surfaceInput.text.toString())) {
                Toast.makeText(this, "Empty field is not allowed!", Toast.LENGTH_SHORT).show()
            } else {
                val result = cubeVolume(surfaceInput.text.toString().toInt())
                Toast.makeText(this@MainActivity, "Calculating...", Toast.LENGTH_SHORT).show()
                resView.text = result.toString()
            }
        }
    }
}