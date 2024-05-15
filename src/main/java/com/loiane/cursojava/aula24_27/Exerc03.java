package com.loiane.cursojava.aula24_27;

public class Exerc03 {
    public static void main(String[] args) {
        LivroDeLivraria livro = new LivroDeLivraria();
        livro.autor = "Franz Kafka";
        livro.editora = "Companhia das Letras";
        livro.idioma = "Português";
        livro.nome = "Metamorfose";
        livro.tipoCapa = "Capa normal";
        livro.qtdPaginas = 96;
        livro.tipo = "Ficção Literária";
        livro.preco = 36;
        livro.avaliacao = 4.6;

        System.out.println("Informações do livro: ");
        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Idioma: " + livro.idioma);
        System.out.println("Modelo da Capa: " + livro.tipoCapa);
        System.out.println("Quantidade de Páginas: " + livro.qtdPaginas);
        System.out.println("Tipo: " + livro.tipo);
        System.out.println("Preço: R$ " + livro.preco);
        System.out.println("Avaliação: " + livro.avaliacao + " *");
    }
}
