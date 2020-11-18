package com.example.desafioandroidcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RestauranteAdapter.onRestauranteClick {

    var listaRestaurantes = getRestaurantes()
    val adapter: RestauranteAdapter = RestauranteAdapter(listaRestaurantes, this)

    private fun getRestaurantes(): ArrayList<Restaurantes> {
        var rest1 = Restaurantes(1,"Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha as 22hrs", (R.drawable.image1))
        var rest2 = Restaurantes(2,"Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema, São Paulo", "Fecha as 00hrs", (R.drawable.image4))
        var rest3 = Restaurantes(3,"Outback - Moema", "Av. Moaci, 187 - Moema, São Paulo", "Fecha as 00hrs", (R.drawable.image2))
        var rest4 = Restaurantes(4,"Si Señor!", "Alameda Jauaperi, 626 - Moema, São Paulo", "Fecha as 01hrs", (R.drawable.image3))

        return arrayListOf(rest1,rest2,rest3,rest4)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tb_toolbarMain)

        rv_restaurantes.adapter = adapter
        rv_restaurantes.layoutManager = LinearLayoutManager(this)
        rv_restaurantes.setHasFixedSize(true)
    }

    override fun restauranteClick(position: Int) {
        val rest = listaRestaurantes.get(position)
        var nome = rest.nome
        var imagem = rest.imagem
        adapter.notifyItemChanged(position)
        activityDetalheRestaurante(rest)
    }

    fun activityDetalheRestaurante (detalheRestaurante: Restaurantes){
        var intent = Intent(this, DetalhesRestauranteActivity::class.java)
        intent.putExtra("restaurante", detalheRestaurante)
        startActivity(intent)
    }
}


