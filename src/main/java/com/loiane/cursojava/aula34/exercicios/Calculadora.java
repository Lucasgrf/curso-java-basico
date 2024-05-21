package com.loiane.cursojava.aula34.exercicios;

public class Calculadora {
    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        if(num1 > num2){
            return num1 - num2;
        }else{
            return num2 - num1;
        }
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        double resultado = 0;
        if(num2 == 0){
            System.out.println("Divisão por 0 ímpossivel.");
        }else{
            resultado = num1 / num2;
        }
        return resultado;
    }

    public static int elevarPotencia(int base, int potencia) {
        int resultado = 1;
        if (potencia == 0) {
            return 1;
        }
        for(int i = 0; i < potencia;i++){
            resultado *= base;
        }
        return resultado;
    }
}
