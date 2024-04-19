package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc25 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        int[] b = new int[a.length];

        for(int i = 0; i < a.length;i++){
            a[i] = random.nextInt(100);
            if(a[i] % 2 == 0){
                b[i] = 1;
            }else{
                b[i] = 0;
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
