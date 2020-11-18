package com.example.desafioandroidcore

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.withStyledAttributes
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_detalhes_pratos.*
import kotlinx.android.synthetic.main.activity_detalhes_pratos.tb_detalhe_prato
import kotlinx.android.synthetic.main.activity_detalhes_restaurante.*
import kotlinx.android.synthetic.main.activity_detalhes_restaurante.tb_detalheRestaurante
import kotlinx.android.synthetic.main.register_body.*
import kotlinx.android.synthetic.main.register_body.bt_register_register

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setSupportActionBar(tb_register)
        tb_register.setNavigationOnClickListener(View.OnClickListener() {
            onBackPressed()
        })

        bt_register_register.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}