package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = input.nextInt();

        if(num > 0 && num <= 1000){
            int centena = num / 100;
            int dezena = (num % 100) / 10;
            int unidade = num % 10;

            System.out.println(num + " = " + centena + " centanas, " + dezena + " dezenas e " + unidade + " unidades.");
        }else{
            System.out.println("Número inválido!");
        }
    }
}
