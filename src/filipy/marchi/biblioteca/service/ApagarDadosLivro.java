package filipy.marchi.biblioteca.service;

import filipy.marchi.biblioteca.domain.Livro;

public class ApagarDadosLivro {
    public static void excluir(Livro livro) {
        livro.alterarNome(null);
        livro.alterarCategoria(null);
        livro.alterarQuantidade(0);
        livro.alterarSinopse(null);
        livro.alterarCodigoDoProduto(0);
    }
}
