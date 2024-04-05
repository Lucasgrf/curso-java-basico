package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        //dropei
        Scanner input = new Scanner(System.in);

        System.out.println("|Digite o valor de saque: \t|Minímo: 10 reais, Máximo: 600  |");

        double vSaque = input.nextDouble();

        if(vSaque >= 10 && vSaque <= 600){
            double cem = vSaque / 100;
            double dez = (vSaque % 100) / 10;
            double unidade = vSaque % 10;
            double cinquenta = vSaque / 50;
            double cinco = vSaque / 5;

            System.out.println("Valor para saque recebido: R$ " + vSaque);
            if(cem > 0 && vSaque >= 100) {
                System.out.println("Notas de R$ 100: " + cem);
                vSaque = vSaque - (cem * 100);
            }else if(cinquenta > 0 && vSaque >= 50){
                    System.out.println("Notas de R$ 50: " + cinquenta);
                    vSaque = vSaque - (cinquenta*50);
            }

        }
    }
}
