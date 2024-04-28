package com.loiane.cursojava.aulal20;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        byte escolha;
        boolean sair = false;

        while(!sair) {
            System.out.println("|\tMENU\t|");

            System.out.println("Consultar digite - 1");
            System.out.println("Adicionar digite - 2");
            System.out.println("Digite 0 pra sair!");

            escolha = scan.nextByte();

            if (escolha == 1) {
                int dia = 0;
                boolean diaValido = false;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente!");
                    }
                }
                int hora = 0;
                boolean horaValido = false;
                while (!horaValido) {
                    System.out.println("Entre com a hora do mês: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválido, digite novamente!");
                    }
                }
                dia--; //O dia vai até 31, mas o vetor conta a partir do 0. Logo vai ser sempre um dia a menos pra o vetor;
                System.out.println("Digite o compromisso: ");
                compromissos[dia][hora] = scan.next();

            } else if (escolha == 2) {
                int dia = 0;
                boolean diaValido = false;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente!");
                    }
                }
                int hora = 0;
                boolean horaValido = false;
                while (!horaValido) {
                    System.out.println("Entre com a hora do mês: ");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValido = true;
                    } else {
                        System.out.println("Hora inválido, digite novamente!");
                    }
                }
                dia--;
                System.out.println("O comprimisso agendado é: ");
                System.out.println("\t" + compromissos[dia][hora]);

            } else if(escolha == 0){
                sair = true;
            }else{
                System.out.println("Por favor escolha uma opção válida!");
            }
        }

    }
}