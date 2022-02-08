package com.example.kotlin_lesson1.data

data class Film(var name:String, var time:Int, var description:String, var id:Int = -1) {
    override fun toString(): String {
        return "$time min"
    }
}
