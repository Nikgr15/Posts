package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var nextId = 1

    fun add(post: Post): Post {
        posts += post
        post.id = nextId++
        return posts.last()
    }


    fun update(post: Post): Boolean {
        for (indexPost in posts) {
            if (post.id == indexPost.id) {
                val updatedPost = Post(indexPost.id, post.ownerId, post.text)
                posts[posts.indexOf(indexPost)] = updatedPost
                return true
            }
        }
        return false

    }
}