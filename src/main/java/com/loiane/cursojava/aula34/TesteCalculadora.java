package com.loiane.cursojava.aula34;

public class TesteCalculadora {

    static int resultadoSoma;
    public static void main(String[] args) {
        // MinhaCalculadora calculadora = new MinhaCalculadora(); Com static não precisa instanciar a classe pra usar seus metodos.
        // calculadora.soma(1,2);

        resultadoSoma = MinhaCalculadora.soma(1,2);

        soma2Valores(1,2);

    }

    static int soma2Valores(int n1, int n2){
        return MinhaCalculadora.soma(n1,n2);
    }
}
