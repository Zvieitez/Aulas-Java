package Aula04;

public class Aula04_ex02 {
    public static void main(String[] args) {
        String[] nomes = {"teste", "teste2"};
        Integer[] idades = new Integer[2];

        idades[0] = 16;
        idades[1] = 32;

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);

        System.out.println(idades[0]);
        System.out.println(idades[1]);

        int controlador = 0;
        while (controlador <= nomes.length -1){
            System.out.println(nomes[controlador]);
            controlador ++;
        }

    }
}
