package com.example.threeintotal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.threeintotal.databinding.ActivityAnekdotsBinding

class AnekdotsActivity : AppCompatActivity() {
    lateinit var binding: ActivityAnekdotsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnekdotsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAnekdotsToBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}