package com.example.okeefeshoes.Login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.okeefeshoes.R
import com.example.okeefeshoes.databinding.ActivitySplashScreen2Binding

class SplashScreen2 : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreen2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            binding.nxtBtn1.setOnClickListener {
                val intent = Intent(this@SplashScreen2, SplashScreen3::class.java)
                startActivity(intent)

            }

        }
    }
}