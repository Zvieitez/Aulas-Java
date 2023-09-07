package Avaliacao;

import java.util.Scanner;

public class aval08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] arrProduto = new String[10];
        int[] arrEstoque = new int[10];
        int maisVendido = 0;
        String produtoMaisVendido = "";

        System.out.println("[1] Cadastro de produto");
        System.out.println("[2] Vender produtos");
        System.out.println("[3] Mostrar os produtos mais vendidos");
        System.out.println("[4] Sair do programa");

        System.out.println("Selecione a opção de 1 a 4: ");
        int opcaoEscolhida = Integer.parseInt(entrada.nextLine());

        int indiceProduto = 0;

        while (opcaoEscolhida <= 3) {
            if(opcaoEscolhida==1){
                System.out.println("Informe o nome do produto: ");
                String produto = entrada.nextLine();
                arrProduto[indiceProduto] = produto;

                System.out.println("Informe o estoque do produto");
                int estoque = entrada.nextInt();
                entrada.nextLine();
                arrEstoque[indiceProduto] = estoque;
                indiceProduto++;
            }
            if(opcaoEscolhida == 2){
                System.out.println("Adicione um produto ao carrinho, informe seu codigo");
                System.out.println("Codigos disponiveis até o numero - " + (indiceProduto - 1));
                int codigo = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Quantos produtos?");
                int qtdProdutos = entrada.nextInt();
                entrada.nextLine();

                int saldo = arrEstoque[codigo] - qtdProdutos;

                if(saldo < 0){
                    System.out.println("Não há estoque disponível para esse produto.");
                }else {
                    arrEstoque[codigo] = saldo;
                    if(qtdProdutos > maisVendido){
                        produtoMaisVendido = arrProduto[codigo];
                        maisVendido = qtdProdutos;
                    }
                }
            }

            if(opcaoEscolhida == 3){
                System.out.println("Produto mais vendido: " + produtoMaisVendido);
                System.out.println("==============================================");
            }

            System.out.println("[1] Cadastro de produto");
            System.out.println("[2] Vender produtos");
            System.out.println("[3] Mostrar os produtos mais vendidos");
            System.out.println("[4] Sair do programa");

            System.out.println("Selecione uma opcao de 1 a 4");
            opcaoEscolhida = Integer.parseInt(entrada.nextLine());
        }
    }
}
