package com.loiane.cursojava.aula36_43.exercicios.exerc03;

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Peixe peixe = new Peixe();
        Mamifero mamifero = new Mamifero();

        animal.setNome("Camelo");
        animal.setCor("Amarelo");
        animal.setAmbiente("Terra");
        animal.setNumeroPatas(4);
        animal.setVelocidade(2);
        animal.setComprimento(150); //Tive que setar tudo
        System.out.println(animal);

        peixe.setNome("Tubarão");
        peixe.setVelocidade(1.5);
        peixe.setComprimento(300);
        System.out.println(peixe);

        mamifero.setNome("Urso-do-canadá");
        mamifero.setCor("Vermelho");
        mamifero.setNumeroPatas(4);
        mamifero.setVelocidade(0.5);
        mamifero.setComprimento(180);
        mamifero.setAlimentacao("Mel");
        System.out.println(mamifero);




    }
}
