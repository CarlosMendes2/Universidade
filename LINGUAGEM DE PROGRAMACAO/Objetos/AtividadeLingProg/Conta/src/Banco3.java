import banco.entidades.*;
import banco.entidades.util.RecebeDados;

import java.util.Scanner;

public class Banco3 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João","30914060506");
        Pessoa pessoa2 = new Pessoa("Ana","12345678901");

        ContaSimples contaJoao = new ContaSimples(pessoa1);
        ContaSimples contaAna = new ContaSimples(pessoa2);

        double depositoJoao = RecebeDados.recebeValorMaiorQueZero("Valor para depositar na conta de Joao:");
        contaJoao.depositar(depositoJoao);
        double transferenciaJoaoAna = RecebeDados.recebeValorMaiorQueZero("Transferencia de João para Ana");
        contaJoao.transferir(contaAna,transferenciaJoaoAna);
        Agencia.fecharCaixa();


    }
}
