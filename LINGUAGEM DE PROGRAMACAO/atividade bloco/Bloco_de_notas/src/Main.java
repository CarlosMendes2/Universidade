import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    final static int ADICIONAR = 1;
    final static int REMOVER = 2;
    final static int EDITAR = 3;
    final static int BUSCAPORTEXTO = 4;
    final static int LISTA_COMPLETA = 5;
    final static int SAIR = 0;
    static boolean ligado = true;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        do {
            acoes(blocoDeNotas);
        }while (ligado);

    }
    public static void acoes(BlocoDeNotas blocodenotas){
        printMenu();
        int acao = entradaInteiro();
        switch (acao){
            case ADICIONAR:
                System.out.println("Digite a nova nota: ");
                String novaAnotacao = entradaString();
                System.out.println("Nova nota adicionada em " + blocodenotas.adicionarNovaAnotacao(novaAnotacao));
                break;
            case REMOVER:
                System.out.println("Digite a nota que deseja remover: ");
                int indexNotaRemover = entradaInteiro();
                if (existeAnotacao(blocodenotas,indexNotaRemover)){
                    blocodenotas.blocoDeNotas.remove(indexNotaRemover);
                }else {
                    System.out.println("Essa não existe!");
                }
                break;
            case EDITAR:
                System.out.println("Digite o índex da nota que deseja editar: ");
                int indexNotaEditar = entradaInteiro();
                if (existeAnotacao(blocodenotas,indexNotaEditar)){
                    System.out.println("Digite o que deseja editar: ");
                    String anotacaoEdit = entradaString();
                    blocodenotas.editarAnotacao(indexNotaEditar,anotacaoEdit);
                }else {
                    System.out.println("Essa não existe!");
                }
                break;
            case BUSCAPORTEXTO:
                System.out.println("Digite o texto que deseja busca: ");
                String buscarTexto = entradaString();
                buscaPorTexto(blocodenotas,buscarTexto);
                break;
            case LISTA_COMPLETA:
                imprimeLista(blocodenotas.blocoDeNotas);
                break;
            case SAIR:
                ligado = false;
                break;
        }
    }

    private static void buscaPorTexto(BlocoDeNotas blocodenotas, String buscarTexto) {
        List<Anotacao> listaBuscaPorTexto = new ArrayList<>();
        for (Anotacao anotacao: blocodenotas.blocoDeNotas){
            if (anotacao.getAnotacao().contains(buscarTexto)){
                listaBuscaPorTexto.add(anotacao);
            }
        }
        System.out.println("Notas encontradas");
        imprimeLista(listaBuscaPorTexto);
    }


    public static boolean existeAnotacao(BlocoDeNotas blocoDeNotas,int index){
        return blocoDeNotas.blocoDeNotas.get(index) != null;
    }
    public static void imprimeLista(List<Anotacao> blocoDeNotas){
        for (Anotacao anotacao: blocoDeNotas){
            System.out.println(anotacao);
        }
    }
    public static String entradaString() {
        return scan.nextLine();
    }

    public static int entradaInteiro() {
        String input = entradaString();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite um número inteiro.");
            return entradaInteiro();
        }
    }
    public static void printMenu(){
        System.out.println("1 - Nova anotação");
        System.out.println("2 - Remover anotação");
        System.out.println("3 - Editar anotação");
        System.out.println("4 - Busca por texto");
        System.out.println("5 - Ver lista completa");
        System.out.println("0 - Sair");
    }

}