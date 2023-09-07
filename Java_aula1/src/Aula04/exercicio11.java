package Aula04;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");

        String nome = entrada.nextLine();

        System.out.println("Informe a quantidade de vezes que quer imprimir: ");
        int quantidadeImpressao = entrada.nextInt();

        int controlador = 0;
        while (controlador <= quantidadeImpressao){
            System.out.println(nome + "-" + controlador);
            controlador++;
        }
    }
}
