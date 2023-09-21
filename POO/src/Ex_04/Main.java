package Ex_04;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);

        System.out.println("Area:"+(circulo.getRaio()* circulo.getRaio()*3.14));
        System.out.println("Circumfrencia:"+(circulo.getRaio()*2*3.14));

    }
}
