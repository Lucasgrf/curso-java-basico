package com.loiane.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1: X");
        System.out.println("Jogador 2: O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while(!ganhou){
            if(jogada % 2 == 1){
                System.out.println("Jogador 1: Escolha linha e coluna(1-3)");
                sinal = 'X';
            }else{
                System.out.println("Jogador 2: Escolha linha e coluna(1-3)");
                sinal = 'O';
            }
            boolean linhaValida = false;
            while(!linhaValida){
                System.out.println("Entre com a linha: (1, 2 ou 3)");
                linha = scan.nextInt();
                if(linha >= 1 && linha <= 3){
                    linhaValida = true;
                }else{
                    System.out.println("Linha inválida! Digite novamente.");
                }
            }
            boolean colunaValida = false;
            while(!colunaValida){
                System.out.println("Entre com a coluna: (1, 2 ou 3)");
                coluna = scan.nextInt();
                if(coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                }else{
                    System.out.println("Coluna inválida! Digite novamente.");
                }
            }

            linha--;
            coluna--; //Usando números pra jogar de 1 - 3, e o vetor começa a contar do 0;

            if(jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
                System.out.println("Posição já usada, jogue novamente.");
            }else{
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            for (char[] chars : jogoVelha) {
                for (int j = 0; j < chars.length; j++) {
                    System.out.print(chars[j] + "|\t");
                }
                System.out.println();
            }

            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') ||
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') ||
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') ||
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') ||
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')){
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            }else if((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') ||
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')){
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            }else if(jogada > 9){
                ganhou = true;
                System.out.println("Ninguém ganhou a partida.");
            }
        }
    }
}
