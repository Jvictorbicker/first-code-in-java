package academy.treino.maratonajava.javacore.Bintroducaometodos.testes;

import academy.treino.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioMetodos {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Victor");
        funcionario.setIdade(19);
        funcionario.setSalario(new double[]{850,700,500});

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salario: " + funcionario.getSalario());
        funcionario.meanSalary();
        funcionario.imprimir();
    }
}
