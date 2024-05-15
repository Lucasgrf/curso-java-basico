package com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número base: ");
        int base = input.nextInt();
        System.out.println("Digite o expoente: ");
        int exp = input.nextInt();

        int resultado = base;

        for(int i = 0; i < exp; i++){
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }
}
