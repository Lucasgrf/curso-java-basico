package com.loiane.cursojava.aula16_17.exercicios;

import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros: ");
        int par = 0, impar = 0;

        for(int i = 0; i < 10; i++){
            int num = input.nextInt();
            if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Quantidade de números par: " + par);
        System.out.println("Quantidade de números ímpar: " + impar);
    }
}
