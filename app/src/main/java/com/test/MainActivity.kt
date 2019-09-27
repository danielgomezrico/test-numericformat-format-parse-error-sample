package com.test

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.Format
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val formatter = NumberFormat.getCurrencyInstance().apply {
            minimumFractionDigits = 0
            maximumFractionDigits = 0
        }

        Log.d("Format", formatter.format(123)) // $123
        Log.d("Format", formatter.format(123.0)) // $123
        Log.d("Format", formatter.parse("$123.0").toString()) // 123
        Log.d("Format", formatter.format(123.0)) // $123.00
        Log.d("Format", formatter.format(123.123)) // $123.12
    }

}
