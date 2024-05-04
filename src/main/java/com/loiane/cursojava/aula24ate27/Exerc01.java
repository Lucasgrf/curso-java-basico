package com.loiane.cursojava.aula24ate27;

public class Exerc01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.marca = "Avant";
        lampada.tensao = "Bivolt";
        lampada.modelo = "Led";
        lampada.tipoLuz = "branca";
        lampada.garantiaMeses = 36;
        lampada.potencia = 30;
        lampada.preco = 60;
        lampada.cor = "Branca";
        System.out.println("Informações da lampada: ");
        System.out.println("Marca: " + lampada.marca);
        System.out.println("Tensão: " + lampada.tensao);
        System.out.println("Modelo: " + lampada.modelo);
        System.out.println("Tipo da Luz: " + lampada.tipoLuz);
        System.out.println("Pôtencia: " + lampada.potencia);
        System.out.println("Cor: " + lampada.cor);
        System.out.println("Garantia: " + lampada.garantiaMeses);
        System.out.println("Preço: R$ " + lampada.preco);

    }
}
