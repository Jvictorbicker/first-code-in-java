package academy.treino.maratonajava.javacore.Eestatico.teste;

import academy.treino.maratonajava.javacore.Eestatico.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280.0);
        Carro.setVelocidadeLimite(180.0);

        c1.imprimir();
    }


}
