package Ficha3;

import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis

        int inicio, fim;

        System.out.println("Insira um nr de inicio");
        inicio = input.nextInt();

        System.out.println("Insira um nr de fim");
        fim = input.nextInt();

        while (inicio < fim) {
            inicio++;

            System.out.println(inicio);
        }

    }
}

