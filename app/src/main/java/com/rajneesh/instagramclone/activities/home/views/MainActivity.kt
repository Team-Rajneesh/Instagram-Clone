package com.rajneesh.instagramclone.activities.home.views

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.rajneesh.instagramclone.R

/**
 * Created by - Rajneesh Shukla
 * Created on - 17/04/2020
 * Used For -
 */
class MainActivity : AppCompatActivity() {

    internal var mSelectedFragment:Fragment? = null

    // Handle Bottom nav tab switching
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
               replaceFragmentInContainer(HomeFragment())
               return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                replaceFragmentInContainer(SearchFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_add -> {
                replaceFragmentInContainer(AddFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_heart -> {
                replaceFragmentInContainer(NotificationsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                replaceFragmentInContainer(ProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        // Default selected fragment
        replaceFragmentInContainer(HomeFragment())

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    /**
     * Replace fragment in Home screen
     */
    fun replaceFragmentInContainer(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }
}
