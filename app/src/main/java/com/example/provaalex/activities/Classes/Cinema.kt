package com.example.provaalex.activities.Classes

class Cinema (nome: String, cnpj: String, caixa: Float, var qtdAssentos: Int): Empresa(nome, cnpj, caixa) {
    override fun toString(): String {
        return "$nome, $cnpj, $caixa, $qtdAssentos"
    }
}