package Ficha2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar as variaveis

        double num1, num2, resultado;
        String operacao;

// Ler valores do utilizador
        System.out.println("Insira um numero");
        num1 = input.nextInt();

        System.out.println("Insira um numero");
        num2 = input.nextInt();

        System.out.println("Insira a operaçao (-),(+),(*),(/) : ");
        operacao=input.next();

        switch(operacao){
            case "+":
                resultado=num1+num2;
                System.out.println("Soma: "+resultado);

                break;
            case "-":
                resultado=num1-num2;
                System.out.println("Subtracao: "+resultado);

                break;

            case "*":
                resultado=num1*num2;
                System.out.println("Multiplicacao: "+resultado);

                break;

            case "/":
                resultado=num1/num2;
                System.out.println("Divisao : "+resultado);

                break;
default:
    System.out.println("Operaçao invalida");
    break;
        }

    }
}