package com.loiane.cursojava.aula24ate27;

public class Exerc05 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.saldo = -10;
        conta.numeroConta = 223234;
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.agencia = 0001;
        conta.valorEspecialUsado = 0;

        /*System.out.println("Dados conta corrente: ");
        System.out.println("Número da conta: " + conta.numeroConta);
        System.out.println("Agência: " + conta.agencia);
        System.out.println("Status da conta: " + conta.especial);
        System.out.println("Limite Especial: " + conta.limiteEspecial);
        System.out.println("Saldo da conta: " + conta.saldo);*/

        boolean saqueEfetuado = conta.realizarSaque(500);
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso!");
            conta.consultarSaldo();
        }else{
            System.out.println("Ímpossivel realizar saque. Sem limite especial suficiente!");
        }

        System.out.println("Depósito de 500 reais!");
        conta.depositar(500);
        conta.consultarSaldo();

        conta.realizarSaque(600);
        conta.consultarSaldo();

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial!");
        }else{
            System.out.println("Não está usando cheque especial!");
        }
    }
}
