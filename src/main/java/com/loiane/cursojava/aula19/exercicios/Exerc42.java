package com.loiane.cursojava.aula19.exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exerc42 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];

        System.out.print("Vetor A desordenado: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10);
            System.out.print(" " + a[i]);
            //Vetor desordenado.
        }
        // Arrays.sort(a); Entrada pra aprendizagem de algoritmo quicksort.

        int n = a.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    // Troca os elementos
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);

        System.out.print("\t|\t");
        System.out.print(" Vetor A Ordenado:");
        for(int i = 0;i<a.length;i++){
            System.out.print(" " + a[i]);
        }
    }
}
