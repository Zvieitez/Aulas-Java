package Aula02;

import javax.lang.model.element.NestingKind;

public class Aula2 {
    public static void main(String[] args) {
        String nome = "John Doe";
        String dataNascimento = "01/01/1983";
        String casa = "carro branco";
        String juntar1 = "Moderna" + "-" + "Tecnologia";
        String juntar2 = nome + ", nasc:" + dataNascimento;
        int idade = 39;
        juntar2 = juntar2 + ", idade:" + idade;
        juntar2 += ",idade:" + idade;
        String texto = idade > 35 ? "Ta velhinho" : "Quase novo";

        System.out.println(juntar2);
        System.out.println(casa);
        System.out.println(texto);
        System.out.println(dataNascimento);
        System.out.println(juntar1);
    }
}
