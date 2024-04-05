package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o sexo: 'F' ou 'M' ");
        String sexo = scan.next();

        switch(sexo){
            case "F":
                System.out.println("Feminino");break;
            case "M":
                System.out.println("Masculino");break;
            default:
                System.out.println("Sexo inválido");
        }
    }
}
