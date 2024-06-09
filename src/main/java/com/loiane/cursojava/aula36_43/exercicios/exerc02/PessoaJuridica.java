package com.loiane.cursojava.aula36_43.exercicios.exerc02;

public class PessoaJuridica {
    private String nome;
    private double renda;
    private final double aliquota = 0.1;

    public PessoaJuridica(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
        calcularDesconto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda() {
        return renda;
    }

    private void setRenda(double renda) {
        this.renda = renda;
    }


    public double getAliquota() {
        return aliquota;
    }


    public void calcularDesconto() {
        double imposto = renda * aliquota;
        System.out.println("Valor do imposto: " + imposto);
    }
}
