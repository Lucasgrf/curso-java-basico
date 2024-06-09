package com.loiane.cursojava.aula36_43.exercicios.exerc01;

public class ContaPoupanca extends ContaBancaria{
    private double diaRendimento, taxa;

    public ContaPoupanca(String nomeCliente, int numeroConta, double saldo) {
        super(nomeCliente, numeroConta, saldo);
        calcularTaxaRendimento();
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }
    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(){
            this.setSaldo(this.getSaldo() + calcularTaxaRendimento());
    }

    private double calcularTaxaRendimento(){
        this.diaRendimento = getSaldo()/110;
        return this.diaRendimento;
    }

    @Override
    public String toString() {
        return "Conta Poupança: {" +
                "nomeCliente='" + super.getNomeCliente() + '\'' +
                ", numeroConta=" + super.getNumeroConta() +
                ", saldo=" + super.getSaldo() +
                ", diaRendimento=" + diaRendimento +
                '}';
    }

}
