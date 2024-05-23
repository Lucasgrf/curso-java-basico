package com.loiane.cursojava.aula34.exercicios;

public class Exerc06 {
    public static void main(String[] args) {
        System.out.println("Primeira rodada de conversões: ");
        imprimirTela(ConversaoDeUnidadesDeTempo.minutosSegundos(1));
        imprimirTela(ConversaoDeUnidadesDeTempo.horasMinutos(1));
        imprimirTela(ConversaoDeUnidadesDeTempo.diasHoras(1));
        imprimirTela(ConversaoDeUnidadesDeTempo.semanasDias(1));
        imprimirTela(ConversaoDeUnidadesDeTempo.mesDias(1));
        imprimirTela(ConversaoDeUnidadesDeTempo.anosDias(1));

        System.out.println();

        System.out.println("Segunda rodada de conversões: ");
        imprimirTela(ConversaoDeUnidadesDeTempo.segundosMinutos(60));
        imprimirTela(ConversaoDeUnidadesDeTempo.minutosHoras(60));
        imprimirTela(ConversaoDeUnidadesDeTempo.horasDias(24));
        imprimirTela(ConversaoDeUnidadesDeTempo.diasSemanas(7));
        imprimirTela(ConversaoDeUnidadesDeTempo.diasMes(30));
        imprimirTela(ConversaoDeUnidadesDeTempo.diasAnos(365.25));


    }

    public static void imprimirTela(double num){
        System.out.println(num);
    }
}
