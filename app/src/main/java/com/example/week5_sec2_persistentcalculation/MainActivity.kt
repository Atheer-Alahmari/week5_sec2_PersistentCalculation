package com.example.week5_sec2_persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var result =0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var dn=editTextDouble.text.toString().toDouble()
            var fn=editTextFloat.text.toString().toFloat()
             result=dn*fn
            textView.text="Result:\n $result"

        }
    }

    override fun onSaveInstanceState(outState : Bundle){
        super.onSaveInstanceState(outState)
        val input:Double=result
        outState.putDouble("result",result)
        // اذا كانت القيمة في ارري احط الارري داخل HashSet

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val input2:Double=savedInstanceState.getDouble("result",0.0)
        result=input2
        textView.text=result.toString()
        // اطلعها من HashSet  و احولها ل ارري لست

    }
}