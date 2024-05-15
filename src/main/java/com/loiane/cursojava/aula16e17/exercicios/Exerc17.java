package com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exerc17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número fatorial: ");
        int n = input.nextInt();

        int fatorial = n;
        for(int i = n; i > 0; i--){
            fatorial *= i;
            if(i > 1)
                System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);
    }
}
