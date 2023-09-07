package Revisao;

import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean par = true;
        boolean impar = false;
        int num = 2;

        if (num %2==0) {
            System.out.println(par);
        }else{
            System.out.println(impar);
        }

        System.out.println("valor 1");
        double num1 = Double.parseDouble(entrada.nextLine());

        System.out.println("valor 2");
        double num2 = Double.parseDouble(entrada.nextLine());

        double soma = num1 + num2;
        System.out.println("valor soma" + soma);

        double multiplicar = num1 * num2;
        System.out.println("valor mult" + multiplicar);

        System.out.println("a soma é igual a multiplicação? ");

        if (soma == multiplicar){
            System.out.println("igual");
            }else{
                System.out.println("diferente");
            }
        }
        }



