package com.loiane.cursojava.aula36_43.exercicios.exerc02;

public class PessoaFisica{
    private String nome;
    private double salario, aliquota, parcela;

    public PessoaFisica(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularFaixa(this.salario);
        calcularDesconto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAliquota() {
        return aliquota;
    }

    private void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getParcela() {
        return parcela;
    }

    private void setParcela(double parcela) {
        this.parcela = parcela;
    }

    private void calcularFaixa(double valor) {
        if(valor <= 1400){
            this.aliquota = 0;
        }else if(valor <= 2100){
            this.aliquota = 0.1;
            this.parcela = 100;
        }else if(valor <= 2800){
            this.aliquota = 0.15;
            this.parcela = 270;
        }else if(valor <= 3600){
            this.aliquota = 0.25;
            this.parcela = 500;
        }else{
            this.aliquota = 0.30;
            this.parcela = 700;
        }
    }

    public void calcularDesconto() {
        double valorAliquota = this.getSalario() * getAliquota();
        double imposto = valorAliquota - getParcela();
        System.out.println("Valor imposto: R$ " + imposto);
    }

}
