package com.loiane.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {
        double tempDia001 = 31.2;
        double tempDia002 = 30.2;
        double tempDia003 = 29.2;
        double tempDia004 = 33.2;
        double tempDia005 = 34.2;

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.2;
        temperaturas[1] = 30.2;
        temperaturas[2] = 29.2;
        temperaturas[3] = 33.2;
        temperaturas[4] = 34.2;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("valores do array: ");

        //Consigo acessar o indice atual;
        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
        }

        //Não consigo acessar qual o indice atual;
        for(double temp : temperaturas){
            System.out.println(temp);
        }


    }
}
