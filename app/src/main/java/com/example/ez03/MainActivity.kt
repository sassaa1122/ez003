package com.example.ez03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus: Button = findViewById(R.id.plus)
        val minus: Button = findViewById(R.id.minus)
        val multi: Button = findViewById(R.id.multi)
        val divider: Button = findViewById(R.id.divider)
        val mod: Button = findViewById(R.id.mod)
        val clear: Button = findViewById(R.id.clear)
        val t7: TextView = findViewById(R.id.t7)
        val num1: EditText = findViewById(R.id.num1)
        val num2: EditText = findViewById(R.id.num2)
        val num3: TextView = findViewById(R.id.num3)

        clear.setOnClickListener{
            num1.setText("")
            num2.setText("")
            num3.setText("")
            t7.setText("")
        }
        plus.setOnClickListener {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() + num2.toInt()
                num3 .text = result.toString()
                t7.setText("+")
            } else {
                Toast.makeText(applicationContext, "กรุณากรอให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }

        minus.setOnClickListener {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() - num2.toInt()
                num3 .text = result.toString()
                t7.setText("-")
            } else {
                Toast.makeText(applicationContext, "กรุณากรอให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }

        multi.setOnClickListener {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() * num2.toInt()
                num3 .text = result.toString()
                t7.setText("*")
            } else {
                Toast.makeText(applicationContext, "กรุณากรอให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }

        divider.setOnClickListener {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()

            if (num1 != "" && num2 != "" && num2 != "0") {
                var result = num1.toInt() / num2.toInt()
                num3 .text = result.toString()
                t7.setText("/")
            } else {
                Toast.makeText(applicationContext, "กรุณากรอให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }

        mod.setOnClickListener {
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()

            if (num1 != "" && num2 != "" && num2 != "0") {
                var result = num1.toInt() % num2.toInt()
                num3 .text = result.toString()
                t7.setText("%")
            } else {
                Toast.makeText(applicationContext, "กรุณากรอให้ครบ", Toast.LENGTH_SHORT).show()
            }
        }

    }

}
