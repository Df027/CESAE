package Ficha4;

import java.util.Scanner;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        int numSecreto, tentativa, num_tentativas=0;


//Este do-while faz com que a instrução abaixo seja repetida até que o numero inserido seja entre 0-100
        do {
            System.out.println("Introduza um numero de 0 a 100");
            numSecreto = input.nextInt();

            if (numSecreto > 100 || numSecreto < 0) {
                System.out.println("O numero tem de ser entre 0 e 100!");
            }

        } while (numSecreto < 0 || numSecreto > 100);

//Tentativa do jogador 2

        do {
            System.out.print("Tente adivinhar o numero inserido pelo jogador 1: ");
            tentativa = input.nextInt();

            if (tentativa < numSecreto) {
                System.out.println("O numero secreto é maior!");
                System.out.println("Tente novamente!");

            }

            if(tentativa>numSecreto){
                System.out.println("O numero secreto é menor!");
                System.out.println("Tente novamente!");
               ;
            }
            num_tentativas++; //Contador

        }while(tentativa>numSecreto || tentativa<numSecreto);

        System.out.println("Acertou! Numero de tentativas : " +num_tentativas);

    }


}

