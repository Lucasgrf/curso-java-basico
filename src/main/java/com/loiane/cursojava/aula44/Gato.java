package com.loiane.cursojava.aula44;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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
