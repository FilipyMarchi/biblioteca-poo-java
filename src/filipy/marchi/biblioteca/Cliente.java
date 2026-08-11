package filipy.marchi.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private List livrosEmprestados = new ArrayList<>();

    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", Livros='" + livrosEmprestados + '\'' +
                '}';
    }

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

    public void excluir() {
        this.nome = null;
        this.idade = 0;
        this.cpf = null;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
    }

    public void alterarCpf(String cpf) {
        this.cpf = cpf;
    }

}
