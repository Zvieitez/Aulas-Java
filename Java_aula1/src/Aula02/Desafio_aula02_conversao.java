package Aula02;

import java.util.Scanner;

public class Desafio_aula02_conversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escrever nome trabalhador 1:");
        String nome1 = entrada.nextLine();

        System.out.println("Escrever nome trabalhador 2:");
        String nome2 = entrada.nextLine();

        System.out.println("Escrever nome trabalhador 3:");
        String nome3 = entrada.nextLine();

        System.out.println("Valor dos últimos 03 salários trab1");
        double  salmesxtrab1 = Double.parseDouble(entrada.nextLine());
        double  salmesytrab1 = Double.parseDouble(entrada.nextLine());
        double  salmesztrab1 = Double.parseDouble(entrada.nextLine());

        double mediatrab1 = (salmesxtrab1 + salmesytrab1 + salmesztrab1)/3;
        System.out.println("Média 03 últimos sal trab1:" + "R$" + mediatrab1);

        System.out.println("Valor dos últimos 03 salários trab2");
        double  salmesatrab2 = Double.parseDouble(entrada.nextLine());
        double  salmesbtrab2 = Double.parseDouble(entrada.nextLine());
        double  salmesctrab2 = Double.parseDouble(entrada.nextLine());

        double mediatrab2 = (salmesatrab2 + salmesbtrab2 + salmesctrab2)/3;
        System.out.println("Média 03 últimos salários trab2" + "R$" + mediatrab2);

        System.out.println("Valor dos últimos 03 salários trab3");
        double  salmesdtrab3 = Double.parseDouble(entrada.nextLine());
        double  salmesetrab3 = Double.parseDouble(entrada.nextLine());
        double  salmesftrab3 = Double.parseDouble(entrada.nextLine());

        double mediatrab3 = (salmesdtrab3 + salmesetrab3 + salmesftrab3)/3;
        System.out.println("Média 03 últimos salários trab2" + "R$" + mediatrab3);

        System.out.println("***********************************************************************************************");
        System.out.println("Trabalhador 1:  " + nome1 + "  -  " + "Média últimos 03 salários" + "  -  " + "R$:  " + mediatrab1);
        System.out.println("Trabalhador 2:  " + nome2 + "  -  " + "Média últimos 03 salários" + "  -  " + "R$:  " + mediatrab2);
        System.out.println("Trabalhador 3:  " + nome3 + "  -  " + "Média últimos 03 salários" + "  -  " + "R$:  " + mediatrab3);
        System.out.println("***********************************************************************************************");

    }
}
