package Aula05_POO.Ex15;

import Aula05_POO.Ex16_Aula06.Usuario;

public class Ex20 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Zandra","000000");

        aluno.imprimirAluno();

        Endereco endereco = new Endereco("Dhália","79");

        endereco.imprimirEndereco();

        //ou


        System.out.println("Nome:" + aluno.nomeAluno);
        System.out.println("CPF: " + aluno.cpf);
        System.out.println("Endereço: " + endereco.rua);
        System.out.println("Número: " + endereco.numero);

    }
}
