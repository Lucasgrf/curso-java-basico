package com.loiane.cursojava.aula35;


public class TesteCalculadora {
    public static void main(String[] args) {
        int naoRecursivo = Calculadora.fatorialNaoRecursivo(5);
        int recursivo = Calculadora.fatorial(5);

        System.out.println(naoRecursivo);
        System.out.println(recursivo);

    }
}
