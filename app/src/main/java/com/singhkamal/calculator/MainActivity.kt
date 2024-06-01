package com.singhkamal.calculator

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.singhkamal.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            if (binding.edt1.text.toString().isNotEmpty() && binding.edt2.text.toString().isNotEmpty()) {
                val no1 = binding.edt1.text.toString().toInt()
                val no2 = binding.edt2.text.toString().toInt()
                val sum = no1 + no2
                Toast.makeText(this, "The sum is $sum", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please fill the blanks.", Toast.LENGTH_LONG).show()
            }
        }

        binding.btnSub.setOnClickListener {
            if (binding.edt1.text.toString().isNotEmpty() && binding.edt2.text.toString().isNotEmpty()) {
                val no1 = binding.edt1.text.toString().toInt()
                val no2 = binding.edt2.text.toString().toInt()
                val sub = no1 - no2
                Toast.makeText(this, "The subtraction result is $sub", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please fill the blanks.", Toast.LENGTH_LONG).show()
            }
        }

        binding.btnMul.setOnClickListener {
            if (binding.edt1.text.toString().isNotEmpty() && binding.edt2.text.toString().isNotEmpty()) {
                val no1 = binding.edt1.text.toString().toInt()
                val no2 = binding.edt2.text.toString().toInt()
                val mul = no1 * no2
                Toast.makeText(this, "The multiplication result is $mul", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please fill the blanks.", Toast.LENGTH_LONG).show()
            }
        }

        binding.btnDiv.setOnClickListener {
            if (binding.edt1.text.toString().isNotEmpty() && binding.edt2.text.toString().isNotEmpty()) {
                val no1 = binding.edt1.text.toString().toInt()
                val no2 = binding.edt2.text.toString().toInt()
                val div = no1 / no2
                Toast.makeText(this, "The division result is $div", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please fill the blanks.", Toast.LENGTH_LONG).show()
            }
        }
    }
}
