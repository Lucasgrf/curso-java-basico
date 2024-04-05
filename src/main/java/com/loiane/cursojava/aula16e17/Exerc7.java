package com.loiane.cursojava.aula16e17;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;

        for(int i = 0;i < 5;i++){
            System.out.println("Digite um numero: ");
            num = input.nextInt();

            if(num > maior){
                maior = num;
            }
        }

        System.out.println("O maior número é: " + maior);

    }
}
