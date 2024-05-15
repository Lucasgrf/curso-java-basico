package com.loiane.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano para verificação: ");
        int ano = input.nextInt();

        if((ano % 400 == 0) || (ano % 4 ==0) && (ano % 100 != 0)){
            System.out.println("Este ano é bissexto!");
        }else{
            System.out.println("Não é bissexto!");
        }
    }
}
