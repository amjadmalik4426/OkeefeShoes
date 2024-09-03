package com.example.okeefeshoes.Login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.okeefeshoes.R
import com.example.okeefeshoes.databinding.ActivitySplashScreen2Binding
import com.example.okeefeshoes.databinding.ActivitySplashScreen3Binding

class SplashScreen3 : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreen3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreen3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            binding.nextBtn2.setOnClickListener {
                val intent = Intent(this@SplashScreen3, LoginPage::class.java)
                startActivity(intent)

            }

        }
    }
}
