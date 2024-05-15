package com.loiane.cursojava.aula14_15.exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite as 3 notas do aluno: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double media = (n1 + n2 + n3)/3;

        if(media >= 7 && media < 10){
            System.out.println("Aprovado, com média: " + media);
        }else if(media < 7){
            System.out.println("Reprovado, com média: " + media);
        }else if(media == 10){
            System.out.println("Aprovado com distinção, média: " + media);
        }
    }
}
