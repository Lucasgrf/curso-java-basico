package com.loiane.cursojava.aula13;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos kilos de peixe: ");
        double peso = scan.nextDouble();

        if(peso>50){
            double excesso = peso - 50;
            double multa = 4 * excesso;
            System.out.println("Você pegou: " + peso + "kg de peixe");
            System.out.println("Excesso de: " + excesso + "kg e valor da multa R$ " + multa);
        }else{
            int excesso = 0;
            int multa = 0;
            System.out.println("Você pegou: " + peso + "kg de peixe");
            System.out.println("Excesso: " + excesso);
            System.out.println("Multa: " + multa);
            System.out.println("Não teve excesso ou multa!");
        }
    }
}
