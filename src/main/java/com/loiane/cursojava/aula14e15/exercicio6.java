package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        ;

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior é: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior é: " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O maior é: " + n3);
        }

        if(n2 > n1 && n3 > n1){
            System.out.println("O menor é: " + n1);
        }else if(n1 > n2 && n3 > n2){
            System.out.println("O menor é: " + n2);
        }else if(n1 > n3 && n2 > n3){
            System.out.println("O menor é: " + n3);
        }
    }
}
