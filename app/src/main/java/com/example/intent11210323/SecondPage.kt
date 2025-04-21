package com.example.intent11210323

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.intent11210323.databinding.ActivitySecondPageBinding

class SecondPage : AppCompatActivity() {
    private lateinit var binding2: ActivitySecondPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding2=ActivitySecondPageBinding.inflate(layoutInflater)
        setContentView(binding2.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val p2Title = intent.getStringExtra("title")
        val p2age = intent.getIntExtra("age", 0)
        binding2.p2text.text = "Title : $p2Title\nAge : $p2age"
    }
}