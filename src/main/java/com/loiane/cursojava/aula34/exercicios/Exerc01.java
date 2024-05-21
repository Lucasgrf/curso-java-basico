package com.loiane.cursojava.aula34.exercicios;

public class Exerc01 {
    public static void main(String[] args) {
        System.out.println(Contador.obterValor());
        Contador.incrementar(2);
        System.out.println(Contador.obterValor());
        Contador.zerar();
        System.out.println(Contador.obterValor());
    }
}
