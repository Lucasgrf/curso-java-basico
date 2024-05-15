package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numEntrevistados, qtdFilhos;

        System.out.println("Digite o número de pessoas que serão entrevistadas: ");
        numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for(int i = 0; i < nomesFilhos.length;i++){
            System.out.println("Qual a quantidade de filhos?");
            qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for(int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println("Digite o nome do filho " + (j+1) + ":");
                nomesFilhos[i][j] = scan.next();
            }
        }

        for(int i = 0; i < nomesFilhos.length;i++){
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos.");
            for(int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
