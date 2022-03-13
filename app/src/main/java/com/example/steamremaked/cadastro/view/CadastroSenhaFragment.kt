package com.example.steamremaked.cadastro.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.steamremaked.R
import com.example.steamremaked.databinding.FragmentCadastroSenhaBinding

class CadastroSenhaFragment: Fragment(R.layout.fragment_cadastro_senha) {

    private var binding: FragmentCadastroSenhaBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentCadastroSenhaBinding.bind(view)

    }
}