package com.loiane.cursojava.aula19;

import java.util.Random;
import java.util.Scanner;

public class Exerc41 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int n, posicao = 0;
        boolean numeroPresente = false;


        for(int i = 0; i < a.length;i++){
            a[i] = rand.nextInt(10);
        }

        System.out.println("Digite o número pra buscar: ");
        n = input.nextInt();

        for(int i = 0; i < a.length;i++){
                if (a[i] == n) {
                    numeroPresente = true;
                    posicao = i;
                    break;
                }
        }
        if(numeroPresente){
            System.out.println("Número " + n + " presente no vetor A!");
            System.out.println("Posição: a[" + posicao + "]");
        }else{
            System.out.println("Número não está presente no vetor A!");
        }
        System.out.println();

        System.out.print("Vetor A:");
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

}
