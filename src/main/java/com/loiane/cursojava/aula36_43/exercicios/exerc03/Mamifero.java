package com.loiane.cursojava.aula36_43.exercicios.exerc03;

public class Mamifero extends Animal {
    private String alimentacao;

    public Mamifero(){
        this.ambiente = "Terra";
    }

    public Mamifero(String nome, String cor, String ambiente, int numeroPatas, double velocidade, int comprimento, String alimentacao) {
        super(nome, cor, ambiente, numeroPatas, velocidade, comprimento);
        this.alimentacao = alimentacao;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "Mamífero: " + nome + "\nComprimento: " + comprimento + "\nCor: " + cor +
                "\nPatas: " + numeroPatas + "\nAmbiente: " + ambiente
                + "\nVelocidade: " + velocidade + "cm \nAlimentação: " + alimentacao + ".\n";
    }
}
