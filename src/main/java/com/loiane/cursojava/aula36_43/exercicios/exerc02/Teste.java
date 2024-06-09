package com.loiane.cursojava.aula36_43.exercicios.exerc02;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        while(!flag) {
            System.out.println("Escolha qual deseja ver o valor do imposto: PF - Pessoa Física | PJ - Pessoa Jurídica");
            String opcao = scan.nextLine();
            switch(opcao.toUpperCase()) {
                case "PF":
                    System.out.println("Qual o nome da pessoa ?");
                    String nome = scan.nextLine();
                    System.out.println("Qual o salário do(a) " + nome + ":");
                    double salario = scan.nextDouble();
                    scan.nextLine();
                    PessoaFisica pf = new PessoaFisica(nome, salario);
                    System.out.println("Deseja fazer outra operação? S/N");
                    if(scan.nextLine().equalsIgnoreCase("N")) {
                        System.out.println("Finalizando programa...");
                        flag = true;
                    }
                    break;

                    case "PJ":
                        System.out.println("Qual o nome da empresa ?");
                        String nomeEmpresa = scan.nextLine();
                        System.out.println("Digite a renda da " + nomeEmpresa + ":");
                        double renda = scan.nextDouble();
                        scan.nextLine();
                        PessoaJuridica pj = new PessoaJuridica(nomeEmpresa, renda);
                        System.out.println("Deseja fazer outra operação? ");
                        if(scan.nextLine().equalsIgnoreCase("N")) {
                            System.out.println("Finalizando programa...");
                            flag = true;
                        }
                        break;
                default:
                    System.out.println("Entre com uma opção válida por favor!");
            }
        }
    }
}
