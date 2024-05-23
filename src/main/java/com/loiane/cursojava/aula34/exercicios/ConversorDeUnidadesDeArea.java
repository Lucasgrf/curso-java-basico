package com.loiane.cursojava.aula34.exercicios;

public class ConversorDeUnidadesDeArea {
    public static double metroPes(double metros){
        return metros * 10.76;
    }
    public static double pesCentimetros(double pes){
        return pes * 929;
    }
    public static double milhaAcres(double milhas){
        return milhas * 640;
    }
    public static double acrePes(double acres){
        return acres * 43.560;
    }
    public static double pesMetros(double pes){
        return  pes / 10.76;
    }
    public static double centimetrosPes(double centimetros){
        return centimetros / 929;
    }
    public static double acresMilhas(double acres){
        return acres / 640;
    }
    public static double pesAcres(double pes){
        return pes / 43.560;
    }
}
