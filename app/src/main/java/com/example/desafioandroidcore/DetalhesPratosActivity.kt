package com.example.desafioandroidcore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detalhes_pratos.*

class DetalhesPratosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_pratos)

        setSupportActionBar(tb_detalhe_prato)
        tb_detalhe_prato.setNavigationOnClickListener(View.OnClickListener() {
            onBackPressed()
        })

        val nome = intent.getStringExtra("nome")
        val descricao = intent.getStringExtra("descricao")

        tv_detalhe_nome_prato.text = nome
        tv_descricao_prato.text = descricao
    }
}