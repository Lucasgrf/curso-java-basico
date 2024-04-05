package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scan.nextDouble();
        double media = (n1+n2)/2;

        if(media > 9 && media <= 10){
            System.out.println("Conceito: A");
        }else if(media > 7.5 && media <= 9){
            System.out.println("Conceito: B");
        }else if(media > 6 && media <= 7.5){
            System.out.println("Conceito: C");
        }else if(media > 4 && media <= 6){
            System.out.println("Conceito: D");
        }else if(media >= 0 && media <= 4){
            System.out.println("Conceito: E");
        }
    }
}
