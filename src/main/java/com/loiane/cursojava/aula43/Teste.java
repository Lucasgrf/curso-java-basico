package com.loiane.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Ciência da computação");
        double[] notas = {1,2,3,4};
        aluno.setNotas(notas);

        System.out.println(aluno);
        String s1 = "aAaAaAaAaAaAaAaAaA";
        String s2 = "AaAaAaAaAaAaAaAaAa";
        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciência da computação");
        double[] notas2 = {1,2,3,4};
        aluno2.setNotas(notas2);

        //System.out.println(aluno2 == aluno); False, compara a referencia
        //System.out.println(aluno.equals(aluno2)); Compara os atributos
        System.out.println(aluno.equals(aluno2)); //metodo equals sobrescrito para comparar apenas o nome da classe
    }
}
