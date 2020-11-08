package ru.netology

class Post(
    var id: Int = 0,
    val ownerId: Int,
    val text: String,
)