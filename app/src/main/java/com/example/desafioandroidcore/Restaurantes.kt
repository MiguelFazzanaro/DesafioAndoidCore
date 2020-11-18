package com.example.desafioandroidcore

import android.media.Image
import java.io.Serializable

class Restaurantes (var id: Int,
                    var nome: String,
                    var endereco: String,
                    var operacao: String,
                    var imagem: Int):Serializable {

    override fun toString(): String {
        return "Restaurantes(nome='$nome', endereco='$endereco', operacao='$operacao')"
    }
}