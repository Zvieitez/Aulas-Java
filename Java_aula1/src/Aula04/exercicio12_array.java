

package Aula04;

import java.util.Scanner;

public class exercicio12_array {
    public static void main(String[] args) {

        String[] arrNome = new String[10];
        int[] arrIdade = new int[10];
        String[] arrSexo = new String[10];
        String[] arrAno = new String[10];

        String[] arrRua = new String[10];
        int[] arrNumero = new int[10];
        String[] arrBairro = new String[10];
        String[] arrCep = new String[10];

        System.out.println("Escolha a opção de 1 a 5: ");
        System.out.println("(1) Cadastrar aluno");
        System.out.println("(2) Cadastrar endereço");
        System.out.println("(3) Imprimir aluno");
        System.out.println("(4) Imprimir endereço");
        System.out.println("(5) Sair");

        Scanner scanner = new Scanner(System.in);

        int indiceAluno = 0;
        int indiceEndereco = 0;

        int opcaoEscolhida = Integer.parseInt(scanner.nextLine());

        while (opcaoEscolhida <= 5) {
            if (opcaoEscolhida == 1) {
                System.out.println("Informe o nome do aluno: ");
                String nome = scanner.nextLine();
                arrNome[indiceAluno] = nome;

                System.out.println("Informe a idade do aluno: ");
                int idade = Integer.parseInt(scanner.nextLine());
                arrIdade[indiceAluno] = idade;

                System.out.println("Informe o sexo (F/M): ");
                String sexo = scanner.nextLine();
                arrSexo[indiceAluno] = sexo;

                System.out.println("Informe o ano de nascimento: ");
                String anoNasc = scanner.nextLine();
                arrAno[indiceAluno] = anoNasc;

                indiceAluno++;
            }
            if (opcaoEscolhida == 2) {
                System.out.println("Informe o endereço: Rua ");
                String endereco = scanner.nextLine();
                arrRua[indiceEndereco] = endereco;

                System.out.println("Informe o nº: ");
                int numero = Integer.parseInt(scanner.nextLine());
                arrNumero[indiceEndereco] = numero;

                System.out.println("Informe o bairro: ");
                String bairro = scanner.nextLine();
                arrBairro[indiceEndereco] = bairro;

                System.out.println("Informe o CEP: ");
                String cep = scanner.nextLine();
                arrCep[indiceEndereco] = cep;

                indiceEndereco++;
            }
            if (opcaoEscolhida == 3) {
                for (int imp = 0; imp < indiceAluno; imp++) {
                    System.out.println("Nome: " + arrNome[imp]);
                    System.out.println("Idade: " + arrIdade[imp]);
                    System.out.println("Sex: " + arrSexo[imp]);
                    System.out.println("Ano de nascimento: " + arrAno[imp]);
                    System.out.println("*************************************");
                }
            }
            if (opcaoEscolhida == 4) {
                for (int impE = 0; impE < indiceEndereco; impE++) {
                    System.out.println("Rua: " + arrRua[impE]);
                    System.out.println("Nº: " + arrNumero[impE]);
                    System.out.println("Bairro: " + arrBairro[impE]);
                    System.out.println("CEP: " + arrCep[impE]);
                    System.out.println("*************************************");
                }
            }

            if (opcaoEscolhida==5){
                System.out.println("Sair");
                System.out.println("*************************************");
            }

            System.out.println("Selecione uma opcao de 1 a 5");
            System.out.println("(1) Cadastro de alunos");
            System.out.println("(2) Cadastro de enderecos");
            System.out.println("(3) Imprimir alunos");
            System.out.println("(4) Imprimir enderecos");
            System.out.println("(5) Sair");
            opcaoEscolhida = Integer.parseInt(scanner.nextLine());
        }
    }
}