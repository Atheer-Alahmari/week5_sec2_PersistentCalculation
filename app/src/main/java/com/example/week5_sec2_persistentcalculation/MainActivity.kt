package com.example.week5_sec2_persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var dn=editTextDouble.text.toString().toDouble()
            var fn=editTextFloat.text.toString().toFloat()
            var result=dn*fn
            textView.text="Result:\n $result"

        }
    }
}