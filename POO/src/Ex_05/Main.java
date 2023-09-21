package Ex_05;
public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Ford","Focus",2000);
        System.out.println("***** Detalhes do carro*****");
        System.out.println("Marca: " + carro1.getmarca());
        System.out.println("Modelo:" + carro1.getmodelo());
        System.out.println("Ano Fabrico:" + carro1.getanoFabrico());

        carro1.ligar();


    }
}
