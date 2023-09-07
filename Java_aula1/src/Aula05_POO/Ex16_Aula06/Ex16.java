package Aula05_POO.Ex16_Aula06;

public class Ex16 {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        usuario.nome = "zandra";
        usuario.idade = 20;
        usuario.cpf = "00000000000";
        usuario.genero = "f";
        usuario.salario = 1000;

        System.out.println("O valor do salário antes é: R$ " + usuario.salario);
        usuario.realizarLancamento(100,"credito","adiantamento");
        System.out.println("O valor do salário depois é: R$ " + usuario.salario);

        System.out.println("**************************************");

        System.out.println("O valor do salário antes é: R$ " + usuario.salario);
        usuario.realizarLancamento(200,"debito","plano de saúde");
        System.out.println("O valor do salário depois é: R$ " + usuario.salario);

    }


}
