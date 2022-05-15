package com.example.calculateapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculationActivity : AppCompatActivity() {
    lateinit var etNum1:EditText
    lateinit var etNum2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMult:Button
    lateinit var btnModul:Button
    lateinit var etView:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModul = findViewById(R.id.btnModul)
        btnMult = findViewById(R.id.btnMult)
        etView = findViewById(R.id.etView)


        btnAdd.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("num1 is requires")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("num2 is requires")
                return@setOnClickListener
            }

            additional(num1.toString().toDouble(),num2.toString().toDouble())
        }


        btnSubtract.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("num1 is requires")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("num2 is requires")
                return@setOnClickListener
            }

            subtraction(num1.toString().toDouble(),num2.toString().toDouble())

        }

        btnModul.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("num1 is requires")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("num2 is requires")
                return@setOnClickListener
            }

            modulus(num1.toString().toDouble(),num2.toString().toDouble())

        }

        btnMult.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()
            if(num1.isBlank()){
                etNum1.setError("num1 is requires")
                return@setOnClickListener
            }
            if(num2.isBlank()){
                etNum2.setError("num2 is requires")
                return@setOnClickListener
            }
            multiplication(num1.toString().toDouble(),num2.toString().toDouble())

        }

    }
    fun additional(num1: Double,num2: Double){
        var add = num1 + num2
        etView.text = add.toString()
    }

    fun subtraction(num1: Double,num2: Double){
        var subtract = num1 - num2
        etView.text = subtract.toString()
    }

    fun multiplication(num1: Double,num2: Double){
        var  multiply= num1 * num2
        etView.text = multiply.toString()
    }
    fun modulus(num1: Double,num2: Double){
        var modul = num1 % num2
        etView.text = modul.toString()
    }
    

}

