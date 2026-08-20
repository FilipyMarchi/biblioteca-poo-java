package filipy.marchi.biblioteca.service;

import filipy.marchi.biblioteca.domain.Cliente;
import filipy.marchi.biblioteca.domain.Livro;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoLivro {

    public static void emprestimo(Cliente cliente, Livro livro) {
        if (livro.getQuantidade() > 0) {
            cliente.livrosEmprestados.add(livro.getNome() + "(" + livro.getCodigoDoProduto() + ")");
            livro.alterarQuantidadeEmprestimo();
        } else if (livro.getQuantidade() == 0) {
            System.out.println("Livro Indisponivel no momento!");
        }
    }

    public static void devolucao(Livro livro) {
        livro.alterarQuantidadeDevolucao();
    }
}
