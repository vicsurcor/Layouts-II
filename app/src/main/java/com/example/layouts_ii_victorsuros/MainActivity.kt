package com.example.layouts_ii_victorsuros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var botSiguiente: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)

        botSiguiente = findViewById(R.id.botonCambio)
        botSiguiente.setOnClickListener {

            val cambio =  Intent(this, ConstraintLayout::class.java)
            startActivity(cambio)
        }
    }
}