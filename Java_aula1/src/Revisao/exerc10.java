package Revisao;

import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma das opções abaixo");
        System.out.println("(1) Cadastrar aluno");
        System.out.println("(2) Cadastrar endereço");
        System.out.println("(3) Imprimir aluno");
        System.out.println("(4) Imprimir endereço");
        System.out.println("(5) Sair");

        int selecionado = Integer.parseInt(scanner.nextLine());

        String nome, idade, sexo, anoNascimento;
        String rua, numero, bairro, cep;

        switch (selecionado) {
            case (1):
                System.out.println("Nome do aluno: ");
                nome = scanner.nextLine();
                System.out.println("Idade do aluno:");
                idade = scanner.nextLine();
                System.out.println("Sexo do aluno (F/M): ");
                sexo = scanner.nextLine();
                System.out.println("Ano de nascimento: ");
                anoNascimento = scanner.nextLine();
                break;

            case (2):
                System.out.println("Nome da rua: ");
                rua = scanner.nextLine();
                System.out.println("Número: ");
                numero = scanner.nextLine();
                System.out.println("Bairro: ");
                bairro = scanner.nextLine();
                System.out.println("CEP: ");
                cep = scanner.nextLine();
                break;

            case (3):
                System.out.println("################### Aluno #################");
                System.out.println("Nome: Zandra Vieitez" + "        " + "Idade: 43 anos");
                System.out.println("Sexo: F" + "         " + "Ano de nascimento: 1979");
                break;

            case (4):
                System.out.println("############## Endereço ################");
                System.out.println("Rua: Dhália " + "        " + "Nº: 79");
                System.out.println("Bairro: Boa Viagem" + "        " + "CEP: 51.020-290");
                break;

            case (5):
                System.out.println("Sair");
                break;

            default:
                System.out.println("Tente uma opção válida");
                break;
        }
    }
    }
