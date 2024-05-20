package com.loiane.cursojava.aula28_33.exercicios;

public class ContaCorrente {
    private int numeroConta, agencia;
    private double saldo, valorEspecialUsado, limiteEspecial;
    private boolean especial;

    public ContaCorrente() {
    }

    public ContaCorrente(int numeroConta, int agencia, double saldo, double valorEspecialUsado, double limiteEspecial, boolean especial) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.valorEspecialUsado = valorEspecialUsado;
        this.limiteEspecial = limiteEspecial;
        this.especial = especial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    private void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public void depositar(double valorDepositado){
        this.saldo += valorDepositado;
    }

    /*public void consultarSaldo(){ não é mais necessário, getSaldo() ja faz isso.
        System.out.println("Saldo atual: " + saldo);
    }*/

    public boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }

    boolean realizarSaque(double quantiaSacar){
        if(getSaldo() >= quantiaSacar){
            this.saldo -= quantiaSacar;
            return true;
        }else{
            if(isEspecial()){
                double limite = this.limiteEspecial + saldo;
                if(limite >= quantiaSacar){
                    saldo -= quantiaSacar;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }

}
