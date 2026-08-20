package filipy.marchi.biblioteca.domain;

public class Livro {
    private String nome;
    Categorias categoria;
    private int quantidade;
    private static int Id = 1;
    private int codigoDoProduto;
    private String sinopse;

    public Livro(String nome, Categorias categoria, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.codigoDoProduto = gerarId();
    }

    public int gerarId(){
        return Id ++;
    }

    public void adicionarSinopse (String sinopse){
        this.sinopse = sinopse;
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

    public void alterarSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void alterarCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getSinopse() {
        return sinopse;
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
