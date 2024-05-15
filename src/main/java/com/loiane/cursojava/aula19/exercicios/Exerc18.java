package com.loiane.cursojava.aula19.exercicios;

import java.util.Random;

public class Exerc18 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[10];
        int idadeMax = Integer.MIN_VALUE, idadeMin = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
            if(a[i] > idadeMax){
                idadeMax = a[i];
            }
            if(a[i] < idadeMin){
                idadeMin = a[i];
            }

        }
        System.out.print("Idades do grupo de pessoas: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Maior idade: " + idadeMax + " anos");
        System.out.println("Menor idade: " + idadeMin + " anos");

    }
}
