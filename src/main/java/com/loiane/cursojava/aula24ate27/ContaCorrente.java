package com.loiane.cursojava.aula24ate27;

public class ContaCorrente {
    int numeroConta, agencia;
    double saldo, valorEspecialUsado, limiteEspecial;
    boolean especial;

    boolean realizarSaque(double quantiaSacar){
        if(saldo >= quantiaSacar){
            saldo -= quantiaSacar;
            return true;
        }else{
            if(especial){
                double limite = limiteEspecial + saldo;
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

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
