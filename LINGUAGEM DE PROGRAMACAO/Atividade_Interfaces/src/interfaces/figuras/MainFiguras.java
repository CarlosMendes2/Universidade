package interfaces.figuras;

import java.util.Scanner;

public class MainFiguras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RepositorioDeFiguras2D figuras = new RepositorioDeFiguras2D();
        int opcao;

        do {
            opcao = recebeInteiro(sc, imprimeMenu());
            switch (opcao) {
                case 1:
                    adicionaCirculo(figuras, sc);
                    break;
                case 2:
                    adicionaQuadrado(figuras, sc);
                    break;
                case 3:
                    adicionaRetangulo(figuras, sc);
                    break;
            }
        } while(opcao == 1 || opcao == 2 || opcao == 3);

        descreveFiguras(figuras);
    }

    private static void adicionaCirculo(RepositorioDeFiguras2D figuras, Scanner sc) {
        Circulo circulo = new Circulo((double) recebeInteiro(sc, "Raio?"));
        figuras.adicionaFigura(circulo);
    }

    private static void adicionaQuadrado(RepositorioDeFiguras2D figuras, Scanner sc) {
        Quadrado quadrado = new Quadrado((double) recebeInteiro(sc, "Lado?"));
        figuras.adicionaFigura(quadrado);
    }

    private static void adicionaRetangulo(RepositorioDeFiguras2D figuras, Scanner sc) {
        Retangulo retangulo = new Retangulo((double) recebeInteiro(sc, "Lado1?"), (double) recebeInteiro(sc, "Lado2?"));
        figuras.adicionaFigura(retangulo);
    }

    private static void descreveFiguras(RepositorioDeFiguras2D figuras) {
        for (int i = 0; i < figuras.getQtdeDeFiguras(); i++) {
            System.out.println(figuras.getDescricaoDeFigura(i));
            System.out.println("Perimetro: " + figuras.getFigura2D(i).calculaPerimetro());
            System.out.println("Area: " + figuras.getAreaDeFigura(i));
        }
    }

    private static int recebeInteiro(Scanner sc, String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(sc.nextLine());
    }

    private static String imprimeMenu() {
        String menu = "";
        menu += "1 - para inserir um circulo\n";
        menu += "2 - para inserir um quadrado\n";
        menu += "3 - para inserir um retangulo\n";
        menu += "qq outro valor - para sair\n";
        return menu;
    }

}
