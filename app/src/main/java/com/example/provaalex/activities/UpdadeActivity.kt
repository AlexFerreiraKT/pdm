package com.example.provaalex.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.provaalex.databinding.ActivityAlterarBinding

class UpdadeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlterarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlterarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}