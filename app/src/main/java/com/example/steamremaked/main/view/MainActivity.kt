package com.example.steamremaked.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.steamremaked.R
import com.example.steamremaked.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){

            mainToolbar.setNavigationOnClickListener {
                mainDrawer.open()
            }

            mainNav.setNavigationItemSelectedListener { menuItem ->
                menuItem.isChecked = true


                true
            }
        }


    }
}