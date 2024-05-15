package com.loiane.cursojava.aula19.exercicios;

import java.text.DecimalFormat;
import java.util.Random;

public class Exerc14 {
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");

        int[] a = new int[10];
        int[] b = new int[a.length];
        int cont = 0, soma = 0;
        double media;

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            if (a[i] % 2 != 0) {
                soma += a[i];
                cont++;
            }
        }
        media = soma / (float) cont;

        System.out.println("Vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Média dos valores ímpares: " + df.format(media));
    }
}
