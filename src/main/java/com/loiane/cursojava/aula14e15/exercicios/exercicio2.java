package com.loiane.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor positivo ou negativo: ");
        double num = scan.nextDouble();

        if(num > 0){
            System.out.println("Número positivo!");
        }else{
            System.out.println("Número negativo!");
        }
    }
}
