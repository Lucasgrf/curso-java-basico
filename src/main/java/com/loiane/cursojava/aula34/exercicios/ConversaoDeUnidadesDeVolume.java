package com.loiane.cursojava.aula34.exercicios;

public class ConversaoDeUnidadesDeVolume {
    public static double litroCentimetros(double litros){
        return litros * 1000;
    }
    public static double metroLitros(double metros){
        return metros * 1000;
    }
    public static double metroPes(double metros){
        return metros * 35.32;
    }
    public static double galaoPolegadas(double galao){
        return galao * 231;
    }
    public static double galaoLitros(double galao){
        return galao * 3.785;
    }

    public static double centimetroLitros(double centimetros){
        return centimetros / 1000;
    }
    public static double litrosMetros(double litros){
        return litros / 1000;
    }
    public static double pesMetros(double pes){
        return pes / 35.32;
    }
    public static double polegadaGalao(double polegadas){
        return polegadas / 231;
    }
    public static double litrosGalao(double litros){
        return litros / 3.785;
    }
}
