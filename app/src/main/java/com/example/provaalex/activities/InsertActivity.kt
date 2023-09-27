package com.example.provaalex.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isInvisible
import com.example.provaalex.R
import com.example.provaalex.activities.Classes.Cinema
import com.example.provaalex.activities.Classes.Empresa
import com.example.provaalex.activities.Classes.PostoGasolina
import com.example.provaalex.activities.Classes.Supermarcado
import com.example.provaalex.databinding.ActivityInserirBinding

class InsertActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityInserirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInserirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var cinema = ArrayList<Cinema>()
        var mercado = ArrayList<Supermarcado>()
        var posto = ArrayList<PostoGasolina>()

        var c = 0
        var m = 0
        var p = 0

        binding.radioCinema.setOnClickListener(this)
        binding.radioPosto.setOnClickListener(this)
        binding.radioMercado.setOnClickListener(this)
        binding.buttonEnviar.setOnClickListener {
            var nome: String
            var cnpj: String
            var caixa: Float
            var temArCondicionado: Boolean
            var capacidadeDoTanque: Float
            var qtdLugares: Int

            if (binding.radioCinema.isChecked) {
                nome = binding.editNomeDoCinema.text.toString()
                cnpj = binding.editCnpjDoCinema.text.toString()
                caixa = binding.editCaixaDoCinema.text.toString().toFloat()
                qtdLugares = binding.editQtdAcentosDoCinema.text.toString().toInt()

                cinema.add(Cinema(nome, cnpj, caixa, qtdLugares))

                Toast.makeText(this,"\n ${cinema[c]} foi inserido",Toast.LENGTH_LONG).show()
                c++
            }

            if (binding.radioMercado.isChecked) {
                nome = binding.editNomeDoMercado.text.toString()
                cnpj = binding.editCnpjDoMercado.text.toString()
                caixa = binding.editCaixaDoMercado.text.toString().toFloat()
                temArCondicionado = binding.radioSim.isChecked

                mercado.add(Supermarcado(nome, cnpj, caixa, temArCondicionado))

                Toast.makeText(this,"\n ${mercado[m]} foi inserido",Toast.LENGTH_LONG).show()
                m++
            }

            if (binding.radioPosto.isChecked) {
                nome = binding.editNomeDoPosto.text.toString()
                cnpj = binding.editCnpjDoPosto.text.toString()
                caixa = binding.editCaixaDoPosto.text.toString().toFloat()
                capacidadeDoTanque = binding.editCapacidadeDoPosto.text.toString().toFloat()

                posto.add(PostoGasolina(nome, cnpj, caixa, capacidadeDoTanque))

                Toast.makeText(this,"\n ${posto[p]} foi inserido",Toast.LENGTH_LONG).show()
                p++
            }
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.radio_cinema -> {

                binding.inputsMercado.isInvisible = true
                binding.inputsPosto.isInvisible = true
                binding.inputsCinema.isInvisible = false
            }

            R.id.radio_posto -> {

                binding.inputsCinema.isInvisible = true
                binding.inputsMercado.isInvisible = true
                binding.inputsPosto.isInvisible = false
            }

            R.id.radio_mercado -> {
                binding.inputsPosto.isInvisible = true
                binding.inputsCinema.isInvisible = true
                binding.inputsMercado.isInvisible = false
            }
        }
    }
}

/*when(it.id) {

                R.id.radio_cinema -> {
                    nome = binding.editNomeDoCinema.text.toString()
                    cnpj = binding.editCnpjDoCinema.text.toString()
                    caixa = binding.editCaixaDoCinema.text.toString().toFloat()
                    qtdLugares = binding.editQtdAcentosDoCinema.text.toString().toInt()

                    empresa.add(Cinema(nome,cnpj,caixa,qtdLugares))
                }

                R.id.radio_mercado -> {
                    nome = binding.editNomeDoMercado.text.toString()
                    cnpj = binding.editCnpjDoMercado.text.toString()
                    caixa = binding.editCaixaDoMercado.text.toString().toFloat()
                    temArCondicionado = binding.radioSim.isChecked

                    empresa.add(Supermarcado(nome,cnpj,caixa,temArCondicionado))
                }

                R.id.radio_posto -> {
                    nome = binding.editNomeDoPosto.text.toString()
                    cnpj = binding.editCnpjDoPosto.text.toString()
                    caixa = binding.editCaixaDoPosto.text.toString().toFloat()
                    capacidadeDoTanque = binding.editCapacidadeDoPosto.text.toString().toFloat()

                    empresa.add(PostoGasolina(nome,cnpj,caixa,capacidadeDoTanque))
                }
            }*/
