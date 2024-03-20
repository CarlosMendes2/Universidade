import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class UsuarioTest {
    Usuario user;
    Usuario secUser;
    @BeforeEach
    void testUsuario(){
        user = new Usuario("Maria");
        secUser = new Usuario("Joao");
        RedeSocial.cadastraUsuario(user);
        RedeSocial.cadastraUsuario(secUser);
    }
    @Test
    void testNovoPost() {
        Assertions.assertEquals("Maria",user.getNome());
        Assertions.assertEquals("Joao",secUser.getNome());

        Post post = new Post("Primeiro Post");
        Post post2 = new Post("Segundo Post Post");
        user.novoPost("Primeiro Post");
        user.novoPost("Segundo Post Post");

        Assertions.assertEquals(post.toString(),user.getMural().get(0).toString());
        Assertions.assertEquals(post2.toString(),user.getMural().get(1).toString());

        Assertions.assertEquals(2,user.getMural().size());

    }

    @Test
    void testSeguir() {
        user.seguirUsuario("Joao");
        Assertions.assertEquals(1,user.getSeguindo().size());
        Assertions.assertTrue(user.isSeguindo("Joao"));
        Assertions.assertFalse(secUser.isSeguindo("Maria"));
    }
}