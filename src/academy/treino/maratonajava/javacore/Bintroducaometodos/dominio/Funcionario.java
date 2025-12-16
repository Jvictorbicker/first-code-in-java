package academy.treino.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = new double[3];
    private double media;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario == null) {
            System.out.println("sem salarios");
            return;
        }
        for (int i = 0; i <salario.length; i++) {
            System.out.println("Salario: " + salario[i]);        }
    }

    public void meanSalary() {
        if (salario == null) {
            return;
        }

        double soma = 0;

        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }
        double media = soma / salario.length;
        System.out.println("Media: " + media);
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

}
