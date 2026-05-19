package com.example.idgs905baseandroid.Distancia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs905baseandroid.R
import kotlin.math.pow
import kotlin.math.sqrt

class distancia : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distancia)


        val edtX1 = findViewById<EditText>(R.id.edtX1)
        val edtY1 = findViewById<EditText>(R.id.edtY1)
        val edtX2 = findViewById<EditText>(R.id.edtX2)
        val edtY2 = findViewById<EditText>(R.id.edtY2)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btnCalcular.setOnClickListener {

            val x1Str = edtX1.text.toString()
            val y1Str = edtY1.text.toString()
            val x2Str = edtX2.text.toString()
            val y2Str = edtY2.text.toString()


            if (x1Str.isNotEmpty() && y1Str.isNotEmpty() && x2Str.isNotEmpty() && y2Str.isNotEmpty()) {

                val x1 = x1Str.toDouble()
                val y1 = y1Str.toDouble()
                val x2 = x2Str.toDouble()
                val y2 = y2Str.toDouble()


                val restaX = (x2 - x1).pow(2)

                val restaY = (y2 - y1).pow(2)

                val distancia = sqrt(restaX + restaY)


                txtResultado.text = String.format("Resultado: %.2f", distancia)

            } else {

                Toast.makeText(this, "Por favor, llena todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}