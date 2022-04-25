package com.example.steamremaked.main.view.loja.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.steamremaked.R
import com.example.steamremaked.model.Oferta

class OfertaAdapter(val itens: List<Oferta>) : RecyclerView.Adapter<OfertaAdapter.OfertaViewHolder>() {

    class OfertaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val capa = itemView.findViewById<ImageView>(R.id.item_img_oferta)


        fun bind(oferta: Oferta) {
            //Função que ira alterar os conteudos dinamica mente
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfertaViewHolder {
        return OfertaViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_loja_ofertas, parent, false)
        )
    }

    override fun onBindViewHolder(holder: OfertaViewHolder, position: Int) {
        holder.bind(itens[position])
    }

    override fun getItemCount() = 5
}