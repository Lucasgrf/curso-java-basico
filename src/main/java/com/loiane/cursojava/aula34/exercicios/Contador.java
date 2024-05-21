package com.loiane.cursojava.aula34.exercicios;

public class Contador {
    private static int instacia;

    public Contador(){
        incrementar();
    }

    public static void zerar(){
        instacia = 0;
    }

    public static void incrementar(){
        instacia++;
    }
    public static void incrementar(int num){
        instacia += num;
    }

    public static int obterValor(){
        return instacia;
    }
}
