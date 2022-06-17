package com.example.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widget.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWidget.setOnClickListener {
            val intent = Intent (this, Widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener {
            val intent = Intent(this, ImplicitIntent::class.java)
            startActivity(intent)
        }
    }
}
