package com.loiane.cursojava.aula16_17.exercicios;

import java.util.Scanner;

public class Exerc10 {
    //exercicio 10 e 11;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite 2 números inteiros: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        while(num1 < num2 - 1){
            System.out.println(num1 + 1);
            soma += num1;
            num1++;
        }
        System.out.println("A soma dos números entre " + num1 + " e " + num2 + " é igual: " + soma);
    }
}
