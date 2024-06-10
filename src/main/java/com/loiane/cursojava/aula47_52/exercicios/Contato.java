package com.loiane.cursojava.aula47_52.exercicios;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    private int id;
    private static int contador;

    public Contato() {
        contador++;
        this.id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String s = "ID: "+ id + "; Nome: " + nome + "; Telefone: " + telefone + "; E-mail: " + email;
        return s;
    }
}
