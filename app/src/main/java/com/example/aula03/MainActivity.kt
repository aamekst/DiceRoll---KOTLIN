package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button:  Button = findViewById(R.id.button)
        Button.setOnClickListener{
           val resultTextView: TextView = findViewById(R.id.textView4)
        resultTextView.text = "Olá, FOI"
        }
    }


}