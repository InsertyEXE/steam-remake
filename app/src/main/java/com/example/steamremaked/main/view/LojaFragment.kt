package com.example.steamremaked.main.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.steamremaked.R
import com.example.steamremaked.databinding.FragmentMainLojaBinding

class LojaFragment : Fragment(R.layout.fragment_main_loja) {

    private var binding: FragmentMainLojaBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMainLojaBinding.bind(view)

        binding?.let {
            with(it) {

                lojaRvOfertas.layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)
                lojaRvOfertas.adapter = OfertaAdapter()

                lojaRvConteudo.layoutManager =
                    LinearLayoutManager(requireContext())
                lojaRvConteudo.adapter = ConteudoAdapter()
            }
        }
    }

    private class OfertaAdapter : RecyclerView.Adapter<OfertaAdapter.OfertaViewHolder>() {

        private class OfertaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(placeholder: Int) {
                itemView.findViewById<ImageView>(R.id.item_img_oferta)
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfertaViewHolder {
            return OfertaViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_loja_ofertas, parent, false)
            )
        }

        override fun onBindViewHolder(holder: OfertaViewHolder, position: Int) {
            holder.bind(R.drawable.placeholder)
        }

        override fun getItemCount(): Int {
            return 5
        }

    }

    private class ConteudoAdapter : RecyclerView.Adapter<ConteudoAdapter.ConteudoViewHolder>() {

        private class ConteudoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            fun bind(placeholder: Int, titulo: String, descricao: String) {
                itemView.findViewById<ImageView>(R.id.item_img_conteudo)
                itemView.findViewById<TextView>(R.id.item_txt_titulo_conteudo)
                itemView.findViewById<TextView>(R.id.item_txt_descricao_conteudo)
            }

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConteudoViewHolder {
            return ConteudoViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_loja_conteudo, parent, false)
            )
        }

        override fun onBindViewHolder(holder: ConteudoViewHolder, position: Int) {
            holder.bind(R.drawable.placeholder, "Titulo", "descrição")
        }

        override fun getItemCount(): Int {
            return 6
        }


    }
}