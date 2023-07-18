import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {

        // instanciar o Scanner (linha obrigatória para ler dados da consola)

        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        double areacircum,pi,raio;


        pi=3.14;

        System.out.println("Introduza o raio da circumfrencia");
        raio=input.nextDouble();

        areacircum=pi*raio*raio;


        System.out.println("A area da circumfrencia é "+areacircum);

    }
}