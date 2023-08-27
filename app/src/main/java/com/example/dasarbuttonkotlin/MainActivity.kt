package com.example.dasarbuttonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnSayHello = findViewById<Button>(R.id.btnSayHello)
        val etWelcome = findViewById<EditText>(R.id.etWelcome)

        btnSayHello.setOnClickListener {
            val name = etName.text.toString()
            etWelcome.setText("Welcome $name")

        }
    }
}