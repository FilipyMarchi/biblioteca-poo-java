package filipy.marchi.biblioteca.domain;

public class Bibliotecaria extends Pessoa{
    private double salario;

    public Bibliotecaria(String nome, int idade, String cpf, double salario) {
        super(nome, idade, cpf);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salario='" + salario + '\'' + "}";
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
