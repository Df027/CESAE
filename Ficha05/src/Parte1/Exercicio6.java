package Parte1;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variavel com 10 posiçoes

        double[] numero = new double[10];
        boolean crescente = true;

        //Introduzir numeros

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduza um numero: ");
            numero[i] = input.nextDouble();}

            //Ler dados do utlizador

            for (int i = 1; i < 10; i++) {

                System.out.println("\n estou a comparar se"+numero[i]+"<"+numero[i-1]+"...\t");

                if (numero[i] <= numero[i - 1]) {
                    System.out.println("Atençao, deixou de ser crescente");
                    crescente = false;
                } else {
                    System.out.println("Falso");


                }
            }

            if (crescente) {
                System.out.println("Crescente");

            } else {
                System.out.println("Nao crescente");

            }


        }
    }

