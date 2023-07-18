package Parte1;

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Criar um vetor-array com 10 posições

        double[] numero = new double[10];
        int maiorPar=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduza um numero: ");
            numero[i] = input.nextDouble();
        }


        //Ler dados do utlizador

        for (int i = 0; i < 10; i++) {
            if (numero[i] % 2 == 0 && maiorPar>numero[i]);

            System.out.println("O maior numero par é"+maiorPar);

        }
        for (int i = 0; i < 10; i++) {
            if (numero[i] % 2 != 0)
                System.out.println("Nao existe numeros pares");

        }
    }
}