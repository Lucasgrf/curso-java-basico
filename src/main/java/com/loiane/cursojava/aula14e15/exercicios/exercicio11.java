package com.loiane.cursojava.aula14e15.exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double salario = scan.nextDouble();
        double aumento;

        if(salario <= 280){
            System.out.println("Seu salario atual: R$ " + salario);
            aumento = salario*0.2;
            System.out.println("Seu percentual de aumento é 20%, com aumento de: R$ " + aumento);
            salario = salario + aumento;
            System.out.println("Salario com aumento: R$ " + salario);
        }else if(salario >= 280 && salario <= 700){
            System.out.println("Seu salario atual: R$ " + salario);
            aumento = salario*0.15;
            System.out.println("Seu percentual de aumento é 15%, com aumento de: R$ " + aumento);
            salario = salario + aumento;
            System.out.println("Salario com aumento: R$ " + salario);
        }else if(salario >= 700 && salario <= 1500){
            System.out.println("Seu salario atual: R$ " + salario);
            aumento = salario*0.1;
            System.out.println("Seu percentual de aumento é 10%, com aumento de: R$ " + aumento);
            salario = salario + aumento;
            System.out.println("Salario com aumento: R$ " + salario);
        }else if(salario > 1500){
            System.out.println("Seu salario atual: R$ " + salario);
            aumento = salario*0.05;
            System.out.println("Seu percentual de aumento é 5%, com aumento de: R$ " + aumento);
            salario = salario + aumento;
            System.out.println("Salario com aumento: R$ " + salario);
        }
    }
}
