import banco.entidades.ContaSimples;

public class Banco2 {
    public static void main(String[] args) {
        ContaSimples contaNumeroUm = new ContaSimples("João","309140605-06");
        contaNumeroUm.depositar(1000);
        ContaSimples contaNumeroDois = new ContaSimples("Ana","123456789-01");
        contaNumeroUm.transferir(contaNumeroDois,400);
        System.out.println(contaNumeroUm);
        System.out.println(contaNumeroDois);
    }
}
