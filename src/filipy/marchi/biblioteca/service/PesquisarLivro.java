package filipy.marchi.biblioteca.service;

import filipy.marchi.biblioteca.domain.Livro;

public class PesquisarLivro {
    public static void busca (Livro livro){
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Categoria: " + livro.getCategoria());
        System.out.println("Quantidade disponivel: " + livro.getQuantidade());
        System.out.println("Codigo do produto: " + livro.getCodigoDoProduto());

        if (livro.getSinopse() == null){
            System.out.println("Nenhum registro de Sinopse encontrado");
        } else {
            System.out.println(livro.getSinopse());
        }
    }
}
