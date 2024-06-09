package com.loiane.cursojava.aula36_43.exercicios.exerc01;

public class TesteConta {
    public static void main(String[] args) {
        /*ContaPoupanca conta = new ContaPoupanca("Lucas", 12345, 100);
        System.out.println(conta);
        conta.calcularNovoSaldo();
        conta.depositar(100);
        conta.calcularNovoSaldo();
        System.out.println(conta);
        conta.sacar(50);
        System.out.println(conta);
        conta.calcularNovoSaldo();
        System.out.println(conta);*/

        ContaEspecial contaEspecial = new ContaEspecial("Lucas", 12345, -10, 200);
        System.out.println(contaEspecial);
        contaEspecial.depositar(5);
        System.out.println(contaEspecial);
        contaEspecial.sacar(125);
        System.out.println(contaEspecial);

    }
}
