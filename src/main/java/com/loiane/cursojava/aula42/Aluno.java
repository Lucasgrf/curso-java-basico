package com.loiane.cursojava.aula42;

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
}
