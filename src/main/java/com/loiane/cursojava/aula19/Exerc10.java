package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];

        for(int i = 0; i < A.length; i++){
            System.out.println("Digite o valor da posição " + i);
            A[i] = input.nextInt();
        }
        for(int i = 0; i < A.length; i++){
            B[i] = A[i] % 2;
        }
        System.out.print("Vetor A: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(" " + A[i]);
        }
        System.out.println();
        System.out.print("Vetor B: ");
        for(int i = 0; i < A.length; i++){
            System.out.print(" " + B[i]);
        }
        System.out.println();
    }
}
