package com.example.desafioandroidcore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PratoAdapter (var listaPrato: ArrayList<Pratos>, val listener: onPratoClick):
    RecyclerView.Adapter<PratoAdapter.PratoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratoAdapter.PratoViewHolder {
        return PratoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.detalhes_restaurante, parent,false))
    }

    override fun onBindViewHolder(holder: PratoAdapter.PratoViewHolder, position: Int) {
        val prat = listaPrato.get(position)
        holder.nome.text = prat.nome
        holder.imagem.setImageResource(prat.foto)
    }

    override fun getItemCount() = listaPrato.size

    interface onPratoClick {
        fun pratoClick (position: Int)
    }

    inner class PratoViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener {

        val nome: TextView = itemView.findViewById(R.id.tv_pratos_nome)
        val imagem: ImageView = itemView.findViewById(R.id.iv_pratos_foto)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (RecyclerView.NO_POSITION != position){
                listener.pratoClick(position)
            }
        }
    }
}