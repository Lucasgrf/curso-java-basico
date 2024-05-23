package com.loiane.cursojava.aula34.exercicios;

public class Exerc05 {
    public static void main(String[] args) {
        System.out.println("Primeira rodada de conversões: ");
        imprimirTela(ConversaoDeUnidadesDeVolume.litroCentimetros(1));
        imprimirTela(ConversaoDeUnidadesDeVolume.metroLitros(1));
        imprimirTela(ConversaoDeUnidadesDeVolume.metroPes(1));
        imprimirTela(ConversaoDeUnidadesDeVolume.galaoPolegadas(1));
        imprimirTela(ConversaoDeUnidadesDeVolume.galaoLitros(1));

        System.out.println();

        System.out.println("Segunda rodada de conversões: ");
        imprimirTela(ConversaoDeUnidadesDeVolume.centimetroLitros(1000));
        imprimirTela(ConversaoDeUnidadesDeVolume.litrosMetros(1000));
        imprimirTela(ConversaoDeUnidadesDeVolume.pesMetros(35.32));
        imprimirTela(ConversaoDeUnidadesDeVolume.polegadaGalao(231));
        imprimirTela(ConversaoDeUnidadesDeVolume.litrosGalao(3.785));



    }

    public static void imprimirTela(double num){
        System.out.println(num);
    }
}
