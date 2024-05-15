package com.loiane.cursojava.aula19.exercicios;

import java.util.Random;

public class Exerc35 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];

        for(int i = 0;i< a.length;i++){
            a[i] = rand.nextInt(20);

            System.out.println("Análise " + a[i] + ":");
            for(int j = 1;j < a[i];j++){
                if(a[i] % j == 0){
                    System.out.println(j + " é divisor!");
                }
            }
            System.out.println();

        }
    }
}
