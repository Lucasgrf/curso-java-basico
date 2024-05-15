package com.loiane.cursojava.aula16_17.exercicios;

public class Exerc29 {
    public static void main(String[] args) {

        double valor = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");
        for(int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + (i*valor));
        }
    }
}
