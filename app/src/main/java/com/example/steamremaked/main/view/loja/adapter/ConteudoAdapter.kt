package com.example.steamremaked.main.view.loja.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.steamremaked.R
import com.example.steamremaked.model.Conteudo

class ConteudoAdapter(val itens: List<Conteudo>) : RecyclerView.Adapter<ConteudoAdapter.ConteudoViewHolder>() {

    class ConteudoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val capa = itemView.findViewById<ImageView>(R.id.item_img_conteudo)
        val titulo = itemView.findViewById<TextView>(R.id.item_txt_titulo_conteudo)
        val descricao = itemView.findViewById<TextView>(R.id.item_txt_descricao_conteudo)


        fun bind(conteudo: Conteudo) {
            //Função que ira alterar os conteudos dinamica mente
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConteudoViewHolder {
        return ConteudoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_loja_conteudo, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ConteudoViewHolder, position: Int) {
        holder.bind(itens[position])
    }

    override fun getItemCount() = 5
}