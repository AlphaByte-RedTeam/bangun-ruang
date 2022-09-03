package com.kelompoktiga.bangunruang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.pow
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun calculate(surface: Int): Int {
            return surface.toDouble().pow(3.0).roundToInt()
        }
    }
}