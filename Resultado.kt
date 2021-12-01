package com.example.app_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlinx.android.synthetic.main.activity_main.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val txtNome = findViewById<EditText>(R.id.txtNome)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        txtResultado.text = "Seu e-mail foi cadastrado com sucesso"
    }
}