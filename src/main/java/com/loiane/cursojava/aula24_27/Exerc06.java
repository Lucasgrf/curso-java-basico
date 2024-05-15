package com.loiane.cursojava.aula24_27;

public class Exerc06 {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.nome = "Mãe";
        contato.operadora = "Tim";
        contato.ddd = 83;
        contato.numero = 987428173;

        System.out.println("Nome do contato: " + contato.nome);
        System.out.println("Operadora: " + contato.operadora);
        System.out.println("DDD: " + contato.ddd);
        System.out.println("Número: " + contato.numero);
    }
}
