import banco.entidades.*;
import banco.entidades.util.Data;
import banco.entidades.util.RecebeDados;

import java.util.Iterator;
import java.util.Scanner;

public class CaixaChatBot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int CRIARCONTA = 1;
        final int LOCALIZARCONTA = 2;
        final int DEPOSITAR = 1;
        final int SACAR = 2;
        final int EXTRATO = 3;
        final int TRANSFERIR = 4;
        final int SALDO = 5;
        final int SAIR = 6;
        
        int opcao;

        do {
            opcao = RecebeDados.recebeInteiro("1 - Criar conta\n2 - Localizar Conta\n6 - Sair");

            switch (opcao) {
                case CRIARCONTA:
                    Conta conta = new ContaSimples(new Pessoa(entradaNomeConta(scan),String.valueOf(RecebeDados.recebeInteiro("Digite seu CPF"))));
                    System.out.println("Conta criada!");
                    break;
                case LOCALIZARCONTA:
                    Conta contaPesquisada = buscaConta(String.valueOf(RecebeDados.recebeInteiro("Digite o CPF: ")));
                    if (contaPesquisada != null) {
                        int acao;

                        do {
                            acao = RecebeDados.recebeInteiro("Depositar - 1\nSacar - 2\nExtrato - 3\nTransferir - 4\nSaldo - 5\nSair - 6");

                            switch (acao) {
                                case DEPOSITAR:
                                    contaPesquisada.depositar(RecebeDados.recebeValorMaiorQueZero("Digite o valor a depositar\n>_"));
                                    break;
                                case SACAR:
                                    contaPesquisada.sacar(RecebeDados.recebeValorMaiorQueZero("Digite o valor que deseja sacar:\n>_"));
                                    break;
                                case EXTRATO:
                                    Data hoje = new Data();
                                    Data ontem = new Data();
                                    ontem.somarDia(-1);
                                    Extrato extratoConta = contaPesquisada.criarExtrato(ontem, hoje);
                                    System.out.println(extratoConta.formatar());
                                    break;
                                case TRANSFERIR:
                                    Conta contaRecebeTransferencia = buscaConta(String.valueOf(RecebeDados.recebeInteiro("Digite o da conta que deseja transferir CPF: ")));
                                    contaPesquisada.transferir(contaRecebeTransferencia,RecebeDados.recebeValorMaiorQueZero("Valor que deseja transferir:\n>_"));
                                    break;
                                case SALDO:
                                    System.out.println(contaPesquisada.getSaldo());
                                    break;
                                case SAIR:
                                    Agencia.fecharCaixa();
                                    break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                                    break;
                            }
                        } while (acao != SAIR);
                    }
                    else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != SAIR);
    scan.close();
    }
    public static Conta buscaConta(String cpf){
        Iterator iterator = Agencia.getContas();
        while (iterator.hasNext()){
            Conta conta = (Conta) iterator.next();
            if (conta.getCPF().equalsIgnoreCase(cpf)){
                return conta;
            }
        }
        System.out.println("CPF não encontrado");
        return null;
    }
    public static String entradaNomeConta(Scanner scan){
        System.out.printf("Digite o nome da conta:%n>_");
        if(scan.hasNextLine()){
            return scan.nextLine();
        }scan.nextLine();
        return entradaNomeConta(scan);
    }

}