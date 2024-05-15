package com.loiane.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[20];

        double cotacaoDolar;

        System.out.println("Digite o valor do dolar: ");
        cotacaoDolar = input.nextDouble();


        for(int i = 0; i < a.length; i++){
            a[i] = cotacaoDolar * (i+1);
            System.out.println(a[i]);
        }

    }
}
