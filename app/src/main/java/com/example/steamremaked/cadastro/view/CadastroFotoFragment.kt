package com.example.steamremaked.cadastro.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.example.steamremaked.R
import com.example.steamremaked.databinding.FragmentCadastroFotoBinding
import com.example.steamremaked.ui.util.CustomDialog

class CadastroFotoFragment : Fragment(R.layout.fragment_cadastro_foto) {

    private var binding: FragmentCadastroFotoBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentCadastroFotoBinding.bind(view)

        val contract = registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->
            Log.i("imagem", uri.toString())
            binding?.cadastroImgPerfil?.setImageURI(uri)
        }

        binding?.let {
            with(it) {

                cadastroBtnAdicionarFoto.isEnabled = true
                cadastroBtnAdicionarFoto.setOnClickListener {
                    contract.launch("image/*")
                }


            }
        }
    }
}