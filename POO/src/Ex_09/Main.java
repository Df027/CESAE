package Ex_09;

public class Main {
    public static void main(String[] args) {
Produto bolachas = new Produto("Maria", 2.5);
        Produto peixe = new Produto("Peixe", 22.5);

bolachas.comprar(5);
        System.out.println(bolachas.comprar(5));

bolachas.vender(2);
        System.out.println(bolachas.vender(2));

bolachas.comprar(10);
        System.out.println(bolachas.comprar(10));

bolachas.vender(35);
        System.out.println(bolachas.vender(35));

        System.out.println("Stock disponivel: "+bolachas.getStock());

    }
}
