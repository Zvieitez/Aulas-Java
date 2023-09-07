package Avaliacao2;

import java.sql.SQLOutput;

public class ProgramaConta {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setNumeroConta(361521);
        conta.setSaldo(1000);

        System.out.println("*** CONTA ***");
        System.out.println("*** Saque Conta ***");
        System.out.println("Saldo inicial antes do saque: R$ " + conta.getSaldo());
        conta.sacar(100);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        System.out.println("*** Depósito Conta ***");
        conta.depositar(200);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());
        System.out.println("******************************************************");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(2000);
        contaCorrente.setTaxa(10);

        System.out.println("*** CONTA CORRENTE ***");
        System.out.println("*** Saque Conta Corrente ***");
        contaCorrente.sacar(100);
        System.out.println("Saldo após saque: R$ " + contaCorrente.getSaldo());
        System.out.println("******************************************************");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(3000);
        contaPoupanca.setRendimento(10);

        System.out.println("*** CONTA POUPANÇA ***");
        System.out.println("*** Depósito Conta Poupança ***");
        contaPoupanca.depositar(200);
        System.out.println("Saldo conta poupança após rendimento: R$ " + contaPoupanca.getSaldo());

    }
}
