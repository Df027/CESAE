package Parte1;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Criar um vetor-array com 10 posições

        double[] numero = new double[10];
        double maior;


        //Ler o numero
        System.out.println("Introduza um numero");
        numero[0] = input.nextDouble();
        maior=numero[0];

        for (int i = 1; i < 10; i++) {
            System.out.println("Introduza um numero");
            numero[i] = input.nextDouble();
            if(numero[i]>maior){
                maior=numero[i];
            }
        }

        System.out.println("O numero maior é: "+maior);

    }
}