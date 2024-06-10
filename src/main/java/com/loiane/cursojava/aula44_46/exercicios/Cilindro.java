package com.loiane.cursojava.aula44_46.exercicios;

public class Cilindro extends Figura3D{
    private int altura;
    private double raio;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI * Math.pow(raio, 2);
        double areaLateral = 2 * Math.PI * raio * altura;
        return (2 * areaBase) + areaLateral;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}
