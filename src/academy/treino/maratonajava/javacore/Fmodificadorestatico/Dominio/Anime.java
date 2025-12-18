package academy.treino.maratonajava.javacore.Fmodificadorestatico.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("bloco de inicilizacao, sempre executado antes do construtor");
    }

    public Anime() {
        episodios = new int [1000];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int ep : Anime.episodios) {
            System.out.print(ep + " ");
        }
    }
}
