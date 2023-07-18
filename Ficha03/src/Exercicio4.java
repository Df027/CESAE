import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int inicio, fim;

        // Ler input do Utilizador
        System.out.print("Introduza um numero inicial: ");
        inicio=input.nextInt();

        // Ler input do Utilizador
        System.out.print("Introduza um numero final: ");
        fim=input.nextInt();

        while(inicio<=fim){
            System.out.println(inicio);
            inicio++;


        }
    }

}