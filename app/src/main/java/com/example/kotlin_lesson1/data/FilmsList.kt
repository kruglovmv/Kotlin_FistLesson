package com.example.kotlin_lesson1.data


object FilmsList {
    var counter: Int = -1
    private val filmsList: ArrayList<Film> = ArrayList<Film>()

    fun getFilms(): ArrayList<Film> {
        return filmsList
    }


    fun create(film: Film) {
        film.id = counter++
        filmsList.add(film)
    }

    fun update(id: Int, film: Film) {
        for (i in 0 until filmsList.size)
            if (filmsList[i].id == id) {
                filmsList[i] = film
                return
            }
    }

    fun read(id: Int): Film? {
        for (i in filmsList.size - 1 downTo 0)
            if (filmsList[i].id == id) {
                return filmsList[i]
            }
        return null
    }

    fun delete(film: Film) {
        filmsList.remove(film)
    }

    fun init() {

        create(Film("Film1", 250, "Film number one"))
        create(Film("Film2", 350, "Film number two"))
        create(Film("Film3", 450, "Film number free"))
        create(Film("Film4", 50, "Film number four"))
        create(Film("Film5", 550, "Film number five"))
        create(Film("Film6", 650, "Film number six"))
        create(Film("Film7", 350, "Film number seven"))
        create(Film("Film8", 250, "Film number eight"))
    }

    fun size(): Int = filmsList.size
}
