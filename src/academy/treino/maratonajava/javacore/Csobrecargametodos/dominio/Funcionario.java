package academy.treino.maratonajava.javacore.Csobrecargametodos.dominio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private String CPF;
    private Double[] salarios = new Double[3];

    public void Funcionario() {
        this.nome = nome;
        this.CPF = CPF;
        this.salarios = salarios;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public Double[] getSalarios() {
        if (salarios == null) {
            System.out.println("Salarios nao encontrado");
            return null;
        } else  {
            return salarios;
        }


    }
    public void setSalarios(Double[] salarios) {
        this.salarios = salarios;
    }
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        for (Double salario : salarios) {
            System.out.println(salario);
        }
    }
    public void meanSalary() {
        double soma = 0;

        for (double salario : salarios) {
            soma += salario;
        }

        double media = soma / salarios.length;
        System.out.println("Media salarial: " + media);
    }

    public void maiorSalary() {
        Double maior = salarios[0];

        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
        }
        System.out.println("Maior salario: " + maior);
    }
    public void menorSalary() {
        Double menor = salarios[0];

        for (int i = 0;i < salarios.length;i++) {
            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }
        System.out.println("Menor salario: " + menor);
    }
    public void teveAumento() {
        boolean teve;
        if (salarios[0] > salarios[1]) {
            teve = true;
            System.out.println("Teve aumento com o ultimo salario");
        }
        else {
            teve = false;
            System.out.println("Nao teve aumento com o ultimo salario");
        }
    }
}
