package com.example.okeefeshoes.Login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.okeefeshoes.R
import com.example.okeefeshoes.databinding.ActivitySplashScreen1Binding

class SplashScreen1 : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreen1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            binding.startBtn.setOnClickListener {
                val intent = Intent(this@SplashScreen1, SplashScreen2::class.java)
                startActivity(intent)

            }


        }
    }
}
