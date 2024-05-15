package com.loiane.cursojava.aula29;

public class Carro {
    String marca, modelo;
    int numPassageiros;
    double capCombustivel,consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    Carro(){};

    /*Carro(){
        System.out.println("Classe instanciada.");
        numPassageiros = 4;
    }*/

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
    }

    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }
}
