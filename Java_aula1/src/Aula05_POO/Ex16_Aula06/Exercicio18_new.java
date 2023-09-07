package Aula05_POO.Ex16_Aula06;

import java.util.Scanner;

public class Exercicio18_new {
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

        int opcaoEscolhida = Integer.parseInt(scanner.nextLine());

        Usuario usuarioA = null;
        Usuario usuarioB = null;

        while (opcaoEscolhida <= 7) {
            if (opcaoEscolhida == 1) {
                usuarioA = new Usuario();
                usuarioA.nome = "Fulano A";
                usuarioA.idade = 60;
                usuarioA.cpf = "0540973645";
                usuarioA.genero = "O";
                usuarioA.salario = 1000;

            }
            else if (opcaoEscolhida == 2) {
                usuarioB = new Usuario();
                usuarioB.nome = "Fulano B";
                usuarioB.idade = 30;
                usuarioB.cpf = "0540973645";
                usuarioB.genero = "O";
                usuarioB.salario = 2000;

            }
            else if (opcaoEscolhida == 3){
                usuarioA.realizarLancamento(100, "CREDITO", "Adiantamento");
                usuarioA.realizarLancamento(300, "DEBITO", "Plano de saude");

            }
            else if (opcaoEscolhida == 4){
                usuarioB.realizarLancamento(100, "CREDITO", "Adiantamento");
                usuarioB.realizarLancamento(300, "DEBITO", "Plano de saude");

            }
            else if (opcaoEscolhida == 5){
                usuarioA.transferir(usuarioB, 150);

            }
            else if (opcaoEscolhida == 6){
                usuarioB.transferir(usuarioA, 150);

            }
            else if (opcaoEscolhida == 7){
                usuarioA.imprimirInformacoesUsuarioA();
                usuarioB.imprimirInformaoesUsuarioB();
                opcaoEscolhida++;
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

            opcaoEscolhida = Integer.parseInt(scanner.nextLine());

            }
    }
}
