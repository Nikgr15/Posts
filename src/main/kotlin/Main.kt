package ru.netology

fun main() {

    val original = Post(
        id = 1, ownerId = 1, text = "Нетология"
    )

    val updatedPost = Post(
        id = 1, ownerId = 1, text = "Новая Нетология"
    )

    WallService.add(original)

    WallService.update(updatedPost)
    print(WallService.update(updatedPost))
}