package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        var count = 0
        button.setOnClickListener() {
            val countTextView = findViewById<TextView>(R.id.counter)
            count++
            countTextView.text = count.toString().padStart(4, '0')
        }
    }
}