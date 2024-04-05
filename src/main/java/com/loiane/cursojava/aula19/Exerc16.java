package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc16 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[10];
        int somaInferior = 0, cont = 0, quinze = 0, somaSuperior = 0;
        double media;

        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(25);
            if(a[i] < 15){
                somaInferior += a[i];
            }else{
                somaSuperior += a[i];
                cont++;
            }
            if(a[i] == 15){
                quinze++;
            }

        }
        System.out.print("Vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println();
        media = (double) somaSuperior /cont;
        System.out.println("A soma dos números inferiores a 15 no vetor: " + somaInferior);
        System.out.println("A quantidade de números 15 no vetor: " + quinze);
        System.out.println("A média dos números maiores que 15 no vetor: " + media);

    }
}
