package academy.treino.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.treino.maratonajava.javacore.Aintroducaoclasses.dominio.Vendedor;

public class Vendedorteste01 {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Joao victor";
        vendedor.idade = 19;
        vendedor.vendas = 23000D;

        System.out.println(vendedor.nome);
        System.out.println(vendedor.idade);
        System.out.println(vendedor.vendas);
    }
}
