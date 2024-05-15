package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos metros quadrados serão pintados: ");
        double metrosQ = scan.nextDouble();

        double quantidadeDeGaloes = metrosQ / 108;
        double quantidadeDeLatas = metrosQ / 21.6;
        double preco1 = quantidadeDeGaloes * 80;
        double preco2 = quantidadeDeLatas * 25;
        double quantidadeTudoJunto = (quantidadeDeGaloes + quantidadeDeLatas)/129.6;
        double desconto = quantidadeTudoJunto * 0.10;
        double preco3 = quantidadeTudoJunto * 105 - desconto;

        System.out.println("Com galões de 18 litros: ");
        System.out.println("Quantidade de galões: " + Math.round(quantidadeDeGaloes));
        System.out.println("Preço: R$ " + Math.round(preco1));
        System.out.println("--------------------");
        System.out.println("Com latas de 3,6 litros: ");
        System.out.println("Quantidade de latas: " + Math.round(quantidadeDeLatas));
        System.out.println("Preço: R$ " + Math.round(preco2));
        System.out.println("--------------------");
        System.out.println("Com galões de 18 litros e latas: ");
        System.out.println("Quantidade de galões e latas: " + Math.round(quantidadeTudoJunto));
        System.out.println("Preço: R$ " + Math.round(preco3));


    }
}
