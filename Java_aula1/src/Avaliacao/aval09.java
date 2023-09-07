package Avaliacao;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class aval09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 0;
        int soma = 0;

        while (true) {
            System.out.println("Escreva um número: ");
            num = entrada.nextInt();
            entrada.nextLine();
            if (num < 0){
                   break;
                }
            soma = soma + num;
            }
        System.out.println("Soma dos números: " + soma);
        }
    }


