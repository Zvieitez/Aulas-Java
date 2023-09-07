package Avaliacao2;

public class ContaPoupanca extends Conta{

    private double rendimento;

    private double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.saldo += rendimento;
    }

    public void depositar (double valor){setSaldo(getSaldo() + (valor + this.rendimento));}
}
