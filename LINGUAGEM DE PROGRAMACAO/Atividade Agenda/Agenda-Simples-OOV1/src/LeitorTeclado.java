import java.util.Scanner;
public class LeitorTeclado extends ValidadorEntradas{
    static Scanner scan = new Scanner(System.in);
    public String entradaNome(){
        System.out.printf("Digite o nome do usuário%n>_");
        String entradaNome = scan.nextLine();
        if(verificaEntradaString(entradaNome)){
            return entradaNome;
        }
        System.out.printf("Entrada Inválida,tente novamente!%n");
        return entradaNome();
    }
    public String entradaTelefone(){
        System.out.printf("Digite o número do usuário%n>_");
        String entradaTelefone = scan.nextLine();
        if(verificaEntradaNumber(entradaTelefone)){
            return entradaTelefone;
        }
        System.out.printf("Entrada Inválida,tente novamente!%n");
        return entradaTelefone();
    }
    public String entradaEmail(){
        System.out.printf("Digite o email do usuário%n>_");
        String entradaEmail = scan.nextLine();
        if(verificaEntradaEmail(entradaEmail)){
            return entradaEmail;
        }
        System.out.printf("Entrada Inválida,tente novamente!%n");
        return entradaEmail;
    }
    public String entradaEventoAgenda(){
        String entradaEvento = scan.nextLine();
        if(verificaEntradaEvento(entradaEvento)){
            return entradaEvento;
        }
        System.out.printf("Entrada Inválida,tente novamente!%n>_");
        return entradaEventoAgenda();
    }
    public String entradaLetra(){
        String entradaLetra = scan.nextLine();
        if(verificaEntradaLetra(entradaLetra)){
            return entradaLetra;
        }
        System.out.printf("Entrada Inválida,tente novamente!%n>_");
        return entradaLetra();
    }
}
