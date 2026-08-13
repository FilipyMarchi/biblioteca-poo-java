package filipy.marchi.biblioteca;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", Categorias.FICCAO, 10, 01);
        Livro livro2 = new Livro("BatPat", Categorias.HISTORIAS_EM_QUADRINHOS, 3, 02);
        Livro livro3 = new Livro("Dicionario", Categorias.EDUCACAO, 5, 03);
        Livro livro4 = new Livro("Biblia", Categorias.RELIGIOSO, 33, 04);
        Cliente cliente1 = new Cliente("Joao", 18, "676.222.552-17");


    }
}
