//Escreva um programa em Java que sirva de agenda, cadastrando nomes, telefones e e-mails dos contatos.
//
//Requisitos funcionais:
//- adicionar novo contato
//- buscar contato pelo nome
//
//Dicas da programação:
//- não escrever tudo dentro do main. Usar modularização, isto é, criar métodos que são chamados no main
//- usar arrays de Strings (pode ser array com 50 posições)
//- usar Scanner para receber dados do teclado. API de Scanner
//- você tem que pensar em um esquema para identificar a próxima posição livre do array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        agendaSimples(scan);
        scan.close();
    }

    private static void agendaSimples(Scanner scan) {
        String[][] cadastros = new String[50][3];
        int entradaStart = inputAcao(scan);
        while (entradaStart!=3){
            if (entradaStart == 1){
                cadastros = cadastro(scan,cadastros);
            } else if (entradaStart ==2) {
                busca(scan, cadastros);
            }
            entradaStart=inputAcao(scan);
        }
        System.err.println("Programa Finalizado");
    }
    //Verificado
    private static int inputAcao(Scanner scn) {
        System.out.printf("-> Cadastro digite '1' %n-> Busca por nome digite '2' %n-> Sair digite '3'%n_");
        if(scn.hasNextInt()){
            int entrada = scn.nextInt();
            if(entrada >= 1 && entrada <=3){
                scn.nextLine();
                return entrada;
            }else{
                System.err.println("ENTRADA INVÁLIDA!");
                scn.nextLine();
                return inputAcao(scn);
            }
        }
        System.err.println("ENTRADA INVÁLIDA!");
        scn.nextLine();
        return inputAcao(scn);
    }
    //@TODO
    private static void busca(Scanner scn, String[][] cadastro) {
        System.out.println("busca");
        String buscaNome = scn.nextLine();
        boolean user = false;
        for (String[] usuario : cadastro) {
            if (buscaNome.equalsIgnoreCase(usuario[0])) {
                System.out.println("Nome: " + usuario[0]);
                System.out.println("Número: " + usuario[1]);
                System.out.println("Email: " + usuario[2]);
                user = true;
                break;
            }
        }
        if (!user){System.err.println("Usuario não encontrado!");}
    }
    //Verificado!
    private static String[][] cadastro(Scanner scn, String[][] cadastros) {
        String[] novoUsuario = inputCadastroUsuario(scn);
        for (int i= 0; i <cadastros.length;i++){
            if (cadastros[i][0] == null){
                cadastros[i] = novoUsuario;
                break;
            }
        }
        return cadastros;
    }
    //Verificado!
    private static String[] inputCadastroUsuario(Scanner scan){
        System.out.print("Digite o nome: ");
        String name = scan.nextLine();
        System.out.print("Digite o número: ");
        String number = scan.nextLine();
        System.out.print("Digite o email: ");
        String email = scan.nextLine();
        return new String[]{name, number, email};
    }
}






