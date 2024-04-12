package com.loiane.cursojava.aula19;

public class Exerc24 {
    public static void main(String[] args) {
        int[] a = new int[10];

        boolean flag = true;

        for(int i = 0; i < a.length;i++){
            if(a[i] != a[a.length - 1 - i]){
                flag = false;
                break;
            }
        }
        System.out.println("Vetor A: ");

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();

        if(flag){
            System.out.println("Palidromo!");
        }else{
            System.out.println("Não é palidromo!");
        }
    }
}
