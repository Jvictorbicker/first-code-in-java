package academy.treino.maratonajava.introducao;

public class EstruturaBreak {
    public static void main(String[] args) {
        int valor = 50;
        for (int i = 1; i <= valor; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
