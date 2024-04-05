package com.loiane.cursojava.aula13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio8 {
    //exercicio 8 e 15
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor/hora do seu trabalho: ");
        double salarioHora = scan.nextDouble();

        System.out.println("Quantos horas você trabalhou esse mês?");
        double horas = scan.nextDouble();

        double salarioBruto = salarioHora * horas;
        System.out.println("O seu salário esse mês foi: R$ " + salarioBruto);


        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        double salarioLiquido;

        if(salarioBruto > 2500){
            double descontos = ir + inss + sindicato;
            salarioLiquido = salarioBruto - descontos;
        }else{
            double descontos = inss + sindicato;
            salarioLiquido = salarioBruto - descontos;
        }

        System.out.println("Seu salário liquído é: R$ " + salarioLiquido);

    }
}
