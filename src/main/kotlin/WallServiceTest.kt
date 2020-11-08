import org.junit.Assert.*
import org.junit.Test
import ru.netology.Post
import ru.netology.WallService

class WallServiceTest {

    @Test
    fun update_False() {

        WallService.add(Post(text = "Нетология", ownerId = 1))
        val update = Post(id = 3, text = "НЕтология", ownerId = 2)
        val result = WallService.update(update)

        assertFalse(result)


    }

    @Test
    fun update_True() {

        WallService.add(Post(text = "Нетология", ownerId = 1))
        val update = Post(id = 3, text = "НЕтология", ownerId = 2)
        val result = WallService.update(update)

        assertFalse(result)
    }
}