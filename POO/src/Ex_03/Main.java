package Ex_03;

public class Main {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5,10);

        System.out.println("Area: "+(retangulo.getAltura()* retangulo.getLargura()));
        System.out.println("Perimetro:"+(retangulo.getLargura()*2 + retangulo.getAltura()*2));

    }



}
