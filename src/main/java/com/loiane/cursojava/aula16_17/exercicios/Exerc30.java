package com.loiane.cursojava.aula16_17.exercicios;

import java.util.Scanner;

public class Exerc30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço do pão: ");
        float valor = input.nextFloat();

        String valorFormatado = String.format("%.2f", valor);
        System.out.println("Panificadora Pão de ontem - Tabela de preços");
        System.out.println("Preço do pão: " + valorFormatado);

        for(int i = 1; i <= 50; i++){
            System.out.println((i + " - R$ " + (i * valor)));
        }
    }
}
