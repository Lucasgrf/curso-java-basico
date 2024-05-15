package com.loiane.cursojava.aula19.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] a = new int[10];
        int[] b = new int[a.length];


        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
        }
        for(int i = 0; i < a.length; i++){
            b[i] = a[i] * i;
        }
        System.out.print("Vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.print("Vetor B: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + b[i]);
        }
        System.out.println();
    }
}
