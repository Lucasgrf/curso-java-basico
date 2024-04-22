package com.loiane.cursojava.aulal20;

public class Matrizes {
    public static void main(String[] args) {
        double[][] notasAlunos = new double[3][4];
        // Aluno 0:
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;
        // Aluno 1:
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;
        // Aluno 2:
        notasAlunos[2][0] = 1;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 6;
        notasAlunos[2][3] = 3;

        // output matriz:
        for(int i = 0;i < notasAlunos.length;i++){
            for(int j = 0; j < notasAlunos[i].length;j++){
                System.out.print(notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }

        notasAlunos[0][1] = 5; //Manipular matrizes.
        System.out.println();

        /* Output da diferença:
        for(int i = 0;i < notasAlunos.length;i++){
            for(int j = 0; j < notasAlunos[i].length;j++){
                System.out.print(notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }*/

        double soma = 0; // Calcular a média dos alunos.
        for(int i = 0;i < notasAlunos.length;i++){
            soma = 0;
            for(int j = 0; j < notasAlunos[i].length;j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + " = " + (soma/4));
        }
    }
}
