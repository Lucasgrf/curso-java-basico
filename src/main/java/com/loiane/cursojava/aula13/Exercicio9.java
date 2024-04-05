package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos graus Farenheit serão convertidos? ");
        double farenheit = scan.nextDouble();

        double c = (5 * (farenheit-32)/9);
        System.out.println("Em celsius: " + c);
    }
}
