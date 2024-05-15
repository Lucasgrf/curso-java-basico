package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas 4 notas bimestrais: ");
        int nota1 = scan.nextInt();
        int nota2 = scan.nextInt();
        int nota3 = scan.nextInt();
        int nota4 = scan.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua média bimestral é: " + media);
    }
}
