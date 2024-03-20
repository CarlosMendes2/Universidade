import java.util.*;

public class Usuario {
    private String nome;
    private List<Post> mural;
    private List<Post> postDeletados;
    private Set<Usuario> seguindo;
    private Set<Usuario> seguidores;
    public Usuario(String nome){
            this.nome = nome;
            this.mural = new ArrayList<>();
            this.seguindo = new HashSet<>();
            this.seguidores = new HashSet<>();
    }
    public void novoPost(String conteudoNovoPost){
        mural.add(new Post(conteudoNovoPost));
    }
    public void seguirUsuario(String seguirUsuario) {
        if (isSeguindo(seguirUsuario)){
            throw new IllegalStateException("Usuário já está seguindo.");
        }
        try {
            Usuario usuarioSeguindo = RedeSocial.buscaUsuarioCadastrado(seguirUsuario);
            seguindo.add(usuarioSeguindo);
            usuarioSeguindo.seguidores.add(this);

        }catch (IllegalArgumentException iae){
            throw new IllegalArgumentException("Usuario não existe!");
        }
    }
    public boolean isSeguindo(String seguirUsuario){
        try {
            return seguindo.contains(buscaUsuarioPorNome(seguirUsuario));
        }catch (IllegalStateException nsfe){
            return false;
        }
    }
    public Usuario buscaUsuarioPorNome(String buscaUsuario) throws IllegalStateException {
        for (Usuario user: seguindo){
            if (user.getNome().equalsIgnoreCase(buscaUsuario)){
                return user;
            }
        }
        throw new IllegalStateException("Usuário não encontrado");
    }
    public Set<Usuario> getUsuariosSeguidores(){
        return seguidores;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Post> getMural() {
        return mural;
    }
    public Set<Usuario> getSeguindo(){
        if (seguindo.isEmpty()){
            throw new IllegalStateException("Usuário não segue ninguém");
        }
        return seguindo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
