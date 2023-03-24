package com.example.threeintotal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.threeintotal.databinding.ActivityPicturesBinding
import com.example.threeintotal.databinding.ActivitySuperBinding

class SuperActivity : AppCompatActivity() {
    lateinit var binding: ActivitySuperBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuperBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSuperToBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}