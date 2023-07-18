import java.util.Scanner;
import java.util.Set;

public class Exercicio6 {
    public static <sucessor> void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, sucessor, antecessor;

        System.out.print("Insira um numero");
        num = input.nextInt();

        antecessor = num - 5;
        sucessor = num + 5;


        while (antecessor < num) {
            System.out.println(antecessor);
            antecessor++;

        }


    }
}








