package com.loiane.cursojava.aula19.exercicios;

import java.util.Random;

public class Exerc37 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[15];
        int[] b = new int[a.length];

        for(int i = 0;i < a.length;i++){
            a[i] = rand.nextInt(10);
            System.out.println("Fatorial de: " + a[i]);
            b[i] = 1;
            for(int j = 1; j <= a[i];j++){
                b[i] *= j;
                System.out.println(a[i] + " x " + j + " = " + b[i]);
            }
        }
    }
}
