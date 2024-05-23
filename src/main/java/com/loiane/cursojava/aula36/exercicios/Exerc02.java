package com.loiane.cursojava.aula36.exercicios;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Curso curso = new Curso();
        Professor professor = new Professor();

        //Dados curso;
        System.out.println("Digite o nome do curso: ");
        curso.setNome(scan.nextLine());
        System.out.println("Digite o horário: ");
        curso.setHorario(scan.nextLine());

        //Dados professor;
        System.out.println("Digite o nome do professor: ");
        professor.setNome(scan.nextLine());
        System.out.println("Digite o departamento do professor: ");
        professor.setDepartamento(scan.nextLine());
        System.out.println("Digite o e-mail do professor: ");
        professor.setEmail(scan.nextLine());

        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[5];
        for (int i=0; i<5; i++){

            scan.nextLine();

            System.out.println("Entre com o nome do aluno " + (i+1));
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com a matrículo do aluno:");
            String matAluno = scan.nextLine();

            double[] notas = new double[4];

            for (int j=0; j<4; j++){
                System.out.println("Entre com a nota " + (j+1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }
}
