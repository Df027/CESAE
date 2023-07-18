package Ficha4;

import java.util.Scanner;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        // Import obrigatório do Scanner
        Scanner input = new Scanner(System.in);

        int num1, num2;
        String operacao, opcao;

        System.out.println("Insira um numero");
        num1 = input.nextInt();

        System.out.println("Insira um numero");
        num2 = input.nextInt();

        do{
        do {


            System.out.println("Escolha uma operaçao a realizar (Soma +,Subtraçao -, Multiplicaçao *, Divisao /)");
            operacao = input.next();
        }while(!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/") );
            switch (operacao) {
                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;


                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case "/":
                    System.out.println("Resultado: " + (num1 / num2));
                    break;

            }
            // perguntas se quer repetir

            System.out.println("Deseja continuar? Introduza sim/nao");
            opcao = input.next();

        } while (opcao.equals("sim"));
    }
}