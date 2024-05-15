package com.loiane.cursojava.aula19.exercicios;

import java.util.Random;

public class Exerc34 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];

        for(int i = 0;i< a.length;i++){
            a[i] = rand.nextInt(20);

            System.out.println("Análise " + a[i] + ":");
            for(int j = 2; j < a[i];j++){
                if(j % 2 == 0){
                    System.out.println(j + " é par!");
                }
            }
            System.out.println();
        }
    }
}
