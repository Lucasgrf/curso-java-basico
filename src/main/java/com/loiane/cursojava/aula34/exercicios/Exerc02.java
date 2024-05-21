package com.loiane.cursojava.aula34.exercicios;

public class Exerc02 {
    public static void main(String[] args) {
        imprimirTela(Calculadora.soma(2,3));
        imprimirTela(Calculadora.dividir(2,3));
        imprimirTela(Calculadora.multiplicar(2,-3));
        imprimirTela(Calculadora.subtrair(2,3));
        imprimirTela(Calculadora.elevarPotencia(2,3));
        imprimirTela(Calculadora.fatorial(5));

    }

    static void imprimirTela(double num){
        System.out.println(num);
    }
}
