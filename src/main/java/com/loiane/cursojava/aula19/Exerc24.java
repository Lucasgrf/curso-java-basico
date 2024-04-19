package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Exerc24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean palidromo = true;
        int[] a = new int[10];

        for(int i = 0; i < a.length;i++){
            System.out.println("Digite o número da posição " + i + ":");
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < a.length/2;i++){
            if(a[i] != a[a.length - 1 - i]){
                palidromo = false;
                break;
            }
        }
        System.out.println("Vetor A: ");

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();

        if(palidromo){
            System.out.println("Palidromo!");
        }else{
            System.out.println("Não é palidromo!");
        }
    }
}
