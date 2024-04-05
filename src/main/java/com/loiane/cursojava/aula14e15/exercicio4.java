package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.next();

        switch(letra){
            case "a":
                System.out.println("É uma vogal.");break;
            case "e":
                System.out.println("É uma vogal.");break;
            case "i":
                System.out.println("É uma vogal.");break;
            case "o":
                System.out.println("É uma vogal.");break;
            case "u":
                System.out.println("É uma vogal.");break;
            case "y":
                System.out.println("É uma vogal.");break;
            default:
                System.out.println("É uma consoante!");
        }

    }
}
