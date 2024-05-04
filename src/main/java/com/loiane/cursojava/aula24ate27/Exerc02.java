package com.loiane.cursojava.aula24ate27;

public class Exerc02 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "Franz Kafka";
        livro.editora = "Companhia das Letras";
        livro.idioma = "Português";
        livro.nome = "Metamorfose";
        livro.imagens = false;
        livro.modelo = "Capa normal";
        livro.paginas = 96;
        livro.tipo = "Ficção Literária";

        System.out.println("Informações do livro: ");
        System.out.println("Nome do livro: " + livro.nome);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Idioma: " + livro.idioma);
        System.out.println("Modelo da Capa: " + livro.modelo);
        System.out.println("Quantidade de Páginas: " + livro.paginas);
        System.out.println("Tipo: " + livro.tipo);
        if(livro.imagens){
            System.out.println("Possui imagens.");
        }

    }
}
