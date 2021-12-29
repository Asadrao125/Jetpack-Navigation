package com.technado.jetpacknavigation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.technado.jetpacknavigation.R

class MainActivity : AppCompatActivity() {
    lateinit var navControlller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        navControlller = navHostFragment.navController
        setupActionBarWithNavController(navControlller)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navControlller.navigateUp() || super.onSupportNavigateUp()
    }
}