package Aula05_POO.Ex16_Aula06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        System.out.println("[1] CADASTRO DE USUÁRIO A");
        System.out.println("[2] CADASTRO DE USUÁRIO B");
        System.out.println("[3] LANÇAMENTOS USUÁRIO A");
        System.out.println("[4] LANÇAMENTOS USUÁRIO B");
        System.out.println("[5] TRANSFERÊNCIA USUÁRIO A PARA B");
        System.out.println("[6] TRANSFERÊNCIA USUÁRIO B PARA USUÁRIO A");
        System.out.println("[7] IMPRIMIR INFORMAÇÕS DE USUÁRIOS");
        System.out.println("[8] SAIR");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção de 1 a 8: ");

        int opcaoEscolhida = scanner.nextInt();
        scanner.nextLine();

        Usuario usuarioA = null;
        Usuario usuarioB = null;

        while (opcaoEscolhida <= 7) {
            if (opcaoEscolhida == 1) {
                usuarioA = new Usuario();
                System.out.println("Nome usuário A: ");
                usuarioA.nome = scanner.nextLine();
                System.out.println("Idade: ");
                usuarioA.idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("CPF: ");
                usuarioA.cpf = scanner.nextLine();
                System.out.println("Gênero: ");
                usuarioA.genero = scanner.nextLine();
                System.out.println("Salário: R$ ");
                usuarioA.salario = scanner.nextDouble();
                scanner.nextLine();

            }else if (opcaoEscolhida == 2) {
                usuarioB = new Usuario();
                System.out.println("Nome usuário B: ");
                usuarioB.nome = scanner.nextLine();
                System.out.println("Idade: ");
                usuarioB.idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("CPF: ");
                usuarioB.cpf = scanner.nextLine();
                System.out.println("Gênero: ");
                usuarioB.genero = scanner.nextLine();
                System.out.println("Salário: R$ ");
                usuarioB.salario = scanner.nextDouble();
                scanner.nextLine();

            }else if (opcaoEscolhida == 3) {
                System.out.println("Lançamentos usuário A:");
                System.out.println("Valor do salário antes do crédito: R$ " + usuarioA.salario);
                usuarioA.realizarLancamento(100, "credito", "adiantamento");
                System.out.println("Valor do salário após do crédito: R$ " + usuarioA.salario);
                System.out.println("*****************************************************************");
                System.out.println("Valor do salário antes o débito: R$ " + usuarioA.salario);
                usuarioA.realizarLancamento(300, "debito", "plano de saúde");
                System.out.println("Valor do salário após o débito: R$ " + usuarioA.salario);

                }else if (opcaoEscolhida == 4) {
                System.out.println("Lançamentos usuário B:");
                System.out.println("Valor do salário antes do crédito: R$ " + usuarioB.salario);
                usuarioB.realizarLancamento(100, "CREDITO", "Adiantamento");
                System.out.println("Valor do salário após do crédito: R$ " + usuarioB.salario);
                System.out.println("*****************************************************************");
                System.out.println("Valor do salário antes o débito: R$ " + usuarioB.salario);
                usuarioB.realizarLancamento(300, "DEBITO", "Plano de saude");
                System.out.println("Valor do salário após o débito: R$ " + usuarioB.salario);

            }else if (opcaoEscolhida == 5) {
                usuarioA.realizarLancamento(50, "DEBITO", "Transferencia para usuarioB");
                usuarioB.realizarLancamento(50, "CREDITO", "Transferencia do usuarioA");


            }else if (opcaoEscolhida == 6) {
                System.out.println("Transferência de usuário B para usuário A:");
                usuarioB.realizarLancamento(50, "DEBITO", "Transferencia para usuarioB");
                usuarioA.realizarLancamento(50, "CREDITO", "Transferencia do usuarioA");

            }else if (opcaoEscolhida == 7) {
                System.out.println("Imprimir informações de usuário A:");
                usuarioA.imprimirInformacoesUsuarioA();
                System.out.println("Imprimir informações de usuário B:");
                usuarioB.imprimirInformaoesUsuarioB();

            }

            System.out.println("[1] CADASTRO DE USUÁRIO A");
            System.out.println("[2] CADASTRO DE USUÁRIO B");
            System.out.println("[3] LANÇAMENTOS USUÁRIO A");
            System.out.println("[4] LANÇAMENTOS USUÁRIO B");
            System.out.println("[5] TRANSFERÊNCIA USUÁRIO A PARA B");
            System.out.println("[6] TRANSFERÊNCIA USUÁRIO B PARA USUÁRIO A");
            System.out.println("[7] IMPRIMIR INFORMAÇÕS DE USUÁRIOS");
            System.out.println("[8] SAIR");

            System.out.println("Escolha a opção de 1 a 8: ");

            opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();
        }

        }

    }






