package Aula05_POO.Ex15;

public class Aluno {

    public String nomeAluno;

    public int idade;

    public String genero;

    public String telefone;

    public Endereco endereco;

    public String cpf;

    public Aluno (){
    }

    public Aluno (String nomeAluno, String cpf){
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
    }

    public void imprimirAluno(){
        System.out.println(this.nomeAluno);
        System.out.println(this.cpf);
    }
}
