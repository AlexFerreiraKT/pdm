package com.example.provaalex.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.provaalex.R
import com.example.provaalex.databinding.ActivityMostrarBinding

class ShowActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMostrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMostrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.radioCinema.setOnClickListener(this)
        binding.radioMercado.setOnClickListener(this)
        binding.radioPosto.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.radio_cinema -> {

            }
        }
    }
}