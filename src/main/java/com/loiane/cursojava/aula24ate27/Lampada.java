package com.loiane.cursojava.aula24ate27;

public class Lampada {
    String tensao,marca,modelo,cor,tipoLuz;
    int preco,potencia,garantiaMeses;
    boolean ligada;

    void desligar(){
        ligada = false;
    }

    void ligar(){
        ligada = true;
    }

    void mostrarEstado(){
        if(ligada){
            System.out.println("A lâmpada está ligada!");
        }else{
            System.out.println("A lâmpada está desligada!");
        }
    }

    void mudarEstado(){
        if(ligada){
            desligar();
        }else{
            ligar();
        }
    }

}
