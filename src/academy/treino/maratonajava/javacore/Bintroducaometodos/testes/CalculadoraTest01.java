package academy.treino.maratonajava.javacore.Bintroducaometodos.testes;

import academy.treino.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        System.out.println("--------------");
        calculadora.subtraDoisNumeros();

        System.out.println("---------------");
        calculadora.multiplicaDoisNumeros(2,2);

        System.out.println("---------------");
        double result = calculadora.divideDoisNumeros(5,0);
        System.out.println("result: " + result);

        System.out.println("---------------");
        calculadora.impimeDivisaoDoisNumeros(5,0);

        System.out.println("---------------");
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
