import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PostTest {
    Post post;
    @BeforeEach
    void testPost() {
        post = new Post("Hello world");
    }
    @Test
    void isPostInvalido() {
        Assertions.assertFalse(Post.isPostInvalido("Olá mundo"));
        Assertions.assertTrue(Post.isPostInvalido("   "));
    }
    @Test
    void setPost() {
        Assertions.assertFalse(post.setPost("  "));
        Assertions.assertFalse(post.setPost(null));
    }
    @org.junit.jupiter.api.Test
    void getPost() {
    }
}