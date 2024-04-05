package com.loiane.cursojava.aula19;

public class Exerc22 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int zeros = 0, uns = 0;

        for(int i = 0; i < a.length; i++){
            a[i] = (int) Math.round(Math.random() * 1);
            if(a[i] == 0){
                zeros++;
            }else if(a[i] == 1){
                uns++;
            }
        }
        System.out.print("Vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        zeros = zeros * 10;
        uns = uns * 10;
        System.out.println();
        System.out.println("Percentual de números zeros: " + zeros + "%");
        System.out.println("Percentual de números um: " + uns + "%");
    }
}
