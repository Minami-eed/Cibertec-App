package com.cibertec.cibertecapp.noticias

import android.os.Bundle
import android.os.RecoverySystem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.cibertec.cibertecapp.R

class NoticiaActivity: AppCompatActivity() {

    val listaNoticias = listOf(
        Noticia("¿DE QUE TRATA LA CARRERA DE DISEÑO DE INTERIORES?",
             "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dictum metus " +
                      "in placerat porta. Morbi ac malesuada magna, et auctor felis. Phasellus blandit maximus orci, " +
                      "sit amet tristique sem sollicitudin vel. Sed eget semper turpis. Nunc molestie id mauris nec dictum.", R.drawable.noticias01),

        Noticia("¿POR QUE ESTUDIAR COMUNICACIÓN AUDIOVISUAL?",
             "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dictum metus" +
                      "in placerat porta. Morbi ac malesuada magna, et auctor felis. Phasellus blandit maximus orci," +
                      "sit amet tristique sem sollicitudin vel. Sed eget semper turpis. Nunc molestie id mauris nec dictum.", R.drawable.noticias02),

        Noticia("15 NOVEDOSAS IDEAS DE REGALO PARA SAN VALENTÍN",
             "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent dictum metus" +
                      "in placerat porta. Morbi ac malesuada magna, et auctor felis. Phasellus blandit maximus orci," +
                      "sit amet tristique sem sollicitudin vel. Sed eget semper turpis. Nunc molestie id mauris nec dictum.", R.drawable.noticias03)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)

        val actionBar = supportActionBar
        actionBar?.hide()

        val recylerNoticias = findViewById<RecyclerView>(R.id.recyclerNoticias)
        recylerNoticias.apply {
             layoutManager = LinearLayoutManager(context)
            // layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            // layoutManager = GridLayoutManager(context, 2)
            // layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
            adapter = NoticiaAdapter(listaNoticias)
        }

    }

}