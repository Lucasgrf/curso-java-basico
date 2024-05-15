package com.loiane.cursojava.aula16_17.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exerc4 {
    //exercicio 4 e 5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double paisA, porcentagemA, crescimentoA;
        double paisB, porcentagemB, crescimentoB;
        int cont = 0;
        boolean flag = false;


        do{
            System.out.println("Digite o tamanho da população dos países A: ");
            paisA = input.nextInt();
            System.out.println("Digite o tamanho da população dos países B: ");
            paisB = input.nextInt();
            if(paisA < paisB){
                flag = true;
            }else{
                System.out.println("O país A tem que ser o menor, digite novamente!");
            }
        }while(!flag);
        flag = false;

        do{
            System.out.println("Digite o tamanho da porcentagem inicial de A: ");
            porcentagemA = input.nextInt();
            System.out.println("Digite o tamanho da porcentagem inicial de B: ");
            porcentagemB = input.nextInt();
            if(porcentagemA > porcentagemB){
                flag = true;
            }else{
                System.out.println("A porcentagem de A tem que ser maior que a de B, digite novamente!");
            }
        }while (!flag);

        while(paisB > paisA){
            crescimentoA = (porcentagemA / 100) * paisA;
            crescimentoB = (porcentagemB / 100) * paisB;

            paisA += crescimentoA;
            paisB += crescimentoB;
            cont++;
        }

        System.out.println("Habitantes pais A: " + paisA);
        System.out.println("Habitantes pais B: " + paisB);
        System.out.println("Anos até igualar a população: " + cont);
    }
}
