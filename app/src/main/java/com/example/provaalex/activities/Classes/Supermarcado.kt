package com.example.provaalex.activities.Classes

open class Supermarcado(nome: String, cnpj: String, caixa: Float, var temArcondicionado: Boolean): Empresa(nome,cnpj,caixa) {
    override fun toString(): String {
        return "$nome, $cnpj, $caixa, $temArcondicionado"
    }
}