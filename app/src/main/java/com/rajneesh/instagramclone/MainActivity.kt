package com.rajneesh.instagramclone

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by - Rajneesh Shukla
 * Created on - 17/04/2020
 * Used For -
 */
class MainActivity : AppCompatActivity() {

    private lateinit var textMessage: TextView

    // Handle Bottom nav tab switching
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                textMessage.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                textMessage.setText(R.string.title_search)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_add -> {
                textMessage.setText(R.string.title_add)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_heart -> {
                textMessage.setText(R.string.title_heart)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                textMessage.setText(R.string.title_profile)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
