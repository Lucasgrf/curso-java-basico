package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        int pares = 0;
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
            if(a[i] % 2 == 0){
                pares++;
            }
        }
        System.out.println("Vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Números pares: " + pares);
    }
}
