package com.loiane.cursojava.aula28_33.exercicios;

public class Exerc01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mudarEstado();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
