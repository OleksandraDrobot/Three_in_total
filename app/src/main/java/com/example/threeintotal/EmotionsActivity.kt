package com.example.threeintotal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.threeintotal.databinding.ActivityEmotionsBinding
import com.example.threeintotal.databinding.ActivityPicturesBinding

class EmotionsActivity : AppCompatActivity() {
    lateinit var binding: ActivityEmotionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmotionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEmoToBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}