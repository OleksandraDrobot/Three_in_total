package com.example.threeintotal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.threeintotal.databinding.ActivityMainBinding
import com.example.threeintotal.databinding.ActivityPicturesBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonForPictures.setOnClickListener {
            val intent = Intent(this, PicturesActivity::class.java)
            startActivity(intent)
        }

        binding.buttonForAnekdots.setOnClickListener {
            val intent = Intent(this, AnekdotsActivity::class.java)
            startActivity(intent)
        }

        binding.buttonForSupertitious.setOnClickListener {
            val intent = Intent(this, SuperActivity::class.java)
            startActivity(intent)
        }

        binding.buttonForZitations.setOnClickListener {
            val intent = Intent(this, ZitationsActivity::class.java)
            startActivity(intent)
        }

        binding.buttonForSea.setOnClickListener {
            val intent = Intent(this, SeaActivity::class.java)
            startActivity(intent)
        }

        binding.buttonForEmotions.setOnClickListener {
            val intent = Intent(this, EmotionsActivity::class.java)
            startActivity(intent)
        }

    }
}