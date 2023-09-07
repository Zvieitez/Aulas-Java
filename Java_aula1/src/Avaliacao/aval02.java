package Avaliacao;

import java.util.Scanner;

public class aval02 {
    public static void main(String[] args) {
        int A = 10;
        int B = 15;
        int C = 5;
        int D = 7;

        int difAB = A * B;
        int difCD = C * D;

        int totaldif = difAB - difCD;

        System.out.println("A diferença entre os produtos AB e CD é de : " + totaldif);

        //Resolução do professor:
//
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Informe o 1º número: ");
//        int A = entrada.nextInt();
//        entrada.nextLine();
//
//        System.out.println("Informe o 2º número: ");
//        int B = entrada.nextInt();
//        entrada.nextLine();
//
//        System.out.println("Informe o 3º número: ");
//        int C = entrada.nextInt();
//        entrada.nextLine();
//
//        System.out.println("Informe o 4º número: ");
//        int D = entrada.nextInt();
//        entrada.nextLine();
//
//        int diferenca  = (A*B) - (C*D);
//
//        System.out.println("A diferença entre AB e CD é: " + diferenca);

    }
}
