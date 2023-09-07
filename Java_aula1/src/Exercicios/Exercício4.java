package Exercicios;

public class Exercício4 {
    public static void main(String[] args) {

        int cpf1 = 26;
        int cpf2 = 463;
        int cpf3 = 734;
        int cpf4 = 81;
        String nome = "Nome" + ":" + "Zandra Vieitez";
        String email1 = "E-mail" + ":" + "zvieitez@hotmail.com";
        String juntar= "CPF" + ":" + "0" + cpf1 + "." + cpf2 + "." + cpf3 + "-" + cpf4;
        String senha = "123456";


        System.out.println("##########USUARIO###########");
        System.out.println(nome);
        System.out.println(juntar);
        System.out.println(email1);
        System.out.println("Senha" + ":" + senha.replaceAll("[@#$%&*A-Za-z0-9]", "*"));
        System.out.println("############################");
    }
}
