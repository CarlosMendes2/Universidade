import java.util.HashSet;
import java.util.Set;
public class RedeSocial {
    public static Set<Usuario> usuariosCadastrados = new HashSet<>();
    public static Usuario buscaUsuarioCadastrado(String nome) throws IllegalArgumentException {
        for (Usuario user: usuariosCadastrados){
            if (user.getNome().equalsIgnoreCase(nome)){
                return user;
            }
        }
        throw new IllegalArgumentException("Usuario não encontrado");
    }
    public static void cadastraUsuario(Usuario user){
        usuariosCadastrados.add(user);
    }
    public static boolean isNomeInvalido(String nome) {
        return nome == null || nome.isBlank() || nome.isEmpty();
    }
    public static int teste(){
        return usuariosCadastrados.size();
    }
    //TODO ver quais métodos da Main tem lógica para pertencer a essa clásse.
}
