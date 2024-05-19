package com.loiane.cursojava.aula33;

public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calculadora = new MinhaCalculadora();

        calculadora.soma(1,2);
        calculadora.soma(1,2,3);
        calculadora.soma(1.2,1.3);
        int[] vetorA = {1, 2, 3, 4, 5};
        calculadora.soma(vetorA);

    }
}
