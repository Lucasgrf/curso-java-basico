package com.loiane.cursojava.aula36_43.exercicios.exerc03;

public class Animal {
    protected String nome, cor,ambiente;
    protected int numeroPatas,comprimento;
    protected double velocidade;

    public Animal() {
    }

    public Animal(String nome, String cor, String ambiente, int numeroPatas, double velocidade, int comprimento) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.numeroPatas = numeroPatas;
        this.velocidade = velocidade;
        this.comprimento = comprimento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public String toString() {
        return "Animal: " + nome + "\nComprimento: " + comprimento + "cm \nCor: " + cor +
                "\nPatas: " + numeroPatas + "\nAmbiente: " + ambiente
                + "\nVelocidade: " + velocidade + "cm.\n";
    }
}
