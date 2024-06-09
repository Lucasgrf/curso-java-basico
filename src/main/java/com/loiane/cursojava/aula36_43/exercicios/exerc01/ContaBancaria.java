package com.loiane.cursojava.aula36_43.exercicios.exerc01;

public class ContaBancaria {
    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double quantiaSacar) {
        if (getSaldo() >= quantiaSacar) {
            this.saldo -= quantiaSacar;
        }else{
            return false;
        }
        return true;
    }

    public void depositar(double valorDepositado){
        this.saldo += valorDepositado;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}