package Collections.List.Pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString(){
        return "Livro{Titulo: '" + titulo + "'" + ", Autor: '" + autor + "'" + ", Ano de Publicação: " + anoPublicacao;
    }
}
