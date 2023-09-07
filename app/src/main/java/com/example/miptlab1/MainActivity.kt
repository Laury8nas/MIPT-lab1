package com.example.miptlab1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miptlab1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnChangeText.setOnClickListener {
            binding.tvField.text = "Labas rytas!"
        }

        binding.btnChangeColor.setOnClickListener {
            binding.tvField.setTextColor(Color.BLUE)
        }
    }
}