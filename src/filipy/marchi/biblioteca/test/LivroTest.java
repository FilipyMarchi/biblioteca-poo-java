package filipy.marchi.biblioteca.test;

import filipy.marchi.biblioteca.domain.Categorias;
import filipy.marchi.biblioteca.domain.Cliente;
import filipy.marchi.biblioteca.domain.Livro;
import filipy.marchi.biblioteca.service.PesquisarLivro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", Categorias.FICCAO, 10);
        Livro livro2 = new Livro("BatPat", Categorias.HISTORIAS_EM_QUADRINHOS, 3);
        Livro livro3 = new Livro("Dicionario", Categorias.EDUCACAO, 5);
        Livro livro4 = new Livro("Biblia", Categorias.RELIGIOSO, 33);
        Cliente cliente1 = new Cliente("Joao", 18, "676.222.552-17");

        cliente1.
    }
}
