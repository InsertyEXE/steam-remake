package com.example.steamremaked.main.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.steamremaked.R
import com.example.steamremaked.databinding.FragmentMainLojaBinding

class LojaFragment: Fragment(R.layout.fragment_main_loja) {

    private var binding: FragmentMainLojaBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMainLojaBinding.bind(view)


    }
}