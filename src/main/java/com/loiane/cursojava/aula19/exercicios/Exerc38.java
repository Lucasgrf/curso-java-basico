package com.loiane.cursojava.aula19.exercicios;

import java.util.Random;

public class Exerc38 {
    public static void main(String[] args) {
        Random rand = new Random();
        int soma = 0;
        int[] a = new int[10];
        int[] b = new int[a.length];

        for(int i = 0;i < a.length;i++){
            a[i] = rand.nextInt(10);
            soma += a[i];
            for(int j = 0; j < i;j++){
                b[i] = soma;
            }
        }
        System.out.print("Vetor A:");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B:");
        for(int i = 0;i<a.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
