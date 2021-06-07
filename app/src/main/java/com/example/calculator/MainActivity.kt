package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var num1=findViewById<EditText>(R.id.etnum1)
        var num2=findViewById<EditText>(R.id.etnum2)
        var button1=findViewById<Button>(R.id.btn1)
        var button2=findViewById<Button>(R.id.btn2)
        var button3=findViewById<Button>(R.id.btn3)
        var button4=findViewById<Button>(R.id.btn4)
        var result=findViewById<EditText>(R.id.etresult)


        button1.setOnClickListener {
            var n1=num1.text.toString().toInt()
            var n2=num2.text.toString().toInt()
            var sum=n1+n2
            result.setText(sum.toString())

        }
        button2.setOnClickListener {
            var n1=num1.text.toString().toInt()
            var n2=num2.text.toString().toInt()
            var subtract=n1-n2
            result.setText(subtract.toString())
        }
        button3.setOnClickListener {
            var n1=num1.text.toString().toInt()
            var n2=num2.text.toString().toInt()
            var multiply=n1*n2
            result.setText(multiply.toString())
        }
        button4.setOnClickListener {
            var n1=num1.text.toString().toInt()
            var n2=num2.text.toString().toInt()
            var modulus=n1%n2
            result.setText(modulus.toString())
        }
    }

}