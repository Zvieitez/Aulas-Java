package Avaliacao;

import java.util.Scanner;

public class aval05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 13;

        if (num %2 == 0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é impar.");
        }

        //resolução do professor

//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Escreva um número: ");
//        int num = entrada.nextInt();
//        entrada.nextLine();
//
//        if (num %2 > 0) {
//            System.out.println("ímpar");
//        }else{
//            System.out.println("par");
//        }

    }
}
