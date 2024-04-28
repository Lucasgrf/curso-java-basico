package com.loiane.cursojava.aulal20;

import java.util.Random;

public class Exerc02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] valoresAleatorios = new int[10][10];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int linha = 5, coluna = 7, x = 0, y = 0;

        //Matriz 10x10
        for(int i = 0;i < valoresAleatorios.length;i++){
            for(int j = 0; j < valoresAleatorios[i].length;j++){
                valoresAleatorios[i][j] = rand.nextInt(9);
                System.out.print(valoresAleatorios[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int j = 0; j < valoresAleatorios[linha].length;j++){
            if(valoresAleatorios[linha][j] > max){
                max = valoresAleatorios[linha][j];
                x = linha;
                y = j;
            }
        }
        System.out.println("O maior valor da linha " + linha + ": " + max);
        System.out.println("Coordenadas: [" + x + "]" + "[" + y + "]");

        for(int i = 0; i < valoresAleatorios.length;i++){
            if(valoresAleatorios[i][coluna] < min){
                min = valoresAleatorios[i][coluna];
                x = i;
                y = coluna;
            }
        }

        System.out.println("O menor valor da coluna " + coluna + ": " + min);
        System.out.println("Coordenadas: [" + x + "]" + "[" + y + "]");

    }
}
