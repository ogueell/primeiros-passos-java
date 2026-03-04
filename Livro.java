public class Livro {
    private String autor;
    private String titulo;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes() {
        System.out.println("Autor do livro: " + autor);
        System.out.println("Título do livro: " + titulo);
    }
}
