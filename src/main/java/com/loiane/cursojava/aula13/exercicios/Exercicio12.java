package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float altura = scan.nextFloat();

        float peso = (float) ((72.7*altura) - 58);
        System.out.println("Seu peso ideal é: " + peso);
    }
}
