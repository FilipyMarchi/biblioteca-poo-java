package filipy.marchi.biblioteca.service;

import filipy.marchi.biblioteca.domain.Livro;

public class PesquisarLivro {
    public static void busca (Livro livro){
        System.out.println(livro.getNome());
        System.out.println(livro.getCategoria());
        System.out.println(livro.getSinopse());
        System.out.println(livro.getQuantidade());
        System.out.println(livro.getCodigoDoProduto());

    }
}
