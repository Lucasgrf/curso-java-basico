package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] notas = new int[10];

        //For normal
        System.out.println("For normal: ");
        for(int i = 0; i < notas.length;i++){
            notas[i] = rand.nextInt(10);
            System.out.print(notas[i] + " ");
        }

        //For melhorado
        System.out.println("\nUsando ForEach: ");
        for(int nota : notas){
            System.out.print(nota + " ");
        }

        System.out.println("\nExemplo com arrays multidimensionais: ");
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 1;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 6;
        notasAlunos[2][3] = 3;

        for(double[] notaAlunos : notasAlunos){
            for(double nota : notaAlunos){
                System.out.println(nota + " ");
            }
            System.out.println();
        }

    }
}
