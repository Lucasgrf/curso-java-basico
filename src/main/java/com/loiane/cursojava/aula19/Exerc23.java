package com.loiane.cursojava.aula19;

import java.util.Random;
import java.util.Scanner;

public class Exerc23 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];
        int cont = 0;

        System.out.println("Quais os elementos do vetor? ");
        for(int i = 0; i < a.length; i++){
            System.out.println("Digite a " + i + "° posição: ");
            a[i] = scan.nextInt();
            if(a[i] % 2 == 0){
                cont++;
                continue;
            }else{
                System.out.println("Vetor ímpar: " + a[i]);
                break;
            }
        }
        System.out.print("Vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
    }
}
