package com.loiane.cursojava.aula36.exercicios;

public class Aluno {
    private String nome, matricula;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo(){

        String info = " Nome aluno: " + this.getNome() + ";";
        info += " Matrícula: " + this.getMatricula() + ";";
        info += " Notas: ";

        double soma = 0;
        for(double nota : notas){
            soma += nota;
            info += nota + " ";
        }

        double media = soma / 4;
        info += "\n" + "Média = " + media + " - ";
        if(media > 7){
            info += "Aprovado!";
        }else{
            info += "Reprovado!";
        }

        return info;
    }
    public double obterMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / 4;
    }
}
