package com.loiane.cursojava.aula16e17;

import java.util.Scanner;

public class Exerc26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int candidatoA = 1, candidatoB = 2, candidatoC = 3, voto, somaA = 0, somaB = 0, somaC = 0;

        System.out.println("Digite o número total de eleitores: ");
        int eleitores = input.nextInt();

        for(int i = 0; i < eleitores; i++){
            System.out.println("Por favor, eleitor " + (i+1) + " utilize seu voto: ");
            voto = input.nextInt();
            switch(voto){
                case 1: somaA++;break;
                case 2: somaB++;break;
                case 3: somaC++;break;
                default:
                    System.out.println("Por favor digite um candidato válido!");
                    i--;
                    continue;
            }

        }
        System.out.println("Total de votos para cada candidato");
        System.out.println("Candidato A: " + somaA);
        System.out.println("Candidato B: " + somaB);
        System.out.println("Candidato C: " + somaC);
        if(somaA > somaB && somaA > somaC){
            System.out.println("Vencedor: " + somaA);
        }else if(somaB > somaA && somaB > somaC){
            System.out.println("Vencedor: " + somaB);
        }else if(somaC > somaA && somaC > somaB){
            System.out.println("Vencedor: " + somaC);
        }else if(somaA == somaB || somaA == somaC){
            System.out.println("Empate técnico!");
        }

    }
}
