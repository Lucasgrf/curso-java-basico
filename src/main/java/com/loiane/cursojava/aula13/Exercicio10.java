package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos graus celsius serão convertidos: ");
        double c = scan.nextDouble();

        double f = c * 1.8 + 32;
        System.out.println("Em farenheit: " + f);
    }
}
