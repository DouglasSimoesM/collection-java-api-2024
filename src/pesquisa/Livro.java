package pesquisa;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private String autor;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo= " + titulo + '\'' +
                ", anoPublicacao= " + anoPublicacao +
                ", autor= " + autor + '\'' +
                '}';
    }
}
