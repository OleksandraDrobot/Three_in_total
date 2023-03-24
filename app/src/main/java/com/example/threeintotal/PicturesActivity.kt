package com.example.threeintotal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.threeintotal.databinding.ActivityPicturesBinding

class PicturesActivity : AppCompatActivity() {
    lateinit var binding: ActivityPicturesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPicturesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPicturesToBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}