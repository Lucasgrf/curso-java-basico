package com.loiane.cursojava.aula14_15.exercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma data: dd/mm/aaaa");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int ano = input.nextInt();

        if(dia <= 31 && mes <= 12 && ano >= 1500){
            System.out.println("É uma data válida!");
        }else{
            System.out.println("Não é uma data válida!");
            if(dia > 31){
                System.out.println(dia + " erro!");
            }else if(mes > 12) {
                System.out.println(mes + " erro!");
            }
        }
    }
}
