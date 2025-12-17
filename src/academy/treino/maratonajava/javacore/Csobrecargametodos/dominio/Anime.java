package academy.treino.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public void imprimir() {
        System.out.println(this.episodios);
        System.out.println(this.tipo);
        System.out.println(this.nome);
        System.out.println(this.genero);
    }

    public void init(String tipo, int episodios, String nome) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
    }
    public void init(String tipo, int episodios, String nome, String genero) {
        this.init(tipo, episodios, nome);
        this.genero = genero;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public int getEpisodios() {
        return episodios;
    }
    public String getNome() {
        return nome;
    }
}
