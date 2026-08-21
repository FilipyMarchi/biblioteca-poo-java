package filipy.marchi.biblioteca.service;

import filipy.marchi.biblioteca.domain.Bibliotecaria;
import filipy.marchi.biblioteca.domain.Cliente;
import filipy.marchi.biblioteca.domain.Pessoa;

public class AlterarDadosPessoa {
    public static void alterarNome (Pessoa pessoa, String nome){
        pessoa.setNome(nome);
    }

    public static void alterarIdade (Pessoa pessoa, int idade){
        pessoa.setIdade(idade);
    }

    public static void alterarCpf (Pessoa pessoa, String cpf){
        pessoa.setCpf(cpf);
    }

    public static void alterarSalarioBibliotecaria (Pessoa pessoa, double salario){
        if (pessoa instanceof Cliente){
            System.out.println("Essa pessoa nao recebe salario!");
        } else if (pessoa instanceof Bibliotecaria){
            ((Bibliotecaria) pessoa).setSalario(salario);
        }
    }
}
