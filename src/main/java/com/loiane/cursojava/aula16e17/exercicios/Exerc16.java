package com.loiane.cursojava.aula16e17.exercicios;

public class Exerc16 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, proximo = 0;

        /* O jeito que eu fiz, com for;
        for(int i = 0; i < 100; i++){
            proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
            System.out.println(proximo);
            if(proximo > 500){
                break;
            }
        }

         */

        while(proximo < 500){
            proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
            System.out.println(proximo);
        }
    }
}
