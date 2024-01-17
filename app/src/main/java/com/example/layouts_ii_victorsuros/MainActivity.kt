package com.example.layouts_ii_victorsuros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var botSiguiente: Button;
    private lateinit var nombre: EditText;
    private lateinit var apellidos: EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout)

        botSiguiente = findViewById(R.id.botonCambio)
        botSiguiente.setOnClickListener {

            val cambio =  Intent(this, ConstraintLayout::class.java)
            startActivity(cambio)
        }
        nombre = findViewById(R.id.inputNombre)
        apellidos = findViewById(R.id.inputApellido)
        
        fun clearFieldOnFocusChange(v: View, hasFocus: Boolean) {

            if (hasFocus) {

                (v as EditText).apply {

                    text.clear();

                }
            }
        }
        val fields = listOf(nombre,apellidos)
        fields.forEach { it.setOnFocusChangeListener(::clearFieldOnFocusChange)}
    }
}