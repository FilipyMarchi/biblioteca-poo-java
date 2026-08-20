package filipy.marchi.biblioteca.service;

import filipy.marchi.biblioteca.domain.Bibliotecaria;
import filipy.marchi.biblioteca.domain.Cliente;
import filipy.marchi.biblioteca.domain.Pessoa;

public class ApagarDadosPessoa {
    public static void excluirPessoa(Pessoa pessoa){
        pessoa.setNome(null);
        pessoa.setCpf(null);
        pessoa.setIdade(0);

        if (pessoa instanceof Bibliotecaria){
            ((Bibliotecaria) pessoa).setSalario(0);
        }

        if (pessoa instanceof Cliente){
            ((Cliente) pessoa).setLivrosEmprestados(null);
            }
        }
    }

