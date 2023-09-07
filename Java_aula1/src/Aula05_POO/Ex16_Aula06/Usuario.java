package Aula05_POO.Ex16_Aula06;

import java.util.Scanner;

public class Usuario {

    public String nome;

    public String cpf;

    public int idade;

    public String genero;

    public double salario;


    public void realizarLancamento(double valor, String tipoDeLancamento, String descricao){
        if (tipoDeLancamento.equalsIgnoreCase("credito")) {
            this.salario += valor;
        }else if (tipoDeLancamento.equalsIgnoreCase("debito")){
            this.salario -= valor;
        }
    }

    public void imprimirInformacoes(){
        System.out.println(" ");
        System.out.println("Informações do usuário");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("*****Fim do relatório*****");
    }

    public void imprimirInformacoes(Usuario usuarioAssinatura){
        System.out.println("*********** Usuário This *********");
        System.out.println("Nome:" + this.nome + "  " + "Idade: " + this.idade + "   " + "Gênero: " + this.genero);
        System.out.println("CPF: " + this.cpf + "   " + "Salário: " + this.salario);

        System.out.println("******* Usuário Assinatura *******");
        System.out.println("Nome: " + usuarioAssinatura.nome + "  " + "Idade: " + usuarioAssinatura.idade + "  " + "Gênero: " + usuarioAssinatura.genero);
        System.out.println("CPF: " + usuarioAssinatura.cpf + "  " + "Salário: " + usuarioAssinatura.salario);
    }

    public void transferir(Usuario usuarioDestino, double valor){
        this.realizarLancamento(valor, "debito", "transferência");
        usuarioDestino.realizarLancamento(valor, "credito", "trasferência");
    }

    public void imprimirInformacoesUsuarioA(){
        System.out.println("**** Usuário A ****");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Salário: " + this.salario);
    }

    public void imprimirInformaoesUsuarioB(){
        System.out.println("**** Usuário B ****");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Salário: " + this.salario);
    }

}
