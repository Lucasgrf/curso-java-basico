package com.loiane.cursojava.aula19.exercicios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        int[] a = new int[10];
        int[] b = new int[a.length];
        double[] c = new double[a.length];


        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
        }
        for(int i = 0; i < a.length; i++){
            b[i] = random.nextInt(100);
        }
        for(int i = 0; i < a.length; i++){
            c[i] = a[i] /(float) b[i];
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
        System.out.print("Vetor C: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + df.format(c[i]));
        }
    }
}
