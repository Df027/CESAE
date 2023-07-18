import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {

        // instanciar o Scanner (linha obrigatória para ler dados da consola)

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        int valor, antecessor, sucessor;

        System.out.println("Introduza um numero");
        valor=input.nextInt();

        antecessor=valor-1;
        System.out.println("Antecessor "+antecessor);

        sucessor=valor+1;
        System.out.println("Sucessor "+sucessor);
    }
}