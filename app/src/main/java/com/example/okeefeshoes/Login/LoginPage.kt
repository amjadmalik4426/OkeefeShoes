package com.example.okeefeshoes.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.okeefeshoes.R
import com.example.okeefeshoes.activity.MainActivity
import com.example.okeefeshoes.databinding.ActivityLoginPageBinding
import com.google.firebase.auth.FirebaseAuth

class LoginPage : AppCompatActivity() {
    private lateinit var binding:ActivityLoginPageBinding
//    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityLoginPageBinding.inflate(layoutInflater)
    setContentView(binding.root)

//        firebaseAuth=FirebaseAuth.getInstance()

    binding.textView.setOnClickListener {
        val intent = Intent(this, Signup::class.java)
        startActivity(intent)
    }

    binding.button.setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

//        binding.button.setOnClickListener {
//            val email = binding.emailEt.text.toString()
//            val pass = binding.passET.text.toString()
//
//            if (email.isNotEmpty() && pass.isNotEmpty()) {
//
//                    firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
//                        if (it.isSuccessful) {
//                            val intent = Intent(this, MainActivity::class.java)
//                            startActivity(intent)
//
//                        } else {
//                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
//                        }
//                    }
//
//            } else {
//                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()
//            }
//
//        }
}

//      override fun onStart() {
//        super.onStart()
//        if (firebaseAuth.currentUser !=null){
//            val intent= Intent(this,MainActivity::class.java)
//            startActivity(intent)
//
//        }
//    }
}