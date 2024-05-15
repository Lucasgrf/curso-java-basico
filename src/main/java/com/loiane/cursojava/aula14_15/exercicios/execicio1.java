package com.loiane.cursojava.aula14_15.exercicios;

import java.util.Scanner;

public class execicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 2 números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(num1);
        } else if(num2 > num1){
            System.out.println(num2);
        }
    }
}
