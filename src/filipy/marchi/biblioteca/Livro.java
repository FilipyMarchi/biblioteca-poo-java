package filipy.marchi.biblioteca;

public class Livro {
    private String nome;
    Categorias categoria;
    private int quantidade;
    private int codigoDoProduto;

    public Livro(String nome, Categorias categoria, int quantidade, int codigo) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.codigoDoProduto = codigoDoProduto;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }


    public void excluir() {
        this.nome = null;
        this.categoria = null;
        this.quantidade = 0;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public void alterarQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void alterarQuantidadeEmprestimo() {
        this.quantidade--;
    }

    public void alterarQuantidadeDevolucao() {
        this.quantidade++;
    }

    public String getNome() {
        return nome;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }
}
