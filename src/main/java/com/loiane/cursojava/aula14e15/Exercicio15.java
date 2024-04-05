package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os 3 lados do triangulo: ");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if(lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado3 + lado1 > lado2){
            System.out.println("Forma um triângulo!");
        }else{
            System.out.println("Não forma um triângulo!");
        }

        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Equilatero!");
        }else if(lado1 == lado2 || lado2 == lado3){
            System.out.println("Isosceles!");
        }else if(lado1 != lado2 && lado2 != lado3){
            System.out.println("Escaleno!");
        }
    }
}
