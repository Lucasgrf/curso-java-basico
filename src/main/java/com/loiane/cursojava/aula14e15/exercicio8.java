package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço dos três produtos: ");
        double preco1 = scan.nextDouble();
        double preco2 = scan.nextDouble();
        double preco3 = scan.nextDouble();

        if(preco1 < preco2 && preco1 < preco3){
            System.out.println("Comprar o primeiro produto por: R$ " + preco1);
        }else if(preco2 < preco1 && preco2 < preco3){
            System.out.println("Comprar o primeiro produto por: R$ " + preco2);
        }else if(preco3 < preco1 && preco3 < preco2){
            System.out.println("Comprar o primeiro produto por: R$ " + preco3);
        }
    }
}
