package com.loiane.cursojava.aulal20.exercicios;

import java.util.Random;

public class Exerc03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] valoresAleatorios = new int[3][3];
        int numPares = 0, numImpares = 0;

        for(int i = 0;i < valoresAleatorios.length;i++){
            for(int j = 0; j < valoresAleatorios[i].length;j++){
                valoresAleatorios[i][j] = rand.nextInt(100);
                System.out.print(valoresAleatorios[i][j] + "\t");
                if(valoresAleatorios[i][j] % 2 == 0){
                    numPares++;
                }else{
                    numImpares++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Quantidade de números pares na matriz: " + numPares);
        System.out.println("Quantidade de números ímpares na matriz: " + numImpares);
    }
}
