package com.cibertec.cibertecapp.noticias

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class NoticiaViewHolder(inflater: LayoutInflater, parent: ViewGroup):
RecyclerView.ViewHolder(inflater.inflate(R.layout.item_noticia,
    parent, false)){

    private var imgPortada: ImageView? = null
    private var txtTitulo: TextView? = null
    private var txtContenido: TextView? = null

    init {
        imgPortada = itemView.findViewById(R.id.imgPortada)
        txtTitulo = itemView.findViewById(R.id.textNoticiaTitulo)
        txtContenido = itemView.findViewById(R.id.textNoticiaContenido)
    }

    fun bind(noticia: Noticia) {
        txtTitulo?.text = noticia.titulo
        txtContenido?.text = noticia.contenido
        imgPortada?.setImageResource(noticia.portada) // Glide
    }

}