package com.example.desafioandroidcore

import java.io.Serializable

class Pratos (var id: Int, var nome: String, var foto: Int, var descricao: String):Serializable {

    override fun toString(): String {
        return "Pratos(id=$id, nome='$nome', foto=$foto, descricao='$descricao')"
    }
}