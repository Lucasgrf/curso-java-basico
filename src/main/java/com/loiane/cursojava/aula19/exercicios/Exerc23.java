package com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Quais os elementos do vetor? ");
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite a " + i + "° posição: ");
            a[i] = scan.nextInt();
            if(a[i] % 2 != 0){
                break;
            }
        }

    }
}
