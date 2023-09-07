package Aula04;

import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {

//        int x = 0;
//        while (x<=7){
//            System.out.println("X é igual a: " + x);
//            x++;
//        }
//        System.out.println("Fim de programa.");

        Scanner entrada = new Scanner (System.in);
        int opcao = 0;
        while (opcao !=2){
            System.out.println("**Qual opção**");
            System.out.println("(1) repetir");
            System.out.println("(2) sair)");
            opcao = entrada.nextInt();
        }
    }


}
