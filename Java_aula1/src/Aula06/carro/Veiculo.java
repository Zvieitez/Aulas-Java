package Aula06.carro;

public class Veiculo {

    private String cor;
    private String nome;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Double getVelocidade() {
        return velocidade;
    }

    public static void setVelocidade(Double velocidade) {
        Veiculo.velocidade = velocidade;
    }

    public static Double velocidade = 0.0;

    public void acelerar (Double velocidade){
        Veiculo.velocidade += velocidade;
    }

}

