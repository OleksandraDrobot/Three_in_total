package com.example.threeintotal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.threeintotal.databinding.ActivityPicturesBinding
import com.example.threeintotal.databinding.ActivitySeaBinding

class SeaActivity : AppCompatActivity() {
    lateinit var binding: ActivitySeaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSeaToBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}