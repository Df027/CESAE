package Ex_02;

public class Main {
    public static void main(String[] args) {

Cao cao1 = new Cao("Pluto","Corgi");
        System.out.println("***** Detalhes do Cao1*****");
        System.out.println("Nome: "+cao1.getNome());
        System.out.println("Raça:"+cao1.getRaca());
        System.out.println("Latido:"+cao1.getLadrar());

        cao1.bark();


Cao cao2 = new Cao("Ivy", "Labrador");
    System.out.println("***Detalhes do Cao2***");
    System.out.println("Nome:"+cao2.getNome());
    System.out.println("Raça:"+cao2.getRaca());
    System.out.println("Latido:"+cao2.getLadrar());

    cao2.bark();

        Cao cao3 = new Cao("Macanudo", "Spitz");
        System.out.println("***Detalhes do Cao3***");
        System.out.println("Nome:"+cao3.getNome());
        System.out.println("Raça:"+cao3.getRaca());
        System.out.println("Latido:"+cao3.getLadrar());

        cao3.bark();

        Cao cao4 = new Cao("Romeu", "Pinscher");
        System.out.println("***Detalhes do Cao4***");
        System.out.println("Nome:"+cao4.getNome());
        System.out.println("Raça:"+cao4.getRaca());
        System.out.println("Latido:"+cao4.getLadrar());

        cao4.bark();

        cao1.setLadrar("Woof!");

}
    }
