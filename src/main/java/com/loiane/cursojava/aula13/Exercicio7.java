package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho dos lados do quadrado: ");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();

        double area = (lado1*lado2)*2;
        System.out.println("O dobro da area do quadrado é: " + area);
    }
}
