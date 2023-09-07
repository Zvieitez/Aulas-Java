package Avaliacao;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class aval06 {
    public static void main(String[] args) {

//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Digite a sua senha: ");
//
//        String senha = entrada.nextLine();
//
//        if (senha.equals("Moderna@2022")){
//            System.out.println("Acesso permitido");
//        }else{
//            System.out.println("Senha inválida");
//        }

        //professor

        Scanner entrada = new Scanner(System.in);
        final String senhaSecreta = "Moderna@2022";

        boolean senhaOk = false;
        while (!senhaOk){
            System.out.println("Informe a senha: ");
            String senha = entrada.nextLine();
            if (senha.equals(senhaSecreta)){
                senhaOk = true;
            }else{
                System.out.println("Senha incorreta - tente novamente");
            }
        }
        System.out.println("Bem vindo ao sistema");
        }
    }

