package com.example.threeintotal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.threeintotal.databinding.ActivityPicturesBinding
import com.example.threeintotal.databinding.ActivitySuperBinding
import com.example.threeintotal.databinding.ActivityZitationsBinding

class ZitationsActivity : AppCompatActivity() {
    lateinit var binding: ActivityZitationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityZitationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonZitationsToBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}