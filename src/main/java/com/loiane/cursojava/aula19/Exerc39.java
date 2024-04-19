package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc39 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        for(int i = 0;i < a.length;i++){
            a[i] = rand.nextInt(10);
            b[i] = rand.nextInt(10);
            for(int j = 0; j < a.length; j++){
                if(a[i] == b[j]){
                    c[i] = a[i];
                }
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
        System.out.println();
        System.out.print("Vetor C:");
        for(int i = 0;i<a.length;i++){
            System.out.print(c[i] + " ");
        }
    }
}
