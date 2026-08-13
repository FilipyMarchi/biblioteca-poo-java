package filipy.marchi.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmprestimoLivro {
    private String nomeClienteEmprestimo;
    private Date dataEmprestimo;

    private List livrosEmprestados = new ArrayList<>();

    public void emprestimo(Livro livro) {
        if (livro.getQuantidade() > 0) {
            livrosEmprestados.add(livro.getNome() + "(" + livro.getCodigoDoProduto() + ")");
            livro.alterarQuantidadeEmprestimo();
        } else if (livro.getQuantidade() == 0) {
            System.out.println("Livro Indisponivel no momento!");
        }
    }

    public void devolucao(Livro livro) {
        livro.alterarQuantidadeDevolucao();
    }
}
