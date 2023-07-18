import java.util.Scanner;
import java.util.Set;

public class Exercicio3v2 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num=0, limite;

        System.out.print("Introduza um numero");
        limite=input.nextInt();


        while(num<=limite)
        System.out.print(limite);
        limite=num+1;


        }
    }

