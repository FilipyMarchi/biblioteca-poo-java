package filipy.marchi.biblioteca.test;

import filipy.marchi.biblioteca.domain.Bibliotecaria;
import filipy.marchi.biblioteca.domain.Categorias;
import filipy.marchi.biblioteca.domain.Cliente;
import filipy.marchi.biblioteca.domain.Livro;
import filipy.marchi.biblioteca.service.*;

public class LivroTest {
    public static void main(String[] args) {
        Livro dicionario = new Livro("Dicionario", Categorias.EDUCACAO, 30);
        Livro biblia = new Livro("bilbia", Categorias.RELIGIOSO, 15);
        Livro batpat = new Livro("batpat", Categorias.HISTORIAS_EM_QUADRINHOS, 12);
        dicionario.adicionarSinopse("Livro para busca de conhecimento");
        Cliente c1 = new Cliente("Filipy", 22, "000.000.000-21");
        Bibliotecaria b1 = new Bibliotecaria("Sheila", 32, "00000", 2000);

        System.out.println(b1);

        AlterarDadosPessoa.alterarSalarioBibliotecaria(b1, 1000);
        System.out.println(b1);
    }
}
