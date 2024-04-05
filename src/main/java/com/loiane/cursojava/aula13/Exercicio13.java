package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura e seu sexo sendo 'M' ou 'F': ");
        String sexo = scan.next();
        double altura = scan.nextDouble();


        if(sexo.equals("M")){
            double pesoIdeal = (72.7*altura) - 58;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
            System.out.println("Qual seu peso?");
            double peso = scan.nextDouble();
            double imc = peso/(altura*altura);
                if(25 >= imc && imc >= 18.5) {
                    System.out.println("Você está no peso ideal!");
                } else if(imc>25){
                    System.out.println("Está acima do peso!");
                }else if(imc<18.5){
                    System.out.println("Está abaixo do peso!");
                }
        }else{
            double pesoIdeal = (62.1*altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
            System.out.println("Qual seu peso?");
            double peso = scan.nextDouble();
            double imc = peso/(altura*altura);
                if(25 >= imc && imc >= 18.5){
                    System.out.println("Você está no peso ideal!");
                }else if(imc>25){
                    System.out.println("Está acima do peso!");
                }else if(imc<18.5){
                    System.out.println("Está abaixo do peso!");
            }
        }
    }
}
