package filipy.marchi.biblioteca;

public class Livro {
    private String nome;
    private String categoria;
    private int quantidade;
    private int codigo;

    public Livro(String nome, String categoria, int quantidade, int codigo) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.codigo = codigo;
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

    public void alterarCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void alterarQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void alterarQuantidadeEmprestimo() {
        this.quantidade--;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCodigo() {
        return codigo;
    }
}
