package com.loiane.cursojava.aula19.exercicios;

import java.util.Random;

public class Exerc30 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[20];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        for(int i = 0;i < a.length;i++){
            a[i] = random.nextInt(100);
            if(a[i] % 2 == 0){
                b[i] = a[i];
            }else{
                c[i] = a[i];
            }
        }
        System.out.print("Vetor A:");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B:");
        for(int i = 0;i<a.length;i++){
            if(b[i] != 0) {
                System.out.print(b[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Vetor C:");
        for(int i = 0;i<a.length;i++){
            if(c[i] != 0) {
                System.out.print(c[i] + " ");
            }
        }
    }
}
