package com.loiane.cursojava.aula16e17;

import java.util.Scanner;

public class Exerc21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = input.nextInt();
        boolean primo = true;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                System.out.println("Não é número primo!");
                primo = false;
            }
        }
        if(primo){
            System.out.println("É primo!");
        }

    }
}
