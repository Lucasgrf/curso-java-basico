package com.loiane.cursojava.aula31;

public class Carro {
    public String marca, modelo;
    int numPassageiros;
    private double capCombustivel,consumoCombustivel;

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km");
    }

    public double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    private double divideKMPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }

    public double calcularCombustivel(double km){
        return this.divideKMPorConsumoCombustivel(km);
    }
}
