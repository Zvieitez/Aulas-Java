package Avaliacao;

import java.util.Scanner;

public class aval03 {
    public static void main(String[] args) {
        int func = 35;
        double htrab = 150;
        double vhora = 50;

        double sal = htrab * vhora;
        System.out.println("O valor do salário do funcionário cód: " + func + " é: R$ " + sal);

        //resolução do professor

//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Nome do funcionário: ");
//        String nome = entrada.nextLine();
//
//        System.out.println("Informe as horas trabalhadas: ");
//        double horasTrabalhadas = entrada.nextInt();
//        entrada.nextLine();
//
//        System.out.println("Qual valor da hora trabalhada?: ");
//        int valorHora = entrada.nextInt();
//        entrada.nextLine();
//
//        double salario = horasTrabalhadas * valorHora;
//
//        System.out.println("O valor do salário do funcionário: " + nome + "  é: R$ " + salario);

    }
}
