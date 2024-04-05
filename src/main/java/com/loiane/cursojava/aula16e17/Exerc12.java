package com.loiane.cursojava.aula16e17;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Digite o número que deseja ver a tabuada: (1 a 10)");
        num = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
            }

        }
    }
