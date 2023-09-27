package com.example.provaalex.activities.Classes

class PostoGasolina(nome: String, cnpj: String, caixa: Float, var capacidadeTanque: Float): Empresa(nome,cnpj,caixa) {
    override fun toString(): String {
        return "$nome, $cnpj, $caixa, $capacidadeTanque"
    }
}