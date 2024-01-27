package Atividade;
import java.util.Scanner;
/*
 * "Ler 3 números inteiros da entrada, imprimir o
 * menor e o maior"
 *
 * Autor: Raquel Lopes
 */

public class MinMax5 {

    public static void main(String[] args) {

        final int NUMEROS_A_LER = 3;

        Scanner sc = new Scanner(System.in);

        int minimo = Integer.MAX_VALUE;

        int maximo = Integer.MIN_VALUE;


        for (int i = 0; i < NUMEROS_A_LER; i++) {

            int num = recebeProximoInteiro(sc);

            minimo = menorNumeroEntre(minimo, num);

            maximo = maiorNumeroEntre(maximo, num);

        }

        System.out.println("O menor numero eh: " + minimo);

        System.out.println("O maior numero eh: " + maximo);

        sc.close();
    }


    private static int maiorNumeroEntre(int numero1, int numero2) {

        return numero2 > numero1 ? numero2 : numero1;

    }


    private static int menorNumeroEntre(int numero1, int numero2) {

        return numero2 < numero1 ? numero2 : numero1;

    }


    private static int recebeProximoInteiro(Scanner sc) {

        System.out.print("Entre com o proximo inteiro:");

        int num;
        if(sc.hasNextInt()){
            num = sc.nextInt();
            return num;
        }
        sc.nextLine();
        System.err.println("Você precisa informar um número inteiro");
        return recebeProximoInteiro(sc);
    }



}