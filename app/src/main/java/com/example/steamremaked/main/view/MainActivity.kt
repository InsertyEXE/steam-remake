package com.example.steamremaked.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.steamremaked.R
import com.example.steamremaked.databinding.ActivityMainBinding
import com.example.steamremaked.main.view.perfil.view.PerfilFragment

private lateinit var binding: ActivityMainBinding
private lateinit var perfilFragment: PerfilFragment
private lateinit var lojaFragment: LojaFragment
private var currentFragment: Fragment? = null


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lojaFragment = LojaFragment()
        perfilFragment = PerfilFragment()
        replaceFragment(R.id.fragment, perfilFragment)

        with(binding) {

            mainToolbar.setNavigationOnClickListener {
                mainDrawer.open()
            }

            mainNav.setNavigationItemSelectedListener { menuItem ->


                when(menuItem.itemId){
                    R.id.menu_main_perfil -> {
                        if (currentFragment == perfilFragment) false
                        currentFragment = perfilFragment
                    }
                    R.id.menu_main_loja -> {
                        if (currentFragment == lojaFragment) false
                        currentFragment = lojaFragment
                    }
                }

                currentFragment?.let {
                    replaceFragment(R.id.fragment, it)
                }

                menuItem.isChecked
                mainDrawer.close()
                true
            }
        }


    }

    private fun replaceFragment(id: Int, fragment: Fragment) {

        if (supportFragmentManager.findFragmentById(id) == null) {
            supportFragmentManager.beginTransaction().apply {
                add(id, fragment)
                commit()
            }
        } else {
            supportFragmentManager.beginTransaction().apply {
                replace(id, fragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}