package com.example.provaalex.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.provaalex.R
import com.example.provaalex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var empresa: ArrayList<Int> = ArrayList()

        binding.buttonInserir.setOnClickListener(this)
        binding.buttonMostrar.setOnClickListener(this)
        binding.buttonRemover.setOnClickListener(this)
        binding.buttonAlterar.setOnClickListener(this)
    }



    override fun onClick(view: View) {
        when(view.id) {

            R.id.button_inserir -> {
                startActivity(Intent(this, InsertActivity::class.java))
            }
            R.id.button_mostrar -> {
                startActivity(Intent(this, ShowActivity::class.java))
            }
            R.id.button_remover -> {
                startActivity(Intent(this, RemoveActivity::class.java))
            }
            R.id.button_alterar -> {
                startActivity(Intent(this, UpdadeActivity::class.java))
            }


        }
    }
    }
