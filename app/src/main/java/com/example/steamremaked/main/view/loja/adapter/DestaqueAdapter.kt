package com.example.steamremaked.main.view.loja.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.steamremaked.R
import com.example.steamremaked.model.Destaque

class DestaqueAdapter(val itens: List<Destaque>): RecyclerView.Adapter<DestaqueAdapter.DestaqueViewHolder>() {

    class DestaqueViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val capa = itemView.findViewById<ImageView>(R.id.item_img_destaque)

        fun bind(destaque: Destaque){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestaqueViewHolder {
        return DestaqueViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_loja_destaque, parent, false))
    }

    override fun onBindViewHolder(holder: DestaqueViewHolder, position: Int) {
        holder.bind(itens[position])
    }

    override fun getItemCount() = itens.size




}