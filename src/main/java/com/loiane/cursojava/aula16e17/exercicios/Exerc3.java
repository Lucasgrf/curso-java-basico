package com.loiane.cursojava.aula16e17.exercicios;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        boolean flag = false;

        System.out.println("Digite seu nome: ");
        do{
            nome = input.next();
            if(nome.length() > 3){
                flag = true;
            }else{
                System.out.println("Nome com mínimo de 3 caracteres, digite novamente!");
            }
        }while(!flag);
        flag = false;

        System.out.println("Digite sua idade: ");
        do{
            idade = input.nextInt();
            if(idade >= 18 && idade < 150){
                flag = true;
            }else{
                System.out.println("Idade mínima de 18 anos, por favor digite novamente!");
            }
        }while(!flag);
        flag = false;

        System.out.println("Digite seu salário: ");
        do{
            salario = input.nextDouble();
            if(salario > 0){
                flag = true;
            }else{
                System.out.println("Salário tem quer ser maior ou igual a 0, por favor digite novamente!");
            }
        }while(!flag);
        flag = false;

        System.out.println("Digite seu sexo: 'f' ou 'm' ");
        do{
            sexo = input.next();
            if(sexo.equalsIgnoreCase("s") || sexo.equalsIgnoreCase("m")){
                flag = true;
            }else{
                System.out.println("Sexo inválido, por favor escolha uma das alternativas!!");
            }
        }while(!flag);
        flag = false;

        System.out.println("Digite seu estado civil: 's', 'c', 'v' ou 'd' ");
        do{
            estadoCivil = input.next();
            if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
            || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                flag = true;
            }else{
                System.out.println("Estado civil inválido, por favor escolha uma das alternativas!");
            }
        }while(!flag);

        System.out.println("Informações coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);

    }
}
