package academy.treino.maratonajava.javacore.Bintroducaometodos.testes;

import academy.treino.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro");
        pessoa.setIdade(12);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
