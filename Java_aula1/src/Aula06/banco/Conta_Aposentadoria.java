package Aula06.banco;

public class Conta_Aposentadoria extends Conta {

    private double rendimento;

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + (valor + this.rendimento));
    }
}