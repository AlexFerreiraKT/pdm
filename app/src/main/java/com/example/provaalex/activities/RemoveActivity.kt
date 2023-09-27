package com.example.provaalex.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.provaalex.databinding.ActivityRemoverBinding

class RemoveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRemoverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRemoverBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}