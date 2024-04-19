package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exerc33 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[5];
        boolean primo = true;
        String msg = "";

        for(int i = 0; i < a.length;i++){
            a[i] = rand.nextInt(100);

            for(int j = 2; j < a[i];j++){
                if(a[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                msg = " é primo!";
            }else{
                msg = " não é primo!";
            }
            System.out.println(a[i] + msg);

        }

    }
}
