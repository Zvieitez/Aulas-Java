package Revisao;

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informar nome");
        String nome = entrada.nextLine();

        System.out.println("Informar idade");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.println("Informar CPF");
        String cpf = entrada.nextLine();

        System.out.println("Informar gênero");
        String genero = entrada.nextLine();

        System.out.println("Informar e-mail");
        String email = entrada.nextLine();

        System.out.println("Informar Telefone");
        String telefone = entrada.nextLine();

        System.out.println("Informar número");
        String numero = entrada.nextLine();

        System.out.println("Informar rua");
        String rua = entrada.nextLine();

        System.out.println("Informar bairro");
        String bairro = entrada.nextLine();

        System.out.println("Informar cidade");
        String cidade = entrada.nextLine();

        System.out.println("**************** Formulário Moderna ********************");
        System.out.println("Nome: " + nome + "      " + "Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Gênero: " + genero);
        System.out.println("E-mail: " + email + "     " + "Telefone: " + telefone);
        System.out.println("----------------------- Endereço -----------------------");
        System.out.println("Rua: " + rua + "     " + "Número: " + numero);
        System.out.println("Bairro: " + "    " + "Cidade: " + cidade);
        System.out.println("********************************************************");


    }
}
