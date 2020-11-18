package com.example.desafioandroidcore

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.withStyledAttributes
import kotlinx.android.synthetic.main.register_body.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        bt_register_register.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}