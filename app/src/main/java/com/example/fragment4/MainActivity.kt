package com.example.fragment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragment4.fragments.FavotiteFragment
import com.example.fragment4.fragments.HomeFragment
import com.example.fragment4.fragments.SettingFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val favoriteIntent = Intent(this,FavoriteActivity::class.java)
                startActivity(favoriteIntent)}
            }
}