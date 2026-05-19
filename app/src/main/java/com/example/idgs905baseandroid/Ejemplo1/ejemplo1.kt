package com.example.idgs905baseandroid.Ejemplo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs905baseandroid.R

class ejemplo1 : AppCompatActivity() {
    private lateinit var edtNumero1: EditText
    private lateinit var edtNumero2: EditText
    private lateinit var btnSumar: Button
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edtNumero1 = findViewById(R.id.edtNumero1)
        edtNumero2 = findViewById(R.id.edtNumero2)
        btnSumar = findViewById(R.id.btnSumar)
        txtResultado = findViewById(R.id.txtResultado)

        btnSumar.setOnClickListener {
            val strNum1 = edtNumero1.text.toString()
            val strNum2 = edtNumero2.text.toString()

            if (strNum1.isNotEmpty() && strNum2.isNotEmpty()) {
                val num1 = strNum1.toInt()
                val num2 = strNum2.toInt()
                val resultado = sumar(num1, num2)
                txtResultado.text = "Resultado: $resultado"
            } else {
                txtResultado.text = "Por favor, ingresa ambos números"
            }
        }
    }

    private fun sumar(numero1: Int, numero2: Int): Int {
        return numero1 + numero2
    }
}