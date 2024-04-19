package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc29 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[a.length*2];

        for(int i = 0;i < a.length;i++){
            a[i] = random.nextInt(100);
            b[i] = random.nextInt(100);
        }
        for(int i = 0;i < a.length*2;i++){
            if(i < 10){
                c[i] = a[i];
            }else if(i >= 10){
                c[i] = b[i - 10];
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
        for(int i = 0;i<a.length*2;i++){
            System.out.print(c[i] + " ");
        }
    }
}
