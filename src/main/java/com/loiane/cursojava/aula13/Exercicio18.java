package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo em mb: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade de dowload: ");
        double velocidadeInternet = scan.nextDouble();

        double velocidadeDownload = (tamanhoArquivo * 8)/velocidadeInternet;

    }
}
