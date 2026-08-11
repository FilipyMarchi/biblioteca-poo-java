package filipy.marchi.biblioteca;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "Ficcao", 10, 01);
        Livro livro2 = new Livro("BatPat", "Animacao", 3, 02);
        Livro livro3 = new Livro("Dicionario", "Conhecimento", 5, 03);
        Livro livro4 = new Livro("Biblia", "Religioso", 33, 04);
        Cliente cliente1 = new Cliente("Joao", 18, "676.222.552-17");

        cliente1.emprestimo(livro3);
        cliente1.emprestimo(livro2);
        cliente1.emprestimo(livro1);

        System.out.println(cliente1);

    }
}
