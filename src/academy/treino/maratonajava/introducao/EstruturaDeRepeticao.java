package academy.treino.maratonajava.introducao;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
     // while, do while,for
        int count = 0;
        while(count < 10 ) {
            count++;
            System.out.println(count);
        }
        do {
            System.out.println("Ola Mundo!") ;
        } while (count < 10);

        for (int i=0; i < 10; i++) {
            System.out.println(i);
        }
    }
}