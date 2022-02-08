package com.example.kotlin_lesson1.ui


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_lesson1.R
import com.example.kotlin_lesson1.data.Film
import com.example.kotlin_lesson1.data.FilmsList

class MainActivity : AppCompatActivity() {
    private lateinit var goButton: Button
    private lateinit var filmName: TextView
    private lateinit var filmDescription: TextView
    private var list: FilmsList = FilmsList


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (list.size() == 0) list.init()

        goButton = findViewById(R.id.activity_main_button)
        val film = Film("Bloodshort", 209, "Stuff")
        filmName = findViewById(R.id.activity_main_film_name)
        filmDescription = findViewById(R.id.activity_main_film_description)
        filmName.text = film.name
        filmDescription.text = film.description

        val newFilm = film.copy(name = "Lock, stock, and barrel ", description = "cool")
        val newFilmName = findViewById<TextView>(R.id.activity_main_new_film_name)
        val newFilmDescription = findViewById<TextView>(R.id.activity_main_new_film_description)
        newFilmName.text = newFilm.name
        newFilmDescription.text = newFilm.description

        findViewById<TextView>(R.id.activity_main_film_from_list_name).text = list.read(2)?.name
        findViewById<TextView>(R.id.activity_main_film_from_list_description).text =  list.read(2)?.name



        goButton.setOnClickListener {
            val recyclerView: RecyclerView = findViewById(R.id.list)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = RecyclerAdapterNew(list)
            recyclerView.adapter = RecyclerAdapterNew(list)
        }


    }
}


