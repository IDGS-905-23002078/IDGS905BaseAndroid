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
// Asegúrate de importar la actividad de multiplicación
import com.example.idgs905baseandroid.multiplica_AxB.MultiplicaActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnEjemplo1 = findViewById<Button>(R.id.btn1)
        val btnDistancia = findViewById<Button>(R.id.btn2)
        val btnEjemplo2 = findViewById<Button>(R.id.btn3)
        // Enlazar el nuevo botón
        val btnMultiplica = findViewById<Button>(R.id.btn4)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnEjemplo1.setOnClickListener { navigateToEjemplo1() }
        btnDistancia.setOnClickListener { navigateToDistancia() }
        btnEjemplo2.setOnClickListener { navigateToEjemplo2() }
        // Asignar el evento clic al nuevo botón
        btnMultiplica.setOnClickListener { navigateToMultiplica() }
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

    // NUEVA FUNCIÓN para navegar a MultiplicaActivity
    private fun navigateToMultiplica() {
        val intent = Intent(this, MultiplicaActivity::class.java)
        startActivity(intent)
    }
}