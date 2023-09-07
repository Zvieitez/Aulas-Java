package poo.e_15;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("(1) Cadastro de aluno");
        System.out.println("(2) venda de endereço");
        System.out.println("(3) Vincular endereço");
        System.out.println("(4) Imprimir");
        System.out.println("(5) Sair");

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Endereco endereco = new Endereco();

        System.out.println("Selecione uma opcao de 1 a 5");
        int opcapEscolhida = Integer.parseInt(scanner.nextLine());

        while(opcapEscolhida <= 4) {
            if(opcapEscolhida == 1){
                System.out.println("Informe o nome do Produto");
                aluno.nome = scanner.nextLine();

                System.out.println("Informe a idade do aluno");
                aluno.idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Informe o genero");
                aluno.genero = scanner.nextLine();

                System.out.println("Informe o telefone");
                aluno.telefone = scanner.nextLine();

            }else if(opcapEscolhida == 2){
                System.out.println("Informe o nome da rua");
                endereco.rua = scanner.nextLine();

                System.out.println("Informe o numero");
                endereco.numero = scanner.nextLine();

                System.out.println("Informe o complemento");
                endereco.complemento = scanner.nextLine();

                System.out.println("Informe o cep");
                endereco.cep = scanner.nextLine();

            }else if(opcapEscolhida == 3){
                aluno.endereco = endereco;
                
            } else if (opcapEscolhida == 4) {
                System.out.println("Dados do Aluno");
                System.out.println("----------------------INICIO--------------------");
                System.out.println("Identificação");
                System.out.println("Nome : "+aluno.nome);
                System.out.println("Idade : "+aluno.idade);
                System.out.println("Genero : "+aluno.genero);
                System.out.println("Telefone : "+aluno.telefone);
                System.out.println("------------------------------------------------");
                System.out.println("Endereço");
                System.out.println("Rua : "+aluno.endereco.rua);
                System.out.println("Numero : "+aluno.endereco.numero);
                System.out.println("CEP : "+aluno.endereco.cep);
                System.out.println("Complemento : "+aluno.endereco.complemento);
                System.out.println("----------------------FIM-----------------------");
            }

            System.out.println("(1) Cadastro de aluno");
            System.out.println("(2) venda de endereço");
            System.out.println("(3) Vincular endereço");
            System.out.println("(4) Imprimir");
            System.out.println("(5) Sair");

            System.out.println("Selecione uma opcao de 1 a 5");
            opcapEscolhida = Integer.parseInt(scanner.nextLine());
        }
    }
}
