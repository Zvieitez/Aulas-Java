package Revisao;

public class exerc8 {
    public static void main(String[] args) {

        int num01 = 2;
        int num02 = 5;
        int num03 = 10;
        int num04 = 35;
        int num05 = 50;

        System.out.println("Número menor");

        if (num01<num02 && num01<num03 && num01<num04 && num01<num05){
            System.out.println(num01);
        }else if (num02<num01 && num02<num03 && num02<num04 && num02<num05){
            System.out.println(num02);
        } else if (num03<num01 && num03<num02 && num03<num04 && num03<num05){
            System.out.println(num03);
        }else if (num04<num01 && num04<num02 && num04<num03 && num04<num05){
            System.out.println(num04);
        } else if (num05<num01 && num05<num02 && num05<num03 && num05<num04){
            System.out.println(num05);
        }

        System.out.println("Número maior");

        if (num01>num02 && num01>num03 && num01>num04 && num01>num05){
            System.out.println(num01);
        }else if (num02>num01 && num02>num03 && num02>num04 && num02>num05){
            System.out.println(num02);
        } else if (num03>num01 && num03>num02 && num03>num04 && num03>num05){
            System.out.println(num03);
        }else if (num04>num01 && num04>num02 && num04>num03 && num04>num05){
            System.out.println(num04);
        } else if (num05>num01 && num05>num02 && num05>num03 && num05>num04){
            System.out.println(num05);
        }
    }

        }


