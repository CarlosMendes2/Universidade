import banco.entidades.*;
import banco.entidades.util.Data;
import banco.entidades.util.RecebeDados;

import java.util.Scanner;

public class CaixaChatBot3 {
    public static void main(String[] args) {

        final int CRIARCONTA = 1;
        final int LOCALIZARPELONUMERO = 2;
        final int DEPOSITAR = 1;
        final int SACAR = 2;
        final int EXTRATO = 3;
        final int TRANSFERIR = 4;
        final int SALDO = 5;
        final int SAIR = 6;

        int opcaoInicial = 0;

        do {
            switch (opcaoInicial) {
                case CRIARCONTA:
                    String name = entradaString("Digite o nome: ");
                    String cpf = entradaString("Digite o CPF: ");
                    Pessoa pessoa = new Pessoa(name, cpf);
                    ContaSimples conta = new ContaSimples(pessoa);
                    break;

                case LOCALIZARPELONUMERO:
                    Conta contaPesquisada = Agencia.localizarConta(RecebeDados.recebeInteiro("Digite o nº da conta: "));
                    if (contaPesquisada != null) {
                        System.out.println("Olá, " + contaPesquisada.getTitular().getNome() + ".");
                        int opcoesLocalizaPeloNumero;
                        do {
                            opcoesLocalizaPeloNumero = RecebeDados.recebeInteiro("1-Depositar\n2-Sacar\n3-Extrato\n4-Transferir\n5-Saldo\n6-Sair");
                            switch (opcoesLocalizaPeloNumero) {
                                case DEPOSITAR:
                                    double valorDepositar = RecebeDados.recebeValorMaiorQueZero("Quanto deseja depositar?\n>_");
                                    contaPesquisada.depositar(valorDepositar);
                                    System.out.println("R$" + valorDepositar + "depositado!");
                                    break;

                                case SACAR:
                                    double valorSacar = RecebeDados.recebeValorMaiorQueZero("Quanto deseja sacar?\n>_");
                                    contaPesquisada.sacar(valorSacar);
                                    System.out.println("Você sacou R$" + valorSacar + "!");
                                    break;
                                case EXTRATO:
                                    Data hoje = new Data();
                                    Data ontem = new Data();
                                    ontem.somarDia(-1);
                                    Extrato extrato = contaPesquisada.criarExtrato(ontem, hoje);
                                    System.out.println(extrato.formatar());
                                    break;

                                case TRANSFERIR:
                                    Conta contaRecebeTransferencia = Agencia.localizarConta(RecebeDados.recebeInteiro("Qual o nº da conta que deseja transferir?"));
                                    if (contaRecebeTransferencia != null) {
                                        double valorTransferir = RecebeDados.recebeValorMaiorQueZero("Quanto deseja transferir?");
                                        contaPesquisada.transferir(contaRecebeTransferencia, valorTransferir);
                                        System.out.println("Você transferiu R$" + valorTransferir + " Para a conta de " + contaRecebeTransferencia.getTitular().getNome());
                                    } else {
                                        System.out.println("Conta não encontrada!");
                                    }
                                    break;

                                case SALDO:
                                    System.out.println("Seu saldo é: R$" + contaPesquisada.getSaldo());
                                    break;

                                case SAIR:
                                    Agencia.fecharCaixa();
                                    break;

                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                                    break;
                            }
                        } while (opcoesLocalizaPeloNumero != SAIR);
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            if (opcaoInicial != SAIR) {
                opcaoInicial = RecebeDados.recebeInteiro("1 - Criar conta\n2 - Localizar pelo número\n6 - Sair");
            }
        } while (opcaoInicial != SAIR);
    }

    public static String entradaString(String prompt) {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
