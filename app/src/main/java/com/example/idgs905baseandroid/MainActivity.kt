package com.example.idgs905baseandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.idgs905baseandroid.Ejemplo1.ejemplo1
import com.example.idgs905baseandroid.Ejemplo2.Ejemplo2
import com.example.idgs905baseandroid.Distancia.distancia

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Asignación corregida respetando tus IDs del XML:
        val btnEjemplo1 = findViewById<Button>(R.id.btn1) // btn1 -> Ejemplo1
        val btnDistancia = findViewById<Button>(R.id.btn2) // btn2 -> Distancia
        val btnEjemplo2 = findViewById<Button>(R.id.btn3) // btn3 -> Ejemplo2

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Listeners corregidos con los nombres exactos de las variables
        btnEjemplo1.setOnClickListener { navigateToEjemplo1() }
        btnDistancia.setOnClickListener { navigateToDistancia() }
        btnEjemplo2.setOnClickListener { navigateToEjemplo2() }
    }

    private fun navigateToEjemplo1() {
        val intent = Intent(this, ejemplo1::class.java)
        startActivity(intent)
    }

    private fun navigateToDistancia() {
        val intent = Intent(this, distancia::class.java)
        startActivity(intent)
    }

    private fun navigateToEjemplo2() {
        val intent = Intent(this, Ejemplo2::class.java)
        startActivity(intent)
    }
}