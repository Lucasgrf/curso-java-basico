package com.loiane.cursojava.aula24_27;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia(); // Método. Ações de um objeto.
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        // System.out.println("A autonomia do carro é: " + van.obterAutonomia()); Mesma coisa do anterior.

        double qtdCombustivel = van.calcularCombustivel(10); //Argumentos ou Paramêtros.

        System.out.println("Quantidade de combustivel pra 10 km: " + qtdCombustivel + " litros.");

        /*Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
         */
    }
}
