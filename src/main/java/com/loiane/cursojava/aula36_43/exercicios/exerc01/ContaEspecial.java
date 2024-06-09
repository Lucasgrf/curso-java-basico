package com.loiane.cursojava.aula36_43.exercicios.exerc01;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numeroConta, double saldo, double limite) {
        super(nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double quantiaSacar) {
        if (getSaldo() >= quantiaSacar) {
                setSaldo(getSaldo() - quantiaSacar);
                return true;
        }else if(this.limite >= quantiaSacar){
            setSaldo(getSaldo() - quantiaSacar);
            this.limite -= quantiaSacar;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta Especial: {" +
                "nomeCliente='" + super.getNomeCliente() + '\'' +
                ", numeroConta=" + super.getNumeroConta() +
                ", saldo=" + super.getSaldo() +
                ", limite=" + limite +
                '}';
    }
}
