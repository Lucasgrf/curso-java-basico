package com.loiane.cursojava.aulal20;

import java.util.Random;

public class Exerc01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        int x =0,y =0;
        int[][] valoresAleatorios = new int[4][4];

        for(int i = 0;i < valoresAleatorios.length;i++){
            for(int j = 0; j < valoresAleatorios[i].length;j++){
                    valoresAleatorios[i][j] = rand.nextInt(9);
                    if(valoresAleatorios[i][j] > max){
                        max = valoresAleatorios[i][j];
                        x = i;
                        y = j;
                    }
            }
        }
        System.out.println("Matriz 0 - 9: ");
        for(int i = 0;i < valoresAleatorios.length;i++){
            for(int j = 0; j < valoresAleatorios[i].length;j++){
                System.out.print(valoresAleatorios[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("O maior número da matriz é: " + max);
        System.out.println("Sua posição: ["+ x +"] e ["+ y +"]");
    }
}
