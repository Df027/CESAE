package Ficha2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis

int num1,num2,num3;

// Ler valores do utilizador
        System.out.println("Insira um numero");
        num1 = input.nextInt();

        System.out.println("Insira um numero");
        num2 = input.nextInt();

        System.out.println("Insira um numero");
        num3 = input.nextInt();


        if(num1<num2 && num1<num3){
            System.out.println("O menor numero é"+num1);

        }else if (num2<num1 && num2<num3)
                System.out.println("O menor numero é"+num2);

            else if(num3<num1 && num3<num2)
            System.out.println("O menor numero é"+num3);

    }

    }
