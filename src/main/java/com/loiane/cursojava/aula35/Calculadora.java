package com.loiane.cursojava.aula35;

public class Calculadora {
    public static int fatorialNaoRecursivo(int num){
        int resultado = 1;
        if(num == 0){
            return 1;
        }
        for(int i = num; i > 1;i--){
            resultado *= i;
        }
        return resultado;
    }

    public static int fatorial(int num){
        if(num == 0){
            return 1;
        }
        return num * fatorial(num-1);
    }
}
