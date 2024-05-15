package com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exerc31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int produto = 1;
        float valorT = 0, troco, dinheiro = 0, valor = 0;

        System.out.println("==Lojas Tabajara==");
        while(produto != 0){
            System.out.println("Produto " + produto + ": R$ " );
            valor = input.nextFloat();
            valorT += valor;
            produto++;
            if(valor == 0){
                System.out.println("Quanto de dinheiro foi dado pelo cliente? ");
                dinheiro = input.nextFloat();
                System.out.println("Total: R$ " + valorT);
                System.out.println("Dinheiro: R$ " + dinheiro);
                troco = dinheiro - valorT;
                System.out.println("Troco: R$ " + troco);

                produto = 0;
            }
        }


    }
}
