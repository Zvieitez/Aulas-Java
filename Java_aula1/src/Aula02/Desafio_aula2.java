package Aula02;

import javax.swing.*;
import java.util.Scanner;

public class Desafio_aula2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sal1, sal2, sal3;
        double media;

        sal1 = 1000;
        sal2 = 2000;
        sal3 = 3000;

        media = (sal1 + sal2 + sal3)/3;

        String nome1 = "José";
        String nome2 = "Maria";
        String nome3 = "Rita";

        System.out.println("José");
        String trab1 = entrada.nextLine();

        System.out.println("Maria");
        String trab2 = entrada.nextLine();

        System.out.println("Rita");
        String trab3 = entrada.nextLine();

        System.out.println("Salário" + " " + nome1 + " " + "R$: " + sal1);
        String salario1= entrada.nextLine();
        System.out.println("Salário" + " " + nome2 + " " + "R$: " + sal2);
        String salario2 = entrada.nextLine();
        System.out.println("Salário" + " " + nome3 + " " + "R$: " + sal3);
        String salario3 = entrada.nextLine();

        System.out.println("**************************************************");
        System.out.println("Nome: " + nome1);
        System.out.println("Nome: " + nome2);
        System.out.println("Nome: " + nome3);
        System.out.println("Salário José:" + "R$ " + sal1);
        System.out.println("Salário Maria:" + "R$ " + sal2);
        System.out.println("Salário Rita:" + "R$ " + sal3);
        System.out.println("Média de salário dos trabalhadores: R$ " + media);
        System.out.println("***************************************************");
    }
}

