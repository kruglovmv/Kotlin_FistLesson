package com.example.kotlin_lesson1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_lesson1.R
import com.example.kotlin_lesson1.data.FilmsList

class RecyclerAdapterNew(private val films: FilmsList = FilmsList) :
    RecyclerView.Adapter<RecyclerAdapterNew.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val filmName: TextView = itemView.findViewById(R.id.film_name)
        val filmDescription: TextView = itemView.findViewById(R.id.film_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.holder_for_film, parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.filmName.text = films.getFilms()[position].name
        holder.filmDescription.text = films.getFilms()[position].description

    }

    override fun getItemCount(): Int = films.size()


}