package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do pai");
        String nomePai = entrada.nextLine();

        System.out.println("Informe a idade do pai");
        int idadePai = Integer.parseInt(entrada.nextLine());

        System.out.println("Informe o nome da mae");
        String nomeMae = entrada.nextLine();

        System.out.println("Informe a idade da mae");
        int idadeMae = Integer.parseInt(entrada.nextLine());


        System.out.println("Pai:" + nomePai + " - Idade:" + idadePai);
        System.out.println("Mae:" + nomeMae + " - Idade:" + idadeMae);
    }
}
