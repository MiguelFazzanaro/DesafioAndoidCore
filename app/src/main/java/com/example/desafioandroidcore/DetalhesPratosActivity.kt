package com.example.desafioandroidcore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detalhes_pratos.*
import kotlinx.android.synthetic.main.activity_detalhes_pratos.tv_detalhe_nome_prato
import kotlinx.android.synthetic.main.activity_detalhes_restaurante.*

class DetalhesPratosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_pratos)

        setSupportActionBar(tb_detalhe_prato)
        tb_detalhe_prato.setNavigationOnClickListener(View.OnClickListener() {
            onBackPressed()
        })

        val prat = intent.getSerializableExtra("prato") as? Pratos
        tv_detalhe_nome_prato.text = prat!!.nome
        tv_descricao_prato.text = prat.descricao
        iv_detalhe_prato.setImageResource(prat.foto)
        
    }
}