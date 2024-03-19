import java.util.ArrayList;
import java.util.List;

public class Agenda extends LeitorTeclado{
    private final List<Usuario> usuarios;

    public Agenda (){
        this.usuarios = new ArrayList<>(); //**
        System.out.println("Agenda criada");
    }
    public void adicionarNovoUsuario(){
        usuarios.add(new Usuario(entradaNome(),entradaTelefone(),entradaEmail()));
        System.out.println("Novo usuário adicionado.");
    }
    public void buscaUsuarioPeloNome(){
        String nome = entradaNome();
        for (Usuario usuario: usuarios){
            if (nome.equalsIgnoreCase(usuario.getNome())){
                System.out.printf("---Consulta Usuário---" +
                        "%nNome:"+usuario.getNome()
                        +"%n---%nTelefone:"+usuario.getTelefone()
                        +"%n---%nE-mail:"+usuario.getEmail()
                        +"%n---%n");
            }else {
                System.out.println("Usuário não encontrado!");
            }
        }
    }
    public void buscaTodosContatos() {
        if(!usuarios.isEmpty()){
            System.out.printf("---%nTodos os usuários cadastrados:%n---%n");
            for (Usuario user: usuarios){
                System.out.printf("Nome: %s, Telefone: %s, Email: %s %n---%n",user.getNome(),user.getTelefone(),user.getEmail());
            }
        }else{
            System.out.println("Lista vazia!");
        }
    }

    public void buscaPorLetra() {
        String chr = entradaLetra();
        System.out.println("Usuários que começam com a letra "+chr);
        for (Usuario user: usuarios){
            if (String.valueOf(user.getNome().charAt(0)).equalsIgnoreCase(chr)){
                System.out.println("-"+user.getNome());
            }
        }
    }
}
