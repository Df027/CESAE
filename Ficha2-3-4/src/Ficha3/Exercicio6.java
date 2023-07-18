package Ficha3;

import java.util.Scanner;
import java.util.Set;

public class Exercicio6 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis
        int num, sucessor, antecessor;


        //Ler input utilizador
        System.out.println("Insira um numero");
        num = input.nextInt();


        //Declarar valor do sucessor
        antecessor = num-5;
        sucessor = num+5;
        do {
            System.out.println(--num);
        }
        while(num>antecessor);

do {
    System.out.println(num+=1);
}
    while(num<sucessor);


        }


       }




