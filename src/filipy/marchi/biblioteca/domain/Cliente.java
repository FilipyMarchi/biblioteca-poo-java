package filipy.marchi.biblioteca.domain;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;

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
                '}';
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
