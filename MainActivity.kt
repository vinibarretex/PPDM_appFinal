package com.example.app_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*
import org.jetbrains.anko.toast

import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNome = findViewById<EditText>(R.id.txtNome)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val checkbox = findViewById<CheckBox>(R.id.checkbox)

        btnLogin.setOnClickListener {
            if(txtEmail.text.isEmpty() && txtNome.text.isEmpty()) {
                txtEmail.error = "Digite um e-mail válido"
                txtNome.error = "Digite seu nome"
            } else {
                startActivity<Resultado>()
            }

        }

    }

}