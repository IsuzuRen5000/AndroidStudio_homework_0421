package com.example.intent11210323

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent11210323.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        binding.button2.setOnClickListener {
//            val my = Intent(this,SecondPage::class.java)
//            startActivity(my)
//            Intent(this,SecondPage::class.java).apply {
//                startActivity(this)
//            }
//        }
        binding.button2.setOnClickListener {
            Intent(this,SecondPage::class.java).apply {
                putExtra("title","john")
                putExtra("age",30)

                startActivity(this)
            }
        }
    }
}