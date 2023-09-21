package Ex_07;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int nrPaginas;
    private int ISBN;

    public Livro(String titulo, String autor, String categoria, int nrPaginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.nrPaginas = nrPaginas;
        this.ISBN = ISBN;
    }
    public void exibirDetalhes(){
        System.out.println("Título:" + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("Categoria:" + categoria);
        System.out.println("Número de Páginas:" + nrPaginas);
        System.out.println("ISBN:" + ISBN);
    }
}
