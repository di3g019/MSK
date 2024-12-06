package com.example.msk.view.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import android.widget.Button
import com.example.msk.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Encuentra el botón
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)

        // Configura el clic del botón
        btnIngresar.setOnClickListener {
            // Crea un Intent para ir a MenuActivity
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)  // Inicia la actividad
        }
    }
}
