package Aula05_POO.Ex15;

public class Endereco {

    public String numero;

    public String rua;

    public String complemento;

    public String cep;

    public Endereco(){
    }

    public Endereco(String rua, String numero){
        this.rua = rua;
        this.numero = numero;
    }

    public void imprimirEndereco(){
        System.out.println(this.rua);
        System.out.println(this.numero);
    }

}
