package Ficha2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis

        int num;

// Ler valores do utilizador
        System.out.println("Insira um numero");
        num = input.nextInt();

        if(num%2==0){
            System.out.println("É numero par");
        }else{
            System.out.println("É numero impar");

        }
    }
}