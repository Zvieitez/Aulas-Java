package Aula05_POO;

import Aula05_POO.Ex16_Aula06.Usuario;

public class Ex19 {
    public static void main(String[] args) {

        Usuario usuarioThis = new Usuario();

        usuarioThis.nome = "Zandra";
        usuarioThis.idade = 10;
        usuarioThis.genero = "F";
        usuarioThis.cpf = "0000000000";
        usuarioThis.salario = 1000;

        Usuario usuarioAssinatura = new Usuario();

        usuarioAssinatura.nome = "Lucas";
        usuarioAssinatura.idade = 15;
        usuarioAssinatura.genero = "M";
        usuarioAssinatura.cpf = "1111111111";
        usuarioAssinatura.salario = 2000;

        usuarioThis.imprimirInformacoes(usuarioAssinatura);

    }
}
