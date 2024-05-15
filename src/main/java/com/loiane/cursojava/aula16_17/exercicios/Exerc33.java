package com.loiane.cursojava.aula16_17.exercicios;

import java.util.Scanner;

public class Exerc33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, cont = 1, somaT = 0;
        float temperatura, tempMax = Float.MIN_VALUE, tempMin = Float.MAX_VALUE, media = 0;
        System.out.println("Atenção, digite zero para sair do programa a qualquer momento!");
        while(i != 0){
            System.out.println("Qual a temperatura " + cont + ":");
            temperatura = input.nextFloat();
            if(temperatura > tempMax){
                tempMax = temperatura;
            }
            if(temperatura < tempMin && temperatura != 0){
                tempMin = temperatura;
            }
            somaT += temperatura;
            media = somaT/cont;
            cont++;

            if(temperatura == 0){
                i = 0;
            }

        }

        System.out.println("A maior temperatura foi: " + tempMax);
        System.out.println("A menor temperatura foi: " + tempMin);
        System.out.println("A média das temperaturas foi: " + media);

    }
}
