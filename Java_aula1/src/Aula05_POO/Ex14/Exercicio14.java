package Aula05_POO.Ex14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CADASTRO DE USUÁRIO");
        System.out.println("*******************");
        System.out.println("Informe os dados: ");

        Usuario usuario = null;

        for (int i = 0; i < 2; i++){
            usuario = new Usuario();

            System.out.println("Informe o nome: ");
            usuario.nome = scanner.nextLine();

            System.out.println("Informe o CPF: ");
            usuario.cpf = scanner.nextLine();

            System.out.println("Informe o gênero: ");
            usuario.genero = scanner.nextLine();

            System.out.println("Informe a idade: ");
            usuario.idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Informe o salário: ");
            usuario.salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Usuário número: " + (i + 1));
            System.out.println("Nome: " + usuario.nome);
            System.out.println("CPF: " + usuario.cpf);
            System.out.println("Gênero: " + usuario.genero);
            System.out.println("Idade: " + usuario.idade);
            System.out.println("Salário: R$ " + usuario.salario);


        }

    }

}
