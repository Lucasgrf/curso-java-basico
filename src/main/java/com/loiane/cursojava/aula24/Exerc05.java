package com.loiane.cursojava.aula24;

public class Exerc05 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.saldo = 0;
        conta.deposito = 100;
        conta.numeroConta = 223234;
        conta.nomePessoa = "Lucas";
        conta.status = "Especial";
        conta.limitada = false;
        conta.agencia = 0001;

        System.out.println("Dados conta corrente: ");
        System.out.println("Número da conta: " + conta.numeroConta);
        System.out.println("Agência: " + conta.agencia);
        System.out.println("Nome do dono da conta: " + conta.nomePessoa);
        System.out.println("Status da conta: " + conta.status);
        System.out.println("Conta limitada: " + conta.limitada);
        System.out.println("Saldo da conta: " + conta.saldo);
        System.out.println("Saldo pra deposito: " + conta.deposito);
    }
}
