package com.loiane.cursojava.aula16_17.exercicios;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean flag = false;

        do {
            System.out.println("Digite o seu nome de usuário: ");
            String nome = input.next();
            System.out.println("Digite a sua senha: ");
            String senha = input.next();
            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("A senha não pode ser o mesmo nome de usuário!");
            } else {
                System.out.println("Nome e senha registrados: " + nome + " : " + senha);
                flag = true;
            }
        }while(!flag);
    }
}
