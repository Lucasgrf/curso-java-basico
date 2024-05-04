package com.loiane.cursojava.aula24ate27;

public class Exerc04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.autor = "Franz Kafka";
        livro.editora = "Companhia das Letras";
        livro.nome = "Metamorfose";
        livro.tipoCapa = "Capa normal";
        livro.qtdPaginas = 96;

        livro.tipos = new String[5]; //Sempre inicializar o vetor, já que ele também é um objeto.
        livro.tipos[0] = "Ficção Literária";

        livro.sessao = 5;
        livro.prateleira = 34;
        livro.emprestado = true;

        System.out.println("Informações do livro: ");
        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Modelo da Capa: " + livro.tipoCapa);
        System.out.println("Quantidade de Páginas: " + livro.qtdPaginas);
        System.out.println("Tipo: " + livro.tipos[0]);
        System.out.println("Sessão: " + livro.sessao);
        System.out.println("Prateleira: " + livro.prateleira);
        System.out.println("Emprestado: " + livro.emprestado);

    }
}
