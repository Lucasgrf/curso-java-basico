package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros para converter para centimetro: ");
        double metros = scan.nextDouble();

        double cm = metros * 100;

        System.out.println(metros + " Convertidos em centimetros: " + cm);

    }
}
