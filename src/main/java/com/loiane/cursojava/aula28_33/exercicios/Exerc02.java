package com.loiane.cursojava.aula28_33.exercicios;

public class Exerc02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setSaldo(-10);
        conta.setEspecial(true);
        conta.setNumeroConta(12345);
        conta.setAgencia(0001);
        conta.setLimiteEspecial(500);


        System.out.println("Depósito de 500 reais!");
        conta.depositar(500);
        System.out.println("Saldo: " + conta.getSaldo());

        conta.realizarSaque(500);
        System.out.println("Saldo: " + conta.getSaldo());

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial!");
        }else{
            System.out.println("Não está usando cheque especial!");
        }
    }
}
