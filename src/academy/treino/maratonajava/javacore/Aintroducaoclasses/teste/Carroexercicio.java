package academy.treino.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.treino.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carroexercicio {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.modelo = "Gol";
        carro.ano = 2011;
        carro.marca = "volkswagem";

        carro2.ano = 2015;
        carro2.marca = "volkswagem";
        carro2.modelo = "Gol GT";

        carro = carro2; //fazer uma classe receber outra classe

        System.out.println("modelo: " + carro.modelo + " ano: " + carro.ano + " marca: " + carro.marca);
        System.out.println("modelo: " + carro2.modelo + " ano: " + carro2.ano + " marca: " + carro2.marca);
    }
}
