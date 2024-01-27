package Atividade;

import java.util.Arrays;
import java.util.Scanner;

public class Inverso {

    public static void main(String[] args) {

        final int TAMANHO_ARRAY = 5;
        Scanner scn = new Scanner(System.in);
        int[] numeros = new int[TAMANHO_ARRAY];

        for(int i = 0; i< TAMANHO_ARRAY; i++){
            numeros[i] = adicionaInteiro(scn);
        }

        reverteArray(numeros);
        System.out.println(Arrays.toString(numeros));

        scn.close();
    }
    private static int adicionaInteiro(Scanner scn) {
        int num;
        System.out.println("Digite um número inteiro: ");
        if (scn.hasNextInt()) {
            num = scn.nextInt();
            return num;
        }
        scn.nextLine();
        return adicionaInteiro(scn);
    }
    private static void reverteArray(int[] a){
        int[] reverso = new int[a.length];
        for(int i = 0; i<a.length ; i++){
            reverso[i] = a[a.length-i-1];
        }
        System.out.println(Arrays.toString(reverso));
    }



}



