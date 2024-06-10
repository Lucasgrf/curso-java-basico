package com.loiane.cursojava.aula47_52.exercicios;

public class ContatoNaoExisteException extends Exception{
    private String nomeContato;

    public ContatoNaoExisteException(String nome) {
        this.nomeContato = nome;
    }

    public String getMessage(){
        return "Contato " + nomeContato + " não existe na agenda!";
    }
}
