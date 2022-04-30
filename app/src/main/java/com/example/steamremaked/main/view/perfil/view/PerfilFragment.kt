package com.example.steamremaked.main.view.perfil.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.steamremaked.R
import com.example.steamremaked.databinding.FragmentMainPerfilBinding

class PerfilFragment: Fragment(R.layout.fragment_main_perfil) {

    var binding: FragmentMainPerfilBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMainPerfilBinding.bind(view)
    }
}