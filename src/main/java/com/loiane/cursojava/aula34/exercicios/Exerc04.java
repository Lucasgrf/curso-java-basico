package com.loiane.cursojava.aula34.exercicios;

public class Exerc04 {
    public static void main(String[] args) {
        System.out.println("Primeira rodada de conversões: ");
        imprimirTela(ConversorDeUnidadesDeArea.metroPes(1));
        imprimirTela(ConversorDeUnidadesDeArea.pesCentimetros(1));
        imprimirTela(ConversorDeUnidadesDeArea.milhaAcres(1));
        imprimirTela(ConversorDeUnidadesDeArea.acrePes(1));

        System.out.println();

        System.out.println("Segunda rodada de conversões: ");
        imprimirTela(ConversorDeUnidadesDeArea.pesMetros(10.76));
        imprimirTela(ConversorDeUnidadesDeArea.centimetrosPes(929));
        imprimirTela(ConversorDeUnidadesDeArea.acresMilhas(640));
        imprimirTela(ConversorDeUnidadesDeArea.pesAcres(43.56));


    }

    public static void imprimirTela(double num){
        System.out.println(num);
    }
}
