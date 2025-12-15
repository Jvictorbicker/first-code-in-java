package academy.treino.maratonajava.introducao;

public class ExercicioBreak {
    public static void main(String[] args) {
        int valor = 50000;
        int valorParcela = 1000;

        for (int i = 1;;i++) {
            if (valor / i < valorParcela) {
                break;
            }
            System.out.println(i);
        }
    }
}
