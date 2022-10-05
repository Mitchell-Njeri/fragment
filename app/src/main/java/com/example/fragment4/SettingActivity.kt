package com.example.fragment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val button = findViewById<Button>(R.id.button3)

        button.setOnClickListener {
            val setIntent = Intent(this,MainActivity::class.java)
            startActivity(setIntent)
        }
    }
}