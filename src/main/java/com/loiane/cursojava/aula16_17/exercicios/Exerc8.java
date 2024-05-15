package com.loiane.cursojava.aula16_17.exercicios;

import java.util.Scanner;

public class Exerc8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0, media = 0, num;
        for(int i = 0;i < 5; i++){
            System.out.println("Digite um número: ");
            num = input.nextInt();

            soma = soma + num;
            media = soma/i;

        }
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
    }
}
