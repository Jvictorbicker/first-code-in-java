package academy.treino.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
    public void subtraDoisNumeros() {
        System.out.println(10 - 10);
    }
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    public int divideDoisNumeros(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("erro! divisao por zero");
            return 0;
        }
        else {
        return num1 / num2;
        }
    }
    public void impimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("erro! divisao por zero");
            return;
        }
        System.out.println(num1 / num2);
    }
    public void alteraNumeros(double num1, double num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do altera numeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
