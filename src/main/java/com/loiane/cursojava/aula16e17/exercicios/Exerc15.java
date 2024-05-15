package com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo termo de fibonacci: ");
        int n = input.nextInt();

        int n1 = 1, n2 = 1, proximo;

        for(int i = 3; i < n; i++){
            proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
            System.out.println(proximo);
        }

    }
}
