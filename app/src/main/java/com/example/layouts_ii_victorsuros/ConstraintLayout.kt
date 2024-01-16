package com.example.layouts_ii_victorsuros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class ConstraintLayout : AppCompatActivity() {

    private lateinit var botSiguiente: Button;
    private lateinit var botVolver: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)

        botSiguiente = findViewById(R.id.botonCambio)
        botSiguiente.setOnClickListener {

            setContentView(R.layout.constraint_layout_ii)
        }
    }

}