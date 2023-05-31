package com.cibertec.cibertecapp.noticias

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NoticiaAdapter(val list: List<Noticia>) :
    RecyclerView.Adapter<NoticiaViewHolder>(){

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return NoticiaViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: NoticiaViewHolder, position: Int) {
        val noticia: Noticia = list[position]
        holder.bind(noticia)
    }

}