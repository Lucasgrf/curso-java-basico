package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc32 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[5];

        for(int i = 0;i < a.length; i++){
            a[i] = rand.nextInt(12);
        }
        for(int i = 0; i < a.length;i++){
            System.out.println("Tabuada de: " + a[i]);
            for(int j = 1; j <= 10;j++){
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
        }

    }
}
