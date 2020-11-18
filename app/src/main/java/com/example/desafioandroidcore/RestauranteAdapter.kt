package com.example.desafioandroidcore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RestauranteAdapter (var listaRestaurante: ArrayList<Restaurantes>, val listener: onRestauranteClick):
        RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteAdapter.RestauranteViewHolder {
        return RestauranteViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante, parent,false))
    }

    override fun onBindViewHolder(holder: RestauranteAdapter.RestauranteViewHolder, position: Int) {
        val rest = listaRestaurante.get(position)
        holder.nome.text = rest.nome
        holder.endereco.text = rest.endereco
        holder.operacao.text = rest.operacao
        holder.imagem.setImageResource(rest.imagem)
    }

    override fun getItemCount() = listaRestaurante.size

    interface onRestauranteClick {
        fun restauranteClick (position: Int)
    }

    inner class RestauranteViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView), View.OnClickListener {

        val nome: TextView = itemView.findViewById(R.id.cv_tv_restaurante_nome)
        val endereco: TextView = itemView.findViewById(R.id.cv_tv_restaurante_endereco)
        val operacao: TextView = itemView.findViewById(R.id.cv_tv_restaurante_funcionamento)
        val imagem: ImageView = itemView.findViewById(R.id.cv_iv_restaurante_foto)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position){
                listener.restauranteClick(position)
            }
        }
    }
}
