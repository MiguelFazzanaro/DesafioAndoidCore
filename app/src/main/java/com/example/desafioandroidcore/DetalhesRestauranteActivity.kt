package com.example.desafioandroidcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detalhes_restaurante.*
import kotlinx.android.synthetic.main.activity_main.*

class DetalhesRestauranteActivity : AppCompatActivity(), PratoAdapter.onPratoClick{

    var listaPratos:ArrayList<Pratos> = getPratos()
    val adapter: PratoAdapter = PratoAdapter(listaPratos, this)

    private fun getPratos(): ArrayList<Pratos> {
        var prat1 = Pratos(1,"Salada com molho Gengibre", (R.drawable.image4), "Salada Ligh com molho saboroso, contas com as gorduras boas do azeite de oliva e com moderada quantidade de calorias e sodio. O gengibre da um sabor resfrescante, otimo para o verão")
        var prat2 = Pratos(2,"Salada com molho Gengibre", (R.drawable.image4), "Salada Ligh com molho saboroso, contas com as gorduras boas do azeite de oliva e com moderada quantidade de calorias e sodio. O gengibre da um sabor resfrescante, otimo para o verão")
        var prat3 = Pratos(3,"Salada com molho Gengibre", (R.drawable.image4), "Salada Ligh com molho saboroso, contas com as gorduras boas do azeite de oliva e com moderada quantidade de calorias e sodio. O gengibre da um sabor resfrescante, otimo para o verão")
        var prat4 = Pratos(4,"Salada com molho Gengibre", (R.drawable.image4), "Salada Ligh com molho saboroso, contas com as gorduras boas do azeite de oliva e com moderada quantidade de calorias e sodio. O gengibre da um sabor resfrescante, otimo para o verão")
        var prat5 = Pratos(4,"Salada com molho Gengibre", (R.drawable.image4), "Salada Ligh com molho saboroso, contas com as gorduras boas do azeite de oliva e com moderada quantidade de calorias e sodio. O gengibre da um sabor resfrescante, otimo para o verão")
        var prat6 = Pratos(4,"Salada com molho Gengibre", (R.drawable.image4), "Salada Ligh com molho saboroso, contas com as gorduras boas do azeite de oliva e com moderada quantidade de calorias e sodio. O gengibre da um sabor resfrescante, otimo para o verão")
        return arrayListOf(prat1,prat2,prat3,prat4,prat5,prat6)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_restaurante)

        setSupportActionBar(tb_detalheRestaurante)

        rv_detalheRestaurante.adapter = adapter
        rv_detalheRestaurante.layoutManager = LinearLayoutManager(this)
        rv_detalheRestaurante.setHasFixedSize(true)

        val rest = intent.getSerializableExtra("restaurante") as? Restaurantes
        tv_detalhe_nome_restaurante.text = rest!!.nome
        iv_detalhe_restaurante.setImageResource(rest.imagem)
    }

    override fun pratoClick (position: Int) {
        val prat = listaPratos.get(position)
        var nome = prat.nome
        var imagem = prat.foto
        var descricao = prat.descricao

        adapter.notifyItemChanged(position)
        activityDetalhePrato(prat)
    }

    private fun activityDetalhePrato(detalhePrato: Pratos) {
        var intent = Intent (this, DetalhesPratosActivity::class.java)
        intent.putExtra("prato", detalhePrato)
        startActivity(intent)
    }

}
