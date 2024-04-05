package com.loiane.cursojava.aula12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scan.next();


        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();


        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Seu primeiro nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu peso é: " + peso);

        /*double imc;
        imc = (peso/altura*altura);

        System.out.println("Seu imc é: " + imc);*/
        //Não consegui fazer o imc.
    }
}
