package com.loiane.cursojava.aula47_52.exercicios;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;
        while (opcao != 3) {
            opcao = obterOpcaoMenu(sc);
            if (opcao == 1) {
                consultarContato(sc, agenda);
            } else if (opcao == 2) {
                adicionarContato(sc, agenda);
            }
        }

    }

    public static void adicionarContato(Scanner sc, Agenda agenda) {
        try {
            System.out.println("Criando um contato, entre com as informações: ");
            String nome = leInformacaoString(sc, "Entre com o nome do contato: ");
            String telefone = leInformacaoString(sc, "Entre com o telefone do contato: ");
            String email = leInformacaoString(sc, "Entre com o email do contato: ");
            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);

            agenda.adicionarContato(contato);

        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda: ");
            System.out.println(agenda);
        }
    }

    public static void consultarContato(Scanner sc, Agenda agenda) {
        String nomeContato = leInformacaoString(sc, "Entre com o nome do contato a ser consultado: ");
        try {
            if (agenda.consultarContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe!");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leInformacaoString(Scanner sc, String msg) {
        System.out.print(msg);
        String str = sc.nextLine();
        return str;
    }

    public static int obterOpcaoMenu(Scanner sc) {

        boolean flag = false;
        int opcao = 3;
        while (!flag) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato.");
            System.out.println("2: Adicionar contato.");
            System.out.println("3: Sair.");

            try {
                String entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    flag = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite novamente.\n");
            }
        }
        return opcao;
    }
}
