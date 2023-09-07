package Aula04;

import java.util.Scanner;

public class exercicio12_switch_case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma das opções abaixo:");
        System.out.println("(1) Cadastrar aluno");
        System.out.println("(2) Cadastrar endereço");
        System.out.println("(3) Imprimir aluno");
        System.out.println("(4) Imprimir endereço");
        System.out.println("(5) Sair");

        int selecionado = scanner.nextInt();

        String nome, idade, sexo, anoNascimento;
        String rua, numero, bairro, cep;

        while (selecionado <= 5) {
            switch (selecionado) {
                case 1:
                    System.out.println("Nome do aluno: ");
                    nome = scanner.next();
                    System.out.println("Idade do aluno:");
                    idade = scanner.next();
                    System.out.println("Sexo do aluno (F/M): ");
                    sexo = scanner.next();
                    System.out.println("Ano de nascimento: ");
                    anoNascimento = scanner.next();
                    System.out.println("*****************************************");
                    break;

                case 2:
                    System.out.println("Nome da rua: ");
                    rua = scanner.next();
                    System.out.println("Número: ");
                    numero = scanner.next();
                    System.out.println("Bairro: ");
                    bairro = scanner.next();
                    System.out.println("CEP: ");
                    cep = scanner.next();
                    System.out.println("*****************************************");
                    break;

                case 3:
                    System.out.println("################### Aluno #################");
                    System.out.println("Nome: Zandra Vieitez" + "        " + "Idade: 43 anos");
                    System.out.println("Sexo: F" + "         " + "Ano de nascimento: 1979");
                    System.out.println("*****************************************");
                    break;

                case 4:
                    System.out.println("############## Endereço ################");
                    System.out.println("Rua: Dhália " + "        " + "Nº: 79");
                    System.out.println("Bairro: Boa Viagem" + "        " + "CEP: 51.020-290");
                    System.out.println("*****************************************");
                    break;

                case 5:
                    System.out.println("Sair");
                    System.out.println("*****************************************");
                    break;
            }
                System.out.println("Informe uma das opções abaixo:");
                System.out.println("(1) Cadastrar aluno");
                System.out.println("(2) Cadastrar endereço");
                System.out.println("(3) Imprimir aluno");
                System.out.println("(4) Imprimir endereço");
                System.out.println("(5) Sair");

                selecionado = scanner.nextInt();

        }
        //não precisa colocar esse bloco, só qdo for usar if/else
//        System.out.println("Informe uma das opções abaixo");
//        System.out.println("(1) Cadastrar aluno");
//        System.out.println("(2) Cadastrar endereço");
//        System.out.println("(3) Imprimir aluno");
//        System.out.println("(4) Imprimir endereço");
//        System.out.println("(5) Sair");

        //selecionado = Integer.parseInt(scanner.next());

    }

}
