package com.loiane.cursojava.aula34.exercicios;

public class ConversaoDeUnidadesDeTempo {
    public static int minutosSegundos(int minutos){
        return minutos * 60;
    }
    public static int horasMinutos(int horas){
        return horas * 60;
    }
    public static int diasHoras(int dias){
        return dias * 24;
    }
    public static int semanasDias(int semanas){
        return semanas * 7;
    }
    public static int mesDias(int mes){
        return mes * 30;
    }
    public static double anosDias(int anos){
        return anos * 365.25;
    }

    public static int segundosMinutos(int segundos){
        return segundos / 60;
    }
    public static int minutosHoras(int minutos){
        return minutos / 60;
    }
    public static int horasDias(int horas){
        return horas / 24;
    }
    public static int diasSemanas(int dias){
        return dias / 7;
    }
    public static int diasMes(int dias){
        return dias / 30;
    }
    public static double diasAnos(double dias){
        return dias / 365.25;
    }

}
