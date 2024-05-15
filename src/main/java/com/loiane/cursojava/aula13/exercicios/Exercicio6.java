package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * (raio*raio);
        System.out.println("O circulo com raio " + raio + " tem uma área de: " + area);
    }
}
