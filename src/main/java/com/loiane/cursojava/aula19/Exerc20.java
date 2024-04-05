package com.loiane.cursojava.aula19;

public class Exerc20 {
    public static void main(String[] args) {
        double[] a = new double[20];
        double dolar = 1;
        double real = 1;
        double cotacaoDolar = dolar*(real*5.06);

        for(int i = 0; i < a.length; i++){
            a[i] = cotacaoDolar * (i+1);
            System.out.println(a[i]);
        }

    }
}
