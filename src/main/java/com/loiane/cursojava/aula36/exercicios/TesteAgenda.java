package com.loiane.cursojava.aula36.exercicios;

import com.loiane.cursojava.aula36.Telefone;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("Digite o nome da agenda: ");
        agenda.setNome(scan.nextLine());

        Contato[] contatos = new Contato[3];

        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();

        contatos[0] = contato1;
        contatos[1] = contato2;
        contatos[2] = contato3;

        for(int i = 0; i < contatos.length;i++){
            System.out.println("Digite o nome do contato " + (i+1));
            contatos[i].setNome(scan.nextLine());
            System.out.println("Digite o telefone de " + contatos[i].getNome() + ":");
            contatos[i].setTelefone(scan.nextLine());
            System.out.println("Digite o e-mail de " + contatos[i].getNome() + ":");
            contatos[i].setEmail(scan.nextLine());
        }

        agenda.setContatos(contatos);

        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }
}
