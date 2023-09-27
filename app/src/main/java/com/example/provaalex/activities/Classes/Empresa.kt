package com.example.provaalex.activities.Classes

open class Empresa (var nome: String, var cnpj: String, var caixa: Float) {
    override fun toString(): String {
        return "$nome, $cnpj, $caixa - "
    }
}