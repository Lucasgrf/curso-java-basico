package com.loiane.cursojava.aula36_43.exercicios.exerc03;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(){
        this.numeroPatas = 0;
        this.ambiente = "Mar";
        this.cor = "Cinzenta";
        this.caracteristica = "Barbatanas e cauda";
    }

    public Peixe(String nome, String cor, String ambiente, int numeroPatas, double velocidade, int comprimento) {
        super(nome, cor, ambiente, numeroPatas, velocidade, comprimento);
    }


    @Override
    public String toString() {
        return "Peixe: " + nome + "\nComprimento: " + comprimento + "cm \nCor: " + cor +
                "\nPatas: " + numeroPatas + "\nAmbiente: " + ambiente
                + "\nVelocidade: " + velocidade + "cm \nCaracteristica: " + caracteristica + ".\n";
    }
}
