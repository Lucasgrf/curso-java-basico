package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 2 números inteiros e 1 real: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        double n3 = scan.nextDouble();

        double calc1 = (n1*2 + (n2/2));
        double calc2 = (n1*3 + n3);
        double  calc3 = Math.pow(n3,3);

        System.out.println("Cálculo 1: " + calc1);
        System.out.println("Cálculo 2: " + calc2);
        System.out.println("Cálculo 3: " + calc3);
    }
}
