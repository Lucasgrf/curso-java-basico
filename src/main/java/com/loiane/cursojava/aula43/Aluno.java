package com.loiane.cursojava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    private String curso;
    private double[] notas;

    public Aluno() {
        super(); // Faz referência aos atributos e métodos da superclass.
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }

    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno: ";
        //s += super.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Imprimindo endereço do aluno:");
        System.out.println(this.obterEtiquetaEndereco());
    }

    /*public String toString(){
        String s = curso + "\n";
        for(double nota: notas){
            s += nota + " ";
        }
        return s;
    }*/

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        if(curso.equals(aluno.getCurso())){
            return true;
        }
        return false;
    }

}
