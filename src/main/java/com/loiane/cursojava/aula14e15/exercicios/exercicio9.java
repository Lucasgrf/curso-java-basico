package com.loiane.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        double valor1 = scan.nextDouble();
        double valor2 = scan.nextDouble();
        double valor3 = scan.nextDouble();

        if(valor1 > valor2 && valor1 > valor3){
            if(valor2 > valor3){
                System.out.println(valor1 + ", " + valor2 + ", " + valor3);
            }else{
                System.out.println(valor1 + ", " + valor3 + ", " + valor2);
            }
        } else if(valor2 > valor1 && valor2 > valor3){
            if(valor1 > valor3){
                System.out.println(valor2 + ", " + valor1 + ", " + valor3);
            }else{
                System.out.println(valor2 + ", " + valor3 + ", " + valor1);
            }
        }else if(valor3 > valor1 && valor3 > valor2){
            if(valor1 > valor2){
                System.out.println(valor3 + ", " + valor1 + ", " + valor2);
            }else{
                System.out.println(valor3 + ", " + valor2 + ", " + valor1);
            }
        }
    }
}
