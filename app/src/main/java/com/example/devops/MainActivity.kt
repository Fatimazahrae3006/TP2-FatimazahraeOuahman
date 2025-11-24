package com.example.simplemessageapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageText: TextView = findViewById(R.id.messageText)
        val changeButton: Button = findViewById(R.id.changeMessageButton)

        changeButton.setOnClickListener({ v ->
            messageText.setText("Button was clicked!")
        })
    }
}