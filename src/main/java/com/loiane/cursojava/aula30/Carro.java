package com.loiane.cursojava.aula30;

public class Carro {
    String marca, modelo;
    int numPassageiros;
    double capCombustivel,consumoCombustivel;

    public Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Construtor com 3 parametros chamado");
    }

    public Carro(String marca, String modelo) {
        this("Fiat", "Ducato", 10);
        System.out.println("Construtor com 2 parametros chamado");
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km");
    }

    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km/this.consumoCombustivel;
        return qtdCombustivel;
    }
}
