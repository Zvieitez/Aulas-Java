package Aula04;

import java.util.Scanner;

public class exercicio12_if_else {
    public static void main(String[] args) {

        int op1 = 1, op2 = 2, op3 = 3, op4=4, op5=5;

        System.out.println("Informe uma das opções abaixo:");
        System.out.println("(1) Cadastrar aluno");
        System.out.println("(2) Cadastrar endereço");
        System.out.println("(3) Imprimir aluno");
        System.out.println("(4) Imprimir endereço");
        System.out.println("(5) Sair");

        Scanner entrada = new Scanner(System.in);
        int opcaoEscolhida = Integer.parseInt(entrada.nextLine());

        while (opcaoEscolhida <=5) {

            if (opcaoEscolhida == 1) {
                System.out.println("Nome do aluno: ");
                String nome = entrada.next();
                System.out.println("Idade do aluno:");
                String idade = entrada.next();
                System.out.println("Sexo do aluno (F/M): ");
                String sexo = entrada.next();
                System.out.println("Ano de nascimento: ");
                String anoNasc = entrada.next();
                System.out.println("########################################");
            }

            if (opcaoEscolhida == 2) {
                System.out.println("Nome da rua: ");
                String rua = entrada.next();
                System.out.println("Número: ");
                String numero = entrada.next();
                System.out.println("Bairro: ");
                String bairro = entrada.next();
                System.out.println("CEP: ");
                String cep = entrada.next();
                System.out.println("########################################");
            }

            if (opcaoEscolhida == 3) {
                System.out.println("################### Aluno #################");
                System.out.println("Nome: Zandra Vieitez" + "        " + "Idade: 43 anos");
                System.out.println("Sexo: F" + "         " + "Ano de nascimento: 1979");
                System.out.println("############################################");
            }

            if (opcaoEscolhida == 4) {
                System.out.println("############## Endereço ################");
                System.out.println("Rua: Dhália " + "        " + "Nº: 79");
                System.out.println("Bairro: Boa Viagem" + "        " + "CEP: 51.020-290");
                System.out.println("############################################");
            }

            if (opcaoEscolhida == 5) {
                System.out.println("Sair");
                System.out.println("########################################");

                opcaoEscolhida++;
            }

            System.out.println("Informe uma das opções abaixo:");
            System.out.println("(1) Cadastrar aluno");
            System.out.println("(2) Cadastrar endereço");
            System.out.println("(3) Imprimir aluno");
            System.out.println("(4) Imprimir endereço");
            System.out.println("(5) Sair");

            opcaoEscolhida = Integer.parseInt(entrada.next());
        }
    }
}