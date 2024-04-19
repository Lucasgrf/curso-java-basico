package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc31 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[20];
        int[] b = new int[a.length];
        int posB = 0;

        for(int i = 0; i < a.length;i++){
            a[i] = rand.nextInt(20);
        }

        for(int i = 0; i < a.length;i++){
            if(a[i] % 2 == 0){
                b[posB] = a[i];
                posB++;
            }
        }

        for(int i = 0; i < a.length;i++){
            if(a[i] % 2 != 0){
                b[posB] = a[i];
                posB++;
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
