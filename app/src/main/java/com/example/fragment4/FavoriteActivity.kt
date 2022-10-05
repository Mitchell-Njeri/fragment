package com.example.fragment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val button = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            val setIntent = Intent(this,SettingActivity::class.java)
            startActivity(setIntent)}
    }

}