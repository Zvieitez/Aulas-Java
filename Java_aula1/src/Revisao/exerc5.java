package Revisao;

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informar nome do pai");
        String nomePai = entrada.nextLine();

        System.out.println("Informar idade do pai");
        int idadePai = Integer.parseInt(entrada.nextLine());

        System.out.println("Informar nome da mãe");
        String nomeMae = entrada.nextLine();

        System.out.println("Informar idade da mãe");
        int idadeMae = Integer.parseInt(entrada.nextLine());

        System.out.println("Pai: " + nomePai + "-" + "Idade: " + idadePai);
        System.out.println("Mãe: " + nomeMae + "-" + "Idade: " + idadeMae);

    }
}
