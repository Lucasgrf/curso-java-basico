package com.loiane.cursojava.aula24_27;

public class JogoDaVelha {
    char[][] jogoVelha = new char[3][3];
    int jogada = 1;

    boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {
            return false;
        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }

    void imprimirTabuleiro() {
        for (char[] chars : jogoVelha) {
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[j] + "|\t");
            }
            System.out.println();
        }
    }

    boolean verificarGanhador(char sinal){
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal) ||
                (jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) ||
                (jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) ||
                (jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) ||
                (jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal)){
            return true;
        }
        return false;
    }

    boolean vezJogador1(){
        if(jogada % 2 == 1){
            return true;
        }
        return false;
    }
}
