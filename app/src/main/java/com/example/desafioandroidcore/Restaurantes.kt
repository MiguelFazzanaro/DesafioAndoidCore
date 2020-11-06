package com.example.desafioandroidcore

import java.sql.Time

class Restaurantes (var nome: String,
                    var endereco: String,
                    var operacao: String,
                    var pratos: ArrayList<Pratos>,
                    var imagem: Int) {
    override fun toString(): String {
        return "Restaurantes(nome='$nome', endereco='$endereco', operacao='$operacao')"
    }
}