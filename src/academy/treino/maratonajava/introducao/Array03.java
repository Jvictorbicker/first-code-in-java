package academy.treino.maratonajava.introducao;

public class Array03 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
            for(int i=0; i < numeros.length; i++){
                System.out.println(numeros[i]);
            }
        for (int n: numeros) {
            System.out.println(n);
        }
        int n = numeros[0];
        System.out.println(n);
    }
}
