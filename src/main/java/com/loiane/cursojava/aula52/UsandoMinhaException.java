package com.loiane.cursojava.aula52;

public class UsandoMinhaException {
    public static void main(String[] args) {

        try {
            teste();
        } catch (DivisaoNaoExata e) {
            e.printStackTrace();
        }
    }

    public static void teste() throws DivisaoNaoExata{
        int[] numeros = {4,8,5,16,32,21, 64,128};
        int[] denominadores = {2,0,4,8,0,2,4};

        for(int i = 0; i < numeros.length; i++){
            try {
                if(numeros[i] % 2 != 0){
                    throw new DivisaoNaoExata(numeros[i], denominadores[i]);
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i] / denominadores[i]));
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Aconteceu um erro!");
                e.printStackTrace();
            }
        }
    }
}

