package com.loiane.cursojava.aula16_17.exercicios;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Digite um número de um a dez: ");
            int n = input.nextInt();
            if (n >= 0 && n <= 10) {
                System.out.println("Você digitou a nota: " + n);
                notaValida = true;
            }else{
                System.out.println("Você digitou uma nota inválida!");
            }
        }while(!notaValida);
    }
}
