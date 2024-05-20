package com.loiane.cursojava.aula28_33.exercicios;

public class JogoDaVelha {
    private char[][] jogoVelha;
    private int jogada;

    public JogoDaVelha() {
        jogoVelha = new char[3][3];
        jogada = 1;
    }
    public char[][] getJogoVelha() {
        return jogoVelha;
    }
    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }
    public int getJogada() {
        return jogada;
    }
    public void setJogada(int jogada) {
        this.jogada = jogada;
    }
    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
            return false;
        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
            return true;
        }
    }
    public void imprimirTabuleiro() {
        for (char[] chars : jogoVelha) {
            for (int j = 0; j < chars.length; j++) {
                System.out.print(chars[j] + "|\t");
            }
            System.out.println();
        }
    }
    public boolean verificarGanhador(char sinal){
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
    public boolean vezJogador1(){
        if(getJogada() % 2 == 1){
            return true;
        }
        return false;
    }
}
