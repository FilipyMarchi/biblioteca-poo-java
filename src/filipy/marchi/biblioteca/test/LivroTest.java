package filipy.marchi.biblioteca.test;

import filipy.marchi.biblioteca.domain.Categorias;
import filipy.marchi.biblioteca.domain.Cliente;
import filipy.marchi.biblioteca.domain.Livro;
import filipy.marchi.biblioteca.service.ApagarDadosLivro;
import filipy.marchi.biblioteca.service.ApagarDadosPessoa;
import filipy.marchi.biblioteca.service.EmprestimoLivro;
import filipy.marchi.biblioteca.service.PesquisarLivro;

public class LivroTest {
    public static void main(String[] args) {
        Livro dicionario = new Livro("Dicionario", Categorias.EDUCACAO, 30);
        Livro biblia = new Livro("bilbia", Categorias.RELIGIOSO, 15);
        Livro batpat = new Livro("batpat", Categorias.HISTORIAS_EM_QUADRINHOS, 12);
        dicionario.adicionarSinopse("Livro para busca de conhecimento");
        Cliente c1 = new Cliente("Filipy", 22, "000.000.000-21");

        EmprestimoLivro.emprestimo(c1, dicionario);
        EmprestimoLivro.emprestimo(c1, biblia);
        EmprestimoLivro.emprestimo(c1, batpat);

        System.out.println(c1);

        ApagarDadosPessoa.excluirPessoa(c1);

        System.out.println(c1);
    }
}
