package Aula06.banco;

public class ProgramaBanco {
    public static void main(String[] args) {

        Conta_Estudantil estudante = new Conta_Estudantil();
        estudante.setNumero(10990);
        estudante.setSaldo(200);

        estudante.sacar(10);
        estudante.depositar(200);
        System.out.println("Conta Estudantil: " + estudante.getSaldo());

        Conta conta = new Conta();
        conta.setNumero(10990);
        conta.setSaldo(100);

        conta.sacar(10);
        conta.depositar(100);
        System.out.println("Conta: " + conta.getSaldo());


        Conta_Investimento investimento= new Conta_Investimento();
        investimento.setTaxa(10);
        investimento.setNumero(1020);
        investimento.setSaldo(50);

        investimento.sacar(15);
        investimento.depositar(100);
        System.out.println("Conta Investimento: " + investimento.getSaldo());

        Conta_Aposentadoria aposentadoria= new Conta_Aposentadoria();
        aposentadoria.setRendimento(10);
        aposentadoria.setNumero(1001);
        aposentadoria.setSaldo(200);

        aposentadoria.sacar(15);
        aposentadoria.depositar(100);
        System.out.println("Conta Aposentadoria: " + aposentadoria.getSaldo());

    }
}
