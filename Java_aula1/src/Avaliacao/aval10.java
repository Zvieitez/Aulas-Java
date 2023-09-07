package Avaliacao;

import java.util.Scanner;

public class aval10 {
    public static void main(String[] args) {

        int[] arrNumeros = {1, 4, 9, 13, 19, 20, 28, 30, 35, 40};

        int maiorValor = 0;

        for (int i = 0; i < arrNumeros.length; i++) {
            if (arrNumeros[i] > maiorValor) {
                maiorValor = arrNumeros[i];
            }
            System.out.println(arrNumeros[i]);
        }
        System.out.println("O maior valor é: " + maiorValor);
    }
}
