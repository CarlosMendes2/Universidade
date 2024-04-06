import java.util.Scanner;

public class PetshopCaoFianca {
    public static final int SAIR = 0;
    public static final int SERVICO_HOTELZINHO = 1;
    public static final int SERVICO_BANHO = 2;
    public static final int SERVICO_TOSA = 3;
    public static Scanner scan = new Scanner(System.in);
    public static int codigoServico = 0;
    public static boolean status = true;
    public static void main(String[] args) {
        InventarioDeServicos inventarioDeServicos = new InventarioDeServicos();
        do {
            menuServicos(inventarioDeServicos);
        }while (status);
        relatorioFinalDia(inventarioDeServicos);
    }

    private static void menuServicos(InventarioDeServicos inventarioDeServicos) {
        exibeBannerPetshop();
        System.out.println("Qual serviço deseja cadastrar?");
        System.out.println("Hotelzinho (1) | Banho (2) | Tosa(3) | Finalizar Serviços (0)");
        int escolhaServico = entradaInteiro();
        switch (escolhaServico){
            case SERVICO_HOTELZINHO -> {
                System.out.println("Qual o tamanho do pet?(P,M,G)");
                String tamanhoDoPet = scan.next(); //FIXME NÃO FUNCIONA SE DIGITAR OS VALUES DO ENUM
                System.out.println("Quantas horas?");
                int quantidadeHoras = entradaInteiro();
                inventarioDeServicos.adicionaServico(new ServicoHotelzinho(geraCodigo(),tamanhoDoPet,quantidadeHoras));
            }
            case SERVICO_BANHO -> {
                System.out.println("Qual o tamanho do pet?(P,M,G)");
                String tamanhoDoPet = scan.next();
                System.out.println("Qual o tamanho do pêlo?(P,M,G)");
                String tamanhoDoPelo = scan.next();
                inventarioDeServicos.adicionaServico(new ServicoBanho(geraCodigo(),tamanhoDoPet,tamanhoDoPelo));
            }
            case SERVICO_TOSA -> {
                System.out.println("Qual o tamanho do pet?(P,M,G)");
                String tamanhoDoPet = scan.next();
                inventarioDeServicos.adicionaServico(new ServicoTosa(geraCodigo(),tamanhoDoPet));
            }
            case SAIR -> status = false;
        }
    }
    private static int entradaInteiro() {
        if (scan.hasNextInt()){
            return scan.nextInt();
        }scan.nextLine();
        System.out.println("Entrada inválida");
        return entradaInteiro();
    }
    public static int geraCodigo(){
        return codigoServico +=1 ;
    }
    private static void relatorioFinalDia(InventarioDeServicos inventarioDeServicos){
        for (Servico servico: inventarioDeServicos.getInventarioDeServicos()){
            System.out.println(servico);
        }
        System.out.println("Total arrecadado: "+inventarioDeServicos.getPrecoTotal());
    }
    public static void exibeBannerPetshop(){
        System.out.println("   +---------------------------------------+\n" +
                "   | ,-.___,-.                      __     |\n" +
                "   | \\_/_ _\\_/    PETSHOP      (___()'`;   |\n" +
                "   |   )O_O(                   /,    /`    |\n" +
                "   |  { (_) }    CÃO-FIANÇA    \\\\\"--\\\\     |\n" +
                "   |   `-^-'                               |\n" +
                "   +---------------------------------------+");
    }
}
