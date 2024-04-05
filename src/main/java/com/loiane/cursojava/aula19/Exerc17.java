package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc17 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[10];
        int cont = 0;

        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
            if(a[i] > 35){
                cont++;
            }

        }
        System.out.print("Idades do grupo de pessoas: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.println("Pessoas com mais de 35 anos: " + cont);
    }
}
