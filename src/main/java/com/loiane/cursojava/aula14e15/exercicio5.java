package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas duas notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;

        if(media >= 7 && media <= 9){
            System.out.println("Aprovado com media " + media);
        } else if(media <= 7){
            System.out.println("Reprovado com media " + media);
        }else if(media == 10){
            System.out.println("Aprovado com distinção de media " + media);
        }
    }
}
