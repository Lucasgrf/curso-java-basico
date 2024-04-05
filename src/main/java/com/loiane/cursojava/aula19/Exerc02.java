package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[8];
        int[] b = new int[a.length];

        for(int i = 0; i < a.length; i++){
            System.out.println("Digite o valor da posição: " + i);
            a[i] = input.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            b[i] = a[i] * 2;
        }
        System.out.println("Vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + b[i]);
        }
        System.out.println();

    }
}
