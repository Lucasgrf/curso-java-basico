package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc27 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        char[] b = new char[a.length];


        for(int i = 0; i < a.length;i++){
            a[i] = random.nextInt(20);

            if(a[i] < 7){
                b[i] = 'a';
            }else if(a[i] > 7 && a[i] < 10){
                b[i] = 'c';
            }else if(a[i] == 10){
                b[i] = 'd';
            }else if(a[i] > 10){
                b[i] = 'e';
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
