import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int CRIARCONTA = 1;
    private static final int LOGAR = 2;
    private static final int POSTAR = 1;
    private static final int SEGUIR = 2;
    private static final int VERSEGUINDO = 3;
    private static final int VERSEGUIDORES = 4;
    private static final int VERMEUMURAL = 5;
    private static final int VERMURALDEOUTRAPESSOA = 6;
    private static final int DELETARPOST = 1; //TODO
    private static final int EDITARPOST = 2; //TODO
    private static final int DARLIKE = 1; //TODO
    private static final int DESLOGAR = 9;
    private static final int SAIR = 0;
    private static Usuario logado = null;
    private static boolean status = true;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            menuIniciar();
        }while (status);
    }
    private static void menuIniciar(){
        exibirMenuInicial();
        int opMenuInicial = entradaInteiros();
        switch (opMenuInicial){
            case CRIARCONTA:
                System.out.println("Criar usuario: ");
                String novoUsuario = entradaStrings();
                if (!RedeSocial.isNomeInvalido(novoUsuario)){
                    try {
                        RedeSocial.buscaUsuarioCadastrado(novoUsuario);
                        System.out.println("O usuário já existe!");
                    }catch (IllegalArgumentException ise){
                        RedeSocial.cadastraUsuario(new Usuario(novoUsuario));
                        System.out.println("Usuário criado com sucesso.");
                    }
                }else{
                    System.out.println("Nome inválido");
                }
                break;
            case LOGAR :
                System.out.println("====================================");
                System.out.println("Digite seu Login:");
                String loginUsuario = entradaStrings();
                try{
                    logado= RedeSocial.buscaUsuarioCadastrado(loginUsuario);
                    menuUsuario(logado);
                }catch (IllegalArgumentException iae){
                    System.out.println("Usuário não encontrado!");
                }
                break;
            case SAIR:
                status = false;
                break;
        }
    }
    private static void menuUsuario(Usuario userLogado) {
        int opMenuUsuario;
        do {
        exibirMenuUsuario();
        opMenuUsuario = entradaInteiros();
        switch (opMenuUsuario){
            case POSTAR:
                try{
                    System.out.println("Novo post: ");
                    String conteudoNovoPost = entradaStrings();
                    userLogado.novoPost(conteudoNovoPost);
                    System.out.println("Nova publicação.");
                    break;
                }catch (IllegalArgumentException iae){
                    System.out.println("Post inválido!");
                }
                break;
            case SEGUIR:
                try{
                    System.out.println("Digite o nome do usuario que deseja seguir: ");
                    String seguirUsuario = entradaStrings();
                    userLogado.seguirUsuario(seguirUsuario);
                    System.out.println("Agora você está seguindo "+ seguirUsuario);
                    break;
                }catch (IllegalStateException nsfe){
                    System.out.println("Você já está seguindo o usuário!");
                }catch (IllegalArgumentException iae){
                    System.out.println("Usuário não encontrado!");
                }
                    break;
            case VERSEGUINDO:
                try{
                    exibirUsuariosSeguindo(userLogado);
                }catch (IllegalStateException ise){
                    System.out.println("Você não segue nenhum usuário");
                }
                break;
            case VERSEGUIDORES:
                try{
                    exibirSeguidores(userLogado);
                }catch (IllegalArgumentException iae){
                    System.out.println("Você não tem seguidores");
                }
                break;
            case VERMEUMURAL:
                try{
                    exibirMural(userLogado);
                }catch (IllegalStateException iae){
                    System.out.println("Você não tem nenhum conteúdo postado!");
                }
                break;
            case VERMURALDEOUTRAPESSOA:
                try{
                    Usuario pessoaBuscada = RedeSocial.buscaUsuarioCadastrado(entradaStrings());
                    List<Post> muralBuscado = pessoaBuscada.getMural();
                    exibirMuralOutroUsuario(muralBuscado, pessoaBuscada.getNome());

                }catch (IllegalArgumentException iae){
                    System.out.println("Usuário não encontrado!");
                }
                break;
            case DESLOGAR:
                logado = null;
                menuIniciar();
                break;
            case SAIR:
                logado = null;
                status = false;
                break;
            }
        }while (opMenuUsuario!= DESLOGAR);
    }
    private static void exibirMuralOutroUsuario(List<Post> muralBuscado, String nomeUsuario) {
        if (!muralBuscado.isEmpty()){
            for (Post post: muralBuscado){
                System.out.println(">"+nomeUsuario+"-> "+post);
            }
        }else{
            System.out.println(nomeUsuario+" não postou nada.");
        }
    }
    private static void exibirSeguidores(Usuario userLogado) {
        for (Usuario user : userLogado.getUsuariosSeguidores()){
            System.out.println(user.getNome());
        }
    }
    private static void exibirUsuariosSeguindo(Usuario userLogado){
        for (Usuario user : userLogado.getSeguindo()){
            System.out.println(user.getNome());
        }
    }
    private static void exibirMural(Usuario userLogado) throws IllegalStateException {
        for (Post post: userLogado.getMural()){
            System.out.println(">"+userLogado.getNome()+"-> "+post);
        }
        if (!userLogado.getSeguindo().isEmpty()){
            for (Usuario seguindor: userLogado.getSeguindo()){
                exibirMuralOutroUsuario(seguindor.getMural(),seguindor.getNome());
            }
        }
    }
    private static void exibirMenuInicial() {
        System.out.println("====================================");
        System.out.println("#1# Criar conta");
        System.out.println("#2# Logar");
        System.out.println("#0# Sair");
        System.out.println("====================================");
    }
    private static void exibirMenuUsuario() {
        System.out.println("====================================");
        System.out.println("#1# Novo post");
        System.out.println("#2# Seguir");
        System.out.println("#3# Seguindo");
        System.out.println("#4# Seguidores");
        System.out.println("#5# Ver mural");
        System.out.println("#6# Ver postagens seguidor");
        System.out.println("#9# Deslogar");
        System.out.println("#0# Sair");
        System.out.println("====================================");
    }
    private static String entradaStrings() {
        return scan.nextLine();
    }
    private static int entradaInteiros() {
        String input = entradaStrings();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida!");
            return entradaInteiros();
        }
    }
}
