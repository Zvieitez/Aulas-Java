package Aula06;

import Aula06.carro.Veiculo;

public class Programa {
    public static void main(String[] args) {
        Veiculo veiculoA = new Veiculo();
        Veiculo veiculoB = new Veiculo();

        veiculoA.acelerar( 10.0);
        System.out.println(Veiculo.velocidade);

        veiculoB.acelerar( 80.0);
        System.out.println(Veiculo.velocidade);

        veiculoA.setNome("Nome: "+ "Gol");
        System.out.println(veiculoA.getNome());

        veiculoA.setCor("Cinza");
        System.out.println(veiculoA.getCor());
    }

}
