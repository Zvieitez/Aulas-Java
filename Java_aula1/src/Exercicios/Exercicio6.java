package Exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome:");
        String nome = entrada.nextLine();

        System.out.println("Informe a idade:");
        String idade = entrada.nextLine();

        System.out.println("Informe o CPF: (000.000.000-00)");
        String cpf = entrada.nextLine();

        System.out.println("Informe o genero:");
        String genero = entrada.nextLine();

        System.out.println("Informe o Email:");
        String email = entrada.nextLine();

        System.out.println("Informe o telefone: (00) 00000-0000");
        String telefone = entrada.nextLine();

        System.out.println("Informe o número");
        String numero = entrada.nextLine();

        System.out.println("Informe a rua");
        String rua = entrada.nextLine();

        System.out.println("####################### Formulário Moderna #######################");
        System.out.println("Nome:" + nome + "                     " + "Idade:" + idade);
        System.out.println("CPF:" + cpf);
        System.out.println("Gênero:" + genero);
        System.out.println("E-mail:" + email + "              " + "Telefone:" + telefone);
        System.out.println("-------------------------- Endereço ------------------------------");
        System.out.println("Rua:" + rua + "      " + "Número:" + numero);

    }
}
