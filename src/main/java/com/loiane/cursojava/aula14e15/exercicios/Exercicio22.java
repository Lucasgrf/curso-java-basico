package com.loiane.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Ele é par!");
        }else{
            System.out.println("Ele é ímpar!");
        }
    }
}
