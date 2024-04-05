package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;
import java.util.Random;

public class Exerc15 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[10];
        int pares = 0, impares = 0;

        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
            if(a[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }

        System.out.println("Vetor A: ");

        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }

        pares = pares * 10;
        impares = impares * 10;

        System.out.println();
        System.out.println("Percentual de pares: " + pares + "%");
        System.out.println("Percentual de impares: " + impares + "%");
    }
}
