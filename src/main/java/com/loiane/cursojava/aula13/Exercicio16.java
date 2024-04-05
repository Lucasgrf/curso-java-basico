package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos metros quadrados serão pintados: ");
        double metrosQ = scan.nextDouble();

        double quantidadeDeLatas = metrosQ / 54;
        double preco = quantidadeDeLatas * 80;

        System.out.println("Quantidade de latas para comprar: " + quantidadeDeLatas);
        System.out.println("Preço total: R$ " + preco);




    }
}
