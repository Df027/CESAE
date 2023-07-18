package Parte1;

import java.util.Scanner;
public class Exercicio1
    /* Programa que permite adicionar 10nr a um array
    e que os imprima pela ordem de inserção */
{
    public static void main(String[] args ){
    //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int [] vetor = new int[10];


        //Inserir valores do utilizador

        for (int i=0; i<10; i++){
            System.out.println("Introduza um numero no vetor["+"]: ");
            vetor[i]= input.nextInt();
        }

        //Ciclo para imprimir o conteudo do vetor

        for(int i=0; i<10; i++){
            System.out.println("Vetor["+i+"]: "+ vetor[i]);
        }
}
  }