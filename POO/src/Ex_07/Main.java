package Ex_07;

public class Main {
    public static void main(String[] args) {
        Livro book1 = new Livro("Head First", "Bert", "Learning", 700, 8899965);
        Livro book2 = new Livro("Head First", "Tom", "Learning", 750, 88434);

        book1.exibirDetalhes();
        book2.exibirDetalhes();
    }

}
