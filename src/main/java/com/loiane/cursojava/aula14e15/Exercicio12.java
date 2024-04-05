package com.loiane.cursojava.aula14e15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora?");
        double valorH = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou esse mês?");
        double horasT = scan.nextDouble();

        double salarioBruto = valorH * horasT;;
        double sindicato = salarioBruto*0.03;
        double fgts = salarioBruto*0.11;
        double inss = salarioBruto*0.1;

        int numberOfTabs = 5;
        String tabs = "\t".repeat(numberOfTabs);



        System.out.println("Você deseja pagar o sindicato? (S ou N)");
        String sind = scan.next();

        if(salarioBruto <= 900){
            double ir = 0;
            System.out.println("Salario Bruto: " + "(" + valorH +" * " + horasT + ")" + " \t\t: R$ " +  salarioBruto);
            System.out.println("(-) IR: (0%) " + tabs +"\t: R$" + ir);
            System.out.println("(-) INSS: (10%) " + tabs + ": R$" + inss);
            System.out.println("FGTS (11%) " + tabs + "\t\t: R$ " + fgts);

            if(sind.equals("S")){
                double desconto = sindicato + inss + ir;
                System.out.println("(-) Sindicato: (3%) " + "\t\t\t\t: R$ " + sindicato);
                System.out.println("Total de descontos " + tabs + ": R$ " + desconto);
                System.out.println("Salário Liquído " + tabs + ": R$ " + (salarioBruto - desconto));
            }else{
                double desconto = inss + ir;
                System.out.println("Total de descontos " + tabs + ": R$ " + desconto);
                System.out.println("Salário Liquído " + tabs + ": R$ " + (salarioBruto - desconto));
            }

        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            double ir = salarioBruto*0.05;
            System.out.println("Salario Bruto: " + "(" + valorH +" * " + horasT + ")" + " \t\t: R$ " +  salarioBruto);
            System.out.println("(-) IR: (5%) " + tabs +"\t: R$" + ir);
            System.out.println("(-) INSS: (10%) " + tabs + ": R$" + inss);
            System.out.println("FGTS (11%) " + tabs + "\t\t: R$ " + fgts);

            if(sind.equals("S")){
                double desconto = sindicato + inss + ir;
                System.out.println("(-) Sindicato: (3%) " + "\t\t\t\t: R$ " + sindicato);
                System.out.println("Total de descontos " + tabs + ": R$ " + desconto);
                System.out.println("Salário Liquído " + tabs + ": R$ " + (salarioBruto - desconto));
            }else{
                double desconto = inss + ir;
                System.out.println("Total de descontos " + tabs + ": R$ " + desconto);
                System.out.println("Salário Liquído " + tabs + ": R$ " + (salarioBruto - desconto));
            }

        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            double ir = salarioBruto*0.1;
            System.out.println("Salario Bruto: " + "(" + valorH +" * " + horasT + ")" + " \t\t: R$ " +  salarioBruto);
            System.out.println("(-) IR: (10%) " + tabs +"\t: R$" + ir);
            System.out.println("(-) INSS: (10%) " + tabs + ": R$" + inss);
            System.out.println("FGTS (11%) " + tabs + "\t\t: R$ " + fgts);

            if(sind.equals("S")){
                double desconto = sindicato + inss + ir;
                System.out.println("(-) Sindicato: (3%) " + "\t\t\t\t: R$ " + sindicato);
                System.out.println("Total de descontos " + tabs + ": R$ " + desconto);
                System.out.println("Salário Liquído " + tabs + ": R$ " + (salarioBruto - desconto));
            }else{
                double desconto = inss + ir;
                System.out.println("Total de descontos " + tabs + ": R$ " + desconto);
                System.out.println("Salário Liquído " + tabs + ": R$ " + (salarioBruto - desconto));
            }
        }else if(salarioBruto > 2500){
            double ir = salarioBruto*0.2;
            System.out.println("Salario Bruto: " + "(" + valorH +" * " + horasT + ")" + " \t\t: R$ " +  salarioBruto);
            System.out.println("(-) IR: (20%) " + tabs +"\t: R$" + ir);
            System.out.println("(-) INSS: (10%) " + tabs + ": R$" + inss);
            System.out.println("FGTS (11%) " + tabs + "\t\t: R$ " + fgts);

            if(sind.equals("S")){
                double desconto = sindicato + inss + ir;
                System.out.println("(-) Sindicato: (3%) " + "\t\t\t\t: R$ " + sindicato);
                System.out.println("Total de descontos " + tabs + ": R$ " + desconto);
                System.out.println("Salário Liquído " + tabs + ": R$ " + (salarioBruto - desconto));
            }else{
                double desconto = inss + ir;
                System.out.println("Total de descontos " + tabs + ": R$ " + desconto);
                System.out.println("Salário Liquído " + tabs + ": R$ " + (salarioBruto - desconto));
            }
        }
    }
}
