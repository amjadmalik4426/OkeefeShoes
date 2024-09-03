package com.example.okeefeshoes.Login

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.okeefeshoes.R
import com.example.okeefeshoes.databinding.ActivityLogoscreenBinding

class Logoscreen : AppCompatActivity() {
    private lateinit var binding:ActivityLogoscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLogoscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SplashScreen1::class.java)
            startActivity(intent)
            finish()
        }, 800)

    }
}