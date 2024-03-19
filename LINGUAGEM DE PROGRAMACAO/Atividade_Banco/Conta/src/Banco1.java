import banco.entidades.ContaSimples;

public class Banco1 {
    public static void main(String[] args)
    {
        ContaSimples umaConta = new ContaSimples("João","309140605-06");
        umaConta.depositar(1000);
        System.out.println(umaConta.getSaldo());
        umaConta.sacar(300);
        System.out.println(umaConta.toString());
        System.out.println(umaConta.getSaldo());
    }
}