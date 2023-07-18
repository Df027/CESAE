import java.util.Scanner;
import java.util.Set;

public class Exercicio5 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num = 1, soma = 0;


        //Imprimir numeros de 1 a 100
        while (num <= 100) {
            System.out.println(+num);

            //Soma = Soma(0) + num(100)
            soma = soma + num;
            num = num + 1;


            }

        System.out.println("A soma de todos os numeros é " + soma);

        }
    }



