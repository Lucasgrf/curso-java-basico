package com.loiane.cursojava.aula16_17.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exerc27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de turmas: ");
        int turmas = input.nextInt();
        int alunos, soma = 0, media = 0;

        for(int i = 0;i < turmas; i++){
            System.out.println("Digite a quantidade de alunos da turma " + (i+1));
            alunos = input.nextInt();
            if(alunos > 40){
                System.out.println("Número de alunos maior que 40, por favor digite novamente!");
                i--;
                continue;
            }
            soma += alunos;

        }
        media = soma/turmas;
        System.out.println("Média de alunos por turma: " + media);

    }
}
