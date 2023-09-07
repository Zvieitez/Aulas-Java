package Avaliacao2;

import Aula06.Cadastros.Pessoa;

public class Conta {

    private int numeroConta;
    private Pessoa titularDaConta;
    double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(Pessoa titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar (double valor) {
        this.saldo -= valor;
    }

    public void depositar (double valor){
        this.saldo += valor;
    }

    public void imprimirSaldo (){
        System.out.println(saldo);
    }

}
