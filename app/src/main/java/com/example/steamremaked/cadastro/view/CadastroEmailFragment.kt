package com.example.steamremaked.cadastro.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import com.example.steamremaked.R
import com.example.steamremaked.databinding.FragmentCadastroEmailBinding

class CadastroEmailFragment: Fragment(R.layout.fragment_cadastro_email) {

    private var binding: FragmentCadastroEmailBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentCadastroEmailBinding.bind(view)

        val items = listOf("Brasil", "United States", "日本語", "United Kingdom")
        val adapter = ArrayAdapter(requireContext(), R.layout.item_dropdown_cadastro, items)
        (binding?.cadastroEdtDropdown as AutoCompleteTextView).setAdapter(adapter)

        super.onViewCreated(view, savedInstanceState)
    }


}