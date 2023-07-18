package Parte1;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Criar um vetor-array(numero) com 10 posições

        double[] numero = new double[10];
        double menor;

        //Ler o numero

        System.out.println("Introduza um numero");
        numero[0] = input.nextDouble();
        menor = numero[0];

        for (int i = 1; i < 10; i++) {
            System.out.println("Introduza um numero");
            numero[i] = input.nextDouble();
            if (numero[i] < menor) {
                menor=numero[i];
            }
        }

        System.out.println("O numero menor é: "+menor);

    }
}
