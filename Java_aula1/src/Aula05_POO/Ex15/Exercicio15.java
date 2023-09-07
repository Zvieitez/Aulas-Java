package Aula05_POO.Ex15;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        System.out.println("[1] CADASTRO DO ALUNO");
        System.out.println("[2] CADASTRO DO ENDEREÇO");
        System.out.println("[3] VINCULAR ENDEREÇO AO ALUNO");
        System.out.println("[4] IMPRIMIR");
        System.out.println("[5] SAIR");

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Endereco endereco = new Endereco();

        System.out.println("SELECIONE A OPÇÃO DE 1 A 5");
        int opcaoEscolhida = Integer.parseInt(scanner.nextLine());

        while (opcaoEscolhida <= 4){

            if (opcaoEscolhida == 1){
                System.out.println("Informe o nome do aluno: ");
                aluno.nomeAluno = scanner.nextLine();

                System.out.println("Gênero: ");
                aluno.genero = scanner.nextLine();

                System.out.println("Idade: ");
                aluno.idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Telefone: ");
                aluno.telefone = scanner.nextLine();

            } else if (opcaoEscolhida == 2) {
                System.out.println("Informe o nome da rua: ");
                endereco.rua = scanner.nextLine();

                System.out.println("Número: ");
                endereco.numero = scanner.nextLine();

                System.out.println("Complemento: ");
                endereco.complemento = scanner.nextLine();

                System.out.println("CEP: ");
                endereco.cep = scanner.nextLine();

            } else if (opcaoEscolhida == 3) {
                aluno.endereco = endereco;
                System.out.println("Endereço vinculado");

            } else if (opcaoEscolhida == 4) {
                System.out.println("Dados do Aluno");
                System.out.println("----------------------INICIO--------------------");
                System.out.println("Identificação");
                System.out.println("Nome : " + aluno.nomeAluno);
                System.out.println("Idade : " + aluno.idade);
                System.out.println("Gênero : " + aluno.genero);
                System.out.println("Telefone : " + aluno.telefone);
                System.out.println("------------------------------------------------");
                System.out.println("Endereço");
                System.out.println("Rua : " + aluno.endereco.rua);
                System.out.println("Número : " + aluno.endereco.numero);
                System.out.println("CEP : " + aluno.endereco.cep);
                System.out.println("Complemento : " + aluno.endereco.complemento);
                System.out.println("----------------------FIM-----------------------");
            }

            System.out.println("[1] CADASTRO DO ALUNO");
            System.out.println("[2] CADASTRO DO ENDEREÇO");
            System.out.println("[3] VINCULAR ENDEREÇO AO ALUNO");
            System.out.println("[4] IMPRIMIR");
            System.out.println("[5] SAIR");

            System.out.println("SELECIONE A OPÇÃO DE 1 A 5");
            opcaoEscolhida = Integer.parseInt(scanner.nextLine());

            }
        }
}









