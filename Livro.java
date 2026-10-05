public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirDetalhes() {
        System.out.println("O livro " + this.titulo + ", escrito por " + this.autor + ", possui " + this.paginas + " páginas.");
    }

 public static void main(String[] args) {
        Livro meuLivro = new Livro("Dom Casmurro", "Machado de Assis", 256);

        meuLivro.exibirDetalhes();
    }
}
