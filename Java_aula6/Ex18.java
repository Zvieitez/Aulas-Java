package poo.e_14;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //1
        Usuario usuarioA = new Usuario();
        usuarioA.nome = "Fulano A";
        usuarioA.idade = 60;
        usuarioA.cpf = "0540973645";
        usuarioA.genero = "O";
        usuarioA.salario = 1000;

        //2
        Usuario usuarioB = new Usuario();
        usuarioB.nome = "Fulano B";
        usuarioB.idade = 30;
        usuarioB.cpf = "0540973645";
        usuarioB.genero = "O";
        usuarioB.salario = 2000;

        //3
        usuarioA.realizarLancamento(100, "CREDITO", "Adiantamento");
        usuarioA.realizarLancamento(300, "DEBITO", "Plano de saude");

        //4
        usuarioB.realizarLancamento(100, "CREDITO", "Adiantamento");
        usuarioB.realizarLancamento(300, "DEBITO", "Plano de saude");

        //5
        usuarioA.realizarLancamento(50, "DEBITO", "Transferencia para usuarioB");
        usuarioB.realizarLancamento(50, "CREDITO", "Transferencia do usuarioA");

        //6
        usuarioB.realizarLancamento(50, "DEBITO", "Transferencia para usuarioB");
        usuarioA.realizarLancamento(50, "CREDITO", "Transferencia do usuarioA");

        //5
        usuarioA.transferir(usuarioB, 150);
        //6
        usuarioB.transferir(usuarioA, 150);

        //7
        usuarioA.imprimirInformacoes();
        usuarioB.imprimirInformacoes();

        usuarioA.imprimirInformacoes();
        usuarioB.imprimirInformacoes();
        }
}
