package academy.treino.maratonajava.javacore.Eestatico.dominio;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    // static faz a velocidadeLimite ser padrao em todas as instancias e ao alterar, ira alterar todos os carros
    public Carro(String marca, Double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprimir() {
        System.out.println("-----------");
        System.out.println(this.marca);
        System.out.println(this.velocidadeLimite);
        System.out.println(this.velocidadeMaxima);
    }
    public static void setVelocidadeLimite(Double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
