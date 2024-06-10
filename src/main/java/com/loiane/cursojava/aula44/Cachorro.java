package com.loiane.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    private int tamanhoCachorro;
    private String raca;

    public int getTamanhoCachorro() {
        return tamanhoCachorro;
    }

    public void setTamanhoCachorro(int tamanhoCachorro) {
        this.tamanhoCachorro = tamanhoCachorro;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void passear() {

    }

    @Override
    public void levarPassear() {

    }
}
