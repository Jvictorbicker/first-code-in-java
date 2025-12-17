package academy.treino.maratonajava.javacore.Csobrecargametodos.test;

import academy.treino.maratonajava.javacore.Csobrecargametodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Victor");
        funcionario.setCPF("534.133.238-57");
        funcionario.setSalarios(new Double[]{850.0,700.0,500.0});

        funcionario.imprimir();
        funcionario.meanSalary();
        funcionario.maiorSalary();
        funcionario.menorSalary();
        funcionario.teveAumento();
    }
}
