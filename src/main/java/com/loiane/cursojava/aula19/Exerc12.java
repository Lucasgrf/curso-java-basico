package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        int soma = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
            soma += a[i];
        }
        System.out.println("Vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Soma total: " + soma);
    }
}
