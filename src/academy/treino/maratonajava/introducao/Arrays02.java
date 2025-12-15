package academy.treino.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        String [] nomes = new String[3];
        nomes[0]="Maria";
        nomes[1]="Joao";
        nomes[2]="Pedro";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
