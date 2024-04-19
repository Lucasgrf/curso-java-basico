package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        int[] b = new int[a.length];

        for(int i = 0;i < a.length - 1;i++){
            a[i] = random.nextInt(100);
            b[a.length - i - 1] = a[i];
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
