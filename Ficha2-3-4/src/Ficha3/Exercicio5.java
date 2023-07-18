package Ficha3;

import java.util.Scanner;
import java.util.Set;

public class Exercicio5 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis

        int x=0, soma=0;

        while (x<100){
            x++;

            soma=soma+x;
            System.out.println(x);
            System.out.println(soma+"Soma com o numero anterior");

        }

    }
}