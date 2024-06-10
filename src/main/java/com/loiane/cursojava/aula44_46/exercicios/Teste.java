package com.loiane.cursojava.aula44_46.exercicios;

public class Teste {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        quadrado.setNome("Quadrado");
        quadrado.setCor("Azul");

        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        circulo.setNome("Círculo");
        circulo.setCor("Verde");

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(3);
        triangulo.setNome("Triangulo");
        triangulo.setCor("Amarelo");

        Cubo cubo = new Cubo();
        cubo.setLado(3);
        cubo.setNome("Cubo");
        cubo.setCor("Ciano");

        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(3);
        cilindro.setRaio(2);
        cilindro.setNome("Cilindro");
        cilindro.setCor("Cinza");

        Piramide piramide = new Piramide();
        piramide.setAltura(3);
        piramide.setApotema(4);
        piramide.setArestaBase(2);
        piramide.setNumPoliBase(4);
        piramide.setBase(quadrado);
        piramide.setNome("Piramide");
        piramide.setCor("Amarelo queimado");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6]; //upcasting
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;

        for(FiguraGeometrica figura : figuras){
            System.out.println("------------------------");
            System.out.println(figura.getNome());
            if(figura instanceof Figura2D){
                Figura2D figura2D = (Figura2D) figura;//downcasting
                System.out.println("Área: "+figura2D.calcularArea());
            }
            if(figura instanceof Figura3D){
                Figura3D figura3D = (Figura3D) figura; //downcasting
                System.out.println("Área: "+figura3D.calcularArea());
                System.out.println("Volume: "+figura3D.calcularVolume());
            }
        }
    }
}
