package com.loiane.cursojava.aula28_33.exercicios;

public class Lampada {
    private String tensao,marca,modelo,tipoLuz;
    private int preco,garantiaMeses;
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String tensao, String marca, String modelo, String tipoLuz, int preco, int garantiaMeses, boolean ligada) {
        this.tensao = tensao;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoLuz = tipoLuz;
        this.preco = preco;
        this.garantiaMeses = garantiaMeses;
        this.ligada = ligada;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void desligar(){
        setLigada(false);
    }

    public void ligar(){
        setLigada(true);
    }

    public void mostrarEstado(){
        if(isLigada()){
            System.out.println("A lâmpada está ligada!");
        }else{
            System.out.println("A lâmpada está desligada!");
        }
    }

    public void mudarEstado(){
        if(isLigada()){
            desligar();
        }else{
            ligar();
        }
    }
}
