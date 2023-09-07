package Avaliacao;

import java.util.Scanner;

public class aval07 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            double peso = 0;
            double altura = 0;

            System.out.println("Calcule o seu IMC");
            System.out.println("Digite seu peso: ");
            peso = entrada.nextDouble();

            System.out.println("Digite sua altura:");
            altura = entrada.nextDouble();

            System.out.println("Seu IMC é: ");

            double calculo = peso / (altura * altura);
            System.out.println(calculo);

            if (calculo >= 18.5 && calculo <= 24.9) {
                System.out.println("Peso normal");
            }
            if (calculo >= 25 && calculo < 30) {
                System.out.println("Acima do peso");
            }
            if (calculo >= 30 && calculo < 35) {
                System.out.println("Obesidade I");
            }
            if (calculo >= 35 && calculo < 40) {
                System.out.println("Obesidade II");
            }
        }
    }
}





