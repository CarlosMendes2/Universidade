//Melhore seu programa para se prevaver de erros de entrada de dados. Não permita que os nomes dos contatos tenham números,
//não permita que os números telefônicos tenham caracteres e cheque se existe um caractere '@' no email passado.
//Dica: existe uma classe wrapper de char que é Character, e que tem um método estático Character.isDigit(char c).
//Você pode usar o método charAt de String para pegar caractere por caractere e verificar se é ou não dígito.

import java.util.Scanner;

public class MainV2 {
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

    private static String[] inputCadastroUsuario(Scanner scan){
        System.out.print("Digite o nome: ");
        String name = validaName(scan);
        System.out.print("Digite o número: ");
        String number = validaNumber(scan);
        System.out.print("Digite o email: ");
        String email = validaEmail(scan);
        return new String[]{name, number, email};
    }

    private static String validaEmail(Scanner scan) {
        String email = scan.nextLine();
        boolean temArroba = false;
        for(int i = 0; i< email.length(); i++){
            Character verif = email.charAt(i);
            if("@".equalsIgnoreCase(String.valueOf(verif))){
                temArroba = true;
            }
        }
        if(temArroba){
            return email;
        }else{
            System.out.println("Email inválido!");
            System.out.println("Digite um email válido: ");
            return validaEmail(scan);
        }
    }

    private static String validaNumber(Scanner scan) {
        String number = scan.nextLine();
        for(int i = 0; i< number.length(); i++){
            Character verif = number.charAt(i);
            if(!Character.isDigit(verif)){
                System.out.println("Número inválido!");
                System.out.println("Digite um número válido: ");
                return validaNumber(scan);
            }
        }
        return number;
    }


    private static String validaName(Scanner scan) {
        String name = scan.nextLine();
        for(int i = 0; i< name.length(); i++){
            Character verif = name.charAt(i);
            if(Character.isDigit(verif)){   // V if number
                System.out.println("Nome inválido!");
                System.out.println("Digite um nome válido: ");
                return validaName(scan);
            }
        }
        return name;
    }
}






