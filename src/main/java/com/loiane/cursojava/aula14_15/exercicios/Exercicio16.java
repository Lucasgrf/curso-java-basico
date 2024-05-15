package com.loiane.cursojava.aula14_15.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fórmula: ax² + bx + c");

        System.out.println("Digite o valor de a: ");
        int a = scan.nextInt();
        if(a == 0){
            System.out.println("a = 0, não é uma equação de segundo grau!");
            System.exit(1);
        }
            System.out.println("Digite o valor de b: ");
            int b = scan.nextInt();
            System.out.println("Digite o valor de c: ");
            int c = scan.nextInt();

            char sDelta = '\u0394';
            int delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println(sDelta + " = " + delta);
                System.out.println("A equação não possui raízes reais!");
                System.exit(1);
            }else if(delta == 0){
                System.out.println(sDelta + " = " + delta);
                System.out.println("A equação possui apenas 1 raíz real!");
            }else if(delta > 0){
                System.out.println(sDelta + " = " + delta);
                System.out.println("A equação possui duas raízes reais!");
            }


    }
}
