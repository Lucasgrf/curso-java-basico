package com.loiane.cursojava.aula19.exercicios;

import java.util.Random;

public class Exerc19 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] alunos = new int[10];
        double[] nota1 = new double[alunos.length];
        double[] nota2 = new double[alunos.length];
        double[] result = new double[alunos.length];
        double media;
        double somaNotas = 0;

        for(int i = 0; i < alunos.length; i++){
            nota1[i] = random.nextInt(10);
            nota2[i] = random.nextInt(10);

            somaNotas = nota1[i] + nota2[i];
            media = somaNotas/2;
            result[i] = media;

            if(result[i] >= 7){
                System.out.println("Aluno " + (i+1) + ": aprovado!");
                System.out.println("Notas do aluno " + nota1[i] + " | " + nota2[i]);
                System.out.println("Média do aluno: " + result[i]);
            }else{
                System.out.println("Aluno " + (i+1) + ": reprovado!");
                System.out.println("Notas do aluno: " + nota1[i] + " | " + nota2[i]);
                System.out.println("Média do aluno: " + result[i]);
            }
            System.out.println();

        }


    }
}
